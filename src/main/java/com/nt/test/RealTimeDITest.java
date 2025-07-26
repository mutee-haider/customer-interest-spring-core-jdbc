package com.nt.test;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVo;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Scanner;

public class RealTimeDITest {

    public static void main(String[] args) {
        //read input form the end user as string value
        Scanner cs= new Scanner(System.in);
        System.out.println("Enter the customer name::  ");
        String name= cs.next();
        System.out.println("Enter the customer Address:; ");
        String address= cs.next();
        System.out.println("Enter the customer principle amount ::");
        String principleAmount= cs.next();
        System.out.println("Enter the intrest rate:: ");
        String rate= cs.next();
        System.out.println("Enter the time of the interest:: ");
        String time = cs.next();


        // create the customer vo class object
        CustomerVo vo = new CustomerVo();
        vo.setCUSTNAME(name);
        vo.setCUSTADDRS(address);
        vo.setPRINCIPLEAMT(principleAmount);
        vo.setRATE(rate);
        vo.setTIME(time);


        // create the ico container
        DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");



        //  reader.loadBeanDefinitions("src/main/java/com/nt/cfgs/applicationContext.xml");

        //get the Controller class object

      //  MainController controller= factory.getBean("contoller", MainController.class);
        MainController controller = factory.getBean("controller", MainController.class);

        //invoke the method
        try{
            String result = controller.processCustomer(vo);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("internal problem tyr again");
        }



    }
}
