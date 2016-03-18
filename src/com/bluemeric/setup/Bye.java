package com.bluemeric.setup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Bye {


  @GET
  @Path("/bye")
  @Produces(MediaType.TEXT_PLAIN)
  public String saybye() {
    return "Say Bye";
  }

  @GET
  @Path("/bye0")
  @Produces(MediaType.TEXT_XML)
  public String saybye0() {
    return "<?xml version=\"1.0\"?>" + "<hello> Say Bye" + "</hello>";
  }

  @GET
  @Path("/bye1")
  @Produces(MediaType.TEXT_XML)
  public String saybye1() {
    return "<?xml version=\"1.0\"?>" + "<hello> Say Bye vidhya" + "</hello>";
  }
  
  @GET
  @Path("/bye2")
  @Produces(MediaType.TEXT_HTML)
  public String saybye2() {
	  return "<html> " + "<title>" + "Say Bye" + "</title>"
		        + "<body><h1>" + "Say Bye" + "</body></h1>" + "</html> ";
  }
  
  @GET
  @Path("/bye3")
  @Produces(MediaType.TEXT_PLAIN)
  public String saybye3 (@QueryParam("name") String name) {
	  return "Say Bye " + name;
  }
  
  @GET
  @Path("/bye4")
  @Produces(MediaType.TEXT_PLAIN)
  public String saybye4 (@QueryParam("name") String name) {
	  return "Say Bye Testing";
  }
} 