package rs.endpoint;

import jaxb.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;

@Path("/hello")
public class HelloWordEndpoint {

    @GET
    @Produces("application/xml")
    @Path("/{param}")
    public Product getMessage(@PathParam("param") String param){
        System.out.println("in rest");
        return new Product(1,"name",2000);
    }

}
