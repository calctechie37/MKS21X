import java.lang.*;

public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    private String code = "||::::::||::|:|::||::|::|:|:|::||::|:::||::|:|:|::";

    public BarCode(String zip) {
	try{
	    int newZip = Integer.parseInt(zip);
	}catch(NumberFormatException e){
	    System.out.println("Not valid zip code");
	}
	if (_zip.length() == 5){
	    _zip = zip;
	    _checkDigit = checkSum(zip);
	}else{
	    throw new IllegalArgumentException("Zip Code is not 5 characters long!");
	}
    }

    public BarCode(BarCode x) {
	BarCode y =  new BarCode(x._zip);
    }
    
    private int checkSum(String zip){
	int num = Integer.parseInt(zip);
	int sum = 0;
	while (num > 0){
	    sum = sum + num % 10;
	    num = num / 10;
	}
	return sum % 10;
    }

    public String toString(){
	String result = "";
	result += _zip + "  ";
	int num = Integer.parseInt(_zip);
	String tempResult = "";
	while (num > 0){
	    int digit = num % 10;
	    num = num / 10;
	    tempResult = getBarCode(digit) + tempResult;
	}
	result += tempResult;
	return result;
    }

    public String getBarCode(int digit){
	return code.substring(digit * 5, 5);
    }

    public boolean equals(Object other){
	return this.instanceOf(other) && BarCode.compareTo(other);
    }

    public int compareTo(Comparable other){
	return toString().equals(other.toString());
    }

    public static void main(String[] args){
	BarCode x = new BarCode("08451");
	System.out.println(x);
    }
}