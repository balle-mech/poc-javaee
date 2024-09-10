package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void ドル通貨の掛け算() {
		// 前準備
		Dollar five = new Dollar(5);
		// 実行 & 検証
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	void 通貨の値が等しければTureを返す() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

	@Test
	void Franc通貨の掛け算() {
		// 前準備
		Franc five = new Franc(5);
		// 実行 & 検証
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}

}
