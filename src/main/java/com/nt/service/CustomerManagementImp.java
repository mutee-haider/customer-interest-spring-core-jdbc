package com.nt.service;

import com.nt.bo.CustomerBo;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDto;

public final class CustomerManagementImp implements ICustomerService{
    private ICustomerDAO dao;

    public CustomerManagementImp( ICustomerDAO dao) {
        System.out.println("1 param constructor of dao Customer magagement sevice");
        this.dao=dao;
    }

    @Override
public String calcaulteSimpleInterest(CustomerDto dto) throws Exception{


    //caculate simple interest amount
        float interestAmt= (dto.getPRINCIPLEAMT()*dto.getRATE()* dto.getTIME())/100.0f;

     // we have to save all the records in the dao table by supplying inputs to dao
        // dao is exepecting input in the form of bo
        // so it is our responsibilty to create the bo class object


        // create hte bo class object having the persistable data
        CustomerBo bo = new CustomerBo();
        // here dto is also carrying the input so the we can copy the input of dto to bo

        bo.setCUSTNAME(dto.getCUSTNAME());
        bo.setCUSTADDRS(dto.getCUSTADDRS());
        bo.setPRINCIPLEAMT(dto.getPRINCIPLEAMT());
        bo.setRATE(dto.getRATE());
        bo.setTIME(dto.getTIME());
        bo.setINTRESTAMOUNT(interestAmt);


        //use dao
        int count = dao.insert(bo);
        return count==1?" Custome registerd sucessfully ----> simple interest amount "+ interestAmt :  "Cutomer registration failed";
}

}
