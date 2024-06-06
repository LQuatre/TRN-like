package fr.lquatre.trn.controller;

import fr.lquatre.trn.service.RocketLeagueService;

public class RocketLeagueController {
    private final RocketLeagueService rocketLeagueService;

    public RocketLeagueController(RocketLeagueService rocketLeagueService) {
        this.rocketLeagueService = rocketLeagueService;
    }

    public void fetchRocketLeagueStats() {
        rocketLeagueService.fetchStats();
    }
}