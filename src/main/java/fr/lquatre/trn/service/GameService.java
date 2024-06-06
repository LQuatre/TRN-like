package fr.lquatre.trn.service;

import fr.lquatre.trn.repository.GameRepository;
import fr.lquatre.trn.model.Game;

public class GameService {
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public void addGame(Game game) {
        gameRepository.save(game);
    }

    public Game getGame(String name) {
        return gameRepository.findByName(name);
    }
}
