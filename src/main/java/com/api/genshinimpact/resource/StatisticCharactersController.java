package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.StatisticCharactersDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.StatisticCharacters;
import com.api.genshinimpact.service.CrudStatisticCharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/statistics")
public class StatisticCharactersController {
    @Autowired
    private CrudStatisticCharactersService statisticCharactersServices;

    public StatisticCharactersController(CrudStatisticCharactersService statisticCharactersService){
        this.statisticCharactersServices = statisticCharactersService;
    }

    @GetMapping
    public ResponseEntity<List<StatisticCharactersDTO>> findAll(){
        List<StatisticCharacters> list = statisticCharactersServices.findALL();
        List<StatisticCharactersDTO> listDto = list.stream().map(x -> new StatisticCharactersDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public StatisticCharactersDTO findById(@PathVariable Integer id){
        return statisticCharactersServices.findById(id);
    }

}
