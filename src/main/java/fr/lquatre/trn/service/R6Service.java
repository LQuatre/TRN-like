package fr.lquatre.trn.service;

import fr.lquatre.trn.model.R6Game;

public class R6Service {
    private R6Game r6Game;

    public R6Service(R6Game r6Game) {
        this.r6Game = r6Game;
    }

    public void fetchStats() {
        r6Game.fetchStats();
    }
}