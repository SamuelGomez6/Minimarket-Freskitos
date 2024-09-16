package persistencia;

import Logica.registro;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import persistencia.exceptions.NonexistentEntityException;


public class RegistroJpaController implements Serializable {

    
    
    public RegistroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public RegistroJpaController() {
        emf = Persistence.createEntityManagerFactory("BaseDatosfreskitosPU");
    }
    
    public void create(registro usuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            if(em != null) {
                em.close();
            }
        }
    }
    
    public void edit(registro usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            usuario = em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = usuario.getId();
                if (findregistro(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
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
            registro usuario;
            try {
                usuario = em.getReference(registro.class, id);
                usuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    
    public List<registro> findregistroEntities(int maxResults, int firstResult) {
        return findregistroEntities(false, maxResults, firstResult);
    }

   
    public List<registro> findregistroEntities() {
        return findregistroEntities(true, -1, -1);
    }

    private List<registro> findregistroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<registro> cq = em.getCriteriaBuilder().createQuery(registro.class);
            cq.select(cq.from(registro.class));
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
    
    public registro findregistro(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(registro.class, id);
        } finally {
        em.close();
        }
    }
    
}