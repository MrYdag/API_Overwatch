package com.example.api;

public class Map {
    private int id;
    private String name;
    private String gamemode;
    private String country;

    public Map(int id, String name, String gamemode, String country){
        this.id = id;
        this.name = name;
        this.gamemode = gamemode;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGamemode() {
        return gamemode;
    }

    public String getCountry() {
        return country;
    }
}
