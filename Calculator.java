
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int result=0;
        while(true){
        System.out.println("Enter the sign ");
        char sign=sc.next().trim().charAt(0);
        
        if(sign=='+' || sign=='-' || sign=='/' || sign=='*' || sign=='%'){
            System.out.println("Enter the numbers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            if(sign=='+'){
                System.out.println(num1+num2);
                result=num1+num2;
            }
            if(sign=='-'){
                System.out.println(num1-num2);
                result=num1-num2;
            }
            if(sign=='*'){
                result=num1*num2;
                
            }
            
            if(sign=='/'){
                if(num2!=0){
                result=num1/num2;
                }
            }
            if(sign=='%'){
                result=num1%num2;
            }
        }
            else{
                System.out.println("Invalid operation");
                break;
            }
        }
        System.out.println(result);
        
    }
}
