package fr.lquatre.trn.config;

import fr.lquatre.trn.repository.GameRepository;
import fr.lquatre.trn.repository.InMemoryRepository;
import fr.lquatre.trn.service.GameService;

public class AppConfig {
    public static GameService configureGameService() {
        GameRepository gameRepository = new InMemoryRepository();
        return new GameService(gameRepository);
    }
}