package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Player;

import java.io.Serializable;

public class PlayerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String player_name;

    public PlayerDTO(){ };
    public PlayerDTO(int id, String player_name){
        super();
        this.id = id;
        this.player_name  =  player_name;
    }

    public PlayerDTO(Player player){
        this.id =  player.getId();
        this.player_name =  player.getPlayer_name();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPlayer_name() {
        return player_name;
    }
    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
}
