--liquibase formatted sql
--changeset adviters:insert-into-plan
INSERT INTO public.plan (id,tipo)
	VALUES (1,'BASIC');
INSERT INTO public.plan (id,tipo)
	VALUES (2,'GOLD');
INSERT INTO public.plan (id,tipo)
	VALUES (3,'PLATINIUM');