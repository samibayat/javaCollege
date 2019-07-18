public class clock{
	int hours;
	int min;
	int sec;

	public clock(int a, int b, int c){
	hours = a;
	min = b;
	sec = c;
	System.out.println("sec =:" +sec+" hours =: "+hours+" min =: "+min);
	}



	public clock(int a){    this(a,6,02);
				System.out.println("sec=: "+sec+" hours =: "+ hours +" min=: "+min);
				}
	public clock(){         this(4);
				System.out.println("sec=: "+sec+" hours=: "+ hours + " min=: "+min);
				}
}
	









					


