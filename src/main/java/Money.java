public class Money  {
   protected int amount;
   private String currency();

    static Money dollar(int amount)  {
      return new Money(amount, "USD");
   }
    static Money franc(int amount) {
      return new Money(amount, "CHF");
    }

    Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
    }
    Money times(int multiplier){
        return nem Money( amount * multiplier, currency)
    }
    
    abstract String currency();


    public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && currency().equals(money.currency());
   }

    String currency() {
      return currency;
   }
}