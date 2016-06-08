package model;

/**
 * Class for storing player status
 * 
 * @author Dan
 *
 */
public class User
{
	private Boolean[][] positionGrid = new Boolean[10][10];
	private String userName;
	private boolean win;
	private boolean myturn;
	private boolean ready;
	private int id;

	public User()
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
	 * @param id
	 *            the id to set
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
	 * @param userName
	 *            the userName to set
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
	 * @param ready
	 *            the ready to set
	 */
	public void setReady(boolean ready)
	{
		this.ready = ready;
	}

	/**
	 * @return the win
	 */
	public boolean isWin()
	{
		return win;
	}

	/**
	 * @param win
	 *            the win to set
	 */
	public void setWin(boolean win)
	{
		this.win = win;
	}
}
