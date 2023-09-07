package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.QuestsDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Quests;
import com.api.genshinimpact.repository.QuestsRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudQuestsService {
    private QuestsRepository questsRepository;
    public CrudQuestsService(QuestsRepository questsRepository){
        this.questsRepository = questsRepository;
    }

    public void insertData(){
        /*----------------- MISSÕES DO ARCODONTE ---------------*/
        Quests quests0 = new Quests(1, "Archon Quests", "COPY LATER", "REWARD NAMES", "Prologue: The Outsider Who Soars Amid the Wind", "Act I: The Outsider Who Soars Amid the Wind -> Act II: -> Act III:", 0);
       /* Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        /*----------------- MISSÕES LENDÁRIAS ---------------*//*
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        /*----------------- MISSÕES DE MUNDO ---------------*//*
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        /*----------------- MISSÕES DE AVENTURA ---------------*//*
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        this.questsRepository.save(quests0);
        System.out.println("Quests save in database!");
    }

    //----------- SELECIONAR DADOS DA TABELA QUESTS------
    public void selectData(){
        Iterable<Quests> quests = this.questsRepository.findAll();
        for (Quests quest : quests){
            System.out.println(quest);
        }
    };

    public List<Quests> findALL(){
        return (List<Quests>) questsRepository.findAll();
    }

    public QuestsDTO findById(Integer id){
        Quests obj = questsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Quest not found in database with id " + id)
        );
        return new QuestsDTO(obj);
    }
}
