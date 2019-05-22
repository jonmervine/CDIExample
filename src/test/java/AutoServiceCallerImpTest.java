import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by mervinej on 4/12/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class AutoServiceCallerImpTest {

    @Mock
    private AutoService bmwAutoService;

    @Mock
    private AutoService fordAutoService;

    @Mock
    private AutoService hondaAutoService;

    @InjectMocks
    private AutoServiceCallerImp autoServiceAllerImp;

    @Test
    public void mytest() {
        autoServiceAllerImp.callAutoService();
    }


}