public class HeapLab {
    public static void main(String [] args){
        Heap h = new Heap(10);
        h.enqueue(50);
        h.enqueue(20);
        h.enqueue(300);
        h.enqueue(60);
        h.enqueue(250);
        h.enqueue(500);
        h.enqueue(10);
//        h.dequeue();
        h.printAll();
        h.heapSort();
        h.printAll();
    }
}
