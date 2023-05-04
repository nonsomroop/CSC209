import java.util.LinkedList;
import java.util.Queue;

public class Data {
    int[] info;
    int capacity;
    int size;

    public Data() {
        this(100);
    }

    public Data(int c) {
        capacity = c;
        info = new int[c];
    }

    public int addNewInfo(int newItem) {
        info[size] = newItem;
        size++;
        return size;
    }

    public int clone(Data d) {
        size = 0;
        for (int i = 0; i < d.size; i++) {
            info[i] = d.info[i];
            size++;
        }
        return size;
    }

    public void swap(int a, int b) {
        int temp = info[a];
        info[a] = info[b];
        info[b] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int least = i;
            for (int j = (i + 1); j < size; j++) {
                if (info[j] < info[least]) {
                    least = j;
                }
            }
            swap(i, least);
        }
    }

    public String toString() {
        String datas = "";
        for (int i = 0; i < size; i++) {
            datas += info[i] + " ";
        }
        return datas;
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int valueAti = info[i];
            int j;
            for (j = i - 1; j >= 0 && (info[j] > valueAti); j--) {
                info[j + 1] = info[j];
            }
            info[j + 1] = valueAti;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (info[j - 1] > info[j]) {
                    swap(j - 1, j);
                }
            }
        }
    }

    public void quickSort(int first, int last) {
        if (first >= last) {
            return;
        }
        int pivot = info[first];
        int lower = first + 1;
        int upper = last;
        while (lower <= upper) {
            while (lower <= last && info[lower] < pivot) {
                lower++;
            }
            while (upper > first && info[upper] >= pivot) {
                upper--;
            }
            if (upper > lower) {
                swap(lower, upper);
                lower++;
                upper--;
            }
        }
        swap(first, upper);
        quickSort(first, upper - 1);
        quickSort(upper + 1, last);
    }

    public void radixSort() {
        int radix = 10, digits = 4;
        Queue<Integer> q[] = new Queue[10];
        for (int i = 0; i < radix; i++) {
            q[i] = new LinkedList<>();
        }
        int factor = 1;
        for (int i = 0; i <= digits; factor *= 10, i++) {
            for (int j = 0; j < size; j++) {
                q[(info[j] / factor) % 10].add(info[j]);
            }
            for (int j = 0, k = 0; j < radix; j++) {
                while (!q[j].isEmpty()) {
                    info[k] = q[j].remove();
                    k++;
                }
            }
        }
    }

    public void mergeSort(int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(first, mid);
            mergeSort(mid + 1, last);
            merge(first, last);
        }
    }

    public void merge(int first, int last) {
        int[] result = new int[last - first + 1];
        int mid = (first + last) / 2;
        int left = first, right = mid + 1;
        int kAtResult = 0;
        while (left <= mid && right <= last) {
            if (info[left] < info[right]) {
                result[kAtResult++] = info[left++];
            } else {
                result[kAtResult++] = info[right++];
            }
        }
        while (left <= mid) {
            // we have info at left remains in the left array
            result[kAtResult++] = info[left++];
        }
        while (right <= last) {
            result[kAtResult++] = info[right++];
        }
        for (int i = 0; i < last - first + 1; i++) {
            info[first + i] = result[i];
        }
    }

    public void shellSort(){
        for (int shell = 5; shell >= 1; shell -= 2){
            for (int j = 0; j < shell; j++){
                insertionSort4ShellSort(j, shell);
            }
        }
    }
    public void insertionSort4ShellSort(int first, int shell){
        for (int i = first; i < size; i+= shell) {
            int valueAti = info[i];
            int j;
            for (j = i - shell; j >= 0 && info[j] > valueAti; j-=shell){
                info[j + shell] = info[j];
            }
            info[j + shell] = valueAti;
        }
    }
}
