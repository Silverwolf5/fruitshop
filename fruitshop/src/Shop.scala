
/**
 * Main runnable object.
 * 
 * Assumptions: It receives an array of strings with only apples and oranges. All other values or datatypes are ignored
 * and generate invalid request message.
 * 
 * Assumptions for discounts: If the user buys just 1 apple, gets half the price on the apple.
 * If the user buys 4 oranges, get 3 for price of 2 and 1 at full price.
 */
object Shop
{
  
  // Main.
  def main(args: Array[String]): Unit = {
    
    // Example array.
    var basket = Array("apple", "orange", "apple", "orange", "orange", "orange")
    
    // Validation constant.
    val reqVal = new ReqValidation()
    
    // Validate the request.
    if( reqVal.validate(basket) )
    {
      println("Valid request!")
      
      // Return the total price.
      val price = new Price()
    
      // Print the total price of the basket in the console.
      println("Total price of the basket: " + price.getTotalPrice(basket) + "£")
    }
    else
      println("Invalid request. Please check if products exist.")
    }
  
}