package CP9;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

	ArrayList<MenuComponent> componentList = new ArrayList<MenuComponent>();
	String name;
	String description;
	Iterator<MenuComponent> iterator;

	/**
	 * @param name
	 * @param description
	 */
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	};

	public String getDescription() {
		return description;
	};

	public void addComponent(MenuComponent menuComponent) {
		componentList.add(menuComponent);
	};

	public void removeComponent(MenuComponent menuComponent) {
		componentList.remove(menuComponent);
	};

	public MenuComponent getChild(int childIndex) {
		return componentList.get(childIndex);
	};

	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		java.util.Iterator<MenuComponent> iterator = componentList.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}

	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(componentList.iterator());
		}
		return iterator;
	};

}
