// Demonstration of "observer" pattern.

package observer;

import java.util.Observable;
import java.util.Observer;

public class Bee {
	private String name;
	
	private OpenObserver openObsrv = new OpenObserver();
	
	private CloseObserver closeObsrv = new CloseObserver();

	public Bee(String nm)  { name = nm; }

	// An inner class for observing openings:
	private class OpenObserver implements Observer{
		@Override
		public void update(Observable ob, Object a) {
			System.out.println("Bee " + name 
					+ "'s breakfast time!");
		}
	}

	private class CloseObserver implements Observer{
		public void update(Observable ob, Object a) {
			System.out.println("Bee " + name + "'s bed time!");
		}
	}

	public Observer openObserver() { 
		return openObsrv; 
	}
	public Observer closeObserver() { 
		return closeObsrv;
	}
}
