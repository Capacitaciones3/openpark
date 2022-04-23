--liquibase formatted sql
--changeset adviters:insert-into-tipopago
INSERT INTO public.tipopago (id,tipo)
	VALUES (1,'EFECTIVO');
INSERT INTO public.tipopago (id,tipo)
	VALUES (2,'DEBITO');
INSERT INTO public.tipopago (id,tipo)
	VALUES (3,'CREDITO');