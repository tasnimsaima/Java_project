package DemoClass;
public class SingleItem extends Billing{

    private String name;
    private int price;

    public SingleItem(String id,String name, int price){
        super(id);
        this.setName(name);
        this.setPrice(price);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
    public String information(){

          String bill="";
        bill+=super.information()+"\n Product Name :"+this.getName()+"\n Product Price :"+this.getPrice()+"\n";

        return bill;
       
    }
}