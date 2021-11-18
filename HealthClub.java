package Abstraction;

public  class HealthClub implements Gym, Swim, Yoga {

    @Override
    public void Ladies(){
        System.out.println(" only ladies");
    }
    @Override
    public void Kids(){
        System.out.println("Kids love splashing");
    }
    @Override
    public void GentsOnly(){
        System.out.println(" Body Building");
    }
    @Override
    public void SinorCitizen(){
        System.out.println("Yoga Keeps fit");
    }
    @Override
    public void SpecialNeeds(){
        System.out.println("Everybody is welcome in our Health Club");
    }
    public void NoParkingAtSite(){
        System.out.println("No Parking");
    }

    @Override
    public void ladies() {

    }

    @Override
    public void kids() {

    }

    @Override
    public void Sinorcitizen() {

    }

    @Override
    public void Specialneeds() {

    }
}
