class static_veriable{
	static int y=120;
public static void main(String[] args){
	System.out.println(y);

	System.out.println(static_veriable.y);

	static_veriable s= new static_veriable();
	System.out.println(s.y);
}
}