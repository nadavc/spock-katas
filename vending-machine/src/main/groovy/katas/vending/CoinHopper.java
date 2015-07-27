package katas.vending;

public interface CoinHopper {

  /**
   * Dispenses `n` of a coin.
   *
   * @throws IllegalStateException if there are fewer than `n` of `coin`.
   */
  void dispense(Coin coin, int n);

  /**
   * @return the number of coins of type `coin` currently held.
   */
  int count(Coin coin);

  /**
   * Dispenses a product if it is currently in stock.
   *
   * @throws IllegalStateException if the current stock of `product` is zero.
   */
  void dispense(Product product);

  /**
   * @return the number of `product` currently in stock.
   */
  int stock(Product product);
}
