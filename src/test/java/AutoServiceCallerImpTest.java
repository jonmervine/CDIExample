import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.inject.Inject;

/**
 * Created by mervinej on 4/12/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class AutoServiceCallerImpTest {

    @InjectMocks
    private AutoServiceCallerImp autoServiceAllerImp;

    @Test
    public void mytest() {
        autoServiceAllerImp.callAutoService();
    }


}