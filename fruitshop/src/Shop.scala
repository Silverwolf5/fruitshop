
/**
 * Main runnable object.
 */
object Shop
{
  
  // Main.
  def main(args: Array[String]): Unit = {
    
    // Example array.
    var basket = Array("apples", "oranges", "apples", "oranges")
    
    // Validation constant.
    val reqVal = new ReqValidation()
    
    // Validate the request.
    if( reqVal.validate(basket) )
    {
      println("Valid request!")
      
      // Return the total price.
      val price = new Price()
    
      //
      println("Total price of the basket: " + price.getTotalPrice(basket) + "£")
    }
    else
      println("Invalid request. Please check if products exist.")
    }
  
}