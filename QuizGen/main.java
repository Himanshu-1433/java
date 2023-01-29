import java.io.*;
abstract class Operation {
    abstract void Read(File f);
    abstract void Write(File f);
    abstract void Admin(File f);
    abstract void create(String FileName);
    abstract void User(File f);
    abstract void operate(File f);
}
class Workout extends Operation
{
    Workout(){
        create("Db");
    }
    void Read(File f){
        System.out.println("Read");
    }
    void Write(File f){

    }
    void create(String FileName){
        File MyDBFile = new File("E:/D drive/QuizG/java/"+FileName+".txt");
        try{
        if(MyDBFile.exists()){
            System.out.println("File is Alredy Available");
            operate(MyDBFile);
        }
        else
        {
            MyDBFile.createNewFile();
            System.out.println("File "+MyDBFile.getName() + " Created");
            operate(MyDBFile);
        }
        }
        catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
    void Admin(File f){
        
    } 
    void User(File f){
        System.out.println("This is User method");
    }
    void operate(File f){
        
    }

    
}
public class main  
{
	public static void main(String[] args) {
        Workout obj = new Workout();
    }
}
