import java.util.Scanner;

public class sum_of_strings {
    public static void main(String[] args) {
        int sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your string number");
        String user_inp=obj.next();
        for (int i = 0; i <user_inp.length() ; i++) {
            char ok=user_inp.charAt(i);
             sum+=Integer.parseInt(String.valueOf(ok));
        }
        System.out.println(sum);
    }
}

