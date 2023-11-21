import java.util.Scanner;

public class pswrd_strength_checker {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String static_username="";
        String inp_username="";
        String static_pswrd="";
        String inp_pswrd="";
        System.out.println("set your username");
        static_username= obj.next();
        System.out.println("Set your password");
        static_pswrd= obj.next();
        if (static_pswrd.length()>=8){
            if (static_pswrd.contains("@")){
                for (int i = 3; i >0 ; i--) {
                    System.out.println("enter your user name");
                    inp_username= obj.next();
                    System.out.println("Enter your passwrd");
                    inp_pswrd= obj.next();
                    if (inp_username.equals(static_username) && inp_pswrd.equals(static_pswrd)){
                        System.out.println("Sucessfully logged in");
                        break;
                    }else {
                        System.out.println("Invalid ID or pswrd! please try again  you have got "+i+ "more tires");
                    }
                }
            }else {
                System.out.println("Please set a pswrd that contains atleast one @ symbol");
            }
        }else {
            System.out.println("Please try again setting at least 8 character long pswrd");
        }
    }
}
