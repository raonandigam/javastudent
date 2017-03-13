public class User{

	 private String firstName;
     private String lastName;
     private long phoneNo;
     
    public void User(String first, String last, long phoneno){
       this.firstName = first;
       this.lastName = last;
	   this.phoneNo = phoneno;

   }

	public String getFirstname() {
		return this.firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return this.lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public long getPhoneno() {
		return this.phoneNo;
	}

	public void setPhoneno(double phoneno) {
		this.phoneNo = phoneno;
	}

}