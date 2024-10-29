package com.conseitos.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario){
        return "metodoComBodyParams " + usuario.username;
    }

    @PostMapping("/metodoComHeader")
    public String metodoComHeader(@RequestHeader("name") String name){
        return "metodoComHeader " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers){
        return "metodoComListHeaders " + headers.entrySet();
    }

    @GetMapping("/metodoResponsEntity/{id}")
    public ResponseEntity<Object> metodoResponsEntity(@PathVariable long  id){
    
        var usuario = new Usuario("samiraGostosaSex");

        if (id > 5){
            return  ResponseEntity.status(HttpStatus.OK).body(usuario); 
        
        }
        return  ResponseEntity.badRequest().body("numero menor que 5");
    }
 
    record  Usuario(String username){}


}
