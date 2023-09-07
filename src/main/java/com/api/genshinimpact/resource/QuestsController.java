package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.FoodDTO;
import com.api.genshinimpact.dto.QuestsDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Quests;
import com.api.genshinimpact.service.CrudQuestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/quests")
public class QuestsController {
    @Autowired
    private CrudQuestsService questsService;

    public QuestsController(CrudQuestsService questsService){
        this.questsService = questsService;
    }

    @GetMapping
    public ResponseEntity<List<QuestsDTO>> findAll(){
        List<Quests> list = questsService.findALL();
        List<QuestsDTO> listDto = list.stream().map(x -> new QuestsDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public QuestsDTO findById(@PathVariable Integer id){
        return questsService.findById(id);
    }
}
