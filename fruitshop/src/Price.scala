
/**
 * This class obtains the price for the products.
 */
class Price
{
  def getTotalPrice(basket: Array[String]): Double = {
    
    // Total value of the basket.
    var total: Double = 0
    
    // Calculate the total price.
    for (fruit <- basket)
    {
      if(fruit.equalsIgnoreCase("apples"))
        total += 0.6
      else
        total += 0.25
    }
    
    return total
    
  }
}