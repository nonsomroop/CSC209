import java.sql.SQLOutput;

public class CSStack {
    int[] st;
    int top;

    public CSStack(){
        this(100);
    }

    public CSStack(int capacity){
        st = new int[capacity];
        top = 0;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == st.length;
    }

    public void push(int el){
        if (isFull()){
            System.out.println("Stack is Full");
        } else {
            st[top] = el;
            top++;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        } else{
            int temp = st[top - 1];
            top--;
            return temp;
        }
    }

    public int topEl(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return st[top - 1];
        }
    }

    public int size(){
        return top;
    }

    public void reverse(){
        for (int i = 0; i < top/2; i++){
            int temp = st[i];
            st[i] = st[top - 1 - i];
            st[top - 1 - i] = temp;
        }
    }

    public String toString(){
        String temp = "[";
        for (int i = 0; i < st.length; i++){
            if (i < top - 1) {
                temp += st[i] + " ";
            } else if (i == top - 1){
                temp += st[i] + "|";
            }
            else {
                temp += "  ";
            }
        }
        return temp + "]";
    }
}
