package BuilderPattern.BadDesign;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String url;
    private String method;
    private Map<String , String > header;
    private Map<String , String > queryParams;
    private String body;
    private int timeOut;

    public HttpRequest(String url) {
        this.url = url;
        this.method = "GET";
        this.timeOut = 30;
        this.header = new HashMap<>();
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url, String method ) {
        this.url = url;
        this.method = method;
        this.timeOut = 30;
        this.header = new HashMap<>();
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url, String method , int timeOut) {
        this.url = url;
        this.method = method;
        this.timeOut = timeOut;
        this.header = new HashMap<>();
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url,String method, int timeOut, Map< String, String> header) {
        this.url = url;
        this.method = method;
        this.timeOut = timeOut;
        this.header = header;
        this.queryParams = new HashMap<>();
    }

    public HttpRequest(String url, String method, int timeOut, Map<String, String> header, Map<String, String> queryParams) {
        this.url = url;
        this.method = method;
        this.timeOut = timeOut;
        this.header = header;
        this.queryParams = queryParams;
    }

    public HttpRequest(String url, String method, int timeOut, Map<String, String> header, Map<String, String> queryParams, String body) {
        this.url = url;
        this.method = method;
        this.timeOut = timeOut;
        this.header = header;
        this.queryParams = queryParams;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public void addHeader(String key, String value) {
        header.put(key, value);
    }

    public void addQueryParam(String key, String value) {
        queryParams.put(key, value);
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void execute(){
        System.out.println("Executing " + method + " request to " + url);

        if (!queryParams.isEmpty()) {
            System.out.println("Query Parameters:");
            for (Map.Entry<String,String> param : queryParams.entrySet()) {
                System.out.println("  " + param.getKey() + "=" + param.getValue());
            }
        }

        System.out.println("Headers:");
        for (Map.Entry<String,String> header :
        header.entrySet()) {
            System.out.println("  " + header.getKey() + ": " + header.getValue());
        }

        if (body != null && !body.isEmpty()) {
            System.out.println("Body: " + body);
        }

        System.out.println("Timeout: " + timeOut + " seconds");
        System.out.println("Request executed successfully!");

    }
}


