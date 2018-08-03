//Class with main function
package Interface2;

public class Demo {
//Taking reference as parameter
	static void perform(Game a) {
		a.play();
	}

	public static void main(String[] args) {

		Cricket cricket = new Cricket();		//object creation
		perform(cricket);						//passing reference to perform function
		Football football = new Football();
		perform(football);
		Tennis tennis = new Tennis();
		perform(tennis);

	}

}
