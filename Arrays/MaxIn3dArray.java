    import java.util.*;
    public class MaxIn3dArray{ 
        
    public static void maxArray(int[][] my_array){
        int max=Integer.MIN_VALUE;
        int my_rows = my_array.length;
        int my_cols = my_array[0].length;
        
        for (int i = 0; i < my_rows; i++) {
            for (int j = 0; j < my_cols; j++) {
                if(my_array[i][j]>max)
                    max=my_array[i][j];
            }
        }
        System.out.println("The biggest number is "+max);
        
    }
    public static void main(String[] args) throws Exception {
        int my_rows, my_cols;
        int inp1,inp2,inp3,inp4,inp5,inp6,inp7,inp8,inp9;
        
        inp1=Integer.parseInt(args[0]);
        inp2=Integer.parseInt(args[1]);
        inp3=Integer.parseInt(args[2]);
        inp4=Integer.parseInt(args[3]);
        inp5=Integer.parseInt(args[4]);
        inp6=Integer.parseInt(args[5]);
        inp7=Integer.parseInt(args[6]);
        inp8=Integer.parseInt(args[7]);
        inp9=Integer.parseInt(args[8]);
        
        int[][] my_array={
            {inp1,inp2,inp3},
            {inp4,inp5,inp6},
            {inp7,inp8,inp9}
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
        maxArray(my_array);
             }
    }
