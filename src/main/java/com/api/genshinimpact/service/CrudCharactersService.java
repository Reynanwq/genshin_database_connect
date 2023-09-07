package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.repository.CharactersRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudCharactersService {

    private CharactersRepository charactersRepository;
    public CrudCharactersService(CharactersRepository charactersRepository){
        this.charactersRepository = charactersRepository;
    }
    public List<Characters>findALL(){
        return (List<Characters>) charactersRepository.findAll();
    }

    public CharactersDTO findById(Integer id){
        Characters obj = charactersRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Character not found in database with id: " + id));
        return new CharactersDTO(obj);
    }

    public List<Characters> findCharacterByName(String name){
        List<Characters> characters = charactersRepository.findByName(name);
        if (characters.isEmpty()){
            throw new EntityNotFoundException("Character with name '" + name + "' not found");
        }
        return characters;
    }
    public void insertData(){

        //about the PATH, is "../../assets/characters/" for everybody that stay here

        //--------------------- INSERINDO PERSONAGENS ---------------------
        Characters albedo = new Characters(1, "Albedo", "Knights of Favonius", 90, "A genius known as the Kreideprinz, he is the Chief Alchemist and Captain of the Investigation Team of the Knights of Favonius.", "12/2020", "Male", "Normal Attack: Favonius Bladework - White | Abiogenesis - Solar Isotoma | Rite of Progeniture - Tectonic Tide", "Calcite Might: Ascension Phase 1 | Calcite's Secret: Ascension Phase 4 | Homuncular Nature: Passive", "Transient Blossom | Rite of Progeniture: Tectonic Tide | Solar Isotoma | Secret Alchemy | Abiogenesis: Solar Isotoma | Homuncular Nature", "../../assets/characters/albedo.webp");
        Characters Alhaitham = new Characters(2, "Alhaitham", "Sumeru Academia", 90, "The current scribe of the Sumeru Academia, a man of great intelligence and talent. Lives his life free and carefree, being a person very difficult to find.", "01/2023", "Male", "Normal Attack: Investigative Method - Reverse | Mutual Understanding: Knowledge Representation | Alienation: Illustration Constraint", "Four Principles of Restriction | Revelation of the Enigma Forest | Law of the Deduction of Superdeterminancy", "Attentiveness | Debate | Hidden Notes | Application of Justice | Degree of Wisdom | Correct Reasoning", "../../assets/characters/alhaitham.webp");
        Characters Aloy = new Characters(3, "Aloy", "Wandering Knight", 90, "Once an outcast, now a hunter of unparalleled fervor. Ready to do the right thing with her bow at any moment.", "10/2021", "Female", "Normal Attack: Rapid Fire | Frozen Wilds | Prophecies of Dawn", "Combat Override | Strong Strike | Slow Start", "Foreign Lands and Star-Settling | Prophecies of Dawn: Level 1 -> | Prophecies of Dawn: Level 2 -> | Prophecies of Dawn: Level 3 -> | Prophecies of Dawn: Level 4 -> | Prophecies of Dawn: Level 5 -> | Prophecies of Dawn: Level 6 ->", "../../assets/characters/aloy.webp");
        Characters Amber = new Characters(4, "Amber", "Knights of Favonius", 90, "Always energetic and full of life, Amber is the best, but also the last Outrider of the Knights of Favonius.", "09/2020", "Female", "Normal Attack: Aimed Shot | Explosive Puppet | Fiery Rain", "No One Escapes My Sights! | Sharpshooter | Bunny Triggered", "One Arrow to Rule Them All | Bunny Hop | It's Not Just Any Doll... | Baron Bunny | Let's Dance! | Fleece on Fire", "../../assets/characters/amber.webp");
        Characters Arataki_Itto = new Characters(5, "Arataki Itto", "Arataki Gang", 90, "The first and greatest chief of the Arataki Gang, famous in Hanamizaka, Inazuma City... Wait, what? You've never heard of them? Seriously?", "12/2022", "Male", "Normal Attack: Legend of the Fight | Masatsu Zetsugi: Explosive Akaushi! | Royal Descent: Behold, Itto the Evil!", "Arataki Ichiban | Crimson Oni Lineage | Itto the Lumberjack", "Stay a While and Listen | Gather, Fight's On! | Here Comes the Bull! | Private Hermitage | 10 Years of Fame in Hanamizaka | Arataki Itto, Presesnt!", "../../assets/characters/arataki_itto.webp");
        Characters Baizhu = new Characters(6, "Beizhu", "Bubu Pharmacy", 90, "The owner of Bubu Pharmacy, always with a white snake named Changsheng hanging around his neck. A great connoisseur of medicine, his true intentions are a great mystery.", "04/2023", "Male", "Normal Attack: Golden Acupuncture | Universal Diagnosis | Holistic Remedy | Normal Attack: Golden Acupuncture | Universal Diagnosis | Holistic Remedy", "Five Eternal Fortunes | Mother Earth | Herbal Medicine Nutrition", "Careful Observation | Incisive Insight | Complete Stability | Ancestral Perception | Hidden Signs of Change | Eliminating Malicious Qi", "../../assets/characters/baizhu.webp");
        Characters Barbara = new Characters(7, "Barbara", "Church of Favonius", 90, "All of Mondstadt's denizens adore Barbara. However, she saw the word 'idol' for the first time in a magazine.", "09/2020", "Female", "Normal Attack: Whisper of Water | Shining Miracle | Grandeur of a Maiden", "Glorious Season | Encourage | With My Whole Heart", "Dashing to the Victory Stage | Rockin' in the Spotlight | Fantastic Voyage | Summer Night's Glow | Starry-eyed Wonder | Gloria in Excelsis | Let the Show Begin!", "../../assets/characters/barbara.webp");
        Characters Beidou = new Characters(8, "Beidou", "Crimson Fleet", 90, "Leader of the Crux Fleet. She's a boss with no limits and frankness.", "01/2022", "Female", "Normal Attack: Oceanborne | Tidecaller | Stormbreaker", "Retribution | Storm the Abyss | Conqueror of Tides", "Sea Beast's Scourge | Tempestuous Sea-Treading Thunder | Stormbreaker: Dark Tider | Call of the Abyss | Queen of the Sea | Culling Thunder | Conqueror of Tides | Wavebreaker's Might | The Ocean's Wisdom", "../../assets/characters/beidou.webp");
        Characters Bennett = new Characters(9, "Bennett", "Adventurers' Guild", 90, "A kind and righteous Mondstadt adventurer, but also incredibly unlucky.", "03/2022", "Male", "Normal Attack: Strike of Fortune | Passion Overload | Fantastic Voyage", "Rekindle | Fearnaught | It Should Be Safe...", "Expectation | Rekindle | Fearnaught | It Should Be Safe... | Rekindle: Unleashed | Fearnaught: Ascension Phase 4 | Rekindle: Unleashed: Ascension Phase 1", "../../assets/characters/bennett.webp");
        Characters Candance = new Characters(10, "Candace", "Aaru Village", 90, "Guardian of Aaru Village, a descendant of the King Deshret, her left eye is the color of amber.", "09/2022", "Female", "Normal Attack: Radiant Lance - Guardian Form | Sacred Ritual: Guardian Crane | Sacred Ritual: Flock of Ravens", "Plume Protection | Sand's Arc | Primordial Aurora", "Heir of the Resplendent Sands | Moon-Piercing Radiance | Hunt Devotion | Sentinel's Oath | Gilded Eyes | The Flood", "../../assets/characters/candace.webp");
        Characters Collei = new Characters(11, "Collei", "Gandharva Village", 90, "An aspiring forest ranger patrolling the Avidya Forest. Behind her enthusiasm lies a rather introverted personality.", "08/2022", "Female", "Normal Attack: Homage to Archery | Petal Weave | Miauvilhoso Secret", "Floral Frenzy | Forest Rhythms | Sumeru Champion", "Forest Patrol | Through the Hills and Woods | Aroma of Summer", "../../assets/characters/collei.webp");
        Characters Cyno = new Characters(12, "Cyno", "Judicator of Secrets", 90, "The General Mahamatra in charge of supervising the researchers of the Akademiya. It is said that when he gets down to work, the General Mahamatra is even more efficient than the Great Vayuvyastra made by the Kshahrewar. Temple of Silence", "03/2023", "Masculino", "Ataque Normal: Lança da Invocação | Ritual Secreto: Travessia Abissal | Ritual Sagrado: Agilidade Lupina", "Julgamento das Plumas | Soberania dos Nove Arcos | O Dom do Silêncio", "Ordinance: Unceasing Vigil | Ceremony: Homecoming of Spirits | Precept: Lawful Enforcer |  Austerity: Forbidding Guard | Funerary Rite: The Passing of Starlight | Raiment: Just Scales", "../../assets/characters/cyno.webp");
        Characters Dehya = new Characters(13, "Dehya", "The Eremites", 90, "A member of the Eremites, a mercenary organization that roams the sands of Sumeru. Valiant and powerful, she enjoys great fame amongst her fellow Eremites.", "03/2023", "Femal-e", "Normal Attack: Sandstorm Assault | Molten Inferno | Leonine Bite", "Unstinting Succor | Stalwart and True | The Sunlit Way", "The Flame Incandescent | The Sand-Blades Glittering | A Rage Swift as Fire | An Oath Abiding | The Alpha Unleashed | The Burning Claws Cleaving", "../../assets/characters/dehya.webp");
        Characters Diluc = new Characters(14, "Diluc", "The Dark Side of Dawn", 90, "The tycoon of a winery empire in Mondstadt, unmatched in every possible way. Dawn Winery", "09/2020", "Male", "Normal Attack: Tempered Sword | Searing Onslaught | Dawn", "Relentless | Blessing of Phoenix | Tradition of the Dawn Knight", "Conviction | Searing Ember | Fire and Steel | Flowing Flame | Phoenix, Harbinger of Dawn | Flaming Sword, Nemesis of the Dark", "../../assets/characters/diluc.webp");
        Characters Diona = new Characters(15, "Diona", "Kätzlein Cocktail", 90, "A young lady who has inherited trace amounts of non-human blood. She is the incredibly popular bartender of the Cat's Tail tavern. The Cat's Tail.", "11//2020", "Female", "Normal Attack: Kätzlein Style | Icy Paws | Signature Mix","Cat's Tail Secret Menu | Drunkards' Farce | Complimentary Bar Food", "A Lingering Flavor | Shaken, Not Purred | A—Another Round? | Wine Industry Slayer | Double Shot, on the Rocks | Cat's Tail Closing Time", "../../assets/characters/diona.webp");
        /*

        Characters Dori = new Characters(16, "Dori", "", 1-90, "", "09/2022", "Feminino", "", "", "../../assets/characters/");
        Characters Eula = new Characters(17, "Eula", "", 1-90, "", "05/2021", "Feminino", "", "", "../../assets/characters/");
        Characters Faruzan = new Characters(18, "Faruzan", "", 1-90, "", "07/2022", "Feminino", "", "", "../../assets/characters/");
        Characters Fischi = new Characters(19, "Fischi", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Ganyu = new Characters(20, "Ganyu", "", 1-90, "", "01/2021", "Feminino", "", "", "");
        Characters Gorou = new Characters(21, "Gorou", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Hutao = new Characters(22, "Hutao", "", 1-90, "", "03/2021", "Feminino", "", "", "");
        Characters Jean = new Characters(23, "Jean", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Kaedehara_Kazuha = new Characters(24, "Kaedehara_Kazuha", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Kaeya = new Characters(25, "Kaeya", "", 0, "", "09/2020", "Masculino", "", "", "");
        Characters Kamisato_Ayaka = new Characters(26, "Kamisato_Ayaka", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Kamisato_Ayato = new Characters(27, "Kamisato_Ayato", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Kaveh = new Characters(28, "Kaveh", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Keqing = new Characters(29, "Keqing", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Kirara = new Characters(30, "Kirara", "", 1-90, "", "05/2023", "Feminino", "", "", "");
        Characters Klee = new Characters(31, "Klee", "", 1-90, "", "10/2020", "Feminino", "", "", "");
        Characters Kujou_Sara = new Characters(32, "Kujou_Sara", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Kuki_Shinobu = new Characters(33, "Kuki_Shinobu", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Laya = new Characters(34, "Laya", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Lisa = new Characters(35, "Lisa", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Mika = new Characters(36, "Mika", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Mona = new Characters(37, "Mona", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Nahida = new Characters(38, "Nahida", "", 1-90, "", "11/2022", "Feminino", "", "", "");
        Characters Nilou = new Characters(39, "Nilou", "", 1-90, "", "14/2022", "Feminino", "", "", "");
        Characters Ningguang = new Characters(40, "Ningguang", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Noelle = new Characters(41, "Noelle", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Qiqi = new Characters(42, "Qiqi", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Shogun_Raiden = new Characters(43, "Shogun_Raiden", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Razor = new Characters(44, "Razor", "", 1-90, "", "09/2020", "Masculino", "", "", "");
        Characters Rosaria = new Characters(45, "Rosaria", "", 1-90, "", "04/2021", "Feminino", "", "", "");
        Characters Sangonomiya_Kokomi = new Characters(46, "Sangonomiya_Kokomi", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Sayu = new Characters(47, "Sayu", "", 1-90, "", "08/2021", "Feminino", "", "", "");
        Characters Shenhe = new Characters(48, "Shenhe", "", 1-90, "", "01/2022", "Feminino", "", "", "");
        Characters Shikanoin_Heizou = new Characters(49, "Shikanoin_Heizou", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Sucrose = new Characters(50, "Sucrose", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Tartaglia = new Characters(51, "Tartaglia", "", 1-90, "", "11/2020", "Masculino", "", "", "");
        Characters Thoma = new Characters(52, "Thoma", "", 1-90, "", "11/2021", "Masculino", "", "", "");
        Characters Tighnari = new Characters(53, "Tighnari", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Viajante_Anemo = new Characters(54, "Viajante (Anemo)", "", 1-90, "", "", "", "", "", "");
        Characters Viajante_Dentro = new Characters(55, "Viajante (Dentro)", "", 1-90, "", "", "", "", "", "");
        Characters Viajante_Electro = new Characters(56, "Viajante (Electro)", "", 1-90, "", "", "", "", "", "");
        Characters Viajante_Geo = new Characters(57, "Viajante (Geo)", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Venti = new Characters(58, "Venti", "", 1-90, "", "09/2020", "Masculino", "", "", "");
        Characters Andarilho = new Characters(59, "Andarilho", "", 1-90, "", "", "", "", "", "");
        Characters Xiangling = new Characters(60, "Xiangling", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Xiao = new Characters(61, "Xiao", "", 1-90, "", "02/2021", "Masculino", "", "", "");
        Characters Xingqiu = new Characters(62, "Xingqiu", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Xinyan = new Characters(63, "Xinyan", "", 1-90, "", "12/2020", "Feminino", "", "", "");
        Characters Yae_Miko = new Characters(64, "Yae_Miko", "", 1-90, "", "", "", "", "", "");
        Characters Yanfei = new Characters(65, "Yanfei", "", 1-90, "", "04/2021", "Feminino", "", "", "");
        Characters Yaoyao = new Characters(66, "Yaoyao", "", 1-90, "", "01/2023", "Feminino", "", "", "");
        Characters Yelan = new Characters(67, "Yelan", "", 1-90, "", "05/2022", "Feminino", "", "", "");
        Characters Yoimiya = new Characters(68, "Yoimiya", "", 1-90, "", "08/2021", "Feminino", "", "", "");
        Characters Yunjin = new Characters(69, "Yunjin", "", 1-90, "", "01/2022", "Feminino", "", "", "");
        Characters Zhongli = new Characters(70, "Zhongli", "", 1-90, "", "12/2020", "Masculino", "", "", "");*/

        //---------- SALVANDO NO BANCO DE DADOS
        this.charactersRepository.save(albedo);
        this.charactersRepository.save(Alhaitham);
        this.charactersRepository.save(Aloy);
        this.charactersRepository.save(Amber);
        this.charactersRepository.save(Arataki_Itto);
        this.charactersRepository.save(Baizhu);
        this.charactersRepository.save(Bennett);
        this.charactersRepository.save(Beidou);
        this.charactersRepository.save(Barbara);
        this.charactersRepository.save(Candance);
        this.charactersRepository.save(Collei);
        this.charactersRepository.save(Cyno);
        this.charactersRepository.save(Dehya);
        this.charactersRepository.save(Diluc);
        this.charactersRepository.save(Diona);
/*
        this.charactersRepository.save(Dori);
        this.charactersRepository.save(Eula);
        this.charactersRepository.save(Faruzan);
        this.charactersRepository.save(Dischi);
        this.charactersRepository.save(Ganyu);
        this.charactersRepository.save(Gorou);
        this.charactersRepository.save(Hutao);
        this.charactersRepository.save(Jean);
        this.charactersRepository.save(Kaedehara_Kazuha);
        this.charactersRepository.save(Kaeya);
        this.charactersRepository.save(Kamisato_Ayaka);
        this.charactersRepository.save(Kaveh);
        this.charactersRepository.save(Kamisato_Ayato);
        this.charactersRepository.save(Keqing);
        this.charactersRepository.save(Kirara);
        this.charactersRepository.save(Klee);
        this.charactersRepository.save(Kujou_Sara);
        this.charactersRepository.save(Laya);
        this.charactersRepository.save(Kuki_Shinobu);
        this.charactersRepository.save(Lisa);
        this.charactersRepository.save(Mika);
        this.charactersRepository.save(Mona);
        this.charactersRepository.save(Nahida);
        this.charactersRepository.save(Nilou);
        this.charactersRepository.save(Ningguang);
        this.charactersRepository.save(Noelle);
        this.charactersRepository.save(Qiqi);
        this.charactersRepository.save(Shogun_Raiden);
        this.charactersRepository.save(Razor);
        this.charactersRepository.save(Rosaria);
        this.charactersRepository.save(Sangonomiya_Kokomi);
        this.charactersRepository.save(Sayu);
        this.charactersRepository.save(Shenhe);
        this.charactersRepository.save(Sucrose);
        this.charactersRepository.save(Shikanoin_Heizou);
        this.charactersRepository.save(Tartaglia);
        this.charactersRepository.save(Thoma);
        this.charactersRepository.save(Tighnari);
        this.charactersRepository.save(Viajante_Anemo);
        this.charactersRepository.save(Viajante_Dentro);
        this.charactersRepository.save(Viajante_Electro);
        this.charactersRepository.save(Viajante_Geo);
        this.charactersRepository.save(Venti);
        this.charactersRepository.save(Andarilho);
        this.charactersRepository.save(Xiangling);
        this.charactersRepository.save(Xiao);
        this.charactersRepository.save(Xingqiu);
        this.charactersRepository.save(Xinyan);
        this.charactersRepository.save(Yae_Miko);
        this.charactersRepository.save(Yanfei);
        this.charactersRepository.save(Yaoyao);
        this.charactersRepository.save(Yelan);
        this.charactersRepository.save(Yoimiya);
        this.charactersRepository.save(Yunjin);
        this.charactersRepository.save(Zhongli);*/

        System.out.println("Characters save in database");
    }

    //----------- SELECIONAR DADOS DA TABELA CHARACTERS ------
    /*public void selectData(){
        Iterable<Character> characters = this.charactersRepository.findAll();
        for (Characters characters1 : characters){
            System.out.println(characters1);
        }
    };*/
}
