package com.kcsajan.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", length = 10)
	private int userId;

	@Column(name = "user_name", length = 50)
	private String userName;

	@Column(name = "user_email", length = 50)
	private String userEmail;

	@Column(name = "user_password", length = 50)
	private String user_password;

	@Column(name = "user_phone", length = 15)
	private String user_phone;

	@Column(name = "user_pic", length = 1000)
	private String userPic;

	@Column(name = "user_address", length = 500)
	private String userAddress;

	public User() {
		super();
	}

	public User(int userId, String userName, String userEmail, String user_password, String user_phone, String userPic,
			String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.user_password = user_password;
		this.user_phone = user_phone;
		this.userPic = userPic;
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", user_password="
				+ user_password + ", user_phone=" + user_phone + ", userPic=" + userPic + ", userAddress=" + userAddress
				+ "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUserPic() {
		return userPic;
	}

	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}
