import java.util.Scanner;

public class palindrome_checker {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        boolean status=true;
        String inp="";
        System.out.println("Enter your word");
        inp= obj.next();
        for (int i = 0 ,j=inp.length()-1; i < j; i++,j--) {
        if (inp.charAt(i)!=inp.charAt(j)){
            status=false;
            System.out.println("Not pallandrom");
            break;
        }
        }
        if (status){
            if (inp.length()%2==0){
                System.out.println("It is an even palindrome");
            }
            else {
                System.out.println("It is an odd palindrome");

            }        }
    }
}
