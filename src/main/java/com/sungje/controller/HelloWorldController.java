package com.sungje.controller;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author sucho
 * @since 11/19/16.
 */
@Path("/hello")
public class HelloWorldController {
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello() {
        Response response = Response.status(Response.Status.OK).entity("{\"message\": \"Hello World\"}").build();
        return response;
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHelloTo(@PathParam("name") final String name) {
        JSONObject joResponse = new JSONObject("{\"message\": \"Hello World\"}");
        joResponse.put("to", name);
        Response response = Response.status(Response.Status.OK).entity(joResponse.toString()).build();
        return response;
    }



}
