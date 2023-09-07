package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.StatisticCharactersDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.StatisticCharacters;
import com.api.genshinimpact.repository.StatisticCharactersRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import io.micrometer.core.instrument.Statistic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudStatisticCharactersService {
    private StatisticCharactersRepository statisticCharactersRepository;

    public CrudStatisticCharactersService(StatisticCharactersRepository statisticCharactersRepository){
        this.statisticCharactersRepository = statisticCharactersRepository;
    }
    public void insertData(){

        //TODOS SÃO APÓS A ASCENÇÃO

        // ----------- ESTATISTICAS DO ALBEDO ---------
        StatisticCharacters Albedo_1_20 = new StatisticCharacters(1, "ALbedo", 1-20, 1, 1030, 20, 68, 0);
       /* StatisticCharacters Albedo_20_40 = new StatisticCharacters(2, "ALbedo", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters Albedo_40_50 = new StatisticCharacters(3, "ALbedo", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters Albedo_50_60 = new StatisticCharacters(4, "ALbedo", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters Albedo_60_70 = new StatisticCharacters(5, "ALbedo", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters Albedo_70_80 = new StatisticCharacters(6, "ALbedo", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters Albedo_80_90 = new StatisticCharacters(7, "ALbedo", 80-90, 0, 0, 0, 0, 0);*/

        // ----------- ESTATISTICAS DO X ---------
     /*   StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);*/

        // ----------- ESTATISTICAS DO X ---------
/*
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);*/

        // ----------- ESTATISTICAS DO X ---------
/*
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);*

        // ----------- ESTATISTICAS DO X ---------
/*
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);*/

        // ----------- ESTATISTICAS DO X ---------
/*
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);

        // ----------- ESTATISTICAS DO X ---------
        StatisticCharacters X_1_20 = new StatisticCharacters(1, "", 1-20, 0, 0, 0, 0, 0);
        StatisticCharacters X_20_40 = new StatisticCharacters(2, "", 20-40, 0, 0, 0, 0, 0);
        StatisticCharacters X_40_50 = new StatisticCharacters(3, "", 40-50, 0, 0, 0, 0, 0);
        StatisticCharacters X_50_60 = new StatisticCharacters(4, "", 50-60, 0, 0, 0, 0, 0);
        StatisticCharacters X_60_70 = new StatisticCharacters(5, "", 60-70, 0, 0, 0, 0, 0);
        StatisticCharacters X_70_80 = new StatisticCharacters(6, "", 70-80, 0, 0, 0, 0, 0);
        StatisticCharacters X_80_90 = new StatisticCharacters(7, "", 80-90, 0, 0, 0, 0, 0);
*/

        this.statisticCharactersRepository.save(Albedo_1_20);
        System.out.println("Save Statistic in database");
    }

    //----------- SELECIONAR DADOS DA TABELA STATISTIC CHARACTERS------
    public void selectData(){
        Iterable<StatisticCharacters> statisticCharacters = this.statisticCharactersRepository.findAll();
        for (StatisticCharacters statisticCharacter : statisticCharacters){
            System.out.println(statisticCharacter);
        }
    };

    public List<StatisticCharacters> findALL(){ return (List<StatisticCharacters>) statisticCharactersRepository.findAll();  }

    public StatisticCharactersDTO findById(Integer id){
      StatisticCharacters obj = statisticCharactersRepository.findById(id).orElseThrow(
              () -> new EntityNotFoundException("Statistic not found with id: " + id)
      );
      return new StatisticCharactersDTO(obj);
    };
}
