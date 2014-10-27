package CP8;

public abstract class AbstractClass {

	final void templateMethod() {
		primitiveOperaton1();
		primitiveOperation2();
		conreteOperation();
		hook();
	}

	abstract void primitiveOperaton1();

	abstract void primitiveOperation2();

	final void conreteOperation() {

	}

	void hook() {

	}

}
