package model;

import java.io.Serializable;
import java.util.Objects;

public class ModelLogin implements Serializable {
   private static final long serialVersionUID=1l;
   private String login;
   private String password;
   private String email;
   
   
	public ModelLogin(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public ModelLogin(){}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
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


	@Override
	public int hashCode() {
		return Objects.hash(email, login, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelLogin other = (ModelLogin) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password);
	}
   
    
   
}
