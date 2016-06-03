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
	private boolean updateNeeded;
	private int updatedClients;
	private Client player1;
	private Client player2;
	private static Server server;

	public int getClientId(Client c)
	{
		return c.getId();
	}

	public int newClient(String userName)
	{
		if (player1 == null)
		{
			player1 = new Client(userName);
			setUpdateNeeded(true);
			player1.setId(1);
			
		} else if (player2 == null)
		{
			player2 = new Client(userName);
			setUpdateNeeded(true);
			player1.setId(2);			
		}
		if (player1.getUserName().equals(userName))
		{
			updateNeeded=true;
			return player1.getId();
		}
		else if (player2.getUserName().equals(userName))
		{
			updateNeeded=true;
			return player2.getId();
		}		
		return 0;
	}

	/**
	 * use this to retrieve server instance if needed
	 * 
	 * @return server instance
	 */
	public static Server getServerInstance()
	{
		if (server == null)
		{
			server = new Server();
			return server;
		}
		return server;
		
	}

	/**
	 * 	  
	 * @param client
	 * @return the oposite player
	 */
	public Client UpdateClient(Client c)
	{
		if (c == player1)
		{
			return player2;
		}
		return player2;
	}

	public Client getPlayer1()
	{
		return player1;
	}

	public void setPlayer1(Client player1)
	{
		this.player1 = player1;
	}

	public Client getPlayer2()
	{
		return player2;
	}

	public void setPlayer2(Client player2)
	{
		this.player2 = player2;
	}

	public boolean isUpdateNeeded()
	{
		return updateNeeded;
	}

	public void setUpdateNeeded(boolean updateNeeded)
	{
		this.updateNeeded = updateNeeded;
	}
	

	/**
	 * @return the updatedClients
	 */
	public int getUpdatedClients()
	{
		return updatedClients;
	}

	/**
	 * @param updatedClients the updatedClients to set
	 */
	public void setUpdatedClients()
	{		
		updatedClients += 1;
	}
}
