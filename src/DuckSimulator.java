import CP1.FlyWithRocket;
import CP1.duck.Duck;
import CP1.duck.MallardDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlyWithRocket());
		duck.performFly();

	}

}
