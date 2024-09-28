import java.util.*;
public class Loops {

    public static void main(String[] args) {
        // sum of ist n narural numver
        Scanner sc=new Scanner (System.in);
        //int n=sc.nextInt();
       /* int i=1;
        int sum=0;
        while(i<=n){
            System.out.println(i);
            sum=sum+i;
           
            i++;

        }
        System.out.println("sum is"+sum); */
        // for loop
        //for(int i=1;i<=10;i++){
           // System.out.println(i);
       // }
       // square print
        /*for(int i=1;i<=4;i++){
            System.out.println("* * * *");
     
           }
     */
     
     
     /*for(int i=10;i>=0;i--){
        System.out.println(i);
     }
          
      */

//PRINT reverse a given number
/*int n=sc.nextInt();
System.out.println("enter a numver you want to reverse");
int m;
while(n>0){
    m=n%10;
    System.out.print(m);
    n=n/10;
}
 */
//reverse of given number
/*int n=sc.nextInt();
System.out.println("enter a numver you want to reverse");
int rev=0;
int m;
while(n>0){// 0 bcoz al 0 reminder will left when divide 0 by 10 always give 0 that is our terminating
    m=n%10;// to get last digit of num
     rev=(rev*10)+m;
     n=n/10;// delete the last digit number
}
System.out.println(rev);
int j=1; */
// do while loop at leat one TIME RUN
/*do { 
    System.out.println("hello woerd");
    j++;
} while (j<1);


 */
//enter a number until user enter multiple of 10

/*while(true){
    System.out.println("enter number");
    int n=sc.nextInt();
    if(n%10==0){
        System.out.println("your num is multiple of 10:"+n);
        break;
    }
    else{
        System.out.println("your num is:"+n);
    }
}
 */
while(true){
    System.out.println("enter number");
    int n=sc.nextInt();
    if(n%10==0){
        System.out.println("its a multiple of 10");
        
        continue;
        
    }
    else{
        System.out.println("your num is:"+n);
    }
}


    }   
}
