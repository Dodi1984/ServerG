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

	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public String getJson()
	{
		return "json";
	}


	@POST
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_JSON)
	public String getId(String userName)
	{			
		for (Client c : server.getClients())
		{
			if (c.getUserName().equals(userName))
			{
				return Integer.toString(c.getId());			
			}
		}
		Client c = new Client(userName);
		server.addNewClient(c);
		return Integer.toString(c.getId());
	}

}
