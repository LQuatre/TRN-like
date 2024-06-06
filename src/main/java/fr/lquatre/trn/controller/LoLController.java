package fr.lquatre.trn.controller;

import fr.lquatre.trn.service.LoLService;

public class LoLController {
    private final LoLService loLService;

    public LoLController(LoLService loLService) {
        this.loLService = loLService;
    }

    public void fetchLoLStats() {
        loLService.fetchStats();
    }
}