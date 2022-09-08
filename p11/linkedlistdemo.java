package p11;

import java.rmi.Remote;
import java.util.LinkedList;
import java.util.List;

public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList<Character> l1=new LinkedList<>();
        l1.add('A');
        l1.addLast('I');
        l1.addFirst('H');
        l1.add(3,'!');
        System.out.println(l1);
        System.out.println("First Character: "+l1.getFirst());
        System.out.println("Last Character: "+l1.getLast());
        System.out.println("peek: "+l1.peek());
        System.out.println("peek last: "+l1.peekLast());
        l1.remove(1);
        l1.removeLast();
        System.out.println("After Remove and remove last:\n"+l1);
        l1.remove();
        System.out.println("After Remove:\n"+l1);
        l1.add('O');
        l1.add('I');
        System.out.println("After New Insertions:\n"+l1);
        l1.removeFirstOccurrence('I');
        System.out.println("After Remove first occurance of I:\n"+l1);
        l1.addFirst('K');
       // l1.addLast(' ');
        l1.addLast('H');
        l1.addLast('e');
        System.out.println("After New Insertions:\n"+l1);
        List<Character> l2=l1.subList(1,3);
        System.out.println("New Sublist:\n"+l2);
        LinkedList<Character> ll2=new LinkedList<>(l2);
        l1.removeAll(ll2);
        System.out.println("After Removing sublist elements:\n"+l1);
        
    }
}
