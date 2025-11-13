class AbstractionNoArgConSuperCall
{
	public static void main(String[] args) {
		
		SunAbstraction1 obj=new SunAbstraction1("Sharad",45,"Farmar","Dipak",23,"BCA");

		obj.displaySon();
		obj.displyFather();
	}
}
class FatherAbstraction1
{
	String fname;
	int fage;
	String work;

	//FatherAbstraction1(){
	//	System.out.println("no arg for FatherAbstraction con");
	}

	FatherAbstraction1(String fname,int fage,String work){
		this.fname=fname;
		this.fage=fage;
		this.work=work;
	}
	public void displyFather(){
		System.out.println("Father info");
		System.out.println(fname);
		System.out.println(fage);
		System.out.println(work);

	}
}
class  SunAbstraction1 extends FatherAbstraction1
{
	String name;
	int age;
	String qua;

	SunAbstraction1(){

	}
	SunAbstraction1(String fname,int fage,String work
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