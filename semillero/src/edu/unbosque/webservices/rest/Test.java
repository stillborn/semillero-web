package edu.unbosque.webservices.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import edu.unbosque.dao.FacultiesHome;
import edu.unbosque.model.Faculties;

 
@Path("/message")
public class Test {
  
	
	@GET
	@Path("/{param}")
	@Produces("application/json")
	public Response printMessage(@PathParam("param") String msg) {
 
		String result = "Restful example : " + msg;
		
		FacultiesHome fh = new FacultiesHome();
		
		Faculties fac = new Faculties();
		
		fac.setName("Enfermeria");
		
		fh.persist(fac);
		
		List<Faculties> faculties = fh.findAll();
		
		for(Faculties f : faculties){
			result += f.getName();
		}
		
		return Response.status(200).entity(result).build();
	}
 
}