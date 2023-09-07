package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.PlayerDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Player;
import com.api.genshinimpact.repository.PlayerRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudPlayerService {
    private final PlayerRepository playerRepository;
    @Autowired
    public CrudPlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public void insertData(){
        Player player0 = new Player(1, "Reynan Paiva", "reynanwq@gmail.com", "deathmcpe!@##!#fdsfdffk", 65, 4, 2);
        this.playerRepository.save(player0);
        System.out.println("PLAYER SAVE IN DATABASE");
    }

    //----------- SELECIONAR DADOS DA TABELA PLAYER------
    public void selectData(){
        Iterable<Player> players = this.playerRepository.findAll();
        for (Player player : players){
            System.out.println(player);
        }
    };

    public List<Player> findALL(){
        return (List<Player>) playerRepository.findAll();
    }

    public PlayerDTO findById(Integer id){
            Player obj = playerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Player not found in database with id: " + id));
            return new PlayerDTO(obj);
    };
}
