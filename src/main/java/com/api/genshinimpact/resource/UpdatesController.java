package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.dto.UpdatesDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Updates;
import com.api.genshinimpact.service.CrudUpdatesService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "updates")
public class UpdatesController {
    @Autowired
    private CrudUpdatesService updatesService;

    public UpdatesController(CrudUpdatesService updatesService){
        this.updatesService = updatesService;
    }

    @GetMapping
    public ResponseEntity<List<UpdatesDTO>> findAll(){
        List<Updates> list = updatesService.findALL();
        List<UpdatesDTO> listDto = list.stream().map(x -> new UpdatesDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public UpdatesDTO findById(@PathVariable Integer id){
        return updatesService.findById(id);
    }
}
