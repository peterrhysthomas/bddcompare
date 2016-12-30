package fitnesse;

import fit.ColumnFixture;
import swift.SwiftStatusMapper;

public class SwiftStatusMapperFixture {
    String swiftStatus = "";

    public SwiftStatusMapperFixture() {

    }

    public void setSwiftStatus(String status){
        this.swiftStatus = status;
    }

    public String matchStatus(){
        return SwiftStatusMapper.map(this.swiftStatus);
    }
}
