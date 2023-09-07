package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.PlayerDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Player;
import com.api.genshinimpact.service.CrudPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/players") //away how the controller will response
public class PlayerController {

    @Autowired
    private CrudPlayerService playerService;

    public PlayerController(CrudPlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<PlayerDTO>> findAll(){
        List<Player> list = playerService.findALL();
        List<PlayerDTO> listDto = list.stream().map(x -> new PlayerDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
    @GetMapping(value = "/{id}")
    public PlayerDTO findById(@PathVariable Integer id){
        //controller call the service
        return playerService.findById(id);
    }
}
