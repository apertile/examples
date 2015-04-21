package diseno.factorymethod.concrete;

public class PdfDocument implements Document {
	public void open(){
		System.out.println("Open PDF");
	}
	
	public void save(String filename){
		System.out.println("Saving PDF " + filename);
	}
	
	public void close() { 
		System.out.println("Close PDF");
	}
}
