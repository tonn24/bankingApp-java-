package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addTransaction(String name, double amount) {
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for(int i=0; i<customers.size(); i++) {
            Customer  checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
