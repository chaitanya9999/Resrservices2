package webservices1.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Restservices  {   
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String Hello() {
        return "Hello World";
    }
}
