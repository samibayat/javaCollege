class bankTester{

public static void main(String[] args)
{
long dd;
bank s = new bank(100000);
long depamp = 400;
dd=s.deposit(depamp);
System.out.println("deposit ammount is = "+depamp);
long withamp = 900;
dd=s.withdraw(withamp);
System.out.println("withdraw ammount is = "+ withamp);
System.out.println("new balance = "+ dd);
}
}
