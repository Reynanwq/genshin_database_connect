package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.PotionsDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Potions;
import com.api.genshinimpact.service.CrudPotionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/potions")
public class PotionsController {
    @Autowired
    private CrudPotionsService potionsService;
    public PotionsController(CrudPotionsService potionsService){
        this.potionsService = potionsService;
    }

    @GetMapping
    public ResponseEntity<List<PotionsDTO>> findAll(){
        List<Potions> list = potionsService.findALL();
        List<PotionsDTO> listDto = list.stream().map(x -> new PotionsDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public PotionsDTO findById(@PathVariable Integer id){
        return potionsService.findById(id);
    }
}
