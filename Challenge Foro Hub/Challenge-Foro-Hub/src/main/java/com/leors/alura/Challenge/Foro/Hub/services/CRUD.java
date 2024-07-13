package com.leors.alura.Challenge.Foro.Hub.services.CRUD;

import com.leors.alura.Challenge.Foro.Hub.modelos.topicos;
import java.util.List;
public interface CRUD {
    // Metodo para Request GET
    List<topicos> findAll();
    topicos findByID(Integer id);

    // Metodo para Request POST
    topicos save(topicos topicos);

    //Metodo para Request PUT
    topicos update(Integer id, topicos topicos);

    //Metodo para Request DELETE
    void deleteById(Integer id);
}