package diseno.factorymethod.concrete;

public class ConcreteCreator extends Application{

	public Document createDocument(String type){
		if (type.equals("html"))
			return new HtmlDocument();
		if (type.equals("pdf"))
			return new PdfDocument ();
		return null;
	}
}
