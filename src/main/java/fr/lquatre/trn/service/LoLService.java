package fr.lquatre.trn.service;

import fr.lquatre.trn.model.LoLGame;

public class LoLService {
    private LoLGame loLGame;

    public LoLService(LoLGame loLGame) {
        this.loLGame = loLGame;
    }

    public void fetchStats() {
        loLGame.fetchStats();
    }
}