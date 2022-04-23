--liquibase formatted sql
--changeset adviters:create-especialidad
CREATE SCHEMA IF NOT EXISTS entrenador;
CREATE TABLE especialidad (
	id int4 NOT NULL,
	tipo text NOT NULL,
	CONSTRAINT especialidad_pk PRIMARY KEY (id),
	CONSTRAINT especialidad_un UNIQUE (tipo)
);
--rollback DROP TABLE IF EXISTS especialidad;