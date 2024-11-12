package com.parking.packages.protetected;

public class CustomersCode extends ProtectedVariables{

    static  ProtectedVariables customersMessage = new ProtectedVariables();
    static ProtectedVariables customersList = new ProtectedVariables();
    static String[] customers = customersList.customersList;


    public static void main(String[] args) {

        methodeCustomersCode();
    }

    private static void  methodeCustomersCode(){

        System.out.println(customersMessage.protectedMessage);

        for (String customer: customers){
            System.out.println(customer);
        }



    }
}
