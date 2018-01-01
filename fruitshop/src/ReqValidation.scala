
/**
 * Class to validate the request.
 */
class ReqValidation
{
  
  // Validate the request. True if all apples and oranges. Otherwise returns false.
  def validate(request: Array[String]): Boolean = {
    for (fruit <- request)
    {
    	if( !fruit.equalsIgnoreCase("apple") && !fruit.equalsIgnoreCase("orange") )
    	{
        return false
    	}
    }
    
    return true
  }
  
}