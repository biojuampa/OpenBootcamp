package org.example;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

    public Greeter() {
        System.out.println("Estoy construyedo a Greeter Class ...");
    }

    public String sayHello() {
        return "Qué hacé pelau!";
    }
}
