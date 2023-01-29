import java.io.*;
import java.lang.StackWalker.Option;
import java.util.Scanner;
abstract class Operation {
    abstract void Read(File f);
    abstract void Write(File f);
    abstract void Admin(/*File f*/);
    abstract void create(String FileName);
    abstract void User(File f);
    abstract void operate(File f);
}
class Workout extends Operation
{
    Scanner input = new Scanner(System.in);

    // Workout(){
    //     create("Db");
    // }
    void Read(File f){
        System.out.println("Read");
    }
    void Write(File f){

    }
    void create(String FileName){
        File MyDBFile = new File("E:/D drive/QuizG/java/"+FileName+".txt");
        try{
        if(MyDBFile.exists()){  // File is Alredy Available
            // System.out.println("File is Alredy Available"); 
            operate(MyDBFile);
        }
        else // File was create
        {
            MyDBFile.createNewFile();
            // System.out.println("File "+MyDBFile.getName() + " Created");
            operate(MyDBFile);
        }
        }
        catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
    void Admin(/*  File f */){
        // create("DB");
        System.out.println("Welcome Robo");
        System.out.print("How Many Question Are You Enter : ");
        int Questions = input.nextInt();
        System.out.print("How Many Question Are You Enter : ");
        int Options = input.nextInt();
        String QOArr[][] = new String[Questions][Options+1];
        char[] OptionsAlphabet = {'a' , 'b' , 'c' , 'd'};
        for(int i = 0; i < Questions;i++){
            for(int j = 0;j<= Options; j++){
                if(j == 1){
                    System.out.println("Enter Question");
                    QOArr[i][j] = " (Question) " + input.nextLine();
                }
                else if(j>1 && j < Options + 1){
                    System.out.println("Enter Option");
                    QOArr[i][j] = " ("+OptionsAlphabet[j-1]+") " + input.nextLine();
                }
                else if(j == Options+1){
                    System.out.println("Enter Answer");
                    QOArr[i][j] = " (Ans) " + input.nextLine();
                }
                
            }
            
        }
    } 
    void User(File f){
        System.out.println("This is User method");
    }
    void operate(File f){
        System.out.println("Enter You Login as : ");
        String LoginAsa = input.nextLine();

        if(LoginAsa.equals("Admin") || LoginAsa.equals("admin"))
        {
            int cout = 0;
            String User = "Robo";
            String Password = "Robo@123";
            while(cout <= 2)
            {
            System.out.println(" User : ");
            String U_id = input.nextLine();
            System.out.println(" Password : ");
            String U_pw = input.nextLine();

            if(U_id.equals( User) && U_pw.equals(Password)){
                // Admin(f);
                break;
            }
            else{
                System.out.println("User Name And Password are Wrong");
            }
            cout++;
            }
            
        }
        else{
            User(f);
        }
        
        
    }

    
}
public class main  
{
	public static void main(String[] args) {
        // Workout obj = new Workout();
        // obj.Admin();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Robo");
        System.out.print("How Many Question Are You Enter : ");
        int Questions = input.nextInt();
        System.out.print("How Many Options Per Each Question (Note : Enter Between 4) : ");
        int Options = input.nextInt();
        String QOArr[][] = new String[Questions][Options+2];
        char[] OptionsAlphabet = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g'};
        for(int i = 0; i < Questions; i++){
            for(int j = 0; j <= Options+1; j++){
                if(j < 1){
                    System.out.println("Enter Question");
                    QOArr[i][0] = " (Question) " + input.nextLine();
                }
                else if(j>=1 && j <= Options){
                    System.out.println("Enter Option for ("+OptionsAlphabet[j-1]+")");
                    QOArr[i][j] = " ("+OptionsAlphabet[j-1]+") " + input.nextLine();
                }
                else{
                    System.out.println("Enter Answer");
                    QOArr[i][j] = " (Ans) " + input.nextLine();
                }
                
            }
            
        }
    }
}
