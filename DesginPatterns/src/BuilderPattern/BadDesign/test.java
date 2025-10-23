package BuilderPattern.BadDesign;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        // Using Constructors (Telescoping constructor problem)
        HttpRequest request1 = new HttpRequest("https://api.example.com");
        HttpRequest request2 = new HttpRequest("https://api.example.com", "POST");
        HttpRequest request3 = new HttpRequest("https://api.example.com", "PUT", 60);

        // using setters(mutable object problem)
        HttpRequest request4 = new HttpRequest("https://api.example.com");
        request4.setMethod("POST");
        request4.addHeader("Content-Type", "application/json");
        request4.addQueryParam("key", "12345");
        request4.setBody("{\"name\": \"Aditya\"}");
        request4.setTimeOut(60);

        request4.execute();
        Arrays.asList(request3, request2, request1).forEach(HttpRequest::execute);

    }
}
