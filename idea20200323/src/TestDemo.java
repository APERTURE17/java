public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(6);
        myLinkedList.addIndex(2,7);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(7));
        System.out.println(myLinkedList.contains(17));
        System.out.println(myLinkedList.size());
        myLinkedList.remove(7);
        myLinkedList.display();
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.removeAllKey(2);
        myLinkedList.display();
    }
}
