package com.agencia.explore.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.explore.model.Destino;



@Repository
public interface DestinoRepository extends JpaRepository<Destino, Integer>{



}