package org.myGame.server.ServerG;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import controller.Server;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource
{
	Server server = new Server();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt()
	{
		return "Got it! my test";
	}

		
	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public String getJson()
	{
		return "json";
	}

	/**
	 *  login method
	 * @param userName, password
	 * @return unique id to be used via http
	 */
	@POST
	@Path("login")	
	@Produces(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.TEXT_PLAIN)
	public String getId(String userName, String password)
	{
		
		return id;
		
	}

}
