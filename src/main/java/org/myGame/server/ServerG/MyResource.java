package org.myGame.server.ServerG;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import controller.Server;
import model.Message;

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
	@Path("status/id1")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getStatusPlayer1()
	{
		
		return server.status(1);
		
	}

	@GET
	@Path("status/id2")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getStatusPlayer2()
	{
		
		return server.status(2);
		
	}
	
	/**
	 * To be called in order to receive ID
	 * 
	 * @param userName
	 * @return a unique id
	 */
	
	@POST
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)	
	public String login(String userName)
	{				
		return Integer.toString(server.newClient(userName));	
	}
	
	/**
	 * To be called after position is set
	 * 
	 * @param ready
	 * @return OK
	 */
	
	@POST
	@Path("ready")
	@Produces(MediaType.APPLICATION_JSON)	
	public String setPosition(Message ready)
	{		
		server.playerReadyToStart(ready);
		return "OK";
	}
	
	@POST
	@Path("attack")
	@Produces(MediaType.APPLICATION_JSON)	
	
	public String attack(Message attack)
	{		
		
		return server.attack(attack);	
	}

}
