import CP3.DarkRose;
import CP3.Mocha;


public class StarBuzzCoffe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DarkRose darkRose = new DarkRose();
		System.out.println(darkRose.getDescription() + " " + darkRose.cost());
		
		Mocha mocha = new Mocha(darkRose);
		mocha = new Mocha(mocha);
		
		System.out.println(mocha.getDescription() + " " + mocha.cost());

	}

}
