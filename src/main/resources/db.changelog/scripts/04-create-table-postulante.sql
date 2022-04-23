--liquibase formatted sql
--changeset adviters:create-postulante
CREATE TABLE postulante (
	"nombre completo" text NOT NULL,
	"fecha de nacimiento" int4 NULL,
	dni int4 NULL,
	altura _float4 NULL,
	peso int4 NULL,
	plan int4 NOT NULL DEFAULT 1,
	domicilio _int2 NULL,
	"tipo de pago" int4 NULL DEFAULT 1
);
--rollback DROP TABLE IF EXISTS postulante;