package Java10;
class CTriangle{
	protected int base;
	protected int height;
	public CTriangle(int a ,int b) {
		base=a;
		height=b;
}protected void show()
	 {
		 System.out.println("base="+base+", height="+height);
		 }
		 }
class CDate extends CTriangle{
	public CDate(int a ,int b) {
		super(a,b);
	}
	public void area() {
		show();
		System.out.println("area="+base*height/2.0);
	}
}

public class class06 {

	public static void main(String[] args) {
		CDate ans=new CDate(3,2);
		ans.area();

	}

}
