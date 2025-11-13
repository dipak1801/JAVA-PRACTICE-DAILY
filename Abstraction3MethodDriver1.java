class Student
{
	int id;
	String name;
	String adr;
	String branch;
	long mo;

	Student(){}// no arg constructer
	//parametarized constructer
	Student(int id,String name, String adr ,String branch,long mo){

		this.id=id;
		this.name=name;
		this.adr=adr;
		this.branch=branch;
		this.mo=mo;
	}

	//public String toString(){
	//	return "id"+" "+id+"name"+" "+name+ "adr"+" "+adr+"branch"+" "+branch+"mo"+" "+mo;
	//}
		public boolean equals(Object obj){
			if(this==obj){     //chack Same memory (original) refarence
				return true;
			}
			if(obj==null){     // check null 
				return false;
			}
			if(getClass()!=obj.getClass()){
				return false;
			}
			Student other= (Student)obj; 
			/* when we use hashCode Metode then mandatory to 
					do down casting */

			return this.id==other.id&&this.name==other.name&&this.adr==other.adr&&this.branch==other.branch&&
				this.mo==other.mo;
		}
		
		public int hashCode(){
			return id+name.hashCode()+adr.hashCode()+branch.hashCode()+(int)mo;
		}
}
class Abstraction3MethodDriver1
{
	public static void main(String[] args) {
		
		Student s1=new Student(123,"Dipak","Beed","BCA",1234567890l);

		Student s2=new Student(123,"Dipak","Beed","BCA",1234567890l);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());


	}
}