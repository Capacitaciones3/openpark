--liquibase formatted sql
--changeset adviters:create-tipopago
CREATE TABLE tipopago (
	id int4 NOT NULL,
	tipo text NOT NULL,
	CONSTRAINT tipopago_pk PRIMARY KEY (id),
	CONSTRAINT tipopago_un UNIQUE (tipo)
);
--rollback DROP TABLE IF EXISTS tipopago;