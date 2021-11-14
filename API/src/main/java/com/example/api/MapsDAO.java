package com.example.api;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MapsDAO implements IMapsDAO{


    MapsDAO(){
        //2CP maps
        maps.add(new Map(1,"Paris","2CP", "France"));
        maps.add(new Map(2,"Horizon Lunar Colony","2CP", "Moon"));
        maps.add(new Map(3,"Hanamura","2CP", "Japon"));
        maps.add(new Map(4,"Temple of Anubis","2CP", "Egypte"));
        maps.add(new Map(5,"Volskaya Industries","2CP", "Russie"));

        //KOTH
        maps.add(new Map(6,"Busan","KotH", "Corée du sud"));
        maps.add(new Map(7,"Ilios","KotH", "Grece"));
        maps.add(new Map(8,"Lijiang Tower","KotH", "Chine"));
        maps.add(new Map(9,"Nepal","KotH", "Nepal"));
        maps.add(new Map(10,"Oasis","KotH", "Irak"));

        //Escort
        maps.add(new Map(11,"Dorado","Escort", "Mexique"));
        maps.add(new Map(12,"Havana","Escort", "Cuba"));
        maps.add(new Map(13,"Junkertown","Escort", "Australie"));
        maps.add(new Map(14,"Rialto","Escort", "Italie"));
        maps.add(new Map(15,"Route 66","Escort", "Etats-Unis"));
        maps.add(new Map(16,"Watchpoint: Gibraltar","Escort", "Inconnu"));

        //Hybrid
        maps.add(new Map(17,"Blizzard World","Hybrid", "Etats-Unis"));
        maps.add(new Map(18,"Eichenwalde","Hybrid", "Allemagne"));
        maps.add(new Map(19,"Hollywood","Hybrid", "Etats-Unis"));
        maps.add(new Map(20,"King's Row","Hybrid", "Angleterre"));
        maps.add(new Map(21,"Numbani","Hybrid", "Numbani"));

        //Elimination
        maps.add(new Map(22,"Black Forest","Elimination", "Allemagne"));
        maps.add(new Map(23,"Castillo","Elimination", "Mexique"));
        maps.add(new Map(24,"Ecopoint: Antarctica","Elimination", "Inconnu"));
        maps.add(new Map(25,"Necropolis","Elimination", "Egypte"));

    }


    @Override
    public List<Map> findAll() {
        return maps;
    }

    @Override
    public Map findById(int id) {
        return maps.get(id-1);
    }

    @Override
    public void save(Map m) {
        maps.add(m);
    }
}
