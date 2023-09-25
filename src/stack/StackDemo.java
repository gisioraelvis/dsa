package stack;

//import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println("Stack items: " + stack);
//        System.out.println("Peek " + stack.peek());
//        System.out.println("Pop " + stack.pop());
//        System.out.println("Stack is empty: " + stack.empty());
//
//        System.out.println("Reverse string: " + StringUtils.reverse("reverse"));
//
//        Expression exp = new Expression("{<([(1+2)*4])>}");
//        System.out.println("Is expression balanced? " + exp.isBalanced());

        //custom stack
        Stack stack = new Stack(5);

        System.out.println(stack.isEmpty());

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
