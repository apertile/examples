package diseno.factorymethod.concrete;

public class HtmlDocument implements Document {

	public void open() {
		System.out.println("Open HTML");

	}

	public void save(String filename) {
		System.out.println("Save HTML " + filename);

	}

	public void close() {
		System.out.println("Close HTML");

	}

}
