public class Heap {
    int[] heap;
    int size;

    public Heap(){
        this(100);
    }

    public Heap(int capacity){
        heap = new int[capacity];
        size = 0;
    }

    public boolean isFull(){
        return(size == heap.length);
    }

    public boolean isEmpty(){
        return(size == 0);
    }

    public void enqueue(int newInfo){
        if (!isFull()){
            heap[size] =newInfo;
            int newValueIndex = size;
            size++;
            int parentIndex = (newValueIndex - 1)/2;

            while (newValueIndex > 0 && heap[parentIndex] < heap[newValueIndex]){
                int temp = heap[newValueIndex];
                heap[newValueIndex] = heap[parentIndex];
                heap[parentIndex] = temp;
                newValueIndex = parentIndex;
                parentIndex = (newValueIndex - 1)/2;
            }
        }
        else {
            System.out.println("Heap is full.");
        }
    }

    public void printAll(){
        for (int i = 0; i < size; i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int dequeue(){
        if (!isEmpty()){
            int root = heap[0];
            int lastElement = heap[size - 1];
            heap[0] = lastElement;
            size--;

            int lastElementIndex = 0;
            int leftChildofLastElement = lastElementIndex * 2 + 1;
            int rightChildofLastElement = lastElementIndex * 2 + 2;
            while ((leftChildofLastElement < size && heap[lastElementIndex] < heap[leftChildofLastElement])
            || (rightChildofLastElement < size && heap[lastElementIndex] < heap[rightChildofLastElement])){
                int swapIndex;
                if (heap[leftChildofLastElement] > heap[rightChildofLastElement]){
                    swapIndex = leftChildofLastElement;
                } else if(leftChildofLastElement == size - 1){
                    swapIndex = leftChildofLastElement;
                }
                else  {
                    swapIndex = rightChildofLastElement;
                }
                int temp = heap[lastElementIndex];
                heap[lastElementIndex] = heap[swapIndex];
                heap[swapIndex] = temp;
                lastElementIndex = swapIndex;
                leftChildofLastElement = lastElementIndex * 2 + 1;
                rightChildofLastElement = lastElementIndex * 2 + 2;
            }
            return root;
        }
        else {
            System.out.println("Heap is Empty");
            return -1;
        }
    }

    public void heapSort(){
         for (int last = size - 1; last > 0; last--){

             int temp = heap[last];
             heap[last]= heap[0];
             heap[0] = temp;
             int lastElementIndex = 0;
             int leftChildofLastElement = lastElementIndex * 2 + 1;
             int rightChildofLastElement = lastElementIndex * 2 + 2;
             while ((leftChildofLastElement < last && heap[lastElementIndex] < heap[leftChildofLastElement])
                     || (rightChildofLastElement < last && heap[lastElementIndex] < heap[rightChildofLastElement])){
                 int swapIndex;
                 if (heap[leftChildofLastElement] > heap[rightChildofLastElement]){
                     swapIndex = leftChildofLastElement;
                 } else if(leftChildofLastElement == last - 1){
                     swapIndex = leftChildofLastElement;
                 }
                 else  {
                     swapIndex = rightChildofLastElement;
                 }
                 temp = heap[lastElementIndex];
                 heap[lastElementIndex] = heap[swapIndex];
                 heap[swapIndex] = temp;
                 lastElementIndex = swapIndex;
                 leftChildofLastElement = lastElementIndex * 2 + 1;
                 rightChildofLastElement = lastElementIndex * 2 + 2;
             }
         }
    }
}
