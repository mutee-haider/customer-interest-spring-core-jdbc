package com.nt.dao;

import com.nt.bo.CustomerBo;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDaoImpl implements ICustomerDAO {
       // so in the dao we will write all the query above the top of the class IF OUR CODE  become so lengthy and finding hte query is difficult so that why we write query on the top may some time we have to fix this query
   //we write it in the upper case to show that it is sql query no the java code

    private static  final String REALTIME_CUSTOMER_INSERT_QUERY="INSERT INTO realtimedi_customer VALUES(CUSTID,?,?,?,?,?,?)";   // WE are taking it the upper case to show that they are constant

    // here query is private to hide the visibility outside the class and static that people should use it without creating the object inside the class and final mean peole cannot change it or modify the query

   // INSERT INTO realtimedi_customer VALUES(5,'Mutee','kot chutta',2000.20,2.50,35.4,233.3)"


    private DataSource ds;


    public CustomerDaoImpl(DataSource ds) {
        System.out.println("CustomerDaoImpl:: 1 param constructor ");
        this.ds = ds;
    }



    @Override
    public int insert(CustomerBo bo) throws Exception {
        // create the connection


        Connection conn= null;           // we have to use the finally block that why we take the connection outside the try block and further we also have to close the connection
        PreparedStatement ps=null;
        int count=0;

        try{
            //get the pooled connection object
            conn= ds.getConnection();

            // create the prepared statement object because the prepared statement have the pre-compiled sql query
            ps= conn.prepareStatement(REALTIME_CUSTOMER_INSERT_QUERY);

            //set the query param value
            ps.setString(1, bo.getCUSTNAME());
            ps.setString(2, bo.getCUSTADDRS());
            ps.setFloat(3,bo.getPRINCIPLEAMT());
            ps.setFloat(4,bo.getRATE());
            ps.setFloat(5,bo.getTIME());
            ps.setFloat(6,bo.getINTRESTAMOUNT());

            //execute the query
            count= ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw  e;
             } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }finally {
            try {
                if(ps !=null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw e;
            }
            try {
                if(conn !=null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw  e;
            }

        }//finally
        return count;
    }
}

// it is recommanded to take the seperate jdbc connection object , especially in the multi threading case



// so in dao we insert datasource object
// so insert dao in the datasource is manadatory to that why we take the
//constructor injection
//while taking the properties for the dependency injection we will take the of interface type