package Week8.homework;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.System.currentTimeMillis;

public class ListSpeedTester {

    public static void main(String[] args) {

        long arrayListExecutionStartTime;
        long arrayListExecutionEndTime;
        long linkedListExecutionStartTime;
        long linkedListExecutionEndTime;

        ArrayList<Integer> intArrayList = new ArrayList<>();
        LinkedList<Integer> intLinkedList = new LinkedList<>();

        System.out.println("==========================List write time comparison============================");

        arrayListExecutionStartTime = currentTimeMillis();
        System.out.println("Starting array list addition at: " + arrayListExecutionStartTime);
        for (int i = 0; i < 100000; i++){
            intArrayList.add(i);
        }
        arrayListExecutionEndTime = currentTimeMillis();
        System.out.println("Stopping array list addition at: " + arrayListExecutionEndTime);
        System.out.println("Total time for array list addition: " + (arrayListExecutionEndTime - arrayListExecutionStartTime));

        System.out.println("===");

        linkedListExecutionStartTime = currentTimeMillis();
        System.out.println("Starting linked list addition at: "+ linkedListExecutionStartTime);
        for (int i = 0; i < 100000; i++){
            intLinkedList.add(i);
        }
        linkedListExecutionEndTime = currentTimeMillis();
        System.out.println("Stopping linked list addition at: " + linkedListExecutionEndTime);
        System.out.println("Total time for linked list addition: " + (linkedListExecutionEndTime -linkedListExecutionStartTime));

        System.out.println("==========================List access time comparison============================");

        System.out.println("Starting array list access at: " + arrayListExecutionStartTime);
        for (int i = 0; i < 300000; i++){
            intArrayList.get(i);
        }
        arrayListExecutionEndTime = currentTimeMillis();
        System.out.println("Stopping array list access at: " + arrayListExecutionEndTime);
        System.out.println("Total time for array list access: " + (arrayListExecutionEndTime - arrayListExecutionStartTime));

        System.out.println("===");

        linkedListExecutionStartTime = currentTimeMillis();
        System.out.println("Starting linked list access at: "+ linkedListExecutionStartTime);
        for (int i = 0; i < 300000; i++){
            intLinkedList.get(i);
        }
        linkedListExecutionEndTime = currentTimeMillis();
        System.out.println("Stopping linked list access at: " + linkedListExecutionEndTime);
        System.out.println("Total time for linked list access: " + (linkedListExecutionEndTime -linkedListExecutionStartTime));


    }
}
