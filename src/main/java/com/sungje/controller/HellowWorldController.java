package com.sungje.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author sucho
 * @since 11/19/16.
 */
@Path("/hello")
public class HellowWorldController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello() {
        Response response = Response.status(Response.Status.OK).entity("{\"message\": \"Hello World\"}").build();
        return response;
    }
}
