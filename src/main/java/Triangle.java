
public class Triangle  {

        public static void main(String[] args) {
            int a = 5;
            int b = 7;
            int c = 8;
            System.out.println("Let's start!");
            System.out.println("-----------------------------------------");
            System.out.println("To count the square of the triangle we need to know it's lines' lenght:");
            System.out.println("the first line's lenght (a) is " + a + " sm,");
            System.out.println("the second line's lenght (b) is " + b + " sm,");
            System.out.println("the third line's lenght (c) of the triangle is "+ c + " sm.");

            float p = (a + b + c) / 2.f;
            System.out.println("Perimeter of the triangle is: " + p + " sm.");
            float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Square of the triangle is:" + s + " sm.");
            System.out.println("-----------------------------------------");
            System.out.println("Thus, the correct answer is:" + s + " sm.");
        }
}
