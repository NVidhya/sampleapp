package com.bluemeric.setup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloWorld {

  @GET
  @Path("/helloworld")
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHelloWorld() {
    return "Hello World , Welcome!" ;
  } 

  @GET
  @Path("/helloworld1")
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHelloWorld1(@QueryParam("name") String name) {
    return "Hello World " + name ;
  } 
} 
