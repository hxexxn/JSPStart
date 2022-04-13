package dto;

public class userDTO {

	private int uNumber;
	private String uName;
	private String uAddress;
	private String uAge;
	
	
	public int getuNumber() {
		return uNumber;
	}
	public void setuNumber(int uNumber) {
		this.uNumber = uNumber;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuAge() {
		return uAge;
	}
	public void setuAge(String uAge) {
		this.uAge = uAge;
	}
	
	@Override
	public String toString() {
		return "userDTO [uNumber=" + uNumber + ", uName=" + uName + ", uAddress=" + uAddress + ", uAge=" + uAge + "]";
	}
	
	
	
}
