package com.crea.beer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ville {
    @Id
    @Field(type = FieldType.Long)
    private long id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private long population;

}