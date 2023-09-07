package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Food;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class FoodDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String food_name;
    private String food_description;
    private Integer rarity;
    private String food_type;
    private String url;
    public FoodDTO(){};

    public FoodDTO(Integer id, String food_name, String food_description, Integer rarity, String food_type, String url) {
        this.id = id;
        this.food_name = food_name;
        this.food_description = food_description;
        this.rarity = rarity;
        this.food_type = food_type;
        this.url = url;
    }

    public FoodDTO(Food food){
        this.id = food.getId();
        this.food_name = food.getFood_name();
        this.food_description = food.getFood_description();
        this.rarity = food.getRarity();
        this.food_type = food.getFood_type();
        this.url = food.getUrl();
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
}
