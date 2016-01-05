public static void selection(int [] data){
    for(int i = 0; i < data.length; i++){
	target = data[i];
	int index;
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
	    