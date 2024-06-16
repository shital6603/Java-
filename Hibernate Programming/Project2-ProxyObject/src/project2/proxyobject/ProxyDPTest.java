package project2.proxyobject;
import com.shital.component.FlipkartService;
import com.shital.factory.EcommerceFactory;

public class ProxyDPTest {
    public static void main(String[] args) {
        FlipkartService service;
        
        //buy product ---- buyNow
        
        String couponCode = "CoderX20";
        service = EcommerceFactory.getInstance(couponCode);
        System.out.println("Real or proxy class :"+service.getClass());
        float bill = service.buyNow(new String[] {"Tshirts","Shoes"}, new float[] {420.0f},{1200.0f});
        System.out.println(bill);
    }
}


 