package democode;
public class butter{
	
public static void main(String[] args) {
	butter b=new butter();
	b.pattern(4);
}
public static void pattern(int n) {
    String stars;
    for (int i = 1; i <= n; i++) {
        stars = "* ".repeat(i);
        System.out.println(stars + " ".repeat(4 * (n - i)) + stars);
    }
    for (int i = n; i >= 1; i--) {
        stars = "* ".repeat(i);
        System.out.println(stars + " ".repeat(4 * (n - i)) + stars);
    }
}
}