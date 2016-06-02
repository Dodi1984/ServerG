package controller;

import java.util.Random;
import java.util.UUID;
import java.util.Vector;

import model.Client;
/**
 * 
 * @author daniculescu
 *
 */
public class Server
{
	private Vector<Client> clients = new Vector<>();
	private static Server server;
	
	public int getClientId(Client c)
	{		
		
		return c.getId();
	}
	
	public void generateClientId(Client c)
	{
		Random r = new Random();
		int low = 1;
		int high = 100;
		int result = r.nextInt(high-low) + low;
		c.setId(result);
	}
	/**
	 * use this to retrieve server instance if needed
	 * @return server instance
	 */
	public static Server getServerInstance()
	{
		if (server==null)
		{
			server = new Server();
			return server;
		}
		return server;
	}

	public Vector<Client> getClients()
	{
		return clients;
	}

	public void setClients(Vector<Client> clients)
	{
		this.clients = clients;
	}
	
	public void addNewClient(Client c)
	{
		clients.addElement(c);
		generateClientId(c);
	}
	
	
	
}
