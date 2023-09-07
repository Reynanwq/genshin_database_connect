package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.service.CrudAchievementsService;
import com.api.genshinimpact.service.CrudCharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.web.exchanges.HttpExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/characters")
public class CharactersController {
    @Autowired
    private CrudCharactersService charactersService;
    public CharactersController(CrudCharactersService charactersService){
        this.charactersService = charactersService;
    }

    @GetMapping("/{id}")
    public CharactersDTO findById(@PathVariable Integer id){
        return charactersService.findById(id);
    }

    @GetMapping(value = "/character/{name}")
    public ResponseEntity <List<Characters>> getCharacterByName(@PathVariable String name){
        List<Characters> characters = charactersService.findCharacterByName(name);
        if (characters.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(characters);
        }
    }

    @GetMapping
    public ResponseEntity<List<CharactersDTO>> findAll(){
        List<Characters> list = charactersService.findALL();
        List<CharactersDTO> listDto = list.stream().map(x -> new CharactersDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
}
