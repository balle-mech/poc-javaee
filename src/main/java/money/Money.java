package money;
class Money implements Expression {
	// フィールド
	protected int amount;
	protected String currency;

	// コンストラクタ
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money() {
	}

	// メソッド
	Expression plus(Money addMoney) {
		return new Money(addMoney.amount + amount, currency);
	}

	// abstract Money times(int multiplier);
	public Money times(int multiplier) {
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
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}


}
