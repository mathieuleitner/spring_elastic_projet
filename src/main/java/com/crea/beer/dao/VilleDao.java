package com.crea.beer.dao;

import java.util.List;

import com.crea.beer.model.Ville;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleDao extends JpaRepository<Ville, Integer> {

    public Ville findById(long id);

    public List<Ville> findAll();

    @Query(value = "SELECT * FROM ville ORDER BY population DESC", nativeQuery = true)
    List<Ville> seekForLowPeople();
}
