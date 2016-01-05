import java.util.Arrays;

public class Driver{
    public static void main(String []args){
	int [] stuff = {1, 9, 2, 7, 3, 10, 8, 5};
	System.out.println(Arrays.toString(stuff));
	Sorts.selection(stuff);
	System.out.println(Arrays.toString(stuff));
    }
}