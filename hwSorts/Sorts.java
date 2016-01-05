import java.util.Arrays;

public class Sorts{
    public static void selectionSort(int [] data){
	for(int i = 0; i < data.length; i++){
	    int target = data[i];
	    int index = i;
	    for(int j = i; j < data.length; j++){
		if (data[j] < target){
		    target = data[j];
		    index = j;
		}
	    }
	    int temp = data[i];
	    data[i] = target;
	    data[index] = temp;
	}
    }

    public static void insertionSort(int[]data){
	for(int i = 1; i < data.length; i++){
	    for(int j = i; j > 0 && data[j] < data[j - 1]; j--){
		int x = data[j - 1];
		data[j - 1] = data[j];
		data[j] = x;
	    }
	}
    }

    public static void bubbleSort(int[]data){
	int target = data.length;
	boolean changes = true;
	while (changes){
	    changes = false;
	    for(int j = 1; j < target; j ++){
		if(data[j] < data[j - 1]) {
		    int temp = data[j];
		    data[j] = data[j - 1];
		    data[j - 1] = temp;
		    changes = true;
		}
	    }
	    target--;
	}
    }
}
	    
