package DemoClass;
public class MultipleItems extends Billing{

    private String []name;
    private double []price;
    private int productNumber;
    private int totalPrice;

    public MultipleItems(String id,String []name, int []price,int productNumber){
        super(id);
        name=new String[productNumber];
        price=new int[productNumber];
        this.setName(name);
        this.setPrice(price);
        this.setTotalPrice(price);
        this.productNumber=productNumber;
    }
    public void setName(String []name){
       
       for(int i=0;i<productNumber;i++){
           this.name[i]=name[i];
       }
    }
    
    public void setPrice(int []price){
         for(int i=0;i<productNumber;i++){
           this.price[i]=price[i];
       }
    }

    public void setTotalPrice(int []price){
        int tp=0;
         for(int i=0;i<productNumber;i++){
            tp+=price[i];
        }
        this.totalPrice=tp;
    }
    public int getTotalPrice(){
        return this.totalPrice;
    }
    public String information(){

        String bill="";
        bill+=super.information()+"\n";

        // for(int i=0;i<productNumber;i++){
        //     bill+="Product name :"+this.name[i]+"\n Product Price:"+this.price[i]+"\n";
        // }

        return bill;
    }
}