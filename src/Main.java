import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {2, 6, 3, 9, 10};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));


    }

    //takes an int array
    //reverses the array
    public static void reverse(int[] array) {
        //swap first element with last element and so on
        int end = array.length - 1; //this is the highest possible index of the array
        int halfLength = array.length / 2; //only switch elements until the middle of the array
        for(int i=0; i<halfLength; i++) {
            int temp = array[i]; //save the current position's value
            array[i] = array[end - i]; //set the current position to the value of the opposite end's position
            array[end - i] = temp; //set the opposite end's value to the previously saved current positions's value
        }


    }
}







