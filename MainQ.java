import java.util.Scanner;

public class MainQ {
        public static void main(String[] args) {
        Queue q = new Queue(5) ;
        Scanner input = new Scanner(System.in) ;

        System.out.println("Please enter student name (enter quite for exit the program) :") ;

        boolean quit = false ;
        while (quit != true) {
        String name = input.nextLine() ;
            if(name.equals("quit")) {
                q.dequeue() ;
                q.display() ;
                System.out.println("Program has exit");
                quit = true ;
            }
            else {
                q.enqueue(name);
            }
        } 
    }
}
