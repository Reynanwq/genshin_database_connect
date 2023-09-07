package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.FishingDTO;
import com.api.genshinimpact.dto.WeaponsDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Fishing;
import com.api.genshinimpact.entities.Weapons;
import com.api.genshinimpact.repository.WeaponsRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudWeaponsService {
    private WeaponsRepository weaponsRepository;
    public CrudWeaponsService(WeaponsRepository weaponsRepository){
        this.weaponsRepository = weaponsRepository;
    }
    public void insertData(){
        //about the PATH, is "../../assets/weapons/" for everybody that stay here

        Weapons thundering_pulse = new Weapons(1, "Thundering Pulse", "Bow", "A longbow that was bestowed upon someone by the Shogun. It emits unceasing lightning.", 46, 0, 14, 1, 0, 5, "../../assets/weapons/thundering_pulse.webp");
        Weapons aqua_simulacra = new Weapons(2, "Aqua Simulacra", "Bow", "The color of this longbow changes unpredictably. Under the light, it gleams with a bluish water-like shine.", 44, 0, 19, 1, 0, 5, "../../assets/weapons/aqua_simulacra.webp");
        Weapons The_Dock = new Weapons(3, "The Dock", "Sword", "When the equipping character is healed or uses a heal, they will gain a Stoic's Symbol that lasts 30s, up to a maximum of 3 Symbols.", 1, 1, 1, 1, 1, 4, "../../assets/weapons/the_dock.webp");
        Weapons Portable_Power_Saw = new Weapons(4, "Portable Power Saw", "Claymore", "When the equipping character is healed or uses a heal, they will gain a Stoic's Symbol that lasts 30s, up to a maximum of 3 Symbols.", 1, 1, 1, 1, 1, 4, "../../assets/weapons/portable_power_saw.webp");
        Weapons Prospectors_Dril = new Weapons(5, "Prospector's Dril", "", "When the equipping character is healed or uses a heal, they will gain a Mark of Unity that lasts 30s, up to a maximum of 3 Marks.", 1, 1, 1, 1, 1,4, "../../assets/weapons/prospectors_drill.webp");
        Weapons Ballad_of_the_Boundless_Blue = new Weapons(6, "Ballad of the Boundless Blue", "Catalyst", "Within 6s after Normal or Charged Attacks hit an opponent.", 1, 1, 1, 1, 1, 4, "../../assets/weapons/ballad_of_the_boundless_blue.webp");
        Weapons Range_Gauge = new Weapons(7, "Range Gauge", "Bow", "When the equipping character is healed or uses a heal, they will gain a Mark of Unity that lasts 30s, up to a maximum of 3 Marks.", 1, 1, 1, 1, 1, 4, "../../assets/weapons/range_gauge.webp");
        Weapons Cashflow_Supervision = new Weapons(8, "Cashflow Supervision", "Catalyst", "ATK is increased by 12%. When current HP increases or decreases, Normal Attack DMG will be increased by 14%.", 1, 1, 1, 1, 1,5, "../../assets/weapons/cashflow_supervision.webp");
        Weapons Rite_of_the_Eternal_Flow = new Weapons(9, "Rite of the Eternal Flow", "Catalyst", "HP increased by 16%. When current HP increases or decreases, Charged Attack DMG will be increased by 12% for 4s.", 1, 1, 1, 1, 1, 5, "../../assets/weapons/rite_of_the_eternal_flow.webp");
        Weapons A_Thousand_Floating_Dreams  = new Weapons(10, "A Thousand Floating Dreams ", "Catalyst", "This lamp illuminates the dreams that float up over a thousand nights, and in its emerald-green light flows a song of ancient days.", 1, 1, 1, 1, 1, 5, "../../assets/weapons/a_thousand_floating_dreams.webp");
        Weapons Amos_Bow  = new Weapons(11, "Amos' Bow ", "Bow", "An extremely ancient bow that has retained its power despite its original master being long gone.", 0, 0, 0, 0, 0, 5, "../../assets/weapons/amos_bow.webp");
        Weapons Aquila_Favonia = new Weapons(12, "Aquila Favonia", "Sword", "The soul of the Knights of Favonius. Millennia later, it still calls on the winds of swift justice to vanquish all evil — just like the last heroine who wielded it.", 1, 1, 1, 1, 1, 5, "../../assets/weapons/aquila_favonia.webp");
        Weapons Beacon_of_the_Reed_Sea = new Weapons(13, "Beacon of the Reed Sea", "Claymore", "A large, flat-tipped sword designed in to fit as the weapon of an ancient king or some ceremonial instrument.", 1, 1, 1, 1, 1, 5, "../../assets/weapons/beacon_of_thevred_sea.webp");
        Weapons Calamity_Queller = new Weapons(14, "Calamity Queller", "Polearm", "A keenly honed weapon forged from some strange crystal. Its faint blue light seems to whisper of countless matters now past.", 1, 1, 1, 1, 1,5, "../../assets/weapons/calamity_queller.webp");
        Weapons Elegy_for_the_End = new Weapons(15, "Elegy for the End", "Bow", "A bow as lovely as any bard's lyre, its arrows pierce the heart like a lamenting sigh.", 1, 1, 1, 1, 1, 5, "../../assets/weapons/elegy_for_the_end.webp");
       /*
        Weapons weapons0 = new Weapons(16, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(17, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(18, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(19, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(20, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(21, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(22, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(23, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(24, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(25, "", "", "", 0, 0, 0, 0, 0, 0), "";
        Weapons weapons0 = new Weapons(26, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(27, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(28, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(29, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(30, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(31, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(32, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(33, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(34, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(35, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(36, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(37, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(38, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(39, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(40, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(41, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(42, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(43, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(44, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(45, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(46, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(47, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(48, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(49, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(50, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(51, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(52, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(53, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(54, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(55, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(56, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(57, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(58, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(59, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(60, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(61, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(62, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(63, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(64, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(65, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(66, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(67, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(68, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(69, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(70, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(71, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(72, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(73, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(74, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(75, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(76, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(77, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(78, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(79, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(80, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(81, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(82, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(83, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(84, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(85, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(86, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(87, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(88, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(89, "", "", "", 0, 0, 0, 0, 0, 0, "");
        Weapons weapons0 = new Weapons(90, "", "", "", 0, 0, 0, 0, 0, 0, "");*/

        this.weaponsRepository.save(thundering_pulse);
        this.weaponsRepository.save(aqua_simulacra);
        this.weaponsRepository.save(The_Dock);
        this.weaponsRepository.save(Elegy_for_the_End);
        this.weaponsRepository.save(Amos_Bow);
        this.weaponsRepository.save(A_Thousand_Floating_Dreams);
        this.weaponsRepository.save(Calamity_Queller);
        this.weaponsRepository.save(Range_Gauge);
        this.weaponsRepository.save(Rite_of_the_Eternal_Flow);
        this.weaponsRepository.save(Aquila_Favonia);
//this.weaponsRepository.save(Beacon_of_the_Reed_Sea);
        this.weaponsRepository.save(Portable_Power_Saw);
        this.weaponsRepository.save(Cashflow_Supervision);
        this.weaponsRepository.save(Ballad_of_the_Boundless_Blue);
       this.weaponsRepository.save(Prospectors_Dril);


        System.out.println("Save weapons in database");
    }

    //----------- SELECIONAR DADOS DA TABELA WEAPONS ------
    public void selectData(){
        Iterable<Weapons> weapons = this.weaponsRepository.findAll();
        for(Weapons weapon : weapons){
            System.out.println(weapon);
        }
    };

    public List<Weapons> findALL(){
        return (List<Weapons>) weaponsRepository.findAll();
    }

    public WeaponsDTO findById(Integer id){
        Weapons obj = weaponsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Weapons not found in database with id: " + id)
        );
        return new WeaponsDTO(obj);
    }
}
