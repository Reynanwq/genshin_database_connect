package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.PotionsDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Potions;
import com.api.genshinimpact.repository.PotionsRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudPotionsService {
    private PotionsRepository potionsRepository;
    public CrudPotionsService(PotionsRepository potionsRepository){
        this.potionsRepository = potionsRepository;
    }
    public void insertData(){
        //about the PATH, is "../../assets/potions/" for everybody that stay here

        Potions dendrocide_potion = new Potions(1, "Dendrocide Potion", 3, "Increases DEF of all party members by 25% for 300s.", "../../assets/potions/dendrocide_potion.webp");
        Potions protective_potion = new Potions(2, "Protective Potion", 3, "Increases Dendro RES of all party members by 25% for 300s.", "../../assets/potions/desiccant_potion.webp");
        Potions Dutsproof_potion = new Potions(3, "Dutsproof Potion", 3, "Increases all party members' Geo RES by 25% for 300s.", "../../assets/potions/dustproof_potion.webp");
        Potions Flaming_Essential_Oil = new Potions(4, "Flaming Essential Oil", 3, "Increases all party members' Pyro DMG by 25% for 300s.", "../../assets/potions/flaming_essential_oil.webp");
        Potions Forest_Essential_Oil = new Potions(5, "Forest Essential Oil", 3, "Increases all party members' Dendro DMG by 25% for 300s.", "../../assets/potions/forest_essential_oil.webp");
        Potions Frosting_Essential_Oil = new Potions(6, "Frosting Essential Oil", 3, "Increases all party members' Cryo DMG by 25% for 300s.", "../../assets/potions/frosting_essential_oil.webp");
        Potions Frostshield_Potion = new Potions(7, "Frostshield Potion", 3, "Increases all party members' Cryo RES by 25% for 300s.", "../../assets/potions/frostshield_potion.webp");
        Potions Gushing_Essential_Oil = new Potions(8, "Gushing Essential Oil", 3, "Increases all party members' Anemo DMG by 25% for 300s.", "../../assets/potions/gushing_essential_oil.webp");
        Potions Heatshield_Potion = new Potions(9, "Heatshield Potion", 3, "Increases all party members' Pyro RES by 25% for 300s.", "../../assets/potions/heatshield_potion.webp");
        Potions Insulation_Potion = new Potions(10, "Insulation Potion", 3, "Increases all party members' Electro RES by 25% for 300s.", "../../assets/potions/insulation_potion.webp");
        Potions Shocking_Essential_Oil = new Potions(11, "Shocking Essential Oil", 3, "Increases all party members' Electro DMG by 25% for 300s.", "../../assets/potions/shocking_essential_oil.webp");
        Potions Streaming_Essential_Oil = new Potions(12, "Streaming Essential Oil", 3, "Increases all party members' Hydro DMG by 25% for 300s.", "../../assets/potions/streaming_essential_oil.webp");
        Potions Unmoving_Essential_Oil = new Potions(13, "Unmoving Essential Oil", 3, "Increases all party members' Geo DMG by 25% for 300s.", "../../assets/potions/unmoving_essential_oil.webp");
        Potions Windbarrier_Potion = new Potions(14, "Windbarrier Potion", 3, "Increases all party members' Anemo RES by 25% for 300s.", "../../assets/potions/windbarrier_potion.webp");


        this.potionsRepository.save(dendrocide_potion);
        this.potionsRepository.save(protective_potion);
        this.potionsRepository.save(Dutsproof_potion);
        this.potionsRepository.save(Flaming_Essential_Oil);
        this.potionsRepository.save(Forest_Essential_Oil);
        this.potionsRepository.save(Frosting_Essential_Oil);
        this.potionsRepository.save(Frostshield_Potion);
        this.potionsRepository.save(Gushing_Essential_Oil);
        this.potionsRepository.save(Heatshield_Potion);
        this.potionsRepository.save(Insulation_Potion);
        this.potionsRepository.save(Shocking_Essential_Oil);
        this.potionsRepository.save(Streaming_Essential_Oil);
        this.potionsRepository.save(Unmoving_Essential_Oil);
        this.potionsRepository.save(Windbarrier_Potion);




        System.out.println("Save potions on database");
    }

    //----------- SELECIONAR DADOS DA TABELA POTIONS ------
    public void selectData(){
        Iterable<Potions> potions = this.potionsRepository.findAll();
        for (Potions potion : potions){
            System.out.println(potion);
        }
    };

    public List<Potions> findALL(){
        return (List<Potions>) potionsRepository.findAll();
    }

    public PotionsDTO findById(Integer id){
        Potions obj = potionsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Potions not found in database with id: " + id)
        );
        return new PotionsDTO(obj);
    };
}
