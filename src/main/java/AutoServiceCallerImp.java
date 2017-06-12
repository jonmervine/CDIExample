import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by mervinej on 4/12/2017.
 */
public class AutoServiceCallerImp implements AutoServiceCaller {

    @Inject
    @Named("bmwAutoService")
    private AutoService bmwAutoService;

    @Inject
    @Named("hondaAutoService")
    private AutoService hondaAutoService;

    @Inject
    @Named("fordAutoService")
    private AutoService fordAutoService;


    @Override
    public void callAutoService() {
        bmwAutoService.getService();

        fordAutoService.getService();

        hondaAutoService.getService();

    }
}
