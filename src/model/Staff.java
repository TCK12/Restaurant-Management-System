package model;
import java.sql.Time;
import java.time.LocalTime;

public class Staff {
	private String staffID;
	private String userName;
	private String password;
	private String fullName;
	private String phone;
	private byte sex;
	private Time startShift;
	private Time endShift;
	

	public Staff(String staffID, String userName, String password, String fullName, String phone, byte sex,
			Time startShift, Time endShift) {
		this.staffID = staffID;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.phone = phone;
		this.sex = sex;
		this.startShift = startShift;
		this.endShift = endShift;
	}
	
	public void updateInfo(Staff tmp) {
		this.staffID = tmp.staffID;
		this.userName = tmp.userName;
		this.password = tmp.password;
		this.fullName = tmp.fullName;
		this.phone = tmp.phone;
		this.sex = tmp.sex;
		this.startShift = tmp.startShift;
		this.endShift = tmp.endShift;
	}


	public String getStaffID() {
		return staffID;
	}


	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public byte getSex() {
		return sex;
	}


	public void setSex(byte sex) {
		this.sex = sex;
	}


	public Time getStartShift() {
		return startShift;
	}


	public void setStartShift(Time startShift) {
		this.startShift = startShift;
	}


	public Time getEndShift() {
		return endShift;
	}


	public void setEndShift(Time endShift) {
		this.endShift = endShift;
	}
	
	
}
