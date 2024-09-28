import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int sum =0;
        while(num>0){
            int last=num%10;
            int cube=last*last*last;
            sum=sum+cube;
            num=num/10;
            
        }
        if(sum==temp){
            System.out.println(temp+" is a armstrong number");
        }
        else{
            System.out.println(temp+" not a armsrong number");
        }
       









        
    }
    
}
