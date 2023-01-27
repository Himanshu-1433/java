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
        // System.out.println(input.length());
        char arr[] = new char[input.length()];
        int binaryArr[] = new int[input.length()];
        String txt;
        
        for(int i = 0;i<input.length();i++){
            arr[i] = input.charAt(i);
            txt = Integer.toBinaryString(arr[i]);
            binaryArr[i] = Integer.parseInt(txt);
            // System.out.println(binaryArr[i]);
        }

        // for(int i = 0;i<input.length();i++)
        // {
        //     System.out.print(binaryArr[i]);
        // }
        
        int one = 0;
        int zero = 0;
        char[] alphabet = {'a','b','c','d','e'};
        for(int i = 0; i<input.length();i++){
         int num = binaryArr[i];
         for(int j = 0;j<=5;j++)
         {
                
                
                System.out.println(num);
                // if(num == 100000)
                // {
                //         // System.out.print("one = " + num);
                //     one++;
                // }
                // else if (num == 000000){
                //     // System.out.print("Zero =" + num);
                //     zero++;
                // }
                
            }
            System.out.println();
            System.out.println(binaryArr[i]);
            System.out.println(one);
            System.out.println(zero);
            one = 0;
            zero = 0;
     }

    }
    
    public static void main(String[] args)
    {
        main obj = new main();
        obj.convert();

    }
}



