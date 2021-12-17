package Homework8.DoubleLinkedList;

public class MyDoublyLinkedList<E> {
    private int size;
    private Node<E> head, tail;

    // Constructors
    public MyDoublyLinkedList() {
        head = tail = null;
    }

    public MyDoublyLinkedList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    // Methods

    // *** ADDING ***
    public void add(E e) {
        addLast(e);
    }

    public void addFirst(E e) { /** add code to set 'previous' */
        Node<E> newNode = new Node<E>(e); // Create a new node
        if (tail == null) // if empty list
            head = tail = newNode; // new node is the only node in list
        else {
            newNode.next = head; // link the new node with the head
            head.previous = newNode; /***** NEW CODE *****/ //  (111111)
            head = newNode; // **** NEW CODE *****/head points to the new node
        }
        size++;
    }

    public void addLast(E e) { /** add code to set 'previous' */
        Node<E> newNode = new Node<E>(e); // Create a new for element e
        if (tail == null) // if empty list
            head = tail = newNode; // new node is the only node in list
        else {
            tail.next = newNode; // Link the new with the last
            // tail = tail.next; // tail now points to the last node (replace this from MyLinkedListOriginal
            newNode.previous = tail; /***** NEW CODE *****///  (222222222)
            tail = newNode; // tail now points to the last node
        }
        size++;
    }

    public void add(int index, E e) {/** add code to set 'previous' & to improve performance */
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(); // according to Java doc.
        else if (index == 0)
            addFirst(e);
        else if (index == size)
            addLast(e);
        else { /***** NEW CODE (all else block) *****/ //  (333333333)
            Node<E> newNode = new Node<E>(e);
            Node<E> current = getNodeAt(index);
            current.previous.next = newNode;
            newNode.previous = current.previous;
            newNode.next = current;
            current.previous = newNode;
            size++;
        }
    }

    // *** REMOVING ***
    public E removeFirst() { /** add code to set 'previous' */
        if (size == 0)
            return null;
        else {

            Node<E> temp = head; // element will be returned
            head = head.next;
            head.previous = null;/***** NEW CODE *****/ //  (444444444)
            size--;
            if (head == null) // if list becomes empty
                tail = null;
            return temp.element; // return the removed element
        }
    }

    public E removeLast() { /** improve performance using 'previous' */
        if (size == 0)
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> temp = tail;
            tail = tail.previous; /***** NEW CODE *****/ // (5555555555)
            tail.next = null;/***** NEW CODE *****/
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {/** add code using 'previous' */
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else { /***** NEW CODE (else block) *****/ // (666666666)
            Node<E> current = getNodeAt(index);
            current.previous.next = current.next;
            current.next.previous = current.previous;
            size--;
            return current.element;
        }
    }

    public boolean remove(E e) {
        if (indexOf(e) >= 0) { // if the element exists
            remove(indexOf(e)); // call the other remove method
            return true;
        } else
            return false;
    }

    public void clear() {
        size = 0;
        head = tail = null;
    }

    // *** GETTING ***
    public E getFirst() {
        if (size == 0)
            return null;
        else
            return head.element;
    }

    public E getLast() {
        if (size == 0)
            return null;
        else
            return tail.element;
    }

    public E get(int index) { /** improve performance using 'previous' */
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return getFirst();
        else if (index == size - 1)
            return getLast();
        else { /***** NEW CODE (else block) *****/ //    (77777777)
            return getNodeAt(index).element;
        }
    }

    // *** SETTING ***
    public E set(int index, E e) { /** improve performance using 'previous' */
        if (index < 0 || index > size - 1)
            return null;
        Node<E> current = getNodeAt(index); /***** NEW CODE *****/
        E temp = current.element;  // (888888888)
        current.element = e;
        return temp;
    }

    // *** TOSTRING ***
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            result.append(current.element);
            current = current.next;
            if (current != null)
                result.append(", "); // Separate two elements with a comma
            else
                result.append("]"); // Insert the closing ] in the string
        }

        return result.toString();
    }

    public String toReversedString() { /***** NEW CODE (the whole method) *****/
        StringBuilder result = new StringBuilder("["); // (999999999)
        Node<E> current = tail;
        while (current != null) {
            result.append(current.element);
            current = current.previous;
            if (current != null)
                result.append(", ");
            else
                result.append("]");
        }

        return result.toString();
    }

    // *** CHECKING ***
    public int size() {
        return size;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                return true;
            current = current.next;
            if (current == null)
                return false;
        }
        return false;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                return i;
            current = current.next;
            if (current == null)
                return -1;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        /***** CHANGED CODE (the whole method) *****/
        //                    (1010101010)
        Node<E> current = tail; // start from the tail instead of head (single LList)
        for (int i = size - 1; i >= 0; i--) {
            if (current.element.equals(e))
                return i;
            current = current.previous;
            if (current == null)
                return -1;
        }
        return -1;
    }

    // *** HELPER METHODS ***
    private void checkIndex(int idx) {
        if (idx < 0 || idx >= size)
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
    }

    private Node<E> getNodeAt(int index) { /***** NEW CODE (the whole method) *****/
        Node<E> current; //(11_11_11_11)
        if (index < size / 2) { // if in 1st half, then iterate from the left
            current = head; // ]
            for (int i = 0; i < index; i++) // ]- get a reference to node @
                // index
                current = current.next; // ]
        } else { // if in 2nd half, then iterate from the right
            current = tail; // ]
            for (int i = 1; i < size - index; i++)// ]- get a reference to node
                // @ index
                current = current.previous; // ]
        }
        return current;
    }

    // *** INNER NODE CLASS ***// (12121212)
    private static class Node<E> {
        E element;
        Node<E> next, previous; // ***** NEW CODE *****

        public Node(E e) {
            element = e;
        }
    }
}
