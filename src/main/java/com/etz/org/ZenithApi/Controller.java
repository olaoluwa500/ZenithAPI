package com.etz.org.ZenithApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/transaction")
public class Controller  {
     @Autowired
     private RestTemplate restTemplate;

     public void setRestTemplate(RestTemplate restTemplate) {
          this.restTemplate = restTemplate;
     }
     public Request getRequest(String requestCode) {
          Request request = restTemplate.getForObject("https://webservicestest.zenithbank.com:9443/directtransfer/api/transaction/zenithDomTransfer", Request.class, requestCode);

          return request;
     }


     @RequestMapping(value = "/transferToZenith", method = RequestMethod.POST)
     public String createProducts(@RequestBody Request request) {
          HttpHeaders headers = new HttpHeaders();
          headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
          HttpEntity<Request> entity = new HttpEntity<Request>(request,headers);

          return restTemplate.exchange(
                  " https://webservicestest.zenithbank.com:9443/directtransfer/api/transaction/zenithDomTransfer", HttpMethod.POST, entity, String.class).getBody();
     }
     @RequestMapping(value = "/transactionEnquiry", method = RequestMethod.POST)
     public String createRequests(@RequestBody TransactionEnquiryReq transactionEnquiryReq) {
          HttpHeaders headers = new HttpHeaders();
          headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
          HttpEntity<TransactionEnquiryReq> entity = new HttpEntity<TransactionEnquiryReq>(transactionEnquiryReq,headers);

          return restTemplate.exchange(" https://webservicestest.zenithbank.com:9443/directtransfer/api/enquiry/domTransaction", HttpMethod.POST, entity, String.class).getBody();
     }
     @RequestMapping(value = "/domAccEnquiry", method = RequestMethod.POST)
     public String createDomAccRequests(@RequestBody DomAccEnquiryRequest domAccEnquiryRequest) {
          HttpHeaders headers = new HttpHeaders();
          headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
          HttpEntity<DomAccEnquiryRequest> entity = new HttpEntity<DomAccEnquiryRequest>(domAccEnquiryRequest,headers);

          return restTemplate.exchange(" https://webservicestest.zenithbank.com:9443/directtransfer/api/enquiry/domAccountEnquiry", HttpMethod.POST, entity, String.class).getBody();

     }

}
