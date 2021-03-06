package by.vorokhobko.exception;

import by.vorokhobko.encapsulation.start.Tracker;

/**
 * StartUI.
 *
 * Class StartUI the entry point to the program part 002, lesson 6.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 11.04.2017.
 * @version 1.
 */

public class StartUI {
	/**
     * The class field.
	 * Сreating input.
	 */
	private Input input;
	/**
	* The class constructor StartUI.
	* @param input - input.
	*/
	public StartUI(Input input) {
		this.input = input;
	}
	/**
	* The main method of the program, menu.
	* @param tracker - tracker.
	*/
	public void init(Tracker tracker) {
		MenuTracker menu = new MenuTracker(input, tracker);
		int[] ranges = menu.getRanges();
		menu.fillActions();
		do {
			menu.show();
			menu.select(input.ask("Select: ", ranges));
		} while (!"y".equals(this.input.ask("Exit? (y): ")));
	}
	/**
	* Method run the program.
	* @param args - args.
	*/
	public static void main(String[] args) {
		Tracker tracker = new Tracker();
		Input input = new ValidateInput();
		new StartUI(input).init(tracker);
	}
}