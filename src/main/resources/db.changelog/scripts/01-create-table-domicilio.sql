--liquibase formatted sql
--changeset adviters:create-domicilio
CREATE SCHEMA IF NOT EXISTS domicilio;
CREATE TABLE domicilio (
	direccion text NULL,
	numero int4 NULL,
	barrio text NULL,
	provincia text NULL,
	id int4 NOT NULL,
	CONSTRAINT domicilio_pk PRIMARY KEY (id)
);
--rollback DROP TABLE IF EXISTS domicilio;