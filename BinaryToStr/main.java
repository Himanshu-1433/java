
import java.util.*;
interface secure {
    public void convert();
    public String input();
}
public class Main implements secure{
    @Override
    public String input() {
        Scanner User_input = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = User_input.nextLine();
        return str;
    }
    @Override
    public void convert() {
        String input =  input();
        char StringTochar[] = new char[input.length()];
        int binaryArr[] = new int[input.length()];
        String CharToBinary;
        
        for(int i = 0;i<input.length();i++){
            StringTochar[i] = input.charAt(i);
            CharToBinary = Integer.toBinaryString(StringTochar[i]);
            binaryArr[i] = Integer.parseInt(CharToBinary);
        }
        int one = 0;
        char[] alphabet = {'a','b','c','d','e','f','g'};
        for(int i = 0; i<input.length();i++){
        int num = binaryArr[i];
         for(int j = 0;j<=6;j++)
         {
                int reminder = num %10;
                num = num / 10;
                if(reminder == 1)
                {
                     one++;
                }
            }
            System.out.print(alphabet[one-1]);
            one = 0;
     }

    }
    
    public static void main(String[] args)
    {
        Main obj = new Main();
        obj.convert();

    }
}
