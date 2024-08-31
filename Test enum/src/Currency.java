public enum Currency{
    HKD("Hong Kong Dollar.", 1), 
    USD("USD Dollar.", 2), 
    JPY("YEN Dollar.", 3),
    ;

// instance variable
private final String description;
private final int DBValue;

private Currency(String description, int DBValue) {
  this.description = description;
  this.DBValue = DBValue;
}
// Getter

public String getDescription() {
    return this.description;
}

public int getDBValue() {
    return this.DBValue;
}

public static int get(Currency currency) {
    return currency.getDBValue();
  }
  

// 2-> USD,3 -> JPY

  



  public static void main(String[] args) {
    // Currency currency = "HKD";
    // Currency currency = Currence = "HKD";  <= not
Currency currency = Currency.HKD;
    if (currency == Currency.USD) {
    System.out.println("it is " + currency.getDescription());
    } else if (currency == Currency.HKD) {
          System.out.println("it is " + currency.getDescription());
        }  else if (currency == Currency.JPY) {
          System.out.println("it is " + currency.getDescription());
          }












}
}