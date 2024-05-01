public class TwoDArrays {
    public static void main(String[] args) {
        // Initialize a 2D array of integers with 3 rows and 4 columns
        int num[][] = new int[3][4];

        // Import the Math class to generate random numbers
        // Set the random number range from 0 to 100
        int random = 0;

        // Loop through each element in the 2D array
        for(int i = 0; i< 3; i++){
            for(int j = 0; j< 4; j++){
                // Assign a random integer value to each element
                num[i][j]=(int)(Math.random()*100);
            }   
        }

        // Print the 2D array in a readable format
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j< 4; j++){
                System.out.print(num[i][j] + " ");
            }   
            System.out.println();      
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