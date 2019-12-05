package com.crea.beer.controller;

import java.util.List;

import com.crea.beer.dao.VilleDao;
import com.crea.beer.model.Ville;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RestController("/villes")
public class VilleController {
    @Autowired
    private VilleDao villeDao;

    @GetMapping("/villes")
    public List<Ville> getAllVilles() {
        return villeDao.findAll();
    }

    @GetMapping("/villes/{id}")
    public Ville findById(@PathVariable int id) {
        return villeDao.findById(id);
    }

    @GetMapping("/villes/whohasthebiggest")
    public List<Ville> seekForLowPeople() {
        return villeDao.seekForLowPeople();
    }

    @PostMapping("/villes/add")
    public List<Ville> addVille(@RequestBody Ville ville) {
        // code
        villeDao.save(ville);
        return villeDao.findAll();
    }

}