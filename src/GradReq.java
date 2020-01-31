import java.util.List;
import java.util.Map;
/**This class is to check how many units are left until Graduation, what Areas are done
 * and the total units needed.*/
public class GradReq {
    /**TODO: Create instance variables*/
    String major = "";
    Map<List<String>, Boolean> currentStatus; //This is the map to check if the user has completed the area
    double requiredUniversityDegreeUnits = 0.0;
    double requiredTotalUnits = 0.0;
    /**TODO: Create constructor*/
    public GradReq(String myMajor, double myReqUDUnits, double myreqTUnits, Map<List<String>, Boolean> myStatus)
    {
        major = myMajor;
        requiredUniversityDegreeUnits = myReqUDUnits;
        requiredTotalUnits = myreqTUnits;
        currentStatus = myStatus;
    }
    /**TODO:Create setter methods*/
    public void setCurrentStatus()
    {

    }
}
