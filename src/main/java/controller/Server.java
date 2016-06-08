package controller;

import model.Message;
import model.User;

/**
 * 
 * @author daniculescu
 *
 */
public class Server
{
	private boolean updateNeeded;
	private int updatedClients;
	private boolean startGame;
	private User player1;
	private User player2;
	private static Server server;

	private Server()
	{
		// C-tor private to prevent instantiation
	}

	/**
	 * Server is a singleton
	 * 
	 * @return Server instance
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

	public int newClient(String userName)
	{
		if (player1 == null)
		{
			player1 = new User();
			player1.setUserName(userName);
			player1.setId(1);
			return 1;
		} else if (player2 == null && !userName.equals(player1.getUserName()))
		{
			player2 = new User();
			player2.setUserName(userName);
			player1.setId(2);
			return 2;
		}
		if (player1.getUserName().equals(userName))
		{
			return player1.getId();
		}
		if (player2.getUserName().equals(userName))
		{
			return player2.getId();
		}
		return 0;
	}

	/**
	 * 
	 * @param client
	 * @return the oposite player
	 */
	public void updateUser(Message message)
	{
		if (message.getId() == 1)
		{
			
		}
		if (message.getId() == 2)
		{

		}
	}
	
	public void playerReadyToStart(Message message)
	{
		if (message.getId() == 1)
		{
			player1.setPositionGrid(message.getPositionGrid());
			player1.setReady(true);
		}
		if (message.getId() == 2)
		{
			player2.setPositionGrid(message.getPositionGrid());
			player2.setReady(true);
		}
		
		if (player1.isReady()&&player2.isReady())
		{
			startGame=true;
		}
	}

	public User getPlayer1()
	{
		return player1;
	}

	public void setPlayer1(User player1)
	{
		this.player1 = player1;
	}

	public User getPlayer2()
	{
		return player2;
	}

	public void setPlayer2(User player2)
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
	 * @param updatedClients
	 *            the updatedClients to set
	 */
	public void setUpdatedClients()
	{
		updatedClients += 1;
	}

	/**
	 * @return the startGame
	 */
	public boolean isStartGame()
	{
		return startGame;
	}

	/**
	 * @param startGame the startGame to set
	 */
	public void setStartGame(boolean startGame)
	{
		this.startGame = startGame;
	}
}
