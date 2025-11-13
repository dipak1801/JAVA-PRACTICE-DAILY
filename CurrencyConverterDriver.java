interface CurrencyConverter
{
	double usd=88.68;
	double euro=102.77;
	double briPou=116.38;
	double ausD=58.12;

	void indToUsd(double i);

	abstract void indToEuro(double i);

	public abstract void indToBriPou(double i);

	void indToAusD(double i);
	
}
class CurrencyConverterImp implements CurrencyConverter{

	public void indToUsd(double i){
		double inr=usd*i;
		System.out.println("usd to inr"+" "+inr);
	}
	public void indToEuro(double i){
		double inr=euro*i;
		System.out.println(" euro to inr"+" "+inr);
	}
	public void indToBriPou(double i){
		double inr=briPou*i;
		System.out.println("Britic Pound to inr"+" "+inr);
	}
	public void indToAusD(double i){
		double inr=ausD*i;
		System.out.println("aud to inr is"+" "+inr);
	}
}
public class CurrencyConverterDriver
{
	public static void main(String[] args){

		CurrencyConverter obj=new CurrencyConverterImp();
		obj.indToUsd(2);
		obj.indToEuro(2);
		obj.indToBriPou(2);
		obj.indToAusD(2);	

	}
}