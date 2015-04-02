package ua.artcode.ws.endpoint;

import ua.artcode.ws.model.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloService {

    @WebMethod
    Product getProductById(int id);

}
