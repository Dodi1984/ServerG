package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
	private Boolean[][] positionGrid = new Boolean[10][10];
	private Boolean[][] attackPosition = new Boolean[10][10];
	private String userName;
	private int hitsLeft = 18;
	private int id;
	private boolean hit;
	private StatusEnum status = StatusEnum.WAIT;
	
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

	public Boolean[][] getAttackPosition()
	{
		return attackPosition;
	}

	public void setAttackPosition(Boolean[][] attackPosition)
	{
		this.attackPosition = attackPosition;
	}

	/**
	 * @return the hit
	 */
	public boolean isHit()
	{
		return hit;
	}

	/**
	 * @param hit the hit to set
	 */
	public void setHit(boolean hit)
	{
		this.hit = hit;
	}

	/**
	 * @return the hitsLeft
	 */
	public int getHitsLeft()
	{
		return hitsLeft;
	}

	/**
	 * @param hitsLeft the hitsLeft to set
	 */
	public void setHitsLeft(int hitsLeft)
	{
		this.hitsLeft = hitsLeft;
	}


}
