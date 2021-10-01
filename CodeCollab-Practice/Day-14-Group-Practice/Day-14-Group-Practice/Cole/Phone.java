package Cole;

public class Phone extends Electronic implements Charged{

    @Override
    public void isTurnedOn(boolean isIt){
        if(isIt){
            System.out.println("Phone is tuned on");
        }else{
            System.out.println("Phone is turned off");
        }
    }

    @Override
    public void isCharged(boolean isIt){
        if(isIt){
            System.out.println("Phone is fully charged");
        }else{
            System.out.println("Phone is not fully charged");
        }
    }

}