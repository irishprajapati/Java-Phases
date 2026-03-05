package Enum;
enum Package{
    FREE(getYearlyPrice, canAddUsers, canAddUsers),
    BASIC(getYearlyPrice, canAddUsers, canAddUsers),
    PRO(getYearlyPrice, canAddUsers, canAddUsers),
    ENTERPRISE(getYearlyPrice, canAddUsers, canAddUsers);
    private double getYearlyPrice;
    private boolean canAddUsers;
    private boolean hasPrioritySupport;
    Package(double getYearlyPrice, boolean canAddUsers, boolean hasPrioritySupport){
        this.getYearlyPrice = getYearlyPrice;
        this.canAddUsers = canAddUsers;
        this.hasPrioritySupport = hasPrioritySupport;
    }
}
public class Subscription {
    
}
