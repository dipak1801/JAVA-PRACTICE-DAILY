abstract class CalculaterAbstract
{
	public abstract void addition(int a,int b);

	public abstract void subStaaction(int a,int b);

	public abstract void multiplication(int a,int b);

	public void division(int a,int b)
	{
		System.out.println(a/b);
	}
}
 class CalculaterAbstractImp extends CalculaterAbstract{

	public void addition(int a,int b){
		System.out.println(a+b);
	}
	public void subStaaction(int a,int b){
		System.out.println(a-b);
	}
	public void multiplication(int n1,int n2){
		System.out.println(n1*n2);
	}


}
class  CalculaterDriver{
	public static void main(String[] args) {
		
		CalculaterAbstract c1 =new CalculaterAbstractImp();
		c1.addition(10,20);
		c1.subStaaction(20,10);

	}
}