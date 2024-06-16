
package com.shital.factory;

import com.shital.component.FlipkartService;
import com.shital.component.FlipkartServiceRealImpl;
import com.shital.proxy.*;



public class EcommerceFactory {

    //getInstance method - it will give the either proxy or real object
    
    public static FlipkartService getInstance(String couponCode)
    {
        if(couponCode.equals("")|| couponCode.trim().length()==0)
        {
            return new FlipkartServiceRealImpl();
        }
        else if(couponCode.equalsIgnoreCase("coderx20"))
        {
                return new FlipkartServiceProxy(20);
        }
        else if(couponCode.equalsIgnoreCase("coderx10"))
        {
            return new FlipkartServiceProxy(10);
        }    
        else
        {
            return new FlipkartServiceRealImpl();
        }
    }
}
