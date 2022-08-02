package Classes;

import java.time.LocalDate;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerType;
    private String mobile;
    private Address pernamentAddress;
    private LocalDate dateofCreation;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String customerType, String mobile, Address pernamentAddress, LocalDate dateofCreation) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerType = customerType;
        this.mobile = mobile;
        this.pernamentAddress = pernamentAddress;
        this.dateofCreation = dateofCreation;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getPernamentAddress() {
        return pernamentAddress;
    }

    public void setPernamentAddress(Address pernamentAddress) {
        this.pernamentAddress = pernamentAddress;
    }

    public LocalDate getDateofCreation() {
        return dateofCreation;
    }

    public void setDateofCreation(LocalDate dateofCreation) {
        this.dateofCreation = dateofCreation;
    }
}
