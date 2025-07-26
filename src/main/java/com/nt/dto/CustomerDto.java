package com.nt.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
    // we taking dto to carry the input like customer name address time pamt
    private String CUSTNAME;
    private String CUSTADDRS;
    private Float PRINCIPLEAMT;
    private Float TIME;
    private Float RATE;





    @Override
    public String toString() {
        return "CustomerDto{" +
                "CUSTNAME='" + CUSTNAME + '\'' +
                ", CUSTADDRS='" + CUSTADDRS + '\'' +
                ", PRINCIPLEAMT=" + PRINCIPLEAMT +
                ", TIME=" + TIME +
                ", RATE=" + RATE +
                '}';
    }

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
    // why dto implements serilizable
    //if in future we want to sent the data over the internet  from one project to another project
    // we should just sent by the dto class that why it implements the serilizabel



}
// dto implements serializable
// bo does not implements the serializable