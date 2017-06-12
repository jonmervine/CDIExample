import javax.inject.Named;

/**
 * Created by mervinej on 4/12/2017.
 */
@Named("bmwAutoService")
public class BMWAutoService implements AutoService {
    @Override
    public void getService() {
        System.out.println("you chose BMW auto service");
    }
}
