package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("JpaProject");
				EntityManager em = emf.createEntityManager();
				
				em.getTransaction().begin();
				Usuario usuario = em.find(Usuario.class, 1L);
				usuario.setNome("Nykson24");
				usuario.setEmail("nykson24@gmail.com");
				// responsavel por atualizar o usuario no banco
				em.merge(usuario);
				
				em.getTransaction().commit();
				
				em.clear();
				emf.close();
				
				
	}
}
