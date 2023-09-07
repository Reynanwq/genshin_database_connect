package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.FoodDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Food;
import com.api.genshinimpact.service.CrudFoodService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/foods")
public class FoodController {
    @Autowired
    private CrudFoodService foodService;

    public FoodController(CrudFoodService foodService){
        this.foodService = foodService;
    }

    @GetMapping
    public ResponseEntity<List<FoodDTO>> findAll(){
        List<Food> list = foodService.findALL();
        List<FoodDTO> listDto = list.stream().map(x -> new FoodDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
    @GetMapping(value = "/{id}")
    public FoodDTO findById(@PathVariable Integer id){
        return foodService.findById(id);
    }
}
