package com.evaluacion.openpark.services;


import com.evaluacion.openpark.OpenparkApplication;
import com.evaluacion.openpark.model.Postulante;
import com.evaluacion.openpark.repositories.IOpenParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostulanteServices {

    private IOpenParkRepository repository;

    @Autowired
    public PostulanteServices(IOpenParkRepository repository)
    {
        this.repository = repository;
    }


    public OpenparkApplication getById(int id) throws Exception {
        var result = repository.findById(id);

        if(result.isPresent())
        {
            return result.get();
        }
        else
        {
            throw new Exception("Character not found on database");
        }

    }

    public void deletePostulante(int id) {
        repository.deleteById(id);
    }

    public int createPostulante(Postulante postulante) throws Exception {
        if(postulante == null) {
            throw new Exception("La entidad no puede ser nula");
        }

        if(postulante.getFecha_nacimiento() < 1900) {
            throw new Exception("La edad es incorrecta");
        }

        if(postulante.getNombre().length() == 0)
        {
            throw new Exception("El nombre no puede ser vacio");
        }

       // repository.save(postulante);
        return postulante.getDni();
    }

    public OpenparkApplication updateCharacter(Postulante postulante) throws Exception {
        var characterDB = getById(postulante.getDni());

        return repository.save(characterDB);
    }

    public OpenparkApplication updatePostulante(Postulante postulante) throws  Exception{
        var characterDB = getById(postulante.getDni());
        return repository.save(characterDB);
    }
}
