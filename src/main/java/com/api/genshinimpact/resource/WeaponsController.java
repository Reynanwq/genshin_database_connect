package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.WeaponsDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Weapons;
import com.api.genshinimpact.service.CrudWeaponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/weapons")
public class WeaponsController {
    @Autowired
    private CrudWeaponsService weaponsService;

    public WeaponsController(CrudWeaponsService weaponsService){
        this.weaponsService = weaponsService;
    }

    @GetMapping
    public ResponseEntity<List<WeaponsDTO>> findAll(){
        List<Weapons> list = weaponsService.findALL();
        List<WeaponsDTO> listDto = list.stream().map(x -> new WeaponsDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public WeaponsDTO findById(@PathVariable Integer id){
        return weaponsService.findById(id);
    }
}
