package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity

public class Potions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String potion_name;
    @Column(nullable = false)
    private Integer rarity;
    @Column(nullable = false)
    private String effect;
    @Column(nullable = false)
    private String url;

    @Deprecated
    public Potions(){}
    public Potions(Integer id, String potion_name, Integer rarity, String effect, String url) {
        this.id = id;
        this.potion_name = potion_name;
        this.rarity = rarity;
        this.effect = effect;
        this.url = url;
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

    @Override
    public String toString() {
        return "Potions{" +
                "id=" + id +
                ", potion_name='" + potion_name + '\'' +
                ", rarity=" + rarity +
                ", effect='" + effect + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
