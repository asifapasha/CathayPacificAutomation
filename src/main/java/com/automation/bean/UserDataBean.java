package com.automation.bean;

import org.apache.commons.lang.RandomStringUtils;

public class UserDataBean {
    String firstName;
    String lastName;
    String email;
    String phoneNo;
    String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void generateRandomValue() {
        firstName = RandomStringUtils.randomAlphanumeric(6);
        lastName = RandomStringUtils.randomAlphanumeric(6);
        phoneNo = RandomStringUtils.randomNumeric(10);
        email = RandomStringUtils.randomAlphanumeric(6) + "@gmail.com";
        password = RandomStringUtils.randomAlphanumeric(6);
    }

    public static void main(String[] args) {
        UserDataBean userBean = new UserDataBean();
        userBean.generateRandomValue();
        System.out.println(userBean.getFirstName());
        System.out.println(userBean.getLastName());
        System.out.println(userBean.getPhoneNo());
        System.out.println(userBean.getEmail());
        System.out.println(userBean.getPassword());
    }
}
