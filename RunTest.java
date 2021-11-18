package Abstraction;

public class RunTest {
    public static void main (String[] args){
        HealthClub hc = new HealthClub();
        hc.GentsOnly();
        hc.Kids();
        hc.Ladies();
        hc.SinorCitizen();
        hc.SpecialNeeds();
        hc.NoParkingAtSite();
    }
}
