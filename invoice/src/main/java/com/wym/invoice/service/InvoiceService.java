package com.wym.invoice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class InvoiceService {

    @Value("${appID}")
    private String appID;

    @Resource
    private RestTemplate restTemplate;

    public String qryWinningListService(String invTerm){
        String url = "https://api.einvoice.nat.gov.tw/PB2CAPIVAN/invapp/InvApp";

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("version", "0.2");
        params.add("action", "QryWinningList");
        params.add("invTerm", invTerm);
        params.add("appID", appID);

        return restTemplate.postForObject(url, params, String.class);
    }
}
