import java.util.Arrays;

public class Driver{
    public static void main(String []args){
	int [] stuff = {1,2,9,5,0,3};
	System.out.println(Arrays.toString(stuff));
	Sorts.bubbleSort(stuff);
	System.out.println(Arrays.toString(stuff));
    }
}