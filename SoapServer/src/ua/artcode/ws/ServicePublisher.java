package ua.artcode.ws;

import ua.artcode.ws.endpoint.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by serhii on 28.03.15.
 */
public class ServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://192.168.1.50:9999/ws/product", new HelloServiceImpl());
    }
}
