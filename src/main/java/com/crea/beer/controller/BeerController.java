package com.crea.beer.controller;

import java.util.List;

import com.crea.beer.dao.BeerDao;
import com.crea.beer.model.Beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController("/beers")
public class BeerController {

    @Autowired
    private BeerDao beerDao;

    @GetMapping("/beers/all")
    public Page<Beer> getAllbeer() {
        Page<Beer> beers = beerDao.findAll();
        return beers;
    }

    @GetMapping("/beers/{name}")
    public List<Beer> findByName(@PathVariable String name) {
        return beerDao.findByName(name);

    }

    @GetMapping("/beers/beer/{id}")
    public Beer getBeer(@PathVariable Long id) {
        Beer beer = beerDao.findById(id);

        return beer;
    }

}