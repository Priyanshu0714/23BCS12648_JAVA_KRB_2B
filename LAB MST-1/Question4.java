import java.lang.*;

class NumThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class SquareThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square: " + (i * i));
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        NumThread t1 = new NumThread();
        SquareThread t2 = new SquareThread();

        t1.start();
        t2.start();
    }
}
