package fr.lquatre.trn.controller;

import fr.lquatre.trn.service.R6Service;

public class R6Controller {
    private final R6Service r6Service;

    public R6Controller(R6Service r6Service) {
        this.r6Service = r6Service;
    }

    public void fetchR6Stats() {
        r6Service.fetchStats();
    }
}