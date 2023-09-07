package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.AchievementsDTO;
import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.entities.Achievements;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.service.CrudAchievementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/achievements")
public class AchievementsController {

    private final CrudAchievementsService achievementsService;

    public AchievementsController(CrudAchievementsService achievementsService){this.achievementsService = achievementsService;};

    @GetMapping
    public ResponseEntity<List<AchievementsDTO>> findAll(){
        List<Achievements> list = (List<Achievements>) achievementsService.findALL();
        List<AchievementsDTO> listDto = list.stream().map(x -> new AchievementsDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public AchievementsDTO findById(@PathVariable Integer id){
        return achievementsService.findById(id);
    }
}