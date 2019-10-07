package ac.uk.MBro;

public class Main {

    //Written procedurally without the use of classes
    public static void main(String[] args) {
	// write your code here

//        fixedLoop();
        whileLoop();
    }

    //Fixed Loop
    public static void fixedLoop() {
        //each time the loop is completed, int i = 0 will increase by 1 taking the counter
        // closer to the limit of 10 iterations
        for(int i = 0; i<=10; i++){
            System.out.println("Iteration: " + i);

        }//end of for loop
    }//end of fixed loop

    public static void whileLoop() {
        int i = 0;
        while (i <=10){
            System.out.println("Iteration: " + i);
            i++;//increases i by +1
        }//end of while loop

    }//end of whileLoop




}
