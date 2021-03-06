package by.vorokhobko.tracker.encapsulation.models;

/**
 * Task.
 *
 * Class Task to create a new object part 002, lesson 3.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 24.02.2017.
 * @version 1.
 */
public class Task extends Item {
	/**
	* Create constructor.
	* Add Task.
	 * @param name - name.
     * @param desc - desc.
	 * @param create - create.
	 */
	public Task(String name, String desc, long create) {
		super(name, desc, create);
	}
	/**
	* Create the method to calculate the value.
	* @return tag.
	*/
	public String calculatePrice() {
		return "100%";
	}
}