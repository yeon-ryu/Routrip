package com.web.curation.model.user;

 public class User {

     private int uid;
     private String password;
     private String email;
     private String nickname;
     private String name;
     private String phone;
     private String birth;
     private String profileImg;
     private String userkey;
     private int loginApi;
     private String userid;
     
     public User(){}
     public User(String email, String password){
        this.email = email;
        this.password = password;
     }
	public User(int uid, String password, String email, String nickname, String name, String phone, String birth,
			String profileImg, int loginApi, String userkey, String userid) {
		super();
		this.uid = uid;
		this.password = password;
		this.email = email;
		this.nickname = nickname;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.profileImg = profileImg;
		this.loginApi = loginApi;
		this.userkey = userkey;
		this.userid = userid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public int getLoginApi() {
		return loginApi;
	}
	public void setLoginApi(int loginApi) {
		this.loginApi = loginApi;
	}
	public String getUserkey() {
		return userkey;
	}
	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", password=" + password + ", email=" + email + ", nickname=" + nickname + ", name="
				+ name + ", phone=" + phone + ", birth=" + birth + ", profileImg=" + profileImg + ", userkey=" + userkey
				+ ", loginApi=" + loginApi + ", userid=" + userid + "]";
	}
 }
