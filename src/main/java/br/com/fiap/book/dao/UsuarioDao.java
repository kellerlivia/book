import javax.persistence.EntityManager;

public class UsuarioDao extends GenericDao<Usuario> {

    public UsuarioDao(EntityManager entityManager) {
        super(Usuario.class, entityManager);
    }
    
}
