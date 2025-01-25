

public class Queue {
    private int capacity ;
    private String[] q ;
    private int front ;
    private int rear ;
    private int size ;

    public Queue(int capacity){
        this.capacity = capacity ;
        q = new String[capacity] ;
        front = 0 ;
        rear = 0 ;
    }

    public void setQueue() {
        for (int i = 0 ; i < q.length ; i++) {
            q[i] = null ;
        }
    }

    public void enqueue(String name) {
        if(isfull()) {
            System.out.println("Queue are full, can not enqueue!") ;
            return ;
        }
        q[rear] = name ;
        System.out.println(name + " has enqueue");
        rear++ ;
        display() ;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty, can not dequeue!") ;
        }
        String out = q[front] ;
        System.out.println(out + " has dequeue");
        q[front] = null ;
        front++ ;
    }

    public int size() {
        size = rear - front ;
        return size ;
    }

    public boolean isfull() {
        return rear == capacity ; 
    }

    public boolean isEmpty() {
        return rear == front ;
    }
    public void display() {
        for(int i = front ; i < capacity ; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println("[ Frist : " + front + " Rear : " + rear + " Size : " + size() + " ]") ;
    }
}
