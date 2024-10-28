package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	
	public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        
        // Ascending Order
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        
        // Descending Order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }

}
