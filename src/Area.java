import java.util.List;

/**
 * This class is to list all of the necessary Areas required to graduate with a B.S at SJSU*/
public class Area {
    /**TODO: Make a instance variables*/
    private List<String> area;
    int index = 0;

    /**TODO: Constructor needs to include List*/
    /**@param myArea initializes the List in order to edit it*/
    public Area(List<String> myArea)
    {
        this.area = myArea;
    }

    /**TODO: Create setter method to collect areas*/
    /**@param a takes a String and adds it to list*/
    public void setArea(String a) //When method is called, will add string to List and increments index
    {
        area.add(index, a);
        index++;
    }

    /**TODO: Create getter method*/
    public String getArea()
    {
        return area.toString();
    }

}
