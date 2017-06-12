import javax.inject.Named;

/**
 * Created by mervinej on 4/12/2017.
 */
@Named("fordAutoService")
public class FordAutoService implements AutoService {

    @Override
    public void getService() {
        System.out.println("You chose Ford auto service");
    }
}
