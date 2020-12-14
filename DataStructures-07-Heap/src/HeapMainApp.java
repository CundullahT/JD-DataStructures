public class HeapMainApp {

    public static void main(String[] args) {

        MyHeap myHeap = new MyHeap();

        myHeap.insert(23);
        myHeap.insert(32);
        myHeap.insert(91);
        myHeap.insert(100);
        myHeap.insert(2);
        myHeap.insert(101);
        myHeap.insert(600);

        myHeap.print();

    }

}
