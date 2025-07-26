package com.nt.vo;

public class CustomerVo {
    private String CUSTNAME;
    private String CUSTADDRS;
    private String PRINCIPLEAMT;
    private  String TIME;
    private String  RATE;
    private  String  INTRESTAMOUNT;

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

    public String getPRINCIPLEAMT() {
        return PRINCIPLEAMT;
    }

    public void setPRINCIPLEAMT(String PRINCIPLEAMT) {
        this.PRINCIPLEAMT = PRINCIPLEAMT;
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public String getRATE() {
        return RATE;
    }

    public void setRATE(String RATE) {
        this.RATE = RATE;
    }

    public String getINTRESTAMOUNT() {
        return INTRESTAMOUNT;
    }

    public void setINTRESTAMOUNT(String INTRESTAMOUNT) {
        this.INTRESTAMOUNT = INTRESTAMOUNT;
    }


    @Override
    public String toString() {
        return "CustomerVo{" +
                "CUSTNAME='" + CUSTNAME + '\'' +
                ", CUSTADDRS='" + CUSTADDRS + '\'' +
                ", PRINCIPLEAMT='" + PRINCIPLEAMT + '\'' +
                ", TIME='" + TIME + '\'' +
                ", RATE='" + RATE + '\'' +
                ", INTRESTAMOUNT='" + INTRESTAMOUNT + '\'' +
                '}';
    }
}
// here all of this is string because the input came from the html is in the form of string and store the vo
// vo main all its property in the form of the string
// so before sending it into service class the dto will convert these required data type
// so data type converting logic must be written into the dto