package com.crea.beer.dao;

import java.util.List;

import com.crea.beer.model.Beer;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerDao extends ElasticsearchRepository<Beer, Integer> {

    public Beer findById(long id);

    public List<Beer> findByName(String name);

    public Page<Beer> findAll();
}
