 class NumbarProImp extends NumbarPro{

	public void reverese(int n)
	{
		int rev=0;
		while(n!=0){
			int r=n%10;

			 rev=rev*10+r;

			 n/=10;
		}
		System.out.println(rev);
	}
	public void palindrom(int n){
		int temp=n;
		int rev=0;
		while(n!=0){
			int r=n%10;

			rev=rev*10+r;
			n/=10;

		}
		if(temp==rev){
			System.out.println("paindrom num");
		}
		else{
			System.out.println("not palindrom");
		}
	}
	public void prime(int n){
		
		int den=2;
		while(den<n){
			if(n%den==0){
				break;
			}
			den++;

		}
		if(den==n){
			System.out.println("prime num");
		}
		else {
			System.out.println("not prime");
		}
	}
	public void binaryToD(int n){

		int sum=0;
		int a=1;
		while(n!=0){
			int r=n%10;

			sum=sum+r*a;
			a=a*2;

			n/=10;
		}
		System.out.println(sum);
	}

}