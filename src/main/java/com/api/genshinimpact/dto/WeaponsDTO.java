package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Weapons;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class WeaponsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String achievements_name;
    private String type;
    private String achievements_description;
    private Integer basic_attack;
    private Integer basic_defense;
    private Integer crit_damage;
    private Integer level;
    private Integer ascension;
    private Integer amounts_stars;
    private String url;
    public WeaponsDTO(){};

    public WeaponsDTO(Integer id, String achievements_name, String type, String achievements_description, Integer basic_attack, Integer basic_defense, Integer crit_damage, Integer level, Integer ascension, Integer amounts_stars, String url) {
        this.id = id;
        this.achievements_name = achievements_name;
        this.type = type;
        this.achievements_description = achievements_description;
        this.basic_attack = basic_attack;
        this.basic_defense = basic_defense;
        this.crit_damage = crit_damage;
        this.level = level;
        this.ascension = ascension;
        this.amounts_stars = amounts_stars;
        this.url = url;
    }
    public WeaponsDTO(Weapons weapons){
        this.id = weapons.getId();
        this.achievements_name = weapons.getAchievements_name();
        this.type = weapons.getType();
        this.achievements_name = weapons.getAchievements_name();
        this.achievements_description = weapons.getAchievements_description();
        this.basic_attack = weapons.getBasic_attack();
        this.basic_defense = weapons.getBasic_defense();
        this.crit_damage = weapons.getCrit_damage();
        this.level = weapons.getLevel();
        this.ascension = weapons.getAscension();
        this.amounts_stars = weapons.getAmounts_stars();
        this.url = weapons.getUrl();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAchievements_name() {
        return achievements_name;
    }

    public void setAchievements_name(String achievements_name) {
        this.achievements_name = achievements_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAchievements_description() {
        return achievements_description;
    }

    public void setAchievements_description(String achievements_description) {
        this.achievements_description = achievements_description;
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

    public Integer getCrit_damage() {
        return crit_damage;
    }

    public void setCrit_damage(Integer crit_damage) {
        this.crit_damage = crit_damage;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAscension() {
        return ascension;
    }

    public void setAscension(Integer ascension) {
        this.ascension = ascension;
    }

    public Integer getAmounts_stars() {
        return amounts_stars;
    }

    public void setAmounts_stars(Integer amounts_stars) {
        this.amounts_stars = amounts_stars;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
