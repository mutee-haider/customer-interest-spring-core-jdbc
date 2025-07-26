package com.nt.bo;

public class CustomerBo {
    //bean properties

    private String CUSTNAME;
    private String CUSTADDRS;
    private Float PRINCIPLEAMT;
    private Float TIME;
    private Float RATE;
    private  Float INTRESTAMOUNT;

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTADDRS() {
        return CUSTADDRS;
    }

    public void setCUSTADDRS(String CUSTADDRS) {
        this.CUSTADDRS = CUSTADDRS;
    }

    public Float getPRINCIPLEAMT() {
        return PRINCIPLEAMT;
    }

    public void setPRINCIPLEAMT(Float PRINCIPLEAMT) {
        this.PRINCIPLEAMT = PRINCIPLEAMT;
    }

    public Float getTIME() {
        return TIME;
    }

    public void setTIME(Float TIME) {
        this.TIME = TIME;
    }

    public Float getRATE() {
        return RATE;
    }

    public void setRATE(Float RATE) {
        this.RATE = RATE;
    }

    public Float getINTRESTAMOUNT() {
        return INTRESTAMOUNT;
    }

    public void setINTRESTAMOUNT(Float INTRESTAMOUNT) {
        this.INTRESTAMOUNT = INTRESTAMOUNT;
    }

    @Override
    public String toString() {
        return "CustomerBo{" +
                "CUSTNAME='" + CUSTNAME + '\'' +
                ", CUSTADDRS='" + CUSTADDRS + '\'' +
                ", PRINCIPLEAMT=" + PRINCIPLEAMT +
                ", TIME=" + TIME +
                ", RATE=" + RATE +
                ", INTRESTAMOUNT=" + INTRESTAMOUNT +
                '}';
    }
}
//here our attribute should be same name as the our database column name
//instead of taking the simple data type we should take the wrapper data type like Integer instead of int because the if we have no value so deafault value of int is zero so it is not best , so that why we use the integer because the default value of the integer is NULL so null is better that zero for the futher result