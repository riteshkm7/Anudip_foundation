import java.util.*;
public class Basic{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*System.out.println("hello world");
        System.out.print("hello word again");
        byte a =23;
        short b=4;
        char c='c';
        boolean d=true;
        int e=34;
        long f=3355435;
        float g=3.4f;
        double h=3.57534;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);
        System.out.println(h);
        System.out.println(f);
        System.out.println(Integer.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Character.SIZE);
        int k=45;
        int v=44;
       
       int s=k+v;
        System.out.println(s);*/
     /*    
        Scanner sc=new Scanner(System.in);
        System.out.println("ente first numbere");
        int a=sc.nextInt();
        System.out.println("ente second numbere");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("sum is "+c);

       // float b= sc.nextFloat();
      //  String c=sc.next();// string upto space
       // String d=sc.nextLine();// multiple line as input
       // boolean e=sc.nextBoolean();
       // short f=sc.nextShort();
       // byte g=sc.nextByte();
       // long h=sc.nextLong();
       //// double i=sc.nextDouble();
      //  System.out.println(d);

        // area of  circle
*/
/*Scanner sc=new Scanner(System.in);
System.out.println("enter the radius");
float a = sc.nextFloat();
float area;
 area=3.14f * a * a;
System.out.println("area of circle is "+area);
*/

//implicit type conversion
/*int a=4;
float b=a;
System.out.println(b);
double d=4.4;// double cant into long bcoz not compatible means d is not int type while long is int type
//long e=d;
//float f=d; // higher cant convert into lower
long l=a;
System.out.println(l);
byte o=4;
int g=o;
System.out.println(g);
float u=4.3f;
int r;
//r=u;//float to int cant convert not compatible
double h;
h=b;
System.out.println(h);//float to double*/
// explicit conversion
/*float n=4.544f;
int k=(int) n;
System.out.println(k);
 double d=454.434;
 float y=(float) d;
 System.out.println(y);
 int l=(int)4.464;
 System.out.println(l);
 byte b=(byte)(n);
 System.out.println(b);
 //boolean m= (boolean)(4); explict conversion not possible with boolean and alsoo implicit
 // char to int
 char c='c';// 
 int q=(int)c;//ascii value will print
 System.out.println(q);
 float z=(float)(c);
 System.out.println(z);// ascii value will print in the form decimal
 */
// permotion in java
//1. byte shor char in exp automatically into int
/*byte a=4;
short b=9;
char c='d';
int d=a+b+c;
System.out.println(d);
char e='f';
System.out.println((int)e);
System.out.println((int)d);
System.out.println(d-e);
System.out.println(e);
// long doule int float into large value among then in that result will convert
int g=4;
float h=4555.f ;
double l =40.0;  // double>float>long>int>shor>char>byte  exp will converrt into large
long k=45;
double p=g+h+k;
System.out.println(p);


byte n=5;
byte m=(byte)(n*2); // in exp n is byte type is converted into int now int cant conver into byte that why its error
System.out.println(m);*/
/*System.out.println("enter the pencil cost");
Scanner sc =new Scanner(System.in);
float p=sc.nextFloat();
System.out.println("enter the pen cost");
float q=sc.nextFloat();
System.out.println("enter the eraser cost");
float e=sc.nextFloat();
float total=p+q+e;
float tax =(total * 18)/100;
total=total+tax;

System.out.println("total cost is "+total);
int g=5;// 
int h=11;
System.out.println(g*h);
System.out.println("multiply is:" +(g*h));
float r=h/g; 
System.out.println(r); //if both int then ans will int 
System.out.println((float)h/g);// if any one is float then ans will float */
// unary operator
//post increment ist use then increment
/*int a=5;
int sum =a+ a++; // a use as 5 then inc
System.out.println(sum);
System.out.println(a);
// preincremetn
int b=5;
int s =b+++b; // ist inc then use as 6 
System.out.println(s);
System.out.println(b);
// decremnet
//post dec
int c=5;
int su =c+c--; // ist use as 5 then dec 
System.out.println(su);
System.out.println(c);

int  g=5;
int si =g+--g; // ist dec then use ist use as 4
System.out.println(si);
System.out.println(g);
*/
// relational operator
/*int a=10;
int b=20;
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);
*/
// Logical Operator
// logical and &&
/*System.out.println(4>2 && 5>3);
// logical or ||
System.out.println(4>10 || 5>3);
// logical not !
System.out.println(!(5>2));
//System.out.println(!(3)); not allowed

// assignment
int a=10;
int b=5;
int c=20;
System.out.println(a+=10);
System.out.println(a-=10);
System.out.println(a/=10);// a=a/10
System.out.println(b*=10);//b=b*10
//c%=10;
System.out.println(c%=10);
int j=38,k,l;
k=4;
l=9;
//System.out.println(k,l,j); cant print like this onlr a sinle value print
*/
/*int x=4;
if (x>10){
    System.out.println("hi");
}
if (x>90){
    System.out.println("hello");
}
else{
    System.out.println("namste");
}
// largges of two]
Scanner sc=new Scanner(System.in);
/*int a=sc.nextInt();
int b=sc.nextInt();
if(a>b){
    System.out.println(a);
}
else{
System.out.println(b);
}*/
/*
 * System.out.println("enter your income ");
float in=sc.nextFloat();
float tax;
if(in<=500000){
    System.out.println("no tax");
}
else if(in>500000 && in<=1000000){
    tax=(in*20)/100;
System.out.println("your tax is:"+tax);
}
else{
tax=(in*30)/100;
System.out.println("your tax is:"+tax);
}


 */
// ternarary operator
// var=conditon?ist exp:2nd exp if true ist will evaluated else 2
/*int x=sc.nextInt();
String type=x%2==0?"even":"odd";
System.out.println(type);
int a=5>4?5:4;
System.out.println(a);

 */
// match case
/*int x=sc.nextInt();
switch(x)
{
case 1: System.out.println("hello");
         break;
case 2: System.out.println("hi");
 break;
 case 3: System.out.println("namastr");
 break;
 default:System.out.println("no match found");         
 



}




int y=sc.nextInt();
switch(y*2)
{
case 1: System.out.println("hello");
         break;
case 2: System.out.println("hi");
 break;
 case 3: System.out.println("namastr");
 break;
 default:System.out.println("no match found");         
 



}
  String z=sc.nextLine();
switch(z)// datatype of variable must be same in case also 
{
case "abc": System.out.println("hello");
         break;
case "s": System.out.println("hi");
 break;
 case "ritesh": System.out.println("namastr");
 break; // if break not write all if one match occur below all case will run
 default:System.out.println("no match found");         
 



}

 */
/*
 * boolean z=7>3;
System.out.println(z);
//calculator
int a=sc.nextInt();
int b=sc.nextInt(); 
char c=sc.next().charAt(0);
switch (c){
    case '+':System.out.println(a+b); 
    break;

 case '*':System.out.println(a*b); 
    break;
    case '-':System.out.println(a-b); 
    break;
    
    case '/':System.out.println(a/b); 
    break;
    
    case '%':System.out.println(a%b); 
    break;
    
    default: System.out.println("wrong operator");

}

 */
// leap year
// not century must divide by 4 if century must divide by 400
System.out.println("enter the year:");
int y=sc.nextInt();
if(y%100!=0){
    if (y%4==0){
        System.out.println("leap year"+ y);
    }
    else{
        System.out.println("not a leap year");
    }

}
else{
    if(y%400==0){
        System.out.println("leap year");

    }
    else{System.out.println("not a leap year");}
}





        







        
    }
}