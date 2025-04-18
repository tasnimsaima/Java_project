package DemoClass;
public class Billing{

    private String id;

    public Billing(String id){
         this.setId(id);
        
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    
    public String information(){

        String bill="";
        bill+="Billing Id: "+this.getId();

        return bill;
    }
}