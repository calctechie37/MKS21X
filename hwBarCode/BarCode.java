import java.lang.*;

public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    
    public BarCode(String zip) {
	try{
	    int newZip = Integer.parseInt(zip);
	}catch(NumberFormatException e){
	    System.out.println("Not valid zip code");
	}
	if (_zip.length() != 5){
	    throw new ;
	}
    }

    public BarCode(Barcode x) {
	
    }