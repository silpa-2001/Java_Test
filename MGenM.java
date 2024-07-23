class GenericM
{
	public <T> void disp(T a,T b)
	{
		System.out.println(a.toString()+b.toString());
	}
}
public class MGenM
{
	public static void main(String args[])
	{
		Integer i1=10;
		Integer i2=11;
		String str1=new String("Hello ");
		String str2=new String("World");
		GenericM obj=new GenericM();
		obj.disp(i1,i2);
		obj.disp(str1,str2);
	}
}