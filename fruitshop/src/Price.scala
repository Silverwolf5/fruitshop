
/**
 * This class obtains the price for the products.
 */
class Price
{
  def getTotalPrice(basket: Array[String]): Double = {
    
    // Get total price with discounts.
    var price = new Discount(basket)
    
    return price.getTotalDiscounts()
    
  }
}