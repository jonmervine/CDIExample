/**
 * Created by mervinej on 4/12/2017.
 */

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args) {
        Weld weld = new Weld();
        final WeldContainer container = weld.initialize();
        final AutoServiceCallerImp pojo = container.instance().select(AutoServiceCallerImp.class).get();
        pojo.callAutoService();
    }
}
