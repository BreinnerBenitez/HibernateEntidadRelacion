package objetoRelacionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Eliminacliente {

	public static void main(String[] args) {
	
		
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(Detalles_cliente.class)
				.buildSessionFactory();
		
		   Session miseccion= miFactory.openSession();
		   
		   
		
		   
		   try {
			   
			   
			  //asosociar los objetos
			  
			   miseccion.beginTransaction();
			   
			   
			   Cliente elcliente=miseccion.get(Cliente.class, 3);
			   
			   if(elcliente!=null) {
				   
				   System.out.println("voy a eliminar el cliente"+elcliente.getNombre());
				   miseccion.delete(elcliente);
				   System.out.println("registro eliminado correctamente");
			   }
			   
			   miseccion.getTransaction().commit();
			   
			   if(elcliente==null) {
				   
				   System.out.println("no elimino nada de la base de datos no se encuentra el cliente");
			   }
			   
			  
			   
			   
		   }catch(Exception e) {
			   
			   e.printStackTrace();
			   
			   
		   }finally {
			   
			   miseccion.close();
			   miFactory.close();
		   }
		   

	}

}
