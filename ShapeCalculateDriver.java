

interface ShapeCalcu {

		
		double pi=22.0/7.0;
		
		public abstract void areaofSquare(double side);
		
		abstract void paremeterofSquare(double side);
		
		void areaofCircle( double red);
		 
		void areaofTrangle(double base,double hight);
		
		public static void message(String name) {
			
			System.out.println("hey !"+name+"well come to calculater");

		}

}
	
 class ShapeCalculate implements ShapeCalcu{
		
		public void areaofSquare(double sids) {
			double  area = sids*sids;
			System.out.println(area);
		}
		public void paremeterofSquare(double sids) {
			double  area = 4*sids;
			System.out.println(area);
		}
		public void areaofCircle(double red) {
			double  area = pi*(red*red);
			System.out.println(area);
		}
		public void areaofTrangle(double bas,double hig) {
			double  area = 0.5*bas*hig;
			System.out.println(area);
		}
		
		public static void message(String name) {
			
			System.out.println("hey !"+name+"Done");

		}		
}
	
public class ShapeCalculateDriver
{
	public static void main(String[] arg) {
		
		ShapeCalcu s=new ShapeCalculate();
		s.areaofCircle(4);
		s.areaofSquare(4);
		s.areaofTrangle(3,5);
		s.paremeterofSquare(5);
		ShapeCalcu.message("dipak");
		ShapeCalculate.message("tanu");

	}


}


