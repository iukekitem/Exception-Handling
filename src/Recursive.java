public class Recursive {
    public static void move(int n){
        System.out.println("Moved");
        //base condition
        if (n <= 1) {
            return;
        }
        move(n-1);
    }

    public static void main(String[] args){
        move(5);
    }
}
