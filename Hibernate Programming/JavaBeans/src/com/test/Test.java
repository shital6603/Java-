
package com.test;

import com.beans.UserBean;
public class Test {
    public static void main(String args[])
    {
        UserBean user=new UserBean();
        user.setUserId("ANNA123");
        user.setUserName("Santa");
        user.setPassword("Password123");
        user.setAccountNo("78965421");
        user.setAccbalance(456321);
        
        
        System.out.println(user);
    }
}
