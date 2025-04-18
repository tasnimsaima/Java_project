package FileHandle;
import DemoClass.*;
public class Hospital{
    
    ReadWriteDemo file=new ReadWriteDemo();
	private int x=0;

    public Hospital(){

    }

    public  void addNewTest(DiagonsticServiceTest t){
       
           file.writeInFile(t);
          

    }
    public  void addNewBill(Billing b){

                    

                    file.writeBill(b);
          

    }

    public  void showAllTest(){
       
           file.readFromFile();
		     
		   
           
    }

}