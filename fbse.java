public class fbse{
	int n1=0;
	int n2=1;
	int n3;
	int i;
	int count;
	
	public  fbse(int count){
	this.count=count;
	System.out.println(n1+"  "+n2);
}

public void fbse(){
	for(i=2;i<count;i++)
	{
	n3=n1+n2;
	System.out.print("  "+n3);
	n1=n2;
	n2=n3;
	}
}
}
