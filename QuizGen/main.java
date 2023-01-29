
abstract class Operation {
    abstract void Read();
    abstract void Write();
    abstract void Admin();
    abstract void User();
}
class Workout extends Operation
{
     void Read(){
        System.out.println("Read");
    }
    void Write(){
        System.out.println("Write");
    }
    void Admin(){
        System.out.println("Admin");
    }
    void User(){
        System.out.println("User");
    }
}
public class main  
{
	public static void main(String[] args) {
        Workout obj = new Workout();
        obj.Read();
    }
}
