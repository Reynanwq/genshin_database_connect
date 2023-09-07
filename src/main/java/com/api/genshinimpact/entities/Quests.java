package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "quests")
public class Quests implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String quests_name;
    @Column(nullable = false)
    private String quests_description;
    @Column(nullable = false)
    private String quests_reward;
    @Column(nullable = false)
    private String quests_chapter;
    @Column(nullable = false)
    private String quests_acts;
    @Column(nullable = false)
    private Integer adventure_rank;

    @Deprecated
    public Quests(){ }
    public Quests(Integer id, String quests_name, String quests_description, String quests_reward, String quests_chapter, String quests_acts, Integer adventure_rank) {
        this.id = id;
        this.quests_name = quests_name;
        this.quests_description = quests_description;
        this.quests_reward = quests_reward;
        this.quests_chapter = quests_chapter;
        this.quests_acts = quests_acts;
        this.adventure_rank = adventure_rank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuests_name() {
        return quests_name;
    }

    public void setQuests_name(String quests_name) {
        this.quests_name = quests_name;
    }

    public String getQuests_description() {
        return quests_description;
    }

    public void setQuests_description(String quests_description) {
        this.quests_description = quests_description;
    }

    public String getQuests_reward() {
        return quests_reward;
    }

    public void setQuests_reward(String quests_reward) {
        this.quests_reward = quests_reward;
    }

    public String getQuests_chapter() {
        return quests_chapter;
    }

    public void setQuests_chapter(String quests_chapter) {
        this.quests_chapter = quests_chapter;
    }

    public String getQuests_acts() {
        return quests_acts;
    }

    public void setQuests_acts(String quests_acts) {
        this.quests_acts = quests_acts;
    }

    public Integer getAdventure_rank() {
        return adventure_rank;
    }

    public void setAdventure_rank(Integer adventure_rank) {
        this.adventure_rank = adventure_rank;
    }

    @Override
    public String toString() {
        return "Quests{" +
                "id=" + id +
                ", quests_name='" + quests_name + '\'' +
                ", quests_description='" + quests_description + '\'' +
                ", quests_reward='" + quests_reward + '\'' +
                ", quests_chapter='" + quests_chapter + '\'' +
                ", quests_acts='" + quests_acts + '\'' +
                ", adventure_rank=" + adventure_rank +
                '}';
    }
}
