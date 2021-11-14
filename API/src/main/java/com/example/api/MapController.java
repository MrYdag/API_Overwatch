package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MapController {

    @Autowired
    private IMapsDAO dao;

    @ResponseBody
    @GetMapping(value = "/Maps")
    public List<Map> getMaps(){
        return dao.findAll();
    }

    @ResponseBody
    @GetMapping(value = "Maps/{id}")
    public Map getMap(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value = "Maps")
    public void addMaps(@RequestBody Map m){
        dao.save(m);
    }
}
