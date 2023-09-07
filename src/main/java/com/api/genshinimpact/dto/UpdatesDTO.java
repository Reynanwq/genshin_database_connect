package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Updates;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class UpdatesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String path_version;
    private String path_name;
    private String path_status;
    private String path_weapons;
    private String path_characters;
    private String path_time;
    private String path_characters_limited;
    private String url;
    public UpdatesDTO(){};
    public UpdatesDTO(Integer id, String path_version, String path_name, String path_status, String path_weapons, String path_characters, String path_time, String path_characters_limited, String url) {
        this.id = id;
        this.path_version = path_version;
        this.path_name = path_name;
        this.path_status = path_status;
        this.path_weapons = path_weapons;
        this.path_characters = path_characters;
        this.path_time = path_time;
        this.path_characters_limited = path_characters_limited;
        this.url = url;
    }

    public UpdatesDTO(Updates updates){
        this.id = updates.getId();
        this.path_version = updates.getPath_version();
        this.path_name = updates.getPath_name();
        this.path_status = updates.getPath_status();
        this.path_weapons = updates.getPath_weapons();
        this.path_characters = updates.getPath_characters();
        this.path_time = updates.getPath_time();
        this.path_characters_limited = updates.getPath_characters_limited();
        this.url = updates.getUrl();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath_version() {
        return path_version;
    }

    public void setPath_version(String path_version) {
        this.path_version = path_version;
    }

    public String getPath_name() {
        return path_name;
    }

    public void setPath_name(String path_name) {
        this.path_name = path_name;
    }

    public String getPath_status() {
        return path_status;
    }

    public void setPath_status(String path_status) {
        this.path_status = path_status;
    }

    public String getPath_weapons() {
        return path_weapons;
    }

    public void setPath_weapons(String path_weapons) {
        this.path_weapons = path_weapons;
    }

    public String getPath_characters() {
        return path_characters;
    }

    public void setPath_characters(String path_characters) {
        this.path_characters = path_characters;
    }

    public String getPath_time() {
        return path_time;
    }

    public void setPath_time(String path_time) {
        this.path_time = path_time;
    }

    public String getPath_characters_limited() {
        return path_characters_limited;
    }

    public void setPath_characters_limited(String path_characters_limited) {
        this.path_characters_limited = path_characters_limited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
