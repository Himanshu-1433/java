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
        for(int i = 0;i<input.length();i++){
            arr[i] = input.charAt(i);
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(Integer.toBinaryString(arr[i])+" ");
        }
    }
    
    public static void main(String[] args)
    {
        main obj = new main();
        obj.convert();

    }
}



