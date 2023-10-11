package objetoRelacionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(Detalles_cliente.class)
				.buildSessionFactory();
		
		   Session miseccion= miFactory.openSession();
		
		
		   
		   try {
			   
			   
				  //asosociar los objetos
				  
			   miseccion.beginTransaction();
			   
			 
			   // obtener detalle cliente
			   
			   
			   Detalles_cliente detallescliente=miseccion.get(Detalles_cliente.class, 6);
			   
			
			   System.out.println(detallescliente);
			   System.out.println(detallescliente.getElcliente());
			   
			   miseccion.getTransaction().commit();
			   
			
			  
			   
			   
		   }catch(Exception e) {
			   
			   e.printStackTrace();
			   
			   
		   }finally {
			   
			   miseccion.close();
			   miFactory.close();
		   }
		   
			   
			   
		
		
		
	}

}
