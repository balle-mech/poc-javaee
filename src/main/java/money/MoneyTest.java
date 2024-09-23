package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void ドル通貨の掛け算() {
		// 前準備
		Money five = Money.dollar(5);
		// 実行 & 検証
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	void 通貨の値が等しければTureを返す() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	}

	@Test
	void ドルとFrancの価値が等しくない() {
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

	@Test
	public void currencyメソッドで通貨の種類を取得する() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

}
