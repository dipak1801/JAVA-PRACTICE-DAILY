class  SunAbstraction extends FatherAbstraction1
{
	String name;
	int age;
	String qua;

	SunAbstraction(){

	}
	SunAbstraction(String fname,int fage,String work
		,String name,int age,String qua){
		super(fname,fage,work);
		this.name=name;
		this.age=age;
		this.qua=qua;
	}
	public void displaySon(){
		System.out.println("Son info");
		System.out.println(name);
		System.out.println(age);
		System.out.println(qua);
	}
}