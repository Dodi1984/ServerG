package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
	private Boolean[][] positionGrid = new Boolean[10][10];
	private String userName;
	private boolean startGame;
	private boolean myturn;
	private boolean ready;
	private int id;
	
	public Message()
	{

	}

	public Boolean[][] getPositionGrid()
	{
		return positionGrid;
	}

	public void setPositionGrid(Boolean[][] positionGrid)
	{
		this.positionGrid = positionGrid;
	}

	/**
	 * @return the startGame
	 */
	public boolean isStartGame()
	{
		return startGame;
	}

	/**
	 * @param startGame
	 *            the startGame to set
	 */
	public void setStartGame(boolean startGame)
	{
		this.startGame = startGame;
	}

	/**
	 * @return the myturn
	 */
	public boolean isMyturn()
	{
		return myturn;
	}

	/**
	 * @param myturn
	 *            the myturn to set
	 */
	public void setMyturn(boolean myturn)
	{
		this.myturn = myturn;
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/**
	 * @return the ready
	 */
	public boolean isReady()
	{
		return ready;
	}

	/**
	 * @param ready the ready to set
	 */
	public void setReady(boolean ready)
	{
		this.ready = ready;
	}

}
