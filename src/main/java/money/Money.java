package money;

class Money {
	// フィールド
	protected int amount;
	protected String currency;

	// コンストラクタ
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	// メソッド
	// abstract Money times(int multiplier);
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	// メソッドが同じになったので、親クラスに移動
	String currency() {
		return currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object; // キャスト
		return this.amount == money.amount &&	currency().equals(money.currency());
	}

	public String toString() {
		return amount + " " + currency;
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
