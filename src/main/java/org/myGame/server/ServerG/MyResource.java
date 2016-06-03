package org.myGame.server.ServerG;

import java.util.Vector;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import controller.Server;
import model.Client;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource
{

	private Server server = Server.getServerInstance();

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

	/**
	 * Method for status, to be called at least every 200 ms
	 * @return true if the update is needed false if not
	 */
	@GET
	@Path("status")
	@Produces(MediaType.APPLICATION_JSON)
	public String getStatus()
	{
		return Boolean.toString(server.isUpdateNeeded());
	}

	@POST
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)	
	public String login(String userName)
	{				
		return "Connected "+ Integer.toString(server.newClient(userName));	
	}
	
	

}
