public class SortingLab {
    public static void main(String [] args) {
        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();
        Data d4 = new Data();
        Data d5 = new Data();
        Data d6 = new Data();
        Data d7 = new Data();
        Data d8 = new Data();
        d1.addNewInfo(50);d1.addNewInfo(100);
        d1.addNewInfo(25);d1.addNewInfo(9);
        d1.addNewInfo(40);d1.addNewInfo(1200);
        d1.addNewInfo(21);d1.addNewInfo(60);
        d1.addNewInfo(21);d1.addNewInfo(60);
        d1.addNewInfo(12);d1.addNewInfo(30);
        d1.addNewInfo(12);d1.addNewInfo(1234);
        d1.addNewInfo(881);d1.addNewInfo(260);
        d1.addNewInfo(456);d1.addNewInfo(305);
        d1.addNewInfo(999);d1.addNewInfo(981);
        System.out.println(d1);
        d2.clone(d1);
        d3.clone(d1);
        d4.clone(d1);
        d5.clone(d1);
        d6.clone(d1);
        d7.clone(d1);
        d8.clone(d1);
        d2.selectionSort();
        System.out.println("Selection sort:" + d2);
        d3.insertionSort();
        System.out.println("Insertion sort:" + d3);
        d4.bubbleSort();
        System.out.println("Bubble sort: " + d4);
        d5.quickSort(0, d5.size - 1);
        System.out.println("Quick sort: " + d5);
        d6.radixSort();
        System.out.println("Radix sort: " + d6);
        d7.mergeSort(0, 19);
        System.out.println("Merge sort: " + d7);
        d8.shellSort();
        System.out.println("Shell sort: " + d8);
    }
}