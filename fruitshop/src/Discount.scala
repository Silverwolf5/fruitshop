
/**
 * This class applies the discount for both apples and oranges.
 */
class Discount(basket: Array[String])
{
 
  // Total values of the discounts.
  def getTotalDiscounts(): Double = {
    
    // Total price of the basket with discounts.
    var total: Double = 0
    
    // Check if request contains apples.
    if(basket.contains("apple"))
      total += getDiscountApple()
    
    // Check if request contains oranges.
    if(basket.contains("orange"))
      total += getDiscountOrange()
    
    return total
    
  }
  
  // Get discount for apples.
  def getDiscountApple(): Double = {
    
    // Gets 2 apples by price of one. If just one apple, get half the price (Assumption).
    return basket.groupBy(identity).mapValues(_.size)("apple") * 0.3
    
  }
  
  // Get discount for oranges.
  def getDiscountOrange(): Double = {
    
    // Total brought oranges.
    val orangesNum: Int = basket.groupBy(identity).mapValues(_.size)("orange")
    
    // Check if the total number of oranges are divisible by 3.
    if( orangesNum % 3 == 0 )
    {
      // Divisible by 3.
      return (orangesNum / 3) * 0.50
    }
    else
      if(orangesNum == 2)
      {
        // Has only 2 oranges.
        return orangesNum * 0.25
      }
      else
      {
        // Has 1 or 4+ oranges.
        return ( ((orangesNum-1)/3) * 0.5) + 0.25
      }
    
  }
  
}