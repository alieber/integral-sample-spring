package com.metaformsystems.integral.test.spring;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@RestController
@RequestMapping("/service/account")
public class AccountService {

    private static final String TARGET = "http://foo.com/service";

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getAccount(@PathVariable String id) {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(TARGET);
        Invocation.Builder request = target.request();
        Response response = request.get();
        return "";
    }

    @RequestMapping(value = "/balance/{idx}", method = RequestMethod.GET)
    public String getAccountBalance(@PathVariable String id) {
        RestTemplate template = new RestTemplate();
        String response1 = template.getForObject("http://foo.com/backend", String.class);
        String response2 = new RestTemplate().getForObject("http://foo.com/backend2", String.class);
        return "";
    }


}
