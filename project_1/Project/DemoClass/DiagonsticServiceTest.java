package DemoClass;

public class DiagonsticServiceTest{
	
	
	private String productId,productName;
	private int productPrice;
	
	
	public DiagonsticServiceTest(){
		
		
	}
	
	
	public DiagonsticServiceTest(String productId, String productName,  int productPrice)
	{
		this.setProductName(productName);
		this.setProductId(productId);
		this.setProductPrice(productPrice);
	}
	
	public void setProductId(String id)
	{
		this.productId= id;
	}
	public String getProductId()
	{
		return this.productId;
	}
	public void setProductName(String name)
	{
		this.productName= name;
	}
	public String getProductName()
	{
		return this.productName;
	}
	public void setProductPrice(int price)
	{
		this.productPrice= price;
	}
	public int getProductPrice()
	{
		return this.productPrice;
	}
	 public String display()
    {
        
        String info="";
        info+="name : "+this.getProductName()+"\n"+"id : "+this.getProductId()+"\n"+"price : "+this.getProductPrice()+"\n";
        return info;
    }
	
    
	
}