package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Weapons implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String achievements_name;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String achievements_description;
    @Column(nullable = false)
    private Integer basic_attack;
    @Column(nullable = false)
    private Integer basic_defense;
    @Column(nullable = false)
    private Integer crit_damage;
    @Column(nullable = false)
    private Integer level;
    @Column(nullable = false)
    private Integer ascension;
    @Column(nullable = false)
    private Integer amounts_stars;
    @Column(nullable = false)
    private String url;

    @Deprecated
    public Weapons(){ };
    public Weapons(Integer id, String achievements_name, String type, String achievements_description, Integer basic_attack, Integer basic_defense, Integer crit_damage, Integer level, Integer ascension, Integer amounts_stars, String url) {
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

    @Override
    public String toString() {
        return "Weapons{" +
                "id=" + id +
                ", achievements_name='" + achievements_name + '\'' +
                ", type='" + type + '\'' +
                ", achievements_description='" + achievements_description + '\'' +
                ", basic_attack=" + basic_attack +
                ", basic_defense=" + basic_defense +
                ", crit_damage=" + crit_damage +
                ", level=" + level +
                ", ascension=" + ascension +
                ", amounts_stars=" + amounts_stars +
                ", url=" + url +
                '}';
    }
}
