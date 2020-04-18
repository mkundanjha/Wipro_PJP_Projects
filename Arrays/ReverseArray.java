    import java.util.*;

    public class ReverseArray{ 
    public static void reverse_it(int[][] my_array){
    int my_rows = my_array.length;
        int my_cols = my_array[0].length;
        int array[][]=new int[my_rows][my_cols];
        for(int i = my_rows-1; i >= 0; i--) {
            for(int j = my_cols-1; j >= 0; j--) {
                array[my_rows-1-i][my_cols-1-j] = my_array[i][j];
            }
        }
        System.out.println("The reverse of array is :");
        for(int i = 0; i < my_rows; i++) {
            for(int j = 0; j < my_cols; j++) {
                System.out.print(array[i][j]+" ");
                }
                System.out.println();
         }
    }
    public static void main(String[] args) throws Exception {
        int my_rows, my_cols;
        int inp1,inp2,inp3,inp4;
        
        inp1=Integer.parseInt(args[0]);
        inp2=Integer.parseInt(args[1]);
        inp3=Integer.parseInt(args[2]);
        inp4=Integer.parseInt(args[3]);
        
        int[][] my_array={
            {inp1,inp2},
            {inp3,inp4}
        };
        
        my_rows = my_array.length;
        my_cols = my_array[0].length;
       
  
        System.out.println("The given array is :");
        for (int i = 0; i < my_rows; i++) {
            for (int j = 0; j < my_cols; j++) {
            System.out.print(my_array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        reverse_it(my_array);
             }
    }
