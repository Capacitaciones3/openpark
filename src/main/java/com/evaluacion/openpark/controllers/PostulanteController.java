package com.evaluacion.openpark.controllers;

import com.evaluacion.openpark.OpenparkApplication;
import com.evaluacion.openpark.services.PostulanteServices;
import com.evaluacion.openpark.model.Postulante;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/postulante/")
public class PostulanteController {

    @Autowired
    PostulanteServices service;

    public OpenparkApplication getPostulanteById(int id) throws Exception {
        return service.getById(id);
    }

    @DeleteMapping
    public void deletePostulante(int id) {
        service.deletePostulante(id);
    }

    @PutMapping
    public OpenparkApplication updatePostulante(Postulante postulante) throws Exception {
        return service.updatePostulante(postulante);
    }

    @PostMapping("create")
    public int createPostulante(Postulante postulante) throws Exception {
        return service.createPostulante(postulante);
    }
}
