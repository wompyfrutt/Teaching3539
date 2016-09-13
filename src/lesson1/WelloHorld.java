package lesson1;

public class WelloHorld //class
{
	
	public static int matthias = 10; //1 2 3 234245236 234234234 876543456789876543 up to 2 billion
	public static double joey;//2.0 4.4 12323.12323 
	public String ian;// "yes" "no" "Hello Wor123ld" "123/1231293()23123"
	public boolean DD;// True False
	
	public char lauren;// 'a' 'b' 'r' 't'
	public long noah;//for very long numbers
	public short taco;//for short numbers (saves data (memory))
	public float joey2;//.2334643565435
	
	public int pencil = 5;
	public int mouse = 11;
	
	
	public void letsPlay()
	{
		DD = true;
		ian = "yes";
		System.out.println(DD + " " + ian);
	}
	
	public int letsDance() //String int double float, void
	{
		matthias = pencil + mouse;
		return matthias;
	}
	
	public void letsFly(int distance)
	{
		System.out.println("we're going to fly " + distance + " meters" );
	}
	
	public static void main(String[] args) //runs the program
	{
		joey = 2.0;
		
		WelloHorld sharpie = new WelloHorld();
		sharpie.letsPlay();
		System.out.println(sharpie.letsDance());
		sharpie.letsFly(10);
		sharpie.letsFly(20);
		
		
		System.out.println("Hello World!"); //prints "Hello World!"
		System.out.println(matthias); //prints the value of matthias
		System.out.println(joey); //prints the value of joey
		
	}
}