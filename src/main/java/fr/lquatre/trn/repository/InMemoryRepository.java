package fr.lquatre.trn.repository;

import fr.lquatre.trn.model.Player;
import fr.lquatre.trn.model.Game;

import java.util.HashMap;
import java.util.Map;

public class InMemoryRepository implements GameRepository, PlayerRepository {
    private Map<String, Game> games = new HashMap<>();
    private Map<String, Player> players = new HashMap<>();

    @Override
    public void save(Game game) {
        games.put(game.getName(), game);
    }

    @Override
    public Game findByName(String name) {
        return games.get(name);
    }

    @Override
    public void save(Player player) {
        players.put(player.getUsername(), player);
    }

    @Override
    public Player findByUsername(String username) {
        return players.get(username);
    }
}