package Week10;

public class Animal {

    public void sleep(int hours){
        System.out.println("zzzzz"+hours);
    }

    @Deprecated
    public void sleep2hours(){
        System.out.println("zzzzz"+2 + " hours");
    }
}
