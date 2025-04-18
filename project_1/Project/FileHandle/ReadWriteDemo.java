package FileHandle;
import DemoClass.*;
import java.lang.*;
import java.io.*;


public class ReadWriteDemo{

    private File file;
    private FileWriter w;
    private FileReader reader;
    private BufferedReader bfr;

    public ReadWriteDemo(){

    }


    public void writeInFile(DiagonsticServiceTest t){

        try{

        file=new File("Test.txt");
        file.createNewFile();
        w=new FileWriter(file,true);
        w.write(t.display()+"\r"+"\n"+"**"+"\r"+"\n");
        w.flush();
        w.close();
        System.out.println("New Person added");

        }
        catch(Exception e){
            
        }

    }
    public void readFromFile(){
        try{
                file=new File("Test.txt");
                reader=new FileReader(file);
                bfr=new BufferedReader(reader);
                String  text="";
                String tmp;

                while((tmp=bfr.readLine())!=null){
                    text+=tmp+"\n";
                }
                System.out.println(text);
                reader.close();
        }
        catch(Exception e){
           
        }
    }

     public void writeBill(Billing b){
         

        try{

        file=new File("Billing.txt");
        file.createNewFile();
        w=new FileWriter(file,true);
        System.out.println(b.information());
        w.write(b.information()+"\r"+"\n"+"**"+"\r"+"\n");
        w.flush();
        w.close();
        System.out.println("New Bill has been added");

        }
        catch(Exception e){
            
        }

    }
	
}