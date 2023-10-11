# JPA con Hibernate Practica 
### 1) se crea primero una base de datos con dos entidades relacionadas uno a uno  en MySQLWorkbench
###  tambien configuracion de archivo xml Hibernate para conexion a base de datos  
###  los datos ingresados en la clase cliente y detallescliente se hacen atraves de Hibernate imagenes parte de abajo
___

 ![imagencarpeta](img/1sql.JPG)


___

## hibernate.cfg.xml

![imagencarpeta](img/hirbernatexml.JPG)
___


___
### 2)  se crea la clase Clientes y  detallecliente con con sus setter y getter  mas etiquetas de jpa que usa hibernate
### se le asigna clientes y detalle cliente  para realizar consultas   

### Cliente

![imagencarpeta](img/imgen1.1.JPG)


## mas etiquetas jpa para especificar columnas 


![imagencarpeta](img/2imge.JPG)
___
esta parte del codigo y etiquetas indican la clave foranea de la entidad hija en la base de datos como tambien las modificaciones que afectan entre tablas 

~~~
@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_Detalle")
	private Detalles_cliente detallesCliente;
~~~

___

### detallesCliente

![imagencarpeta](img/3detallescliente.JPG)


## mas etiquetas jpa para especificar columnas 


![imagencarpeta](img/4detalle.JPG)


___
### 3)  ingreso de datos en las entidades
## 
![imagencarpeta](img/3ingresodedatos.JPG)


## se realizan tambien consultas Read HQL 


![imagencarpeta](img/4consultadatos.JPG)


## consultas Update HQL 

![imagencarpeta](img/5HQLActualizar.JPG)
