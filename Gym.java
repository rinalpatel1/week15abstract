package Abstraction;

public interface Gym extends Swim {

    void Ladies();

    void Kids();

    public void GentsOnly();

    default void NoCash(){
        System.out.println("Health club no cash");
    }


    void SinorCitizen();

    void SpecialNeeds();
}

