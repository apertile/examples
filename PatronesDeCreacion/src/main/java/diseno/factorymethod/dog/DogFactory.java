package diseno.factorymethod.dog;

import diseno.factorymethod.dog.concretedog.Poodle;
import diseno.factorymethod.dog.concretedog.Rottweiler;
import diseno.factorymethod.dog.concretedog.SiberianHusky;

class DogFactory {

	public static Dog getDog(String criteria) {
		if (criteria.equals("small"))
			return new Poodle();
		else if (criteria.equals("big"))
			return new Rottweiler();
		else if (criteria.equals("working"))
			return new SiberianHusky();

		return null;
	}
}