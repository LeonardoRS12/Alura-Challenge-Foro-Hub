package com.leors.alura.Challenge.Foro.Hub.service.TopicoServiceImpl;

import com.leors.alura.Challenge.Foro.Hub.modelos.topicos;
import com.leors.alura.Challenge.Foro.Hub.repositorios.ITopicoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicoServiceImpl implements CRUD {

    private final ITopicoRepositorio repositorio;
    private Integer id;

    @Override
    public List<topicos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public topicos findByID(Integer id) {
        return null;
    }

    @Override
    public topicos save(topicos topicos) {
        return repositorio.findById(id).orElseThrow();
    }

    @Override
    public topicos update(Integer id, topicos topicos) {
        topicos.setId(id);
        return repositorio.save(topicos);
    }

    @Override
    public void deleteById(Integer id) {
        repositorio.deleteById(id);
    }
}