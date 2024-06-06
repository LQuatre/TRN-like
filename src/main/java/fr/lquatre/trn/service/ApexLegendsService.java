package fr.lquatre.trn.service;

import fr.lquatre.trn.model.ApexLegendsGame;

public class ApexLegendsService {
    private ApexLegendsGame apexLegendsGame;

    public ApexLegendsService(ApexLegendsGame apexLegendsGame) {
        this.apexLegendsGame = apexLegendsGame;
    }

    public void fetchStats() {
        apexLegendsGame.fetchStats();
    }
}
