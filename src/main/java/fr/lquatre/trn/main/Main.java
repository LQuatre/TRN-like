package fr.lquatre.trn.main;

import fr.lquatre.trn.config.AppConfig;
import fr.lquatre.trn.model.*;
import fr.lquatre.trn.service.*;
import fr.lquatre.trn.controller.GameController;

public class Main {
    public static void main(String[] args) {
        GameService gameService = AppConfig.configureGameService();

        R6Game r6Game = new R6Game();
        RocketLeagueGame rocketLeagueGame = new RocketLeagueGame();
        LoLGame loLGame = new LoLGame();
        ApexLegendsGame apexLegendsGame = new ApexLegendsGame();
        ValorantGame valorantGame = new ValorantGame();

        R6Service r6Service = new R6Service(r6Game);
        RocketLeagueService rocketLeagueService = new RocketLeagueService(rocketLeagueGame);
        LoLService loLService = new LoLService(loLGame);
        ApexLegendsService apexLegendsService = new ApexLegendsService(apexLegendsGame);
        ValorantService valorantService = new ValorantService(valorantGame);

        GameController gameController = new GameController(gameService, r6Service, rocketLeagueService, loLService, apexLegendsService, valorantService);
        gameController. start();
    }
}
