package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Quests;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class QuestsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String quests_name;
    private String quests_description;
    private String quests_reward;
    private String quests_chapter;
    private String quests_acts;
    private Integer adventure_rank;

    public QuestsDTO(){};
    public QuestsDTO(Integer id, String quests_name, String quests_description, String quests_reward, String quests_chapter, String quests_acts, Integer adventure_rank) {
        this.id = id;
        this.quests_name = quests_name;
        this.quests_description = quests_description;
        this.quests_reward = quests_reward;
        this.quests_chapter = quests_chapter;
        this.quests_acts = quests_acts;
        this.adventure_rank = adventure_rank;
    }
    public QuestsDTO(Quests quests){
        this.id = quests.getId();
        this.quests_name = quests.getQuests_name();
        this.quests_reward = quests.getQuests_reward();
        this.quests_chapter = quests.getQuests_chapter();
        this.quests_acts = quests.getQuests_acts();
        this.adventure_rank = quests.getAdventure_rank();
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
}
