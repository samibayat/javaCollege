public class Fb{  
    public static void main(String args[])  
    {  
   //a series of numbers in which each number ( Fibonacci number ) is   the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.  
     int n1=0,n2=1,n3,i,count=20;    
     System.out.print(n1+" "+n2);//printing 0 and 1    
        
     for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }}  
