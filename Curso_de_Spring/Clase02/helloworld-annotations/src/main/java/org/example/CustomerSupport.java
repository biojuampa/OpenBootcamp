package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerSupport {

    // por practicidad no encapsulo los atributos
    // la idea es que se vea cómo funciona Spring
    String applicationName;
    Greeter greeter;

    // paso el valor al argumento "applicationName" con @Value
    // (esto solo es para la instancia del bean)
    public CustomerSupport(@Value("CS-3000") String applicationName, Greeter greeter) {
        System.out.println("Construyendo a CustomerSupport Class ...");
    
        this.greeter = greeter;
        this.applicationName = applicationName;
    }

}
