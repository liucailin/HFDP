package CP1.duck;

import CP1.FlyWithWings;
import CP1.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("i am a mallard duck");

	}

}
