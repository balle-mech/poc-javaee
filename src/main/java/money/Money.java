package money;

abstract public class Money {
	protected int amount;
	abstract Money times(int multiplier);
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && this.getClass().equals(money.getClass());
	}

	// Factory Method
	// 通貨の種類に依存しないため、Moneyクラスに実装
	static Money dollar(int amount) {
		return new Dollar(amount);
	}

	static Money franc(int amount) {
		return new Franc(amount);
	}

}
