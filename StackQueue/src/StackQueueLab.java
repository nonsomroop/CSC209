public class StackQueueLab {
    public static void main(String[] args){
        CSStack s1 = new CSStack(10);
        //print empty
        s1.pop();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.push(10);
        System.out.println(s1);
        //print full
        s1.push(11);
        //print 10
        System.out.println(s1.pop());
        //size
        System.out.println(s1.size());
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.topEl());
        s1.reverse();
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);


        CSCQueue q1 = new CSCQueue(6);
        System.out.println(q1);

        q1.dequeue();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(6);
        q1.enqueue(5);
        q1.enqueue(6);
        System.out.println(q1);
        q1.dequeue();
        q1.dequeue();
        System.out.println(q1);
        q1.enqueue(7);
        System.out.println(q1);
        System.out.println(q1.first);
        System.out.println(q1.last);
    }
}
