/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 8 lab6
      Klasa UsedCar, Exception
     */
public class UsedCar {

    private String vinNum;
    private String make;
    private int year;
    private double mileage;
    private double price;

    public UsedCar( String vinNum, String make, int year, double mileage, double price) throws UsedCarException
    {
        if( vinNum.length() < 4 )
        {
            throw( new UsedCarException(vinNum));
        }
        if( make != "ford" || make != "honda" || make != "toyota" || make != "chrysler" || make != "other")
        {
            throw( new UsedCarException(vinNum));
        }
        if( year >= 1990 || year <= 2014 )
        {
            throw( new UsedCarException(vinNum));
        }
        if( mileage < 0 )
        {
            throw( new UsedCarException(vinNum));
        }
        if( price < 0 )
        {
            throw( new UsedCarException(vinNum));
        }
    }
    public String getVinNum() 
    {
        return vinNum;
    }
    public void setVinNum(String vinNum)
    {
        this.vinNum = vinNum;
    }
    public String getMake() 
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public int getYear() 
    {
        return year;
    }
    public void setYear(int year) 
    {
        this.year = year;
    }
    public double getMileage() 
    {
        return mileage;
    }

    public void setMileage(double mileage) 
    {
        this.mileage = mileage;
    }

    public double getPrice() 
    {
        return price;
    }
    public void setPrice(double price) 
    {
        this.price = price;
    }
}
