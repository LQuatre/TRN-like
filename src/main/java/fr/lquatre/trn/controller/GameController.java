package fr.lquatre.trn.controller;

import fr.lquatre.trn.service.*;
import fr.lquatre.trn.model.Game;

import java.util.Scanner;

public class GameController {
    private GameService gameService;
    private R6Service r6Service;
    private RocketLeagueService rocketLeagueService;
    private LoLService loLService;
    private ApexLegendsService apexLegendsService;
    private ValorantService valorantService;

    public GameController(GameService gameService, R6Service r6Service, RocketLeagueService rocketLeagueService, LoLService loLService, ApexLegendsService apexLegendsService, ValorantService valorantService) {
        this.gameService = gameService;
        this.r6Service = r6Service;
        this.rocketLeagueService = rocketLeagueService;
        this.loLService = loLService;
        this.apexLegendsService = apexLegendsService;
        this.valorantService = valorantService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add a new game");
            System.out.println("2. Fetch game statistics");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addNewGame(scanner);
                    break;
                case 2:
                    fetchGameStats(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private void addNewGame(Scanner scanner) {
        System.out.print("Enter the name of the game: ");
        String name = scanner.nextLine();
        System.out.print("Enter the genre of the game: ");
        String genre = scanner.nextLine();

        Game newGame = new Game(name, genre) {
            @Override
            public void fetchStats() {
                // Implementation not required for adding a new game
            }
        };

        gameService.addGame(newGame);
        System.out.println("Game added successfully.");
    }

    private void fetchGameStats(Scanner scanner) {
        System.out.println("Choose the game to fetch statistics:");
        System.out.println("1. Rainbow Six Siege");
        System.out.println("2. Rocket League");
        System.out.println("3. League of Legends");
        System.out.println("4. Apex Legends");
        System.out.println("5. Valorant");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                r6Service.fetchStats();
                break;
            case 2:
                rocketLeagueService.fetchStats();
                break;
            case 3:
                loLService.fetchStats();
                break;
            case 4:
                apexLegendsService.fetchStats();
            case 5:
                valorantService.fetchStats();
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
