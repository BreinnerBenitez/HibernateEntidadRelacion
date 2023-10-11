package objetoRelacionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Guardaclientes {

	public static void main(String[] args) {
	
		
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(Detalles_cliente.class)
				.buildSessionFactory();
		
		   Session miseccion= miFactory.openSession();
		   
		   
		
		   
		   try {
			   
			   
			   Cliente cliente1 = new  Cliente("breinner","parcero","colombia");
			  
			   Detalles_cliente cliente1d = new  Detalles_cliente("breinner.com","311140863","tercer cliente");  
			 
			  //asosociar los objetos
			   
			   cliente1.setDetallesCliente(cliente1d);
			   
			   
			  // esto guarda la informacion en las dos tablas relacionadas 
			   
			   miseccion.beginTransaction();
			   
			   miseccion.save(cliente1);
			   
			   miseccion.getTransaction().commit();
			   
			   
			   System.out.println("registro insertado correctamente");
			   
			   
		   }catch(Exception e) {
			   
			   e.printStackTrace();
			   
			   
		   }finally {
			   
			   miseccion.close();
			   miFactory.close();
		   }
		   

	}

}
