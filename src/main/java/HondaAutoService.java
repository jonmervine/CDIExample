import javax.inject.Named;

/**
 * Created by mervinej on 4/12/2017.
 */
@Named("hondaAutoService")
public class HondaAutoService implements AutoService {

    @Override
    public void getService() {
        System.out.println("You chose Honda auto service");
    }
}
