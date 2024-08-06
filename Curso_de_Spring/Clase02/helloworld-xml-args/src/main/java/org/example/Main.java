package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Cargando el contexto de los beans ...");

        Thread.sleep(3000);

        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Thread.sleep(3000);

        Greeter greeter = (Greeter) context.getBean("greeter");
        Greeter greeter2 = (Greeter) context.getBean("greeter");

        Thread.sleep(3000);

        String greeting = greeter.sayHello();
        String greeting2 = greeter2.sayHello();

        System.out.println(greeting);
        System.out.println(greeting2);

        CustomerSupport customerSupport = (CustomerSupport) context.getBean("customerSupport");

        String appName = customerSupport.applicationName;
        // observar cómo desde el bean customerSupport
        // accedo a la función sayHello() del bean greeter
        String greetingCustomer = customerSupport.greeter.sayHello();

        System.out.printf("(%s): %s\n", appName, greetingCustomer);
    }
}
