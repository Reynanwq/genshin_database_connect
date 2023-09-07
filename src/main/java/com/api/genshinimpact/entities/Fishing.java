package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Fishing implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String fish_name;
    @Column(nullable = false)
    private String localization;
    @Column(nullable = false)
    private String url;

    @Deprecated
    public Fishing(){};
    public Fishing(Integer id, String fish_name, String localization, String url) {
        this.id = id;
        this.fish_name = fish_name;
        this.localization = localization;
        this.url = url;
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

    @Override
    public String toString() {
        return "Fishing{" +
                "id=" + id +
                ", fish_name='" + fish_name + '\'' +
                ", localization='" + localization + '\'' +
                ", url '" + url + '\'' +
                '}';
    }
}
