--liquibase formatted sql
--changeset adviters:create-entrenador
CREATE SCHEMA IF NOT EXISTS entrenador;
CREATE TABLE entrenador (
	"nombre completo" text NOT NULL,
	"fecha de nacimiento" int4 NULL,
	dni int4 NULL,
	altura _float4 NULL,
	peso int4 NULL,
	especialidad int4 NULL,
	sueldo float4 NULL
);
--rollback DROP TABLE IF EXISTS entrenador;