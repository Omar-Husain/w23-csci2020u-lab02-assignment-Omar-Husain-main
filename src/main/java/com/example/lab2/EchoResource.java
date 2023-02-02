package com.example.lab2;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/echo")
public class EchoResource {

    // TO DO ...
    @GET
    @Produces("text/plain")
    public String main() {
        return "Welcome to my Server";
    }

    @GET
    @Path("/{arg}")
    @Produces("text/plain")
    public String unary(@PathParam("arg") String arg) {
        return "Welcome to my servers " + arg;
    }

    @GET
    @Path("/{arg_a}/{arg_b}")
    @Produces("text/plain")
    public String binary(@PathParam("arg_a") String arg_a, @PathParam("arg_b") String arg_b) {
        return "Welcome to my servers: " + arg_a + " and " + arg_b;
    }
}




