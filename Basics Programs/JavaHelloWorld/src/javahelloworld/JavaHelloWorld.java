
package javahelloworld;


public class JavaHelloWorld {
    public String name;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
  
    public static void main(String[] args) {
        System.out.println("Hello World !!");
        
            JavaHelloWorld j1=new JavaHelloWorld();
            j1.setName("Shital");
            System.out.println(j1);
    }
    
}




