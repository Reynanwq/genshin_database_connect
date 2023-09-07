package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.FishingDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Fishing;
import com.api.genshinimpact.service.CrudFishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/fishing")
public class FishingController {
    @Autowired
    private CrudFishingService fishingService;

    public FishingController(CrudFishingService fishingService){
        this.fishingService = fishingService;
    }

    @GetMapping
    public ResponseEntity<List<FishingDTO>> findAll(){
        List<Fishing> list = fishingService.findALL();
        List<FishingDTO> listDto = list.stream().map(x -> new FishingDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public FishingDTO findById(@PathVariable Integer id){
        return fishingService.findById(id);
    }
}
