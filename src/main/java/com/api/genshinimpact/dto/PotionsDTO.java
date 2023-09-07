package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Potions;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class PotionsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String potion_name;
    private Integer rarity;
    private String effect;
    private String url;
    PotionsDTO(){};
    PotionsDTO(Integer id, String potion_name, Integer rarity, String effect, String url) {
        this.id = id;
        this.potion_name = potion_name;
        this.rarity = rarity;
        this.effect = effect;
        this.url = url;
    }

    public PotionsDTO(Potions potions){
        this.id = potions.getId();
        this.potion_name = potions.getPotion_name();
        this.rarity = potions.getRarity();
        this.effect = potions.getEffect();
        this.url = potions.getUrl();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPotion_name() {
        return potion_name;
    }

    public void setPotion_name(String potion_name) {
        this.potion_name = potion_name;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
