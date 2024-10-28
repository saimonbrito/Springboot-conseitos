package com.conseitos.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiroContrpller")
public class PrimeiroController {

    @GetMapping("/preimeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id){
 
        return  "o parametro e " + id;
    }

    @GetMapping("/metodoComQueryParmams3")
    public String metodoComQueryParmams(@RequestParam String id){
 
        return  "o parametro com metodoComQueryParmams e " + id;
    }

    @GetMapping("/metodoComQueryParmams2")
    public String metodoComQueryParmams2(@RequestParam Map<String , String> cataratasParmams){
 
        return  "o parametro e " + cataratasParmams.entrySet();
    }


}
