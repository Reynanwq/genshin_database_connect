package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "achievements")
public class Achievements implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String achievementsTopic;
    @Column(nullable = false)
    private String achievementsName;
    @Column(nullable = false)
    private String achievementsDescription;
    @Column(nullable = false)
    private Integer rarity;
    @Column(nullable = false)
    private Integer totalAmountRarity;

    @Deprecated
    public Achievements(){ } //um como vazio é algo padrão

    public Achievements(Integer id, String achievementsTopic, String achievementsName, String achievementsDescription, Integer rarity, Integer totalAmountRarity) {
        this.id = id;
        this.achievementsTopic = achievementsTopic;
        this.achievementsName = achievementsName;
        this.achievementsDescription = achievementsDescription;
        this.rarity = rarity;
        this.totalAmountRarity = totalAmountRarity;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getAchievements_topic() {
        return achievementsTopic;
    }

    public String getAchievements_description() {
        return achievementsDescription;
    }

    public void setAchievements_description(String achievements_description) {
        this.achievementsDescription = achievements_description;
    }

    public String getAchievements_name() {
        return achievementsName;
    }

    public void setAchievements_name(String achievements_name) {
        this.achievementsName = achievements_name;
    }

    public void setAchievements_topic(String achievements_topic) {
        this.achievementsTopic = achievements_topic;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal_amount_rarity() {
        return totalAmountRarity;
    }

    public void setTotal_amount_rarity(Integer total_amount_rarity) {
        this.totalAmountRarity = total_amount_rarity;
    }

    @Override
    public String toString() {
        return "Achievements{" +
                "id=" + id +
                ", achievements_topic='" + achievementsTopic + '\'' +
                ", achievements_name='" + achievementsName + '\'' +
                ", achievements_description='" + achievementsDescription + '\'' +
                ", rarity=" + rarity +
                ", total_amount_rarity=" + totalAmountRarity +
                '}';
    }
}
