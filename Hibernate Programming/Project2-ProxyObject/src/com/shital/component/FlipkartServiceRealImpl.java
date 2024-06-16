
package com.shital.component;

//concrete class..... real class
public class FlipkartServiceRealImpl implements FlipkartService{

    @Override
    public float buyNow(String[] items, float[] prices) {
       float bill=0;
       
       //calculate bill
       for(float p:prices)
       {
           bill=bill+p;
       }
       return bill;
    }
    
}
