/* Servicio: aquí se realiza toda la lógica */

package com.example.demospringrest.services;

import com.example.demospringrest.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BootcamperService {
    private ArrayList<Bootcamper> bootcampers = new ArrayList<>();

    public ArrayList<Bootcamper> getAll() {
        return bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String name) {
        for (Bootcamper bootcamper: bootcampers) {
            if (bootcamper.getName().equalsIgnoreCase(name))
                return bootcamper;
        }
        return null;
    }

}
