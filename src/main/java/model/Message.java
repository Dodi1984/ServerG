package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
	private Boolean[][] positionGrid = new Boolean[10][10];
	private String userName;
	private int id;
	private StatusEnum status = StatusEnum.WAIT;
	private Boolean[][] attackPosition = new Boolean[10][10];
	
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
	 * @return the status
	 */
	public StatusEnum getStatus()
	{
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusEnum status)
	{
		this.status = status;
	}

	
	/**
	 * @return the attackPosition
	 */
	public Boolean[][] getAttackPosition()
	{
		return attackPosition;
	}

	/**
	 * @param attackPosition the attackPosition to set
	 */
	public void setAttackPosition(Boolean[][] attackPosition)
	{
		this.attackPosition = attackPosition;
	}
}
