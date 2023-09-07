package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Achievements;
import jakarta.persistence.Column;

import java.io.Serializable;

public class AchievementsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String achievementsTopic;
    private String achievementsName;
    private String achievementsDescription;
    private Integer rarity;
    private Integer totalAmountRarity;

    public AchievementsDTO(){};

    public  AchievementsDTO(Integer id, String achievementsTopic, String achievementsName, String achievementsDescription, Integer rarity, Integer totalAmountRarity){
        super();
        this.id = id;
        this.achievementsTopic = achievementsTopic;
        this.achievementsName = achievementsName;
        this.achievementsDescription = achievementsDescription;
        this.rarity = rarity;
        this.totalAmountRarity = totalAmountRarity;
    }

    public  AchievementsDTO(Achievements achievements){
        this.id = achievements.getId();
        this.achievementsTopic = achievements.getAchievements_topic();
        this.achievementsName = achievements.getAchievements_name();
        this.achievementsDescription = achievements.getAchievements_description();
        this.rarity = achievements.getRarity();
        this.totalAmountRarity = achievements.getTotal_amount_rarity();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAchievements_topic() {
        return achievementsTopic;
    }

    public void setAchievements_topic(String achievements_topic) {
        this.achievementsTopic = achievements_topic;
    }

    public String getAchievements_name() {
        return achievementsName;
    }

    public void setAchievements_name(String achievements_name) {
        this.achievementsName = achievements_name;
    }

    public String getAchievements_description() {
        return achievementsDescription;
    }

    public void setAchievements_description(String achievements_description) {
        this.achievementsDescription = achievements_description;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Integer getTotal_amount_rarity() {
        return totalAmountRarity;
    }

    public void setTotal_amount_rarity(Integer total_amount_rarity) {
        this.totalAmountRarity = total_amount_rarity;
    }
}
