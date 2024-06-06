package fr.lquatre.trn.model;

public abstract class Game {
    protected String name;
    protected String genre;

    public Game(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public abstract void fetchStats();

    // Getters et setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}