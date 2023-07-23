package com.example

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/hello")
class ExampleResource {
    @GET
    @Path("bug")
    fun bug(): Response {
        val json =  ExampleResource::class.java.getResource("/big-example.json")!!.readText()
        return Response.status(200).entity(json).build()
    }

    @GET
    @Path("small-json")
    fun noBug(): Response {
        val json =  ExampleResource::class.java.getResource("/small-example.json")!!.readText()
        return Response.status(200).entity(json).build()
    }
}
