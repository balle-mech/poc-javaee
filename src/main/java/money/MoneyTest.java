package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void 掛け算() {
		// 前準備
		Dollar five = new Dollar(5);
		// 実行
		five.times(2);
		// 検証
		assertEquals(10, five.amount);
	}

}
