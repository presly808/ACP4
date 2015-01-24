package ds.link;

import java.util.Iterator;

/**
 * Created by serhii on 24.01.15.
 */
public class LinkedQueue<E> implements Iterable<E> {

    private Node head;
    private Node tail;



    private class LinkedQueueIterator implements Iterator<E> {

        private Node curr = head;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public E next() {
            E forRet = curr.el;
            curr = curr.next;
            return forRet;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedQueueIterator();
    }


    private class Node {

        E el;
        Node next;

        public Node() {
        }

        public Node(E el, Node next) {
            this.el = el;
            this.next = next;
        }
    }

}
