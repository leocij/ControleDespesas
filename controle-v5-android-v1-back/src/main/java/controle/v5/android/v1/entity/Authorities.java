package controle.v5.android.v1.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authorities implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String username;
	private String authority;

	public Authorities() {
		super();
	}

	public Authorities(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Authorities [username=" + username + ", authority=" + authority + "]";
	}

}
