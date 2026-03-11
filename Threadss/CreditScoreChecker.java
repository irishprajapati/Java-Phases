package Threadss;
public class CreditScoreChecker {
    private final String customerID;
    public CreditScoreChecker(String customerID){
        this.customerID = customerID;
    }
    @Override
    public Integer call() throws  Exception{
        return fetchCreditScoreFromBureau(customerID);

    }
}