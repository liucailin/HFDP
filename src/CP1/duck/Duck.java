package CP1.duck;

import CP1.FlyBehavior;
import CP1.QuackBehavior;

public abstract class Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void swim() {

	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public abstract void display();

}
