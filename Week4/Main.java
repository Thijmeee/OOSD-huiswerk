package Week4;

public class Main {
    public static void main(String[] args) {
        System.out.println(fib(11));
    }


    public static int fib(int index){
        if (index == 0){
            return 0;
        }
        if (index == 1){
            return 1;
        }
        return fib(index - 1) + fib(index - 2);
    }
}
