package uestc.cd.sc.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5191432233241825438L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="USERID", length=255, nullable=false)
	private String userId;
	
	@Column(name="USERNAME", length=255, nullable=false)
	private String userName;
	
	@Column(name="ONTIME", length=63)
	private String onTime;
	
	@Column(name="DELETED")
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
