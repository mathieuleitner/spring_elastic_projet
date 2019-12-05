package com.crea.beer.dao;

import com.crea.beer.model.Bar;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarDao extends ElasticsearchRepository<Bar, Integer> {

    public Bar findById(long id);

    public Page<Bar> findAll();
}
