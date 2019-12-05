package com.crea.beer.controller;

import com.crea.beer.dao.BarDao;
import com.crea.beer.model.Bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController("/bars")
public class BarController {

    @Autowired
    private BarDao barDao;

    @GetMapping("/bars")
    public Page<Bar> getAllbeer() {
        Page<Bar> bars = barDao.findAll();
        return bars;
    }

    @GetMapping("/bars/bar/{id}")
    public Bar getBeer(@PathVariable Long id) {
        Bar bar = barDao.findById(id);
        return bar;
    }
}