package test;

import impl.ArrayImpl;
import impl.LinkedListImpl;
import list.Queue;
import list.Stack;

public class BridgeTest {

	public static void main(String[] args) {

		Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());
		
		arrayQueue.enQueue("aaa");
		arrayQueue.enQueue("bbb");
		arrayQueue.enQueue("ccc");
		
		System.out.println(arrayQueue.deQueue());
		System.out.println(arrayQueue.deQueue());
		System.out.println(arrayQueue.deQueue());
		System.out.println("=========================");
		
		Queue<String> linkedQueue = new Queue<String>(new LinkedListImpl<String>());
		linkedQueue.enQueue("aaa");
		linkedQueue.enQueue("bbb");
		linkedQueue.enQueue("ccc");
		
		System.out.println(linkedQueue.deQueue());
		System.out.println(linkedQueue.deQueue());
		System.out.println(linkedQueue.deQueue());
		System.out.println("=========================");
		
		Stack<String> arrayStack = new Stack<String>(new ArrayImpl<String>());
		arrayStack.push("aaa");
		arrayStack.push("bbb");
		arrayStack.push("ccc");
		
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println("=========================");
		
		Stack<String> linkedStack = new Stack<String>(new LinkedListImpl<String>());
		linkedStack.push("aaa");
		linkedStack.push("bbb");
		linkedStack.push("ccc");
		
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println("=========================");
	}

}
