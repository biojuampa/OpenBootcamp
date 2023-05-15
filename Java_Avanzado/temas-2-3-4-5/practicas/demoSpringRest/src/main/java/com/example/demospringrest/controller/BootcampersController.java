package com.example.demospringrest.controller;

import com.example.demospringrest.models.Bootcamper;
import com.example.demospringrest.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;

@Component
@Path("/")
public class BootcampersController {
    @GET
    @Path("/")
    public String saludo() {
        return "Hola\n";
    }

    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

//        bootcamperService.add(new Bootcamper("Uno", Math.random()));
//        bootcamperService.add(new Bootcamper("Dos", Math.random()));
//        bootcamperService.add(new Bootcamper("Tres", Math.random()));
//        bootcamperService.add(new Bootcamper("Cuatro", Math.random()));
//        bootcamperService.add(new Bootcamper("Cinco", Math.random()));

    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public ArrayList<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response createBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);
        return Response.created(URI.create("/bootcamper/" + bootcamper.getName())).build();
    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper getBootcamper(@PathParam("name") String name) {
        return bootcamperService.get(name);
    }
}
