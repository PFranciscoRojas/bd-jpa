package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private Integer actor_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;


    public Actor() {
    }

    public Actor(Integer actor_id, String first_name, String last_name) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    
    public Integer getactor_id() {
        return actor_id;
    }
    public void setactor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Actor [actor_id=" + actor_id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
    }

    
}
