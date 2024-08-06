package org.example;

public class CustomerSupport {

    // por practicidad no encapsulo los atributos
    // la idea es que se vea cómo funciona Spring
    String applicationName;
    Greeter greeter;

    public CustomerSupport(String applicationName, Greeter greeter) {
        System.out.println("Construyendo a Customer Support Class ...");
    
        this.greeter = greeter;
        this.applicationName = applicationName;
    }

}
