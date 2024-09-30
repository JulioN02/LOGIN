package persistencia;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Cargo;
import persistencia.exceptions.NonexistentEntityException;

public class CargoJpaController implements Serializable {

    public CargoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public CargoJpaController(){
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public void create(Cargo cargo) {
        if (cargo.getListaUsuario() == null) {
            cargo.setListaUsuario(new ArrayList<Usuario>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Usuario> attachedListaUsuario = new ArrayList<Usuario>();
            for (Usuario listaUsuarioUsuarioToAttach : cargo.getListaUsuario()) {
                listaUsuarioUsuarioToAttach = em.getReference(listaUsuarioUsuarioToAttach.getClass(), listaUsuarioUsuarioToAttach.getId());
                attachedListaUsuario.add(listaUsuarioUsuarioToAttach);
            }
            cargo.setListaUsuario(attachedListaUsuario);
            em.persist(cargo);
            for (Usuario listaUsuarioUsuario : cargo.getListaUsuario()) {
                Cargo oldCargoOfListaUsuarioUsuario = listaUsuarioUsuario.getCargo();
                listaUsuarioUsuario.setCargo(cargo);
                listaUsuarioUsuario = em.merge(listaUsuarioUsuario);
                if (oldCargoOfListaUsuarioUsuario != null) {
                    oldCargoOfListaUsuarioUsuario.getListaUsuario().remove(listaUsuarioUsuario);
                    oldCargoOfListaUsuarioUsuario = em.merge(oldCargoOfListaUsuarioUsuario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cargo cargo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cargo persistentCargo = em.find(Cargo.class, cargo.getId());
            List<Usuario> listaUsuarioOld = persistentCargo.getListaUsuario();
            List<Usuario> listaUsuarioNew = cargo.getListaUsuario();
            List<Usuario> attachedListaUsuarioNew = new ArrayList<Usuario>();
            for (Usuario listaUsuarioNewUsuarioToAttach : listaUsuarioNew) {
                listaUsuarioNewUsuarioToAttach = em.getReference(listaUsuarioNewUsuarioToAttach.getClass(), listaUsuarioNewUsuarioToAttach.getId());
                attachedListaUsuarioNew.add(listaUsuarioNewUsuarioToAttach);
            }
            listaUsuarioNew = attachedListaUsuarioNew;
            cargo.setListaUsuario(listaUsuarioNew);
            cargo = em.merge(cargo);
            for (Usuario listaUsuarioOldUsuario : listaUsuarioOld) {
                if (!listaUsuarioNew.contains(listaUsuarioOldUsuario)) {
                    listaUsuarioOldUsuario.setCargo(null);
                    listaUsuarioOldUsuario = em.merge(listaUsuarioOldUsuario);
                }
            }
            for (Usuario listaUsuarioNewUsuario : listaUsuarioNew) {
                if (!listaUsuarioOld.contains(listaUsuarioNewUsuario)) {
                    Cargo oldCargoOfListaUsuarioNewUsuario = listaUsuarioNewUsuario.getCargo();
                    listaUsuarioNewUsuario.setCargo(cargo);
                    listaUsuarioNewUsuario = em.merge(listaUsuarioNewUsuario);
                    if (oldCargoOfListaUsuarioNewUsuario != null && !oldCargoOfListaUsuarioNewUsuario.equals(cargo)) {
                        oldCargoOfListaUsuarioNewUsuario.getListaUsuario().remove(listaUsuarioNewUsuario);
                        oldCargoOfListaUsuarioNewUsuario = em.merge(oldCargoOfListaUsuarioNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cargo.getId();
                if (findCargo(id) == null) {
                    throw new NonexistentEntityException("The cargo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cargo cargo;
            try {
                cargo = em.getReference(Cargo.class, id);
                cargo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cargo with id " + id + " no longer exists.", enfe);
            }
            List<Usuario> listaUsuario = cargo.getListaUsuario();
            for (Usuario listaUsuarioUsuario : listaUsuario) {
                listaUsuarioUsuario.setCargo(null);
                listaUsuarioUsuario = em.merge(listaUsuarioUsuario);
            }
            em.remove(cargo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cargo> findCargoEntities() {
        return findCargoEntities(true, -1, -1);
    }

    public List<Cargo> findCargoEntities(int maxResults, int firstResult) {
        return findCargoEntities(false, maxResults, firstResult);
    }

    private List<Cargo> findCargoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cargo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cargo findCargo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cargo.class, id);
        } finally {
            em.close();
        }
    }

    public int getCargoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cargo> rt = cq.from(Cargo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
