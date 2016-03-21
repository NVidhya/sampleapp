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
    return "<?xml version=\"1.0\"?>" + "<hello> Hello World Bluemeric" + "</hello>";
  }
  
  @GET
  @Path("/helloworld2")
  @Produces(MediaType.TEXT_HTML)
  public String sayHelloWorld2() {
	  return "<html> " + "<title>" + "Hello World" + "</title>"
		        + "<body><h1>" + "Hello World! Welcome to Bluemeric Demo10!" + "</body></h1>" + "</html> ";
  }
  
  @GET
  @Path("/helloworld3")
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHelloWorld3 (@QueryParam("name") String name) {
	  return "Hello World " + name;
  }
  
  @GET
  @Path("/helloworld4")
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHelloWorld4 (@QueryParam("name") String name) {
	  return "Hello World Testing";
  }
} 