public class JaggedArray {
    public static void main(String[] args) {
        // Initialize a 2D array of integers with 3 rows and 4 columns
        //Jagged Array = A jagged array is an array of arrays, where each inner array can have a different length. In other words, it's a 2D array where each row can have a different number of columns. This is in contrast to a regular 2D array, where each row has the same number of columns.
        // In the provided code, num is a jagged array because it's declared as int num[][] = new int[3][];, and then each inner array is initialized with a different length: num[0] = new int[3];, num[1] = new int[4];, and num[2] = new int[2];.
        int num[][] = new int[3][];
        // Initialize the 2D array with 3 rows and 4 columns
        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];
        // Loop through each element in the 2D array
        for(int i = 0; i<num.length; i++){
            for(int j = 0; j<num[i].length; j++){
                // Assign a random integer value to each element
                num[i][j]=(int)(Math.random()*10);
            }   
        }
        // Another method to print 2D array by using for each loop to print each element
        for(int n[] : num){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
