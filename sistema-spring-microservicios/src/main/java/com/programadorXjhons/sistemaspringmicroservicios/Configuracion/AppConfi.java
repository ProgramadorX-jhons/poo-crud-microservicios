package com.programadorXjhons.sistemaspringmicroservicios.Configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfi {

    //esto en relaidad nos ayuda a nuestra conexcion con los demas microservicios
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
