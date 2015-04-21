package diseno.factorymethod.concrete;

import java.util.List;

public abstract class Application {
	
	List<Document> docs;
	
	public void newDocument(String type){
		Document doc = createDocument(type);
		docs.add(doc);
		doc.open();
	}
	
	public void openDocument(String fileName){ 
		
	}

	protected abstract Document createDocument(String type);
}
