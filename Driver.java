                             public class Driver{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + "popped from stack");

        System.out.println("Stack is empty: " + s.isEmpty());
        System.out.println("Stack size: " + s.size());
    }
}
