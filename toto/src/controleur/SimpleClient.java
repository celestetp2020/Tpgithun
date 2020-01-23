package controleur;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class SimpleClient {
	
	
	public static void main(String[] args) {
		
		
		String REST_URI = "http://172.17.0.2:8080/toto";
		
		Client client = ClientBuilder.newClient();
		
		String message = client.target(REST_URI).path("bonjour").request(MediaType.TEXT_HTML).get(String.class);
		System.out.println(message);
		

	}

}
