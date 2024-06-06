package fr.lquatre.trn.repository;

import fr.lquatre.trn.model.Player;

public interface PlayerRepository {
    void save(Player player);
    Player findByUsername(String username);
}