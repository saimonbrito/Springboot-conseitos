package com.conseitos.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponente {

    public String chamandomeuComponente(){
        return "componente chamado";
    }

}
