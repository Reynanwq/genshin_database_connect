package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.FishingDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Fishing;
import com.api.genshinimpact.repository.FishingRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudFishingService {
    private FishingRepository fishingRepository;
    public CrudFishingService(FishingRepository fishingRepository){
        this.fishingRepository = fishingRepository;
    }

    public void insertData(){

        //about the PATH, is "../../assets/fishing/" for everybody that stay here

        //LOCALIZADOS NA REGIAO DE MONDSTADT
        Fishing Medaka_mondstadt = new Fishing(1, "Medaka", "Mondstadt", "../../assets/fishing/medaka.webp");
        Fishing Medaka_Azulado_mondstadt = new Fishing(2, "Blue Medaka", "Mondstadt", "../../assets/fishing/aizen_medaka.webp");
        Fishing Peixe_leão_Esgana_Gato_mondstadt = new Fishing(3, "Catscratch Lionfish", "Mondstadt", "../../assets/fishing/venomspine_fish.webp");
        Fishing Shirakodai_Cor_de_Chá_mondstadt = new Fishing(4, "Tea-Colored Shirakodai", "Mondstadt", "../../assets/fishing/teacolored_shirakodai.webp");
        Fishing Apanhador_da_Aurora_mondstadt = new Fishing(5, "Dawncatcher", "Mondstadt", "../../assets/fishing/dawncatcher.webp");
        Fishing Peixe_Cristal_mondstadt = new Fishing(6, "Crystal Fish", "Mondstadt", "../../assets/fishing/crystalfish.webp");
        Fishing Koi_Dourado_mondstadt = new Fishing(7, "Golden Koi", "Mondstadt", "../../assets/fishing/golden_koi.webp");
        Fishing Akai_Maou_mondstadt = new Fishing(8, "Red Akaimaou", "Mondstadt", "../../assets/fishing/akai_maou.webp");
        Fishing Fugu_mondstadt= new Fishing(9, "Fugu", "Mondstadt", "../../assets/fishing/pufferfish.webp");
        Fishing Fugu_Amargo_mondstadt = new Fishing(10, "Bitter Fugu", "Mondstadt", "../../assets/fishing/bitter_pufferfish.webp");
        Fishing Koi_Enferrujado_mondstadt = new Fishing(11, "Rusty Koi", "Mondstadt", "../../assets/fishing/rusty_koi.webp");
        Fishing Rei_da_Neve_mondstadt = new Fishing(12, "Snow King", "Mondstadt", "../../assets/fishing/snowstrider.webp");

        //LOCALIZADOS NA REGIAO DE LIYUE
        Fishing Dawncatcher_liyue = new Fishing(13, "Dawncatcher", "Liyue", "../../assets/fishing/dawncatcher.webp");
        Fishing Flor_Doce_Medaka_liyue = new Fishing(14, "Sweet-Flower Medaka", "Liyue", "../../assets/fishing/sweetflower_medaka.webp");
        Fishing Apanhador_da_Aurora_liyue = new Fishing(15, "Apanhador da Aurora", "Liyue", "../../assets/fishing/  ");
        Fishing Peixe_Cristal_liyue = new Fishing(16, "Crystal Fish", "Liyue", "../../assets/fishing/crystalfish.webp");
        Fishing Betta_Esgana_Gato_liyue = new Fishing(17, "Betta Esgana-Gato", "Liyue", "../../assets/fishing/");
        Fishing Shirakodai_Marrom_liyue = new Fishing(18, "Shirakodai Marrom", "Liyue", "../../assets/fishing/");
        Fishing Fugu_Amargo_liyue = new Fishing(19, "Fugu Amargo", "Liyue", "../../assets/fishing/");
        Fishing Medaka_liyue = new Fishing(20, "Medaka", "Liyue", "../../assets/fishing/");
        Fishing Acara_Devoto_liyue = new Fishing(22, "Acará Devoto", "Liyue", "../../assets/fishing/");
        Fishing Akai_Maou_liyue = new Fishing(23, "Akai Maou", "Liyue", "../../assets/fishing/");
        Fishing Koi_Dourado_liyue = new Fishing(24, "Koi Dourado", "Liyue", "../../assets/fishing/");
        Fishing Koi_Enferrujado_liyue = new Fishing(25, "Koi Enferrujado", "Liyue", "../../assets/fishing/");
        Fishing Fugu_liyue = new Fishing(26, "Fugu", "Liyue", "../../assets/fishing/");

        //LOCALIZADOS NA REGIAO DE INAZUMA
        Fishing Glaze_Medaka_inazuma = new Fishing(27, "Glaze Medaka", "Inazuma", "../../assets/fishing/");
        Fishing Medaka_inazuma_inazuma = new Fishing(28, "Medaka", "Inazuma", "../../assets/fishing/");
        Fishing Medaka_Envernizado_inazuma = new Fishing(29, "Medaka Envernizado", "Inazuma", "../../assets/fishing/");
        Fishing Apanhador_da_Aurora_inazuma = new Fishing(30, "Apanhador da Aurora", "Inazuma", "../../assets/fishing/");
        Fishing Peixe_Cristal_inazuma = new Fishing(31, "Peixe Cristal", "Inazuma", "../../assets/fishing/");
        Fishing Piramboia_Esgana_Gato_inazuma = new Fishing(32, "Piramboia Esgana-Gato", "Inazuma", "../../assets/fishing/");
        Fishing Shirakodai_Roxo_inazuma = new Fishing(33, "Shirakodai Roxo", "Inazuma", "../../assets/fishing/");
        Fishing Fugu_Amargo_inazuma = new Fishing(34, "Fugu Amargo", "Inazuma", "../../assets/fishing/");
        Fishing AcarA_Raimei_inazuma = new Fishing(35, "Acará Raimei", "Inazuma", "../../assets/fishing/");
        Fishing Fugu_inazuma = new Fishing(36, "Fugu", "Inazuma", "../../assets/fishing/");
        Fishing Akai_Maou_inazuma = new Fishing(37, "Akai Maou", "Inazuma", "../../assets/fishing/");
        Fishing Koi_Dourado_inazuma = new Fishing(38, "Koi Dourado", "Inazuma", "../../assets/fishing/");
        Fishing Koi_Enferrujado_inazuma = new Fishing(39, "Koi Enferrujado", "Inazuma", "../../assets/fishing/");

        //LOCALIZADOS NA REGIAO DE ENKANOMIYA
        Fishing Peixe_Cristal_enkanomiya = new Fishing(40, "Peixe Cristal", "Enkanomiya", "../../assets/fishing/");
        Fishing Piramboia_Esgana_Gato_enkanomiya = new Fishing(41, "Piramboia Esgana-Gato", "Enkanomiya", "../../assets/fishing/");
        Fishing Arraia_Divda_enkanomiya = new Fishing(42, "Arraia Divda", "Enkanomiya", "../../assets/fishing/");
        Fishing Arraia_Formalo_enkanomiya = new Fishing(43, "Arraia Formalo", "Enkanomiya", "../../assets/fishing/");
        Fishing Apanhador_da_Aurora_enkanomiya = new Fishing(44, "Apanhador da Aurora", "Enkanomiya", "../../assets/fishing/");
        Fishing Shirakodai_Roxo_enkanomiya = new Fishing(45, "Shirakodai Roxo", "Enkanomiya", "../../assets/fishing/");
        Fishing Akai_Maou_enkanomiya = new Fishing(46, "Akai Maou", "Enkanomiya", "../../assets/fishing/");

        //LOCALIZADOS NA REGIAO DE THE CHASM
        Fishing Medaka_chasm = new Fishing(47, "Medaka", "The Chasm", "../../assets/fishing/");
        Fishing Betta_Esgana_Gato_chasm = new Fishing(48, "Betta Esgana-Gato", "The Chasm", "../../assets/fishing/");
        Fishing Akai_Maou_chasm = new Fishing(49, "Akai Maou", "The Chasm", "../../assets/fishing/");
        Fishing Shirakodai_Marrom_chasm = new Fishing(50, "Shirakodai Marrom", "The Chasm", "../../assets/fishing/");
        Fishing ugu_Amargo_chasm = new Fishing(51, "Fugu Amargo", "The Chasm", "../../assets/fishing/");
        Fishing Doce_Medaka_chasm = new Fishing(52, "Flor Doce Medaka", "The Chasm", "../../assets/fishing/");
        Fishing Apanhador_da_Aurora_chasm = new Fishing(53, "Apanhador da Aurora", "The Chasm", "../../assets/fishing/");
        Fishing Peixe_Cristal_chasm = new Fishing(54, "Peixe Cristal", "The Chasm", "../../assets/fishing/");
        Fishing Fugu_chasm = new Fishing(55, "Fugu", "The Chasm", "../../assets/fishing/");

        //LOCALIZADOS NA REGIAO DE SUMERU
        Fishing Peixe_Cristal_Sumeru = new Fishing(56, "Peixe Cristal", "Sumeru", "../../assets/fishing/");
        Fishing Peixe_Fruta_Verdadeira_sumeru = new Fishing(57, "Peixe Fruta Verdadeira", "Sumeru", "../../assets/fishing/");
        Fishing Peixe_Bola_da_Areia_sumeru = new Fishing(58, "Peixe Bola da Areia", "Sumeru", "../../assets/fishing/");
        Fishing Peixe_Bola_das_Nuvens_Crepusculares_sumeru = new Fishing(59, "Peixe Bola das Nuvens Crepusculares", "Sumeru", "../../assets/fishing/");
        Fishing Marlim_Machado_de_Lazurita_sumeru = new Fishing(60, "Marlim Machado de Lazurita", "Sumeru", "../../assets/fishing/");
        Fishing Marlim_Machado_de_Jade_sumeru = new Fishing(61, "Marlim Machado de Jade", "Sumeru", "../../assets/fishing/");
        Fishing Apanhador_da_Aurorasumeru = new Fishing(62, "Apanhador da Aurora", "Sumeru", "../../assets/fishing/");
        Fishing Medaka_sumeru = new Fishing(63, "Medaka", "Sumeru", "../../assets/fishing/");
        Fishing Akai_Maou_sumeru = new Fishing(64, "Akai Maou", "Sumeru", "../../assets/fishing/");
        Fishing PêssegodasOndasProfundas_sumeru = new Fishing(65, "Pêssego das Ondas Profundas", "Sumeru", "../../assets/fishing/");

        this.fishingRepository.save(Medaka_mondstadt);
        this.fishingRepository.save(Medaka_Azulado_mondstadt);
        this.fishingRepository.save(Peixe_leão_Esgana_Gato_mondstadt);
        this.fishingRepository.save(Shirakodai_Cor_de_Chá_mondstadt);
        this.fishingRepository.save(Apanhador_da_Aurora_mondstadt);
        this.fishingRepository.save(Peixe_Cristal_mondstadt);
        this.fishingRepository.save(Koi_Dourado_mondstadt);
        this.fishingRepository.save(Akai_Maou_mondstadt);
        this.fishingRepository.save(Fugu_mondstadt);
        this.fishingRepository.save(Fugu_Amargo_mondstadt);
        this.fishingRepository.save(Koi_Enferrujado_mondstadt);
        this.fishingRepository.save(Rei_da_Neve_mondstadt);
        this.fishingRepository.save(Dawncatcher_liyue);
        this.fishingRepository.save(Flor_Doce_Medaka_liyue);
        this.fishingRepository.save(Peixe_Cristal_liyue);
        System.out.println("Fishing Send to database!");
    }

    //----------- SELECIONAR DADOS DA TABELA FISHING------
    public void selectData(){
        Iterable<Fishing> fishings = this.fishingRepository.findAll();
        for (Fishing fishing : fishings){
            System.out.println(fishing);
        }
    };
    public List<Fishing> findALL(){
        return (List<Fishing>) fishingRepository.findAll();
    }

    public FishingDTO findById(Integer id){
        Fishing obj = fishingRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Fish not found in database with id: " + id)
        );
        return new FishingDTO(obj);
    }
}
