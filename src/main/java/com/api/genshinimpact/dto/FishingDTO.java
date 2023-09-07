package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Fishing;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class FishingDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fish_name;
    private String localization;
    private String url;

    public FishingDTO(){};

    public FishingDTO(Integer id, String fish_name, String localization, String url) {
        this.id = id;
        this.fish_name = fish_name;
        this.localization = localization;
        this.url = url;
    }
    public FishingDTO(Fishing fishing){
        this.id = fishing.getId();
        this.fish_name = fishing.getFish_name();
        this.localization = fishing.getLocalization();
        this.url = fishing.getUrl();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFish_name() {
        return fish_name;
    }
    public void setFish_name(String fish_name) {
        this.fish_name = fish_name;
    }
    public String getLocalization() {
        return localization;
    }
    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}