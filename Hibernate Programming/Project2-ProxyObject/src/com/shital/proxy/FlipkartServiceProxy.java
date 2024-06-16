
package com.shital.proxy;

import com.shital.component.FlipkartService;
import com.shital.component.FlipkartServiceRealImpl;


public class FlipkartServiceProxy implements FlipkartService{
    
    private FlipkartService flipkartService;
   float discount=0;

    public FlipkartServiceProxy(float discount) {
        flipkartService=new FlipkartServiceRealImpl();
        this.discount=discount;
    }

    @Override
    public float buyNow(String[] items, float[] prices) 
    {
        float billAmt = 0;
        float finalBillAfterDiscount=0;
        for(float p:prices)
        {
            billAmt=billAmt+p;
        }
        finalBillAfterDiscount=(billAmt-(billAmt*discount/100));
        return finalBillAfterDiscount;
    }
}
