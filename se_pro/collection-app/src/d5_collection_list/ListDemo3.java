package d5_collection_list;

import java.util.LinkedList;

/**
 * LinkedList
 * 双链表
 *
 * @author SYX
 */
public class ListDemo3 {

    public static void main(String[] args) {
        // LinkedList可以完成完成队列结构和栈结构（双链表）
        // 栈
        LinkedList<String> stack = new LinkedList<>();
        // 压栈，入栈
        // stack.addFirst("1");
        stack.push("1");
        stack.addFirst("2");
        stack.addFirst("3");
        stack.addFirst("4");
        System.out.println(stack);
        // 出栈
        System.out.println(stack.pop());
        // System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        System.out.println("---------------");

        //队列
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        System.out.println(queue);

        // 出队
        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        System.out.println(queue);

    }


}

