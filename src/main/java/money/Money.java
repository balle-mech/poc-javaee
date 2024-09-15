package money;

abstract class Money {
	// フィールド
	protected int amount;
	protected String currency;

	// コンストラクタ
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	// メソッドが同じになったので、親クラスに移動
	String currency() {
		return currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && this.getClass().equals(money.getClass());
	}

	// Factory Method
	// テストコードの変更箇所を減らすため、DollarとFrancのインスタンス生成を行う
	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

}
