abstract class NumbarPro
{
	public abstract void reverese(int a);

	public abstract void palindrom(int n);

	public abstract void prime(int b);

	public abstract void binaryToD(int c);

	public  void desimalToB(int n){

			String bin=" ";
			while(n!=0){
				int r=n%2;
			bin=r+bin;
				n/=2;
			}
			System.out.println(bin);
	}
}