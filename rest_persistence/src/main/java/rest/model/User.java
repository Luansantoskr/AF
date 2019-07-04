package rest.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	
	private int id;
	private String name;
	private String local;
	private String promotor;
	private String data;
	
	public User() {
		
	}
		
	public User(int id, String name, String local, String promotor, String data) {
		super();
		this.id = id;
		this.name = name;
		this.local = local;
		this.promotor = promotor;
		this.data = data;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return name;
	}
	
	public void setUsername(String name) {
		this.name = name;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	public String getPromotor() {
		return promotor;
	}
	
	public void setPromotor(String promotor) {
		this.promotor = promotor;
	}
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		String local = null;
		return "User [id=" + id + ", name=" + name + ", local=" + local + "]";
	}	
}
