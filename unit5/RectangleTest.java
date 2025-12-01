public class RectangleTest{
	public static void main(String[] args){
		Rectangle rect = new Rectangle(3,4);
		
		System.out.println(rect.getBase());
		System.out.println(rect.getHeight());
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		System.out.println(rect.diagonal());
	}

}
