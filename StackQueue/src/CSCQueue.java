public class CSCQueue {
    int[] q;
    int first, last;

    public CSCQueue() {
        this(100);
    }

    public CSCQueue(int capacity) {
        q = new int[capacity];
        first = last = -1;
    }

    public boolean isEmpty() {
        return first == -1;
    }

    public boolean isFull() {
        return (last + 1 == first) || (first == 0 && last == q.length - 1);
    }

    public void enqueue(int el) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (isEmpty()) {
                first = 0;
            }
            if (last != q.length - 1) {
                last++;
            } else {
                last = 0;
            }
            q[last] = el;
        }
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int temp = q[first];
            if (first != q.length - 1){
                first++;
            }
            if (first == q.length - 1){
                first = 0;
            } else if (first == last){
                first = last = -1;
            }
            return temp;
        }
    }

    public int firstEl(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return q[first];
        }
    }

    public String toString(){
        String temp = "[";
        for (int i = 0; i < q.length; i++){
            if (last < first && (i < last || i >= first)){
                temp += q[i] + " ";
            } else if (last > first && i >= first && i <= last) {
                temp += q[i] + " ";
            } else {
                temp += "  ";
            }
        }
        return temp + "]";
    }
}
