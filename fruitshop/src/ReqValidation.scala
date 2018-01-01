
/**
 * Class to validate the request.
 * 
 * Assumptions: It receives an array of strings with only apples and oranges. All other values or datatypes are ignored
 * and generate invalid request message.
 */
class ReqValidation
{
  
  // Validate the request. True if all apples and oranges. Otherwise returns false.
  def validate(request: Array[String]): Boolean = {
    for (fruit <- request)
    {
    	if( !fruit.equalsIgnoreCase("apples") && !fruit.equalsIgnoreCase("oranges") )
    	{
        return false
    	}
    }
    
    return true
  }
  
}