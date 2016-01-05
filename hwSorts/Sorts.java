public class Sorts{
    public static void selection(int [] data){
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
}
	    