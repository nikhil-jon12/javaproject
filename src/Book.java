import java.io.Serializable;

public class Book implements Serializable 
{

	private static final long serialVersionUID = 1L;
    
	String id;
    private String username;
    private String password;
    private String email;
    private String dob;
    private String address;
    private String selcountry;
    private String phnumber;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSelcountry() {
		return selcountry;
	}
	public void setSelcountry(String selcountry) {
		this.selcountry = selcountry;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
