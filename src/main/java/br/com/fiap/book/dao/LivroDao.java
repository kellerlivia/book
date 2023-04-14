import javax.persistence.EntityManager;

public class LivroDao extends GenericDao<Livro> {

    public LivroDao(EntityManager entityManager) {
        super(Livro.class, entityManager);
    }

}
