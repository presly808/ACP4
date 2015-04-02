package ua.artcode.ws.endpoint;

/**
 * Created by serhii on 28.03.15.
 */
public class RunClient {

    public static void main(String[] args) {
        HelloServiceImplService helloServiceImplService =
                new HelloServiceImplService();

        HelloService helloService =
                helloServiceImplService.getHelloServiceImplPort();

        Product product = helloService.getProductById(2);
        System.out.printf("id %d, name %s, price %.3f",
                product.getId(),
                product.getName(),
                product.getSalary());
    }


}
