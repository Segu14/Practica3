/* Creamos Base de Datos */
drop schema if exists practica;
create schema practica;

/* Creamos usuario identificado con una clave */
drop user 'usuario_practica';
create user 'usuario_practica' identified by 'la_Clave';

/* Le brindamos los privilegios de todas las tablas en la BD */
grant all privileges on practica.* to 'usuario_practica';
flush privileges;

/* Creamos tabla arbol en la BD */
create table practica.arbol (
	id_arbol int NOT NULL AUTO_INCREMENT,
    ruta_imagen varchar(1024) NOT NULL,
    nombre_comun varchar(60) NOT NULL,
    tipo_flor varchar(30) NOT NULL,
    dureza_madera double NOT NULL,
    activos boolean,
    PRIMARY KEY (id_arbol)
	)