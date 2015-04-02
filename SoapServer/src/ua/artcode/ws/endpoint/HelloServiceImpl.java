package ua.artcode.ws.endpoint;

import ua.artcode.ws.model.Product;

import javax.jws.WebService;
import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "ua.artcode.ws.endpoint.HelloService")
public class HelloServiceImpl implements HelloService {

    private List<Product> products;

    public HelloServiceImpl() {
        products = Arrays.asList(
                new Product(1,"Lg", 1200),
                new Product(2,"Samsung", 100),
                new Product(3,"Lenovo", 800));
    }

    @Override
    public Product getProductById(int id) {
        return products.get(products.indexOf(new Product(id, null, 0)));
    }
}
