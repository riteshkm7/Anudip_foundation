import java.util.*;
public class Sum_even_odd {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         // program sum of even and odd integers
     
    
     int choice=1;
     int sum_even=0;
     int sum_odd=0;
    do{
        System.out.println("enter the number  ");
     int num=sc.nextInt();

        if(num%2==0){
            sum_even=sum_even+num;

        }
        else{
            sum_odd=sum_odd+num;
        }
        System.out.println("do you want to continue or not for continue 1 other 0");
        choice =sc.nextInt();
        if(choice==0){
            break;
        }

    }while(choice==1);

    System.out.println("sum of even"+sum_even);
    System.out.println("sum of odd"+sum_odd);


        
    }
    
}
