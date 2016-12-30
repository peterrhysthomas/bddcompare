package concordion;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import swift.SwiftStatusMapper;

@RunWith(ConcordionRunner.class)
public class SwiftMatchStatusMappingFixture {

    public static String mapSwiftStatus(String swiftStatus) {
        return SwiftStatusMapper.map(swiftStatus.trim());
    }
}

