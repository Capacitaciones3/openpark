--liquibase formatted sql
--changeset adviters:insert-into-especialidad
INSERT INTO public.especialidad (id,tipo)
	VALUES (1,'NATACION');
INSERT INTO public.especialidad (id,tipo)
	VALUES (2,'BAILE');
INSERT INTO public.especialidad (id,tipo)
	VALUES (3,'BOXEO');
INSERT INTO public.especialidad (id,tipo)
	VALUES (4,'SPINNING');
INSERT INTO public.especialidad (id,tipo)
	VALUES (5,'CROSSFIT');