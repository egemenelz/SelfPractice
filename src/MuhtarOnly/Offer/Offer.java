package MuhtarOnly.Offer;

public class Offer {
    public String location;
    public int salary;
    public String jobTitle;
    public boolean hasBenefit;
    public boolean WFH;
    public boolean PTO;
    public boolean isFullTime;


    public void setInfo(String offerLocation, int offerSalary, String offerJobTitle, boolean offerHasBenefit, boolean offerWFH, boolean offerPTO, boolean offerIsFullTime){
        location = offerLocation;
        salary = offerSalary;
        jobTitle = offerJobTitle;
        hasBenefit = offerHasBenefit;
        WFH = offerWFH;
        PTO = offerPTO;
        isFullTime = offerIsFullTime;
    }
    public void getInfo (){
        System.out.println(location+" "+salary+" "+jobTitle+" "+hasBenefit+" "+WFH+" "+PTO+" "+isFullTime);
    }


}
