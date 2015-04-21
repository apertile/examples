package diseno.factorymethod.concrete;



public class Client {
	public static void main(String[] args) {
		// create an HTML document
		Document html = new HtmlDocument();
		html.open();
		html.close();

		Document pdf = new PdfDocument();
		pdf.open();
		pdf.close();
	}
}
