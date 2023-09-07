package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.FoodDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.entities.Food;
import com.api.genshinimpact.repository.FoodRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudFoodService {
    private FoodRepository foodRepository;

    public CrudFoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    public void insertData(){
        //about the PATH, is "../../assets/food/" for everybody that stay here

        //COMIDAS DO TIPO NORMAL
        Food aaru_mixed_rice = new Food(1, "Aaru Mixed Rice", "Restores 50 Stamina", 2, "Normal", "../../assets/food/aaru_mixed_rice_normal.webp");
        Food tentacao_dos_adeptos = new Food(2, "Adeptus Temptation", "Increases all party members' ATK by 316 and CRIT Rate by 10% for 300s. In multiplayer mode, this effect only applies to your own character.", 5, "Normal", "../../assets/food/adeptus_temptation_normal.webp");
        Food sanduiche_aventureiro = new Food(3, "Adventurer's Sandwich", "Increases all party members' ATK by 194 for 300s. In multiplayer mode, this effect only applies to your own character.", 3, "Normal", "../../assets/food/adventurers_breakfast_sandwich_normal.webp");
        Food tofu_amendoas = new Food(4, "Almond Tofu", "Increases all party members' ATK by 81 for 300s. In multiplayer mode, this effect only applies to your own character.", 2, "Normal", "../../assets/food/almond_tofu_normal.webp");
        Food baklava = new Food(5, "Baklava", "Increases all party members' CRIT Rate by 15% for 300s. In multiplayer mode, this effect only applies to your own character.", 3, "Normal", "../../assets/food/baklava_normal.webp");
        Food sopa_bambu = new Food(6, "Bamboo Shoot Soup", "Restores 28% of the selected character's Max HP and regenerates 620 HP every 5s for 30s.", 3, "Normal", "../../assets/food/bamboo_shoot_soup_normal.webp");
        Food mizu_manjuu_de_baga = new Food(7, "Berry Mizu Manjuu", "Restores 20% of the selected character's Max HP and regenerates 390 HP every 5s for 30s.", 2, "Normal", "../../assets/food/berry_mizu_manjuu_normal.webp");
        Food ensopado_do_arconde_anemo = new Food(8, "Windborne Archon's Dilemma", "Reduces Stamina consumption when sprinting and gliding for all party members by 20% for 900s. In multiplayer mode, this effect only applies to your own character.", 3, "Normal", "../../assets/food/barbatos_ratatouille_normal.webp");
        Food sushi_de_ovo_de_passaro = new Food(9, "Bird Egg Sushi", "Restores 9% of Max HP and an additional 1000 HP to the selected character.", 1, "Normal", "../../assets/food/bird_egg_sushi_normal.webp");
        Food biryani = new Food(10, "Biryani", "Increases DEF by 261 and Healing Effect by 8% for all team characters for 300s. During multiplayer mode, this effect is applied only to oneself.", 4, "Normal", "../../assets/food/biryani_normal.webp");
        Food ensopado_de_poleiro_com_dorso_negro = new Food(11, "Black-Back Perch Stew", "Restores 28% of the selected character's Maximum HP and regenerates 620 HP every 5s for 30s.", 3, "Normal", "../../assets/food/blackback_perch_stew_normal.webp");
        Food abundancia_anual = new Food(12, "Yearly Abundance", "Increases ATK by 272 and CRIT Rate by 8% for all team characters for 300s. In multiplayer mode, it will have an effect on oneself.", 4, "Normal", "../../assets/food/bountiful_year_normal.webp");
        Food carneBestialRefogada = new Food(13, "Beastly Stewed Meat", "Increases Physical Damage for all party members by 30% for 300s. In multiplayer mode, it will have an effect on oneself.", 3, "Normal", "../../assets/food/braised_meat_normal.webp");
        Food frangoNaManteiga = new Food(14, "Butter Chicken", "Increases ATK of all team members by 194 for 300s. During multiplayer mode, this effect is applied only to oneself.", 3, "Normal", "../../assets/food/butter_chicken_normal.webp");
        Food caranguejoNaManteiga = new Food(15, "Butter Crab", "Increases DEF by 261 and Healing Effect by 8% for all team characters for 300s. In multiplayer mode, it will have an effect on oneself.", 4, "Normal", "../../assets/food/butter_crab_normal.webp");



        Food sopaDeLotusDeLeiteEFrutosDoMar = new Food(16, "Sopa de Lótus de Leite e Frutos do Mar", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "../../assets/food/");
        Food doceDeMelComTamaras = new Food(17, "Doce de Mel com Tâmaras", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "../../assets/food/");
        Food boloDeCocoCarvao = new Food(18, "Bolo de Coco-Carvão", "Revive um personagem e restaura 1200 de Vida.", 3, "Normal", "../../assets/food/");
        Food caldoDeTofuComGalinha = new Food(19, "Caldo de Tofu com Galinha", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "../../assets/food/");
        Food espetoDeFrangoComCogumelos = new Food(20, "Espeto de Frango com Cogumelos", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food bolinhoDeCarnePicante = new Food(21, "Bolinho de Carne Picante", "Aumenta a Força do Escudo em 30% e a DEF em 200 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 3, "Normal", "../../assets/food/");
        Food pratoDeCarnesFrias = new Food(22, "Prato de Carnes Frias", "Aumenta o Dano Físico de todos os membros do Grupo em 30% por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "../../assets/food/");
        Food venhaPorEla = new Food(23, "Venha por Ela", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "../../assets/food/");
        Food caranguejoPresuntoEVegetaisAssados = new Food(24, "Caranguejo, Presunto e Vegetais Assados", "Revive um personagem e restaura 1200 de Vida.", 3, "Normal", "../../assets/food/");
        Food ovasDeCaranguejoAssadas = new Food(25, "Ovas de Caranguejo Assadas", "Aumenta o ATQ de todos os membros da Equipe em 81 por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "../../assets/food/");
        Food tofuComOvasDeCaranguejo = new Food(26, "Tofu com Ovas de Caranguejo", "Revive um personagem e restaura 400 de Vida.", 2, "Normal", "../../assets/food/");
        Food ensopadoDeCreme = new Food(27, "Ensopado de Creme", "Diminui o consumo de Stamina ao correr de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 3, "Normal", "../../assets/food/");
        Food pratoDeCamaraoEBatataCrocante = new Food(28, "Prato de Camarão e Batata Crocante", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 3, "Normal", "../../assets/food/");
        Food camaraoDeCristal = new Food(29, "Camarão de Cristal", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food porcoCuradoComMatsutake = new Food(30, "Porco Curado com Matsutake", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food camaraoComCurry = new Food(31, "Camarão com Curry", "Restaura 22% da Vida Máxima e 1200 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food macarraoBarbaDeDragao = new Food(32, "Macarrão Barba de Dragão", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food peixeSecoSalgado = new Food(33, "Peixe Seco Salgado", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food rolinhoDeOvoDePassaro = new Food(34, "Rolinho de Ovo de Pássaro", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food biscoitosAmanteigadosComGlace = new Food(35, "Biscoitos Amanteigados com Glacê", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "../../assets/food/");
        Food peixeAoCreme = new Food(36, "Peixe ao Creme", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food torradaDoPescador = new Food(37, "Torrada do Pescador", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food cincoTesourosEmConserva = new Food(38, "Cinco Tesouros em Conserva", "Restaura 85 de Stamina.", 1, "Normal", "../../assets/food/");
        Food macarraoABolonhesaPicante = new Food(39, "Macarrão à Bolonhesa Picante", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food pureDeBatatasAromatizado = new Food(40, "Purê de Batatas Aromatizado", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food bolinhasDeRabaneteFritas = new Food(41, "Bolinhas de Rabanete Fritas", "Aumenta o ATQ de todos os membros da Equipe em 81 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food frutasDoFestival = new Food(42, "Frutas do Festival", "Aumenta o bônus de cura de todos os membros da Equipe em 17% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food ovoDeLuaCheia = new Food(43, "Ovo de Lua Cheia", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "../../assets/food/");
        Food caldeiradaDourada = new Food(44, "Caldeirada Dourada", "Aumenta a Vida Máxima de todos os membros da Equipe em 22% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food hamburguerDeFrangoDourado = new Food(45, "Hambúrguer de Frango Dourado", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food caranguejoDourado = new Food(46, "Caranguejo Dourado", "Aumenta a DEF em 261 e o Efeito de Cura em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food galinhaDouradaFrita = new Food(47, "Galinha Dourada Frita", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food almôndegasDouradasDeCamarão = new Food(48, "Almôndegas Douradas de Camarão", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "../../assets/food/");
        Food guisadoDeLegumesAoMolho = new Food(49, "Guisado de Legumes ao Molho", "Diminui levemente o crescimento do Frio Extremo para todos os personagens por 900s. No modo multijogador, esse efeito é aplicado apenas ao seu próprio personagem.", 1, "Normal", "../../assets/food/");
        Food food1 = new Food(50, "Peixe Tigre Frito", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food2 = new Food(51, "Filé Unagi Grelhado", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food3 = new Food(52, "Carne de Ave Cruzada", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food4 = new Food(53, "Refeição Revigorante Miau", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food5 = new Food(54, "Sopa de Fruta Jade", "Aumenta o bônus de cura de todos os membros da Equipe em 17% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food6 = new Food(55, "Porção de Jade", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food7 = new Food(56, "Ensopado de Gemas", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food8 = new Food(57, "Frango de Pimenta de Jueyun", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food9 = new Food(58, "Guoba de Jueyun", "Aumenta o Dano Físico de todos os membros do Grupo em 30% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food10 = new Food(59, "Sanduíche de Katsu", "Aumenta o ATQ de todos os membros da equipe em 81 pontos por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food11 = new Food(60, "Cozido de Konda", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "../../assets/food/");
        Food food12 = new Food(61, "Rolinho de Peixe Lambad", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food13 = new Food(62, "Bolinho de Flor Lótus", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food14 = new Food(63, "Sopa de Lótus e Ovo", "Diminui o consumo de Stamina ao correr de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food15 = new Food(64, "Bolinhas de Queijo ao Masala", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food16 = new Food(65, "Enroladinho de Carne com Matsutake", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food17 = new Food(66, "Pizza de Carne e Cogumelos", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food18 = new Food(67, "Torre Crocante de Cogumelo ao Leite", "Restaura 32% da Vida Máxima e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food19 = new Food(68, "Gelatina de Menta", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food20 = new Food(69, "Salada de Menta", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food21 = new Food(70, "Sopa de Feijão com Menta", "Aumenta o ATQ de todos os membros da Equipe em 81 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food22 = new Food(71, "Chá de Menta com Frutas", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food food23 = new Food(72, "Enroladinho de Carne com Menta", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food24 = new Food(73, "Sopa de Miso", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food25 = new Food(74, "Yakisoba Misto", "Restaura 9% da Vida Máxima do personagem selecionado e regenera 260 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food26 = new Food(75, "Peixe Grelhado de Mondstadt", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food food27 = new Food(76, "Bolinho de Batata de Mondstadt", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food28 = new Food(77, "Torta da Lua", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food29 = new Food(78, "Carne de Mora", "Aumenta a Força do Escudo em 30% e a DEF em 200 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food30 = new Food(79, "Mais e Mais", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food food31 = new Food(80, "Panelão de Cogumelos", "Aumenta o Dano Físico de todos os membros do Grupo em 30% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food32 = new Food(81, "Pizza de Cogumelos", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food33 = new Food(82, "Macarrão com Delícias das Montanhas", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food34 = new Food(83, "Ensopado de Maçã do Norte", "Restaura 50 de Stamina", 1, "Normal", "../../assets/food/");
        Food food35 = new Food(84, "Frango Defumado do Norte", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food36 = new Food(85, "Omelete de Arroz", "Restaura 50 de Stamina", 1, "Normal", "../../assets/food/");
        Food food37 = new Food(86, "Tofu de Oncidium", "Diminui o consumo de Stamina ao correr e planar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food38 = new Food(87, "Onigiri", "Restaura 85 de Stamina.", 1, "Normal", "");
        Food food39 = new Food(88, "Pudim de Padisarah", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food40 = new Food(89, "Panipuri", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food41 = new Food(90, "\"Empilhar\"", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "../../assets/food/");
        Food food42 = new Food(91, "Pão Pita", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food43 = new Food(92, "Navio de Batata", "Restaura 32% da Vida Máxima e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food44 = new Food(93, "Prato Rústico de Qingce", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "../../assets/food/");
        Food food45 = new Food(94, "Guisado Fresco de Peixe e Rabanete", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food46 = new Food(95, "Sopa de Rabanete e Vegetais", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food47 = new Food(96, "Áster Arco-íris", "Restaura 9% da Vida Máxima do personagem selecionado e regenera 260 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food48 = new Food(97, "Bolinha de Arroz", "Diminui o consumo de Stamina ao correr e planar de todos os membros da equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food49 = new Food(98, "Cozido Misto do Mercado", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food50 = new Food(99, "Pudim de Arroz", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food51 = new Food(100, "Creme de Rosa", "Restaura 85 de Stamina.", 1, "Normal", "../../assets/food/");
        Food food52 = new Food(101, "Guisado de Carne de Sabz", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food53 = new Food(102, "Sakura Mochi", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food54 = new Food(103, "Biscoitos de Sakura e Camarão", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "../../assets/food/");
        Food food55 = new Food(104, "Tempura de Sakura", "Aumenta a Vida Máxima de todos os membros da Equipe em 22% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food56 = new Food(105, "Samosa", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food57 = new Food(106, "Sangayaki", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food58 = new Food(107, "Prato de Sashimi", "Diminui o consumo de Stamina ao correr de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food59 = new Food(108, "Salada Saudável", "Aumenta o ATQ de todos os membros da equipe em 81 por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food60 = new Food(109, "Matsutake Salteado", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food61 = new Food(110, "Enroladinho de Carne Perfumado", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food62 = new Food(111, "Salada Tropical", "Possui uma chance de restaurar 26%/32%/38% da Vida Máxima e 950/1250/1550 de Vida adicional para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food63 = new Food(112, "Rolinho Shawarma", "Diminui o consumo de Stamina ao correr e planar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food64 = new Food(113, "Macarrão Soba", "Aumenta o ATQ de todos os membros da equipe em 81 por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food food65 = new Food(114, "Peixe Esquilo", "Restaura 9% da Vida Máxima do personagem selecionado e regenera 260 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food food66 = new Food(115, "Bife", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food food67 = new Food(116, "Carne Frita com Cenoura e Mel", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food food68 = new Food(117, "Carne Frita", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 2, "Normal", "../../assets/food/");
        Food food69 = new Food(118, "Macarrão com Peixe Frito", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food food70 = new Food(119, "Camarão Salteado", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 3, "Normal", "../../assets/food/");
        Food food71 = new Food(120, "Iguarias do Porto de Pedra", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 2, "Normal", "../../assets/food/");
        Food food72 = new Food(121, "Chá de Baga do Crepúsculo", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 3, "Normal", "../../assets/food/");
        Food peixeFritoNaManteiga = new Food(122, "Peixe Frito na Manteiga", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food superEstimadaPizza = new Food(123, "Super Estimada Pizza", "Aumenta o Dano Físico em 35% e a Taxa CRIT em 8% de todos os membros da Equipe por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food frangoAssadoComMel = new Food(124, "Frango Assado com Mel", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food sushiDeCamaraoDoce = new Food(125, "Sushi de Camarão Doce", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food tahchin = new Food(126, "Tahchin", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food taiyaki = new Food(127, "Taiyaki", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "../../assets/food/");
        Food frangoAssadoTandoori = new Food(128, "Frango Assado Tandoori", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food panquecaDoChaDaTarde = new Food(129, "Panqueca do Chá da Tarde", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "../../assets/food/");
        Food ovoFritoDeTeyvat = new Food(130, "Ovo Frito de Teyvat", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "../../assets/food/");
        Food carneDeTianshu = new Food(131, "Carne de Tianshu", "Aumenta o Dano Físico em 35% e a Taxa CRIT em 8% de todos os membros da Equipe por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food ramenTonkotsu = new Food(132, "Ramen Tonkotsu", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food dangoDeTresCores = new Food(133, "Dango de Três Cores", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food espetoDeTresSabores = new Food(134, "Espeto de Três Sabores", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food tirasDeTresSabores = new Food(135, "Tiras de Três Sabores", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food frutasAoMel = new Food(136, "Frutas ao Mel", "Diminui o consumo de Stamina ao correr e planar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food sushiDeAtum = new Food(137, "Sushi de Atum", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food macarraoUdon = new Food(138, "Macarrão Udon", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "../../assets/food/");
        Food carneFrescaChazuke = new Food(139, "Carne Fresca Chazuke", "Aumenta o bônus de cura de todos os membros da Equipe em 17% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "../../assets/food/");
        Food pazUniversal = new Food(140, "Paz Universal", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "../../assets/food/");
        Food abaloneVegetariano = new Food(141, "Abalone Vegetariano", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "../../assets/food/");
        Food wakatakeni = new Food(142, "Wakatakeni", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "../../assets/food/");
        Food chopSueyDeZhongyuan = new Food(143, "Chop Suey de Zhongyuan", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "../../assets/food/");

    
        //COMIDAS DO TIPO DELICIOSO
        Food arroz_mistura_de_aaru_delicioso = new Food(144, "Arroz Mistura de Aaru Delicioso", "Restaura 60 de Stamina", 2, "Delicioso", "");

        //COMIDAS DO TIPO SUSPEITO
         Food foodVAR = new Food(145, "Arroz Mistura de Aaru Estranho", "Restaura 40 de Stamina", 2, "Suspeito", "");
    

        //COMIDAS DO TIPO ESPECIAL
        Food cuidado_extremo = new Food(146, "Cuidado Extremo", "Restaura 80 de Stamina", 2, "Especial", "");

        this.foodRepository.save(aaru_mixed_rice);
        this.foodRepository.save(tentacao_dos_adeptos);
        this.foodRepository.save(sanduiche_aventureiro);
        this.foodRepository.save(tofu_amendoas);
        this.foodRepository.save(baklava);
        this.foodRepository.save(sopa_bambu);
        this.foodRepository.save(mizu_manjuu_de_baga);
        this.foodRepository.save(ensopado_do_arconde_anemo);
        this.foodRepository.save(sushi_de_ovo_de_passaro);
        this.foodRepository.save(biryani);
        this.foodRepository.save(ensopado_de_poleiro_com_dorso_negro);
        this.foodRepository.save(abundancia_anual);
        this.foodRepository.save(carneBestialRefogada);
        this.foodRepository.save(frangoNaManteiga);
        this.foodRepository.save(caranguejoNaManteiga);
    }

    //----------- SELECIONAR DADOS DA TABELA FOOD ----------
    public void selectData(){
        Iterable<Food> foods = this.foodRepository.findAll();
        for (Food food : foods){
            System.out.println(food);
        }
    };

    public List<Food> findALL(){
        return (List<Food>) foodRepository.findAll();
    }

    public FoodDTO findById(Integer id){
        Food obj = foodRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Food not found in database with id: " + id)
        );
        return new FoodDTO(obj);
    }
}
