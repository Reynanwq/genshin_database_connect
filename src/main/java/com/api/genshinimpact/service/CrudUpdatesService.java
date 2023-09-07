package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.FishingDTO;
import com.api.genshinimpact.dto.UpdatesDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Fishing;
import com.api.genshinimpact.entities.Updates;
import com.api.genshinimpact.repository.UpdatesRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudUpdatesService {
    private UpdatesRepository updatesRepository;
    public CrudUpdatesService(UpdatesRepository updatesRepository){
        this.updatesRepository = updatesRepository;
    }

    public void insertData(){
        //about the PATH, is "../../assets/updates/" for everybody that stay here

        Updates path1_0 = new Updates(1, "Patch 1.0", "Verse of Cups", "COMPLETED", "Falcon and Amos' Bow", "Barbara | Fischl | Xiangling", "Sep 27 - Oct 18, 2020", "Venti", "../../assets/updates/patch1-0.webp");
        Updates path1_1 = new Updates(2, "Patch 1.1", "Farewell to the North", "COMPLETED", "Celestial Harp | Dust Memories", "Diona | Beidou | Ningguang", "Nov 11 - Dec 01, 2020", "Tartaglia", "../../assets/updates/patch1-1.webp");
        Updates path1_2 = new Updates(3, "Patch 1.2", "Enigmatic Chronicles", "COMPLETED", "Mountain Shaper | Celestial Atlas", "Bennett | Fischl | Sucrose", "Dec 23, 2020 - Jan 12, 2021", "Albedo", "../../assets/updates/path1-2.webp");
        Updates path1_3 = new Updates(4, "Patch 1.3", "Flames Invitations", "COMPLETED", "Primordial Jade Cutter | Primordial Jade Winged-Spear", "Diona | Xinyan | Beidou", "Feb 03 - Feb 17, 2021", "Xiao", "../../assets/updates/patch1-3.webp");
        Updates path1_4 = new Updates(5, "Patch 1.4", "Verse of Cups", "COMPLETED", "Elegy for the End | Celestial Blade", "Sucrose | Razor | Noelle", "Mar 17 - Apr 06, 2021", "Venti (Rerun)", "../../assets/updates/patch1-4.webp");
        Updates path1_5 = new Updates(6, "Patch 1.5", "Hermitage of Nobility", "COMPLETED", "Mountain Shaper | Dust Memories", "Yanfei | Noelle | Diona", "Apr 28 - May 18, 2021", "Zhongli (Rerun)", "../../assets/updates/patch1-5.webp");
        Updates path1_6 = new Updates(7, "Patch 1.6", "Flaming Steps", "COMPLETED", "Lost Prayer to the Sacred Winds | Celestial Pride", "Sucrose | Fischl | Barbara", "Jun 09 - Jun 29, 2021", "Klee (Rerun)", "../../assets/updates/patch1-6.webp");
        Updates path2_0 = new Updates(8, "Patch 2.0", "Realm of the Crane", "COMPLETED", "Mist Splitter Reforged | Primordial Jade Cutter", "Yanfei | Ningguang | Chongyun", "Jul 21 - Aug 01, 2021", "Kamisato Ayaka", "../../assets/updates/patch2-0.webp");
        Updates path2_1 = new Updates(9, "Patch 2.1", "Serenity Pot's Realm", "COMPLETED", "Luminous Blade | Rough-Surface Sword", "Sucrose | Xiangling | Kojou Sara", "Jul 21 - Sep 01, 2021", "Shogun Raiden", "../../assets/updates/patch2-1.webp");
        Updates path2_2 = new Updates(10, "Patch 2.2", "Farewell to the North", "COMPLETED", "null", "Yanfei | Ningguang | Chongyun", "Oct 13 - Nov 02, 2021", "Tartaglia", "../../assets/updates/patch2-2.webp");
        Updates path2_3 = new Updates(11, "Patch 2.3", "Enigmatic Chronicles / Wave-Born Form", "COMPLETED", "Oath of Freedom | Song of Pine", "Rosaria | Noelle | Bennett", "Nov 24 - Dec 14, 2021", "Albedo | Eula", "../../assets/updates/patch2-3.webp");
        Updates path2_4 = new Updates(12, "Patch 2.4", "Hermitage of Nobility / Temporary Questions", "COMPLETED", "Prismatic Grinder | Amos' Bow", "Xingqiu | Beidou | Yanfei", "Jan 25 - Feb 15, 2022", "Zhongli | Ganyu", "../../assets/updates/patch2-4.webp");
        Updates path2_5 = new Updates(13, "Patch 2.5", "Eternal Purple Sakura", "COMPLETED", "Trial of Kagura | Primordial Jade Winged-Spear", "Diona | Fischl | Thoma", "Sep 27 - Oct 18, 2020", "Yae Miko", "../../assets/updates/patch2-5.webp");
        Updates path2_6 = new Updates(14, "Patch 2.6", "Zephyrs of the Violet Garden", "COMPLETED", "Moonlit Sea of Futsu | Elegy for the End", "Yunjin | Sucrose | Xiangling", "Mar 30 - Apr 20, 2022", "Kamisato Ayato | Venti", "../../assets/updates/patch2-6.webp");
        Updates path2_7 = new Updates(15, "Patch 2.7", "Dreams Hidden in the Depths", "COMPLETED", "Faded Twilight | Aqua Simulacrum", "Barbara | Noelle | Yanfei", "Sep 27 - Oct 18, 2020", "Yelan | Xiao", "../../assets/updates/patch2-7.webp");
        Updates path2_8 = new Updates(16, "Patch 2.8", "Summer Reveries", "COMPLETED", "Oath of Freedom | Lost Prayer to the Sacred Winds", "Heizou | Thoma | Ningguang", "Jul 13 - Aug 02, 2022", "Kaedahara Kazuha | Klee", "../../assets/updates/patch2-8.webp");
        Updates path3_0 = new Updates(17, "Patch 3.0", "Dawn of Roses", "COMPLETED", "Path of the Hunter | Prismatic Grinder", "Collei | Fischl | Diona", "Aug 24 - Sep 09, 2022", "Tighnari | Zhongli", "../../assets/updates/3patch3-0.webp");
        Updates path3_1 = new Updates(18, "Patch 3.1", "The Deshret King and the Three Mages", "COMPLETED", "Path of the Hunter | Prismatic Grinder", "Kuki Shinobu | Candace | Sayu", "Sep 28 - Oct 14, 2022", "Cyno | Venti", "../../assets/updates/patch3-1.webp");
        Updates path3_2 = new Updates(19, "Patch 3.2", "The Akasha Pulses, the Kalpa Rises", "COMPLETED", "Floating Dreams of a Thousand Nights | Thunderous Agitation", "Noelle | Razor | Bennett", "Nov 02 - Nov 18, 2022", "Nahida | Yoimiya", "../../assets/updates/patch3-2.webp");
        Updates path3_3 = new Updates(20, "Patch 3.3", "In Purifying the Senses, the Emptiness of Existence", "COMPLETED", "Reminiscences of Tulaytullah | Red Horns of Stone Destruction", "Faruzan | Gorou | Yanfei", "Dec 07 - Dec 27, 2022", "Traveler (Anemo) | Arataki Itto", "../../assets/updates/patch3-3.webp");
        Updates path3_4 = new Updates(21, "Patch 3.4", "Exquisite Echoes of the Night", "AVAILABLE", "Light of Cut Leaves | Primordial Jade Winged-Spear", "Yaoyao | Yunjin | Xinyan", "Jan 18 - Feb 07, 2023", "Alhaitham | Xiao", "../../assets/updates/patch3-4.webp");
        Updates path3_5 = new Updates(22, "Patch 3.5", "To Be Announced", "COMING SOON", "To Be Announced", "Mika", "TBA", "Dehya | Eula", "../../assets/updates/patch3-5.webp");


        this.updatesRepository.save(path1_0);
        this.updatesRepository.save(path1_1);
        this.updatesRepository.save(path1_2);
        this.updatesRepository.save(path1_3);
        this.updatesRepository.save(path1_4);
        this.updatesRepository.save(path1_5);
        this.updatesRepository.save(path1_6);
        this.updatesRepository.save(path2_0);
        this.updatesRepository.save(path2_1);
        this.updatesRepository.save(path2_2);
        this.updatesRepository.save(path2_3);
        this.updatesRepository.save(path2_4);
        this.updatesRepository.save(path2_5);
        this.updatesRepository.save(path2_6);
        this.updatesRepository.save(path2_7);
        this.updatesRepository.save(path2_8);
        this.updatesRepository.save(path3_0);
        this.updatesRepository.save(path3_1);
        this.updatesRepository.save(path3_2);
        this.updatesRepository.save(path3_3);
        this.updatesRepository.save(path3_4);
        this.updatesRepository.save(path3_5);

        System.out.println("Patch save in database");
    }

    //----------- SELECIONAR DADOS DA TABELA UPDATES------
    public void selectData(){
        Iterable<Updates> updates = this.updatesRepository.findAll();
        for (Updates update : updates){
            System.out.println(update);
        }
    };

    public List<Updates> findALL(){
        return (List<Updates>) updatesRepository.findAll();
    }

    public UpdatesDTO findById(Integer id){
        Updates obj = updatesRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Updates not found in database with id: " + id)
        );
        return new UpdatesDTO(obj);
    }
}
