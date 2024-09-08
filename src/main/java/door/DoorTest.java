package door;

import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoorTest {
	Door door;
	private ByteArrayOutputStream baos;

	// 前処理
	@Before
	public void setUp() {
		door = new Door();

		baos = new ByteArrayOutputStream();
		System.setOut(
				new PrintStream(
						new BufferedOutputStream(baos)
						)
				);
	}

    // 「@Test」は、JUnitがテストメソッドと認識するためのアノテーション
    // public voidで作成すること
	@Test
	public void failWord() {
		door.open("ドア、開いてください");

		System.out.flush();
		String expected = "違います。\n";
		String actual = baos.toString();

		assertEquals(false, door.isOpen());
		assertEquals(expected, actual);
	}

	@Test
	public void successfulOpen() {
		door.open("開けゴマ！");
		assertEquals(true, door.isOpen());
	}

	@Test
	public void closeDoor() {
		door.close();
		assertEquals(false, door.isOpen());
	}

	@After
	public void fin() {

	}

}
