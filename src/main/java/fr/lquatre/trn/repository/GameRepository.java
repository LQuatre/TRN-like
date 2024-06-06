package fr.lquatre.trn.repository;

import fr.lquatre.trn.model.Game;

public interface GameRepository {
    void save(Game game);
    Game findByName(String name);
}