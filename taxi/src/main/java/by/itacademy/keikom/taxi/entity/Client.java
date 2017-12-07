package by.itacademy.keikom.taxi.entity;

public class Client {
	
	private Integer clientId;
	private String clientName;
	
	
	public Client(Integer clientId, String clientName) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
	}
	
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + "]";
	}
	
	

}
