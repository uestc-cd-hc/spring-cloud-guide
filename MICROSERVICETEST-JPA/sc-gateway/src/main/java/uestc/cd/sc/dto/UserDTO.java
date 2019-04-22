package uestc.cd.sc.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3656820954722071044L;
	
	private int id;
	
	private String userId;
	
	private String userName;
	
	private String onTime;
	
	private int deleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOnTime() {
		return onTime;
	}

	public void setOnTime(String onTime) {
		this.onTime = onTime;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id 
				+ ", userId=" + userId 
				+ ", userName=" + userName 
				+ ", onTime=" + onTime 
				+ ", deleted=" + deleted + "]";
	}
}

