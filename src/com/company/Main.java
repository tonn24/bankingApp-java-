package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("LHV");
	    bank.addBranch("Tallinn");
        bank.addBranch("Tartu");

	    bank.addCustomer("Tallinn", "Tõnn", 1000.1);
	    bank.addCustomer("Tallinn", "Tony", 500.05);
        bank.addCustomer("Tallinn", "Mike", 50.05);

        bank.addCustomer("Tartu", "Peter", 100.05);
        bank.addCustomer("Tartu", "Mikk", 2900);
        bank.addCustomer("Tartu", "Martin", 35450.50);

        bank.addCustomerTransaction("Tallinn", "Tõnn", 25.05);
        bank.addCustomerTransaction("Tallinn", "Tony", 545.05);
        bank.addCustomerTransaction("Tallinn", "Tõnn", 23.45);

        //bank.listCustomers("Tallinn", true);
        bank.listCustomers("Tartu", false);
    }
}
