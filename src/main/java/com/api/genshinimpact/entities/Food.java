package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Food implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String food_name;
    @Column(nullable = false)
    private String food_description;
    @Column(nullable = false)
    private Integer rarity;
    @Column(nullable = false)
    private String food_type;
    @Column(nullable = false)
    private String url;

    @Deprecated
    public Food(){};

    public Food(Integer id, String food_name, String food_description, Integer rarity, String food_type, String url) {
        this.id = id;
        this.food_name = food_name;
        this.food_description = food_description;
        this.rarity = rarity;
        this.food_type = food_type;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", food_name='" + food_name + '\'' +
                ", food_description='" + food_description + '\'' +
                ", rarity=" + rarity +
                ", food_type='" + food_type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
