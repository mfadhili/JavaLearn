public class FoodService
{
    // Data fields holding info of FoodService
    private String foodDescription;
    private double price;
    
    // Methods that sets the values for the datafields
    public void setFoodDescription(String service)
    {
        foodDescription = service;
        
    }
    
    public void setPrice(double pr)
    {
        price = pr;
    }
    
    //Methods for retrieving the field values
    public String getFoodDescription()
    {
        return foodDescription;
        
    }
    
    public double getPrice()
    {
        return price;
    }
}
