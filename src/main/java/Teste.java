import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

    public static void main(String[] args) {
    	
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
    	
    }

}
