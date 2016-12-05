package by.vorokhobko;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * TriangleTest.
 *
 * Class TriangleTest for testing class Triangle.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 05.12.2016.
 * @version 1.
 */

public class TriangleTest {
	  /**
	  * @Test.
	  * Point test.
	  */
	public void determineTheAreaOfTheTriangle() {
		final double x = 2;
		final double y = 5;
		final double totalArea = 34.971;
		final double numberExeption = 0.01;
		final Point pointA = new Point(x, y);
		final Point pointB = new Point(x + y, y + y);
		final Point pointC = new Point(x * y, y * y);
		final Triangle triangleABC = new Triangle(pointA, pointB, pointC);
		double resultArea = triangleABC.area();
		assertThat(resultArea, is(closeTo(totalArea, numberExeption)));
		}
	}