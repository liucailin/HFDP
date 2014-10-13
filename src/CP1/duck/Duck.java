package CP1.duck;

import CP1.FlyBehavior;
import CP1.QuackBehavior;

public abstract class Duck {

	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;

	public void swim() {

	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public abstract void display();

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
