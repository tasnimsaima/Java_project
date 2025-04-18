import java.util.*;
import FileHandle.*;
import DemoClass.*;
class Start{

    public static void  main(String[] args)
    {
      
       
       Scanner input=new Scanner(System.in);

       int c=0,productPrice,totalItems,productNumber;
       String productName,productId,billId;
       int []multipleProductPrice;
       String []multipleProductName;
       
       
       Hospital h = new Hospital();




       while(true){

             System.out.println("Welcome to SEBA");
             System.out.println("Enter 1 for add all information ");
             System.out.println("Enter 2 for show all info");
             System.out.println("Enter 3 for add new bill ");
             System.out.println("Enter 4 forexit");
             c=input.nextInt();
        
           if(c==1){
               
               System.out.println("Add new all information---");
               
               input.nextLine();

               System.out.println("enter name--");
               productName=input.nextLine();
               input.nextLine();
               System.out.println("enter product id--");
               productId=input.nextLine();
               System.out.println("enter product price--");
               productPrice=input.nextInt();
              
               h.addNewTest(new DiagonsticServiceTest (productId,productName,productPrice));

           }
           else if(c==2)
		     {
                h.showAllTest();

           }
           else if(c==3){

              System.out.println("Press 1 for single items");
              System.out.println("Press 2 for  multiple items");
               totalItems=input.nextInt();
               input.nextLine();
              if(totalItems==1){
                  
                  System.out.println("Enter Billing id");
                  billId=input.nextLine();
                  input.nextLine();
                  System.out.println(billId);
                  System.out.println("Enter product name");
                  productName=input.nextLine();
                  input.nextLine();
                  System.out.println("Enter product price");
                  productPrice=input.nextInt();

                  h.addNewBill(new SingleItem(billId,productName,productPrice));

              }
              else if(totalItems==2){

                  System.out.print("How many Products : ");
                  productNumber=input.nextInt();
                  multipleProductName=new String[productNumber];
                  multipleProductPrice=new int[productNumber];
                   System.out.println("Enter Billing id");
                        billId=input.nextLine();
                        input.nextLine();
              
                  for(int i=0;i<productNumber;i++){
                       
                        System.out.println(billId);
                        System.out.println("Enter product "+(i+1)+" name");
                        multipleProductName[i]=input.nextLine();
                        input.nextLine();
                        System.out.println("Enter product "+(i+1)+" price");
                        multipleProductPrice[i]=input.nextInt();
                        h.addNewBill(new MultipleItems(billId, multipleProductName,multipleProductPrice,productNumber));

                        
                  }


              }
              else{

              }
            
           }
           else{
              System.out.println("Invalid Input");
             
           }
		   

       }

   

   }
}