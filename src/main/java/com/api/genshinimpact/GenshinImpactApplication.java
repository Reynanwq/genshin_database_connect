package com.api.genshinimpact;

import com.api.genshinimpact.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenshinImpactApplication implements CommandLineRunner {

	private final CrudUpdatesService updatesService;
	private final CrudAchievementsService achievementsService;
	private final CrudCharactersService charactersService;
	private final CrudFishingService fishingService;
	private final CrudFoodService foodService;
	private final CrudPlayerService playerService;
	private final CrudPotionsService potionsService;
	private final CrudQuestsService questsService;
	private final CrudStatisticCharactersService statisticCharactersService;
	private final CrudWeaponsService weaponsService;

	@Autowired
	public GenshinImpactApplication(
			CrudUpdatesService updatesService,
			CrudAchievementsService achievementsService,
			CrudCharactersService charactersService,
			CrudFishingService fishingService,
			CrudFoodService foodService,
			CrudPlayerService playerService,
			CrudPotionsService potionsService,
			CrudQuestsService questsService,
			CrudStatisticCharactersService statisticCharactersService,
			CrudWeaponsService weaponsService) {
		this.updatesService = updatesService;
		this.achievementsService = achievementsService;
		this.charactersService = charactersService;
		this.fishingService = fishingService;
		this.foodService = foodService;
		this.playerService = playerService;
		this.potionsService = potionsService;
		this.questsService = questsService;
		this.statisticCharactersService = statisticCharactersService;
		this.weaponsService = weaponsService;
	}

	public static void main(String[] args) {
		SpringApplication.run(GenshinImpactApplication.class, args);}
		@Override
		public void run (String...args) throws Exception {
			this.achievementsService.insertData(); //INSERT DATA ON DATABASE -> ACHIEVEMENTS
			this.charactersService.insertData(); //INSERT DATA ON DATABASE -> CHARACTERS
			this.fishingService.insertData(); //INSERT DATA ON DATABASE -> FISHING
			this.foodService.insertData(); //INSERT DATA ON DATABASE -> FOOD
			this.playerService.insertData(); //INSERT DATA ON DATABASE -> PLAYER
			this.potionsService.insertData(); //INSERT DATA ON DATABASE -> POTIONS
			this.questsService.insertData(); //INSERT DATA ON DATABASE -> QUESTS
			this.statisticCharactersService.insertData(); //INSERT DATA ON DATABASE -> STATISTIC CHARACTERS
			this.updatesService.insertData(); //INSERT DATA ON DATABASE -> UPDATES
			this.weaponsService.insertData(); //INSERT DATA ON DATABASE -> WEAPONS
		}
}