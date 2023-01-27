import java.util.*;
interface secure {
    public void convert();
    public String input();
}
public class main implements secure{
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
        System.out.println(input.length());
        char arr[] = new char[input.length()];
        int binaryArr[] = new int[input.length()];
        String txt;
        
        for(int i = 0;i<input.length();i++){
            arr[i] = input.charAt(i);
            txt = Integer.toBinaryString(arr[i]);
            binaryArr[i] = Integer.parseInt(txt);
        }
        for(int i = 0;i<input.length();i++)
        {
            System.out.print(binaryArr[i]);
        }
        int i = 0;
        int t = 0;
        char[] alphabet = {'a','b','c','d','e'};
        while(i<binaryArr.length){
            for()
            {

            }
            i++;
        }
        
    }
    
    public static void main(String[] args)
    {
        main obj = new main();
        obj.convert();

    }
}



