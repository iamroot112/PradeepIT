package in.pradeep.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User {
	@NotEmpty(message = "user name mandatory")
	@Size(min=3 ,max=10,message="name should be 3 to 10 character")
	private String uname;
	@NotEmpty(message = "password mandatory")
	private String pwd;
	@NotEmpty(message="Emailid mandatory")
	@Email(message="valid mailid ")
	private String email;
	 @NotEmpty(message="Phone number mandatory")
	 @Size(min=10 , message="number should have 10 digits")
	private String phno;
	@NotNull(message = "password mandatory")
	private Integer age;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
