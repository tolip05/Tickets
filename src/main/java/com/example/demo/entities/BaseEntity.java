package com.example.demo.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    private String id;

    public BaseEntity() {
    }
     @Id
         @GeneratedValue(generator = "UUID")
         @GenericGenerator(
                 name = "UUID",
                 strategy = "org.hibernate.id.UUIDGenerator"
         )
         @Column(name = "id", nullable = false, unique = true, updatable = false)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
