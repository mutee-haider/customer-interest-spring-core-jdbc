package com.nt.controller;

import com.nt.dto.CustomerDto;
import com.nt.service.ICustomerService;
import com.nt.vo.CustomerVo;

public class MainController  {
    private ICustomerService service;

    public MainController(ICustomerService service) {
        System.out.println("1 param construtor :Main Controller");
        this.service = service;
    }

    public String processCustomer(CustomerVo vo) throws Exception{
        //convert VO class data to DTO class object data because the vo contains the string
        // vo is used for the holding the input so passing the value to service is done by the Controller
        // if we donot want to involve the vo we can do so but here we will involve the vo
        // but here we will invole hte vo but we want to show the purpose of vo
        // that why client supplied data we are gathering in hte form vo class object to the controller


        //convert hte vo class data to dto class
        CustomerDto dto = new CustomerDto();
        dto.setCUSTNAME(vo.getCUSTNAME());
        dto.setCUSTADDRS(vo.getCUSTADDRS());
        dto.setPRINCIPLEAMT(Float.parseFloat(vo.getPRINCIPLEAMT()));
        dto.setTIME(Float.parseFloat(vo.getTIME()));
        dto.setRATE(Float.parseFloat(vo.getRATE()));


        //use service

        String result = service.calcaulteSimpleInterest(dto);

        return result;
    }

}
