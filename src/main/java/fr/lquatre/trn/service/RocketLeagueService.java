package fr.lquatre.trn.service;

import fr.lquatre.trn.model.RocketLeagueGame;

public class RocketLeagueService {
    private RocketLeagueGame rocketLeagueGame;

    public RocketLeagueService(RocketLeagueGame rocketLeagueGame) {
        this.rocketLeagueGame = rocketLeagueGame;
    }

    public void fetchStats() {
        rocketLeagueGame.fetchStats();
    }
}