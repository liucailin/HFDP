import CP7.Duck;
import CP7.MallardDuck;
import CP7.Turkey;
import CP7.TurkeyAdapter;
import CP7.WildTurkey;

public class DuckTestDriver {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();

		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

		testDuck(duck);
		testDuck(turkeyAdapter);
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();

	}
}
