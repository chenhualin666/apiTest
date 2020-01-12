package com.chl.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import java.io.IOException;

public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        String result;
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        HttpClient httpClient = new DefaultHttpClient();
        HttpResponse httpResponse = httpClient.execute(httpGet);
        result = EntityUtils.toString(httpResponse.getEntity(),"utf-8");
        System.out.println(result);
    }

    @Test
    public void getWithCookies(){
        HttpGet get = new HttpGet("");
        HttpClient client = new DefaultHttpClient();

    }
}
