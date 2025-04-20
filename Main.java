/*
Name: Bontha Mallikarjun Reddy
PRN: 23070126026
Batch: A1
*/
public class Main {
    // Create instances of different threads
    public static void main(String[] args) {
        // Create instances of different threads
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}