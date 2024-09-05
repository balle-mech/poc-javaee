package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("FizzBuzz 数列と変換規則を扱う FizzBuzz クラス")
class FizzBuzzTest {
	private FizzBuzz fizzbuzz;

	@BeforeEach
	void 前準備() {
		fizzbuzz = new FizzBuzz();
	}

	@Nested
	class convertメソッドは数を文字列に変換する {

		@Nested
		class _3の倍数のときには数の代わりにFizzに変換する {
			@Test
			void _3を渡すと文字列Fizzを返す() throws Exception {
				assertEquals("Fizz", fizzbuzz.convert(3));
			}
		}

		@Nested
		class _5の倍数のときには数の代わりにBuzzに変換する {
			@Test
			void _5を渡すと文字列Buzzを返す() throws Exception {
				assertEquals("Buzz", fizzbuzz.convert(5));
			}
		}

		@Nested
		class _その他の数のときはそのまま文字列に変換する {

			@Test
			void _1を渡すと文字列1を返す() throws Exception {
				assertEquals("1", fizzbuzz.convert(1));
			}

//			@Test
//			void _2を渡すと文字列2を返す() throws Exception {
//				assertEquals("2", fizzbuzz.convert(2));
//			}
		}

	}
}
