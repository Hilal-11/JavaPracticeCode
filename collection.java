import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import javax.management.Query;
import javax.print.attribute.IntegerSyntax;

public class collection {
    public static void main(String[] args) {

        //

        //

        //

        //

        // ArrayList
        // ArrayList

        // List list = new ArrayList();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // System.out.println(list);
        // list.add(0, 100);
        // System.out.println(list);

        // list.add("Hilal");
        // System.out.println(list);

        // List<Integer> list = new ArrayList<Integer>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(0, 100);
        // System.out.println(list);

        // List<String> list2 = new ArrayList<String>();
        // list2.add("Hilal");
        // list2.add("Waseem");
        // list2.add("Azhar");
        // list2.add("Junaid");
        // list2.add("Umer");
        // list2.add("Fiddha");

        // System.out.println(list2);

        // ArrayList<Character> list3 = new ArrayList<Character>();
        // list3.add('H');
        // list3.add('I');
        // list3.add('L');
        // list3.add('A');
        // list3.add('L');

        // System.out.println(list3);
        //

        //

        //

        //

        //

        // LinkedList
        // LinkedList

        // LinkedList<Integer> list = new LinkedList<Integer>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // System.out.println(list);
        // list.add(0, 818);
        // System.out.println(list);

        // LinkedList<Integer> list = new LinkedList<Integer>();
        // list.add(0, 100);
        // list.add(1, 200);
        // list.add(2, 300);
        // list.add(3, 400);
        // list.add(4, 500);
        // System.out.println(list);

        // list.remove(0);
        // System.out.println(list);

        //

        //

        //

        //

        //

        // Vector
        // Vector

        // Vector<String> vector = new Vector<String>();
        // vector.add("Hilal");
        // vector.add("Waseem");
        // vector.add("Aadil");
        // vector.add("Hilal");
        // vector.add("Waseem");
        // System.out.println("Vector : " + vector);

        // vector.clear();
        // System.out.println(vector);

        //

        //

        //

        //

        // Stack
        // Stack

        // Stack<Integer> stk = new Stack<Integer>();
        // stk.push(10);
        // stk.push(20);
        // stk.push(30);
        // stk.push(40);
        // System.out.println(stk);
        // System.out.println();

        // stk.push(100);
        // stk.pop();
        // System.out.println(stk.peek());

        //
        //

        //

        //

        // Sets
        // Sets

        // Set<Integer> set = new HashSet<Integer>();
        // set.add(10);
        // set.add(100);
        // set.add(300);
        // set.add(40);
        // System.out.println(set);

        // LinkedHashSet
        // LinkedHashSet

        // LinkedHashSet<Integer> linkSet = new LinkedHashSet<Integer>();
        // linkSet.add(10);
        // linkSet.add(20);
        // linkSet.add(30);
        // linkSet.add(40);
        // linkSet.add(50);
        // linkSet.add(50);

        // System.out.println(linkSet);
        // System.out.println(linkSet.contains(10));

        //

        //

        //

        // TreeSet
        // TreeSet

        // TreeSet<Integer> tree = new TreeSet<Integer>();
        // tree.add(222);
        // tree.add(32);
        // tree.add(12);
        // tree.add(11);
        // tree.add(10);
        // tree.add(100);
        // System.out.println(tree);

        //
        //

        //
        //

        //

        // Queue
        // Queue

        // Queue<Integer> queue = new LinkedList<Integer>();
        // queue.add(10);
        // queue.offer(20);
        // queue.offer(30);
        // queue.offer(40);
        // // queue.poll();
        // System.out.println(queue);
        // System.out.println("Removed :- " + queue.poll());
        // System.out.println("Removed :- " + queue.remove());
        // System.out.println(queue);
        // System.out.println("Top Value :- " + queue.peek());

        //
        //

        //

        //

        // De-Queue
        // De-Queue

        // Deque<Integer> Dqueue = new ArrayDeque<Integer>();
        // Dqueue.offer(10);
        // Dqueue.offer(20);
        // Dqueue.offer(30);
        // Dqueue.offerFirst(30);
        // Dqueue.offerLast(50);
        //
        // Dqueue.poll();
        // Dqueue.pollFirst();
        // Dqueue.pollLast();
        //
        // System.out.println(Dqueue);
        // System.out.println(Dqueue.peek());
        // System.out.println(Dqueue.peekLast());

        //
        //

        //

        //

        // PriorityQueue [imp]
        // PriorityQueue [imp]

        // Min Heap
        // Min Heap

        // PriorityQueue<Integer> pro_que = new PriorityQueue<Integer>();
        // pro_que.offer(88);
        // pro_que.offer(11);
        // pro_que.offer(14);
        // pro_que.offer(10);

        // System.out.println(pro_que);

        // Max Heap
        // Max Heap

        // PriorityQueue<Integer> pro_que = new
        // PriorityQueue<Integer>(Comparator.reverseOrder());
        // pro_que.offer(88);
        // pro_que.offer(11);
        // pro_que.offer(14);
        // pro_que.offer(10);
        // System.out.println(pro_que);

        // // //
        // // //

        // // //

        // // //

        // // //

        // // // Map // // //
        // // // Map // // //

        // // // HashMap // // //
        // // // HashMap // // //
        // HashMap<String, Integer> map = new HashMap<String, Integer>();
        // map.put("Aoll No ", 10);
        // map.put("Phone No ", 9019199);
        // map.put("Pin code ", 193222);
        // System.out.println("HashMap :- " + map);

        // System.out.println();
        //

        //

        //
        // // // TreeMap // // //
        // // // TreeMap // // //
        // TreeMap<String, Integer> Tmap = new TreeMap<String, Integer>();
        // Tmap.put("Aoll No ", 10);
        // Tmap.put("Phone No ", 9019199);
        // Tmap.put("Pin_code ", 193222);
        // System.out.println("TreeMap :- " + Tmap);
        // System.out.println();

        // System.out.println("Get Value = " + Tmap.get("Pin_code"));
        // System.out.println("Get Keys :- " + Tmap.keySet());
        // System.out.println("Get Values :- " + Tmap.values());

        //

        //

        //

        // int arry[] = { 5, 6, 3, 4, 1, 2 };
        // for (int i = 0; i < arry.length; i++) {
        // System.out.print(" " + arry[i]);
        // }

        // System.out.println();
        // Arrays.sort(arry);
        // for (int i = 0; i < arry.length; i++) {
        // System.out.print(" " + arry[i]);
        // }

        // //

        // //

        // //
        // System.out.println("\n \n");

        // int arr[] = { 5, 6, 3, 4, 1, 2 };
        // for (int i : arr) {
        // System.out.print(" " + i);
        // }

        // System.out.println();
        // Arrays.sort(arr);
        // for (int i : arr) {
        // System.out.print(" " + i);
        // }

        //

        //

        //

        // int arry[] = { 1, 3, 5, 6, 7, 8, 4 };
        // Arrays.sort(arry);
        // for (int e : arry) {
        // System.out.print(" " + e);

        // }
        // System.out.println();
        // System.out.println(Arrays.binarySearch(arry, 1));
        //

        //

        //

        // ArrayList<String> myList = new ArrayList<String>();
        // myList.add("Hilal");
        // myList.add("Waseem");
        // myList.add("Aadil");
        // System.out.println(myList);

        // Collections.sort(myList);
        // System.out.println(myList);

        //

        //

        //

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(22);
        list.add(11);
        list.add(66);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        // System.out.println(Collections.(list));

        //

        //

        //
    }
}