package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Characters;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class CharactersDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private Integer level;
    private String description;
    private String release_date;
    private String gender;
    private String skills;
    private String passive_talent;
    private String constellations;
    private String url;
    public CharactersDTO(){}

    public CharactersDTO(Integer id, String name, String type, Integer level, String description, String release_date, String gender, String skills, String passive_talent, String constellations, String url){
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.description = description;
        this.release_date = release_date;
        this.gender = gender;
        this.skills = skills;
        this.passive_talent = passive_talent;
        this.constellations = constellations;
        this.url = url;
    }
    public CharactersDTO(Characters characters){
        this.id = characters.getId();
        this.name = characters.getName();
        this.type = characters.getType();
        this.level = characters.getLevel();
        this.description = characters.getDescription();
        this.release_date = characters.getRelease_date();
        this.gender = characters.getGender();
        this.skills = characters.getSkills();
        this.passive_talent = characters.getPassive_talent();
        this.constellations = characters.getConstellations();
        this.url =  characters.getUrl();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getPassive_talent() {
        return passive_talent;
    }

    public void setPassive_talent(String passive_talent) {
        this.passive_talent = passive_talent;
    }

    public String getConstellations() {
        return constellations;
    }

    public void setConstellations(String constellations) {
        this.constellations = constellations;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
