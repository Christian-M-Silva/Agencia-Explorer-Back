package com.agencia.explore.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.explore.model.Origem;



@Repository
public interface OrigemRepository extends JpaRepository<Origem, Integer>{



}