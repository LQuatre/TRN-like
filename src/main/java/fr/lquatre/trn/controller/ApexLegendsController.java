package fr.lquatre.trn.controller;

import fr.lquatre.trn.service.ApexLegendsService;

public class ApexLegendsController {
    private ApexLegendsService apexService;
    public ApexLegendsController(ApexLegendsService apexService) {
        this.apexService = apexService;
    }

    public void fetchApexLegendsStats() {
        apexService.fetchStats();
    }
}
