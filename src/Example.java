public class Example {
    /*
    * Mark Allen Weiss Data structures and algorithm analysis in Java
    *P9
    *  */

    public static int f(int x) {
        if (x == 0){
            return x;
        } else {
            return 2 * f(x-1) + x * x;
        }
    }
    public static void main(String []args) {
        
    }
}
