package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bonjour")
public class MonService {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String direBonjour() {
		return "Bonjour Le Monde";
	}
}