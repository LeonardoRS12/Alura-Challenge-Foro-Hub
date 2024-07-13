package com.leors.alura.Challenge.Foro.Hub.repositorios;

import com.leors.alura.Challenge.Foro.Hub.modelos.topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicoRepositorio extends JpaRepository<topicos, Integer> {
}