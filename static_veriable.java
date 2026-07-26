public class static_veriable {
    static int x=150;

public static void main(String[] args) {
    
    System.out.println(x);

    System.out.println(static_veriable.x);

    static_veriable b= new static_veriable();
    System.out.println(b.x);
}

}
