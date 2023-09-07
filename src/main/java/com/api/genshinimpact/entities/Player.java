package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "player")
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String player_name;
    @Column(nullable = false)
    private String player_email;
    @Column(nullable = false)
    private String player_password;
    @Column(nullable = false)
    private Integer level;
    @Column(nullable = false)
    private Integer experience;
    @Column(nullable = false)
    private Integer currency;

    @Deprecated
    public Player(){}
    public Player(Integer id, String player_name, String player_email, String player_password, Integer level, Integer experience, Integer currency) {
        this.id = id;
        this.player_name = player_name;
        this.player_email = player_email;
        this.player_password = player_password;
        this.level = level;
        this.experience = experience;
        this.currency = currency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_email() {
        return player_email;
    }

    public void setPlayer_email(String player_email) {
        this.player_email = player_email;
    }

    public String getPlayer_password() {
        return player_password;
    }

    public void setPlayer_password(String player_password) {
        this.player_password = player_password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", player_name='" + player_name + '\'' +
                ", player_email='" + player_email + '\'' +
                ", player_password='" + player_password + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", currency=" + currency +
                '}';
    }
}
