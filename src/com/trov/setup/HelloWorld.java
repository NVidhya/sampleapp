package com.trov.setup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloWorld {


  @GET
  @Path("/helloworld")
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHelloWorld() {
    return "Hello World";
  }

  @GET
  @Path("/helloworld0")
  @Produces(MediaType.TEXT_XML)
  public String sayHelloWorld0() {
    return "<?xml version=\"1.0\"?>" + "<hello> Hello World" + "</hello>";
  }

  @GET
  @Path("/helloworld1")
  @Produces(MediaType.TEXT_XML)
  public String sayHelloWorld1() {
    return "<?xml version=\"1.0\"?>" + "<hello> Hello World vidhya" + "</hello>";
  }
  
  @GET
  @Path("/helloworld2")
  @Produces(MediaType.TEXT_HTML)
  public String sayHelloWorld2() {
	  return "<html> " + "<title>" + "Hello World" + "</title>"
		        + "<body><h1>" + "Hello World" + "</body></h1>" + "</html> ";
  }
} 