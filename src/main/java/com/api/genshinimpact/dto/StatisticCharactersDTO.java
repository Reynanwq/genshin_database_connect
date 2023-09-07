package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.StatisticCharacters;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class StatisticCharactersDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name_characters;
    private Integer level;
    private Integer ascender;
    private Integer basic_life;
    private Integer basic_attack;
    private Integer basic_defense;
    private Integer damage_bonus;

    public StatisticCharactersDTO(){};

    public StatisticCharactersDTO(Integer id, String name_characters, Integer level, Integer ascender, Integer basic_life, Integer basic_attack, Integer basic_defense, Integer damage_bonus) {
        this.id = id;
        this.name_characters = name_characters;
        this.level = level;
        this.ascender = ascender;
        this.basic_life = basic_life;
        this.basic_attack = basic_attack;
        this.basic_defense = basic_defense;
        this.damage_bonus = damage_bonus;
    }

    public StatisticCharactersDTO(StatisticCharacters statisticCharacters){
        this.id = statisticCharacters.getId();
        this.name_characters = statisticCharacters.getName_characters();
        this.level = statisticCharacters.getLevel();
        this.ascender = statisticCharacters.getAscender();
        this.basic_life = statisticCharacters.getBasic_life();
        this.basic_attack = statisticCharacters.getBasic_attack();
        this.basic_defense = statisticCharacters.getBasic_defense();
        this.damage_bonus = statisticCharacters.getDamage_bonus();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_characters() {
        return name_characters;
    }

    public void setName_characters(String name_characters) {
        this.name_characters = name_characters;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAscender() {
        return ascender;
    }

    public void setAscender(Integer ascender) {
        this.ascender = ascender;
    }

    public Integer getBasic_life() {
        return basic_life;
    }

    public void setBasic_life(Integer basic_life) {
        this.basic_life = basic_life;
    }

    public Integer getBasic_attack() {
        return basic_attack;
    }

    public void setBasic_attack(Integer basic_attack) {
        this.basic_attack = basic_attack;
    }

    public Integer getBasic_defense() {
        return basic_defense;
    }

    public void setBasic_defense(Integer basic_defense) {
        this.basic_defense = basic_defense;
    }

    public Integer getDamage_bonus() {
        return damage_bonus;
    }

    public void setDamage_bonus(Integer damage_bonus) {
        this.damage_bonus = damage_bonus;
    }
}
