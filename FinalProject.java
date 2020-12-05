package pkgfinal.project;

import java.util.Queue;
import java.util.LinkedList;

public class FinalProject {

    public static void subArray(Integer[] array) {
        //   Queue<Integer> subarr = new LinkedList<>();

        int value = 0;
        int end = 0;

        int startingIndex = 0;
        int startModify = 0;
        int endIndex = 0;

        for (int i = 0; i < array.length; i++) {
            end = end + array[i];
            //   System.out.println("END: " + end);

            if (value < end) {
                value = end;
                //subarr.offer(array[i]);
                //  i1 = i;
                startingIndex = startModify;
                endIndex = i;

            }
            if (end < 0) {
                //  System.out.println("ZEROED");
                startModify = i + 1;
                end = 0;
            }
        }
        System.out.println("Output: " + value);
        System.out.print("Which is the subarray: [");
        for (int i = startingIndex; i <= endIndex; i++) {
            System.out.print(array[i]);
            if (i < endIndex) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    //checks if identical and if not, recursively checks both the left
    //and right nodes of node "a" with the potential sub tree node "b"
    public static boolean trees(Node a, Node b) {
        if(nodeCheck(a, b)){
            return true;
        }
        return (trees(a.right, b) || trees(a.left, b));
    }
    //recursively checks data
    public static boolean nodeCheck(Node a, Node b){
        return (a.num == b.num && nodeCheck(a.left, b.left) && nodeCheck(a.right, b.right));
    }
   
/*
//broken
    public static void matrix(int [][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){
            
        }

    }
*?
    public static void main(String[] args) {
        Integer[] arr = {2, -8, -3, -2, -4, -10};
        subArray(arr);
        
        //prints out if the node is not a s
        if(trees(a, b)){
            System.out.println("Node B is a sub tree of A");
        }else{
            System.out.println("Node B is not a sub tree of A");
        }

    }

}
