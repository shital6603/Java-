
package com.beans;

import java.io.Serializable;
public class UserBean implements Serializable
{
    private String userId;
    private String userName;
    private String password;
    private String accountNo;
    private double accbalance;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(double accbalance) {
        this.accbalance = accbalance;
    }

    @Override
    public String toString() {
        return "UserBean{" + "userId=" + userId + ", userName=" + userName + ", password=" + password + ", accountNo=" + accountNo + ", accbalance=" + accbalance + '}';
    }
    
    
}
