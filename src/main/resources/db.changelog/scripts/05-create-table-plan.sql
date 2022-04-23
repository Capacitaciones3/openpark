--liquibase formatted sql
--changeset adviters:create-plan
CREATE TABLE plan (
	id int4 NOT NULL,
	tipo text NOT NULL,
	CONSTRAINT plan_pk PRIMARY KEY (id),
	CONSTRAINT plan_un UNIQUE (tipo)
);
--rollback DROP TABLE IF EXISTS plan;