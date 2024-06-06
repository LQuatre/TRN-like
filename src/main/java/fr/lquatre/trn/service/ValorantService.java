package fr.lquatre.trn.service;


import fr.lquatre.trn.model.ValorantGame;

public class ValorantService {
    private ValorantGame valorantGame;

    public ValorantService(ValorantGame valorantGame) {
        this.valorantGame = valorantGame;
    }

    public void fetchStats() {
        valorantGame.fetchStats();
    }
}
