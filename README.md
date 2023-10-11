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
unidericional: cliente->detalles 
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
### 3)  ingreso de datos en las entidades con conexion a base de datos desde java hibernate

![imagencarpeta](img/5.JPG)

___

## se realizan tambien eliminacion de datos 


![imagencarpeta](img/6imagen.JPG)


### 4) se actualiza archivos se encuentran en paquetebidirecional se agrega etiqueta con mapeo en detalles_Cliente
### para que sea biderecional 

![imagencarpeta](img/biderecional/1detallecliente.JPG)

___

## se agreaga toString para ver objetos en la clase nueva ObtenerCliente.java


![imagencarpeta](img/biderecional/3seagrega.JPG)

___

## clase nueva ObtenerCliente.java trae informacion de entidad detalles  mas las del cliente,  Bidirecional <==>


![imagencarpeta](img/biderecional/2clase.JPG)





