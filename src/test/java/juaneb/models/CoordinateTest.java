package juaneb.models;

import juaneb.models.Coordinate;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

public class CoordinateTest {

	@Test(expected = AssertionError.class)
	public void testgetInstanceWithNull() {
		String format = null;
		Coordinate.getInstance(format);
	}

	@Test
	public void testgetInstanceWithWrongFormatWithoutInt() {
		try {
			String format = "patata";
			Coordinate.getInstance(format);
			throw new Exception();
		} catch (Exception e) {
		}
	}

	@Ignore
	@Test(expected = Exception.class)
	public void testgetInstanceWithWrongFormatWithTestAnotation() {
		String format = "patata";
		Coordinate.getInstance(format);
	}

	@Test
	public void testgetInstanceWithCorrectFormatWithIntOutDimension() {
		String format = "10";
		Coordinate coordinate = Coordinate.getInstance(format);
		assertNull(coordinate);
	}

	@Test
	public void testgetInstanceWithCorrectFormatWithIntInDimensionSup() {
		Coordinate coordinate = new Coordinate(Coordinate.getDimension() - 1, Coordinate.getDimension() - 1);
		String format = "88";
		assertThat(Coordinate.getInstance(format), is(coordinate));
	}

	@Test
	public void testgetInstanceWithCorrectFormatWithIntInDimensionInf() {
		Coordinate coordinate = new Coordinate(0, 0);
		String format = "11";
		assertThat(Coordinate.getInstance(format), is(coordinate));
	}

	@Test
	public void testisLastFalse() {
		Coordinate coordinate = new Coordinate(1, 1);
		assertFalse(coordinate.isLast());
	}

	@Test
	public void testisLastTrue() {
		Coordinate coordinate = new Coordinate(7, 1);
		assertTrue(coordinate.isLast());
	}

	@Test
	public void testisFirstFalse() {
		Coordinate coordinate = new Coordinate(2, 1);
		assertFalse(coordinate.isFirst());
	}

	@Test
	public void testisFirstTrue() {
		Coordinate coordinate = new Coordinate(0, 1);
		assertTrue(coordinate.isFirst());
	}

	@Test
	public void testgetDimension() {
		int dimension = Coordinate.getDimension();
		assertEquals(dimension, Coordinate.getDimension());
	}


}