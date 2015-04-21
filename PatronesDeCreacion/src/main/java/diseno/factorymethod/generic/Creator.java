package diseno.factorymethod.generic;

public abstract class Creator {
	
	public void anOperation() {
		factoryMethod();
	}

	protected abstract Product factoryMethod();
}
