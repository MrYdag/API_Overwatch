package com.example.api;

import java.util.ArrayList;
import java.util.List;

public interface IMapsDAO {

    ArrayList<Map> maps = new ArrayList<>();

    List<Map> findAll();

    Map findById(int id);

    void save(Map m);
}
