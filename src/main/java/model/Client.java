package model;

/**
 * 	Class for storing player status
 * @author Alex
 *
 */
public class Client
{
	private String userName;
	private String password;
	private int id;
	// instantiate client array, by default all values are false
	private boolean[][] table = new boolean [10][10];

	public Client(String userName)
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public boolean[][] getTable()
	{
		return table;
	}

	public void setTable(boolean[][] table)
	{
		this.table = table;
	}
}
