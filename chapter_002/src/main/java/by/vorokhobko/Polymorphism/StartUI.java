package by.vorokhobko.Polymorphism;

import by.vorokhobko.Encapsulation.start.Tracker;
import by.vorokhobko.Encapsulation.models.Task;
/**
 * StartUI.
 *
 * Class StartUI the entry point to the program part 002, lesson 5.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 20.03.2017.
 * @version 1.
 */

public class StartUI {
	/**
     * The class field.
	 * Сreating input.
	 */
	private Input input;
	/**
	* Сreate the class constructor StartUI.
	* @param input - input.
	*/
	public StartUI(Input input) {
		this.input = input;
	}
	/**
	* The method adds a request to the array.
	* @param tracker - tracker.
	*/
	public void addItem(Tracker tracker) {
		String name = input.ask("please, enter the task's name: ");
		String desc = input.ask("please, enter the task's description: ");
		String create = input.ask("please, enter the task's time: ");
		tracker.add(new Task(name, desc, Long.parseLong(create)));
	}
	/**
	* The method searches all cells.
	* @param tracker - tracker.
	*/
	public void findAllItem(Tracker tracker) {
		String name1 = input.ask("please, enter the task's name: ");
		String desc1 = input.ask("please, enter the task's description: ");
		String create1 = input.ask("please, enter the task's time: ");
		tracker.add(new Task(name1, desc1, Long.parseLong(create1)));
		String name2 = input.ask("please, enter the task's name: ");
		String desc2 = input.ask("please, enter the task's description: ");
		String create2 = input.ask("please, enter the task's time: ");
		tracker.add(new Task(name2, desc2, Long.parseLong(create2)));
		tracker.findAll();
	}
	/**
	* The method needs to replace the cell in the array.
	* @param tracker - tracker.
	*/
	public void editItem(Tracker tracker) {
		String name = input.ask("please, enter the task's name: ");
		String desc = input.ask("please, enter the task's description: ");
		String create = input.ask("please, enter the task's time: ");
		Task task = new Task(name, desc, Long.parseLong(create));
		tracker.add(task);
		tracker.update(task);
	}
	/**
	* The method should delete the cells in the array.
	* @param tracker - tracker.
	*/
	public void deleteItem(Tracker tracker) {
		String name = input.ask("please, enter the task's name: ");
		String desc = input.ask("please, enter the task's description: ");
		String create = input.ask("please, enter the task's time: ");
		Task task = new Task(name, desc, Long.parseLong(create));
		tracker.add(task);
		tracker.delete(task);
	}
	/**
	* The method finds similar cells in the Id.
	* @param tracker - tracker.
	*/
	public void findItemById(Tracker tracker) {
		String name = input.ask("please, enter the task's name: ");
		String desc = input.ask("please, enter the task's description: ");
		String create = input.ask("please, enter the task's time: ");
		Task task = new Task(name, desc, Long.parseLong(create));
		tracker.add(task);
		String id = input.ask("please, enter the task's id: ");
		tracker.findById(id);
		if (tracker.findById(id) != null) {
			System.out.print(tracker.findById(id));
		} else {
			System.out.println("This ID does not exist");
		}
	}
	/**
	 * The method finds similar cells in the Name.
	 * @param tracker - tracker.
	 */
	public void findItemsByName(Tracker tracker) {
		String name = input.ask("please, enter the task's name: ");
		String desc = input.ask("please, enter the task's description: ");
		String create = input.ask("please, enter the task's time: ");
		Task task = new Task(name, desc, Long.parseLong(create));
		tracker.add(task);
		tracker.findByName(name);
		if (tracker.findByName(name) != null) {
			System.out.print(tracker.findByName(name));
		} else {
			System.out.println("This Name does not exist");
		}
	}
	/**
	 * The method exit this program.
	 * @param tracker - tracker.
	 */
	public void exitProgram(Tracker tracker) {
		int exitNumber = 7;
		String answer = "n";
		do {
			if (exitNumber == 7) {
				answer = input.ask("You are sure?\n y/n: ");
				if (answer.equals("y")) {
					break;
				} else {
					init(tracker);
				}
				break;
			}
		} while (answer.equals("n"));
	}

	/**
	* The main method of the program, menu.
	* @param tracker - tracker.
	*/
	public void init(Tracker tracker) {
		String result = input.ask("please select one of the items:\n 1 - Add new Item\n "
		+ "2 - Show all items\n 3 - Edit item\n 4 - Delete item\n 5 - Find item by Id\n"
		+ " 6 - Find items by name\n 7 - Exit Program\n");
		if (result.equals("1")) {
			new StartUI(input).addItem(tracker);
		}
		if (result.equals("2")) {
			new StartUI(input).findAllItem(tracker);
		}
		if (result.equals("3")) {
			new StartUI(input).editItem(tracker);
		}
		if (result.equals("4")) {
			new StartUI(input).deleteItem(tracker);
		}
		if (result.equals("5")) {
			new StartUI(input).findItemById(tracker);
		}
		if (result.equals("6")) {
			new StartUI(input).findItemsByName(tracker);
		}
		if (result.equals("7")) {
			new StartUI(input).exitProgram(tracker);
		}
	}
	/**
	* Method run the program.
	* @param args - args.
	*/
	public static void main(String[] args) {
		Tracker tracker = new Tracker();
		Input input = new ConsoleInput();
		new StartUI(input).init(tracker);
	}
}