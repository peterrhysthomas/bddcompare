package swift;

import java.util.HashMap;
import java.util.Map;

public class SwiftStatusMapper {
    public static String map(String swiftStatus) {
        Map<String, String> mappings = new HashMap<String, String>();
        mappings.put("CALL//CACK","Acknowledged");
        mappings.put("CALL//DEND","Unmatched");
        mappings.put("CPRC//CAND","Market Cancellation");
        mappings.put("CPRC//PACK","Market Cancellation");
        mappings.put("INMH//MACH","Matched");
        mappings.put("INMH//NMAT","Unmatched");
        mappings.put("IPRC//CAND","Market Cancellation");
        mappings.put("IPRC//CGEN","Acknowledged");
        mappings.put("IPRC//PACK","Acknowledged");
        mappings.put("IPRC//PPRC","Acknowledged");
        mappings.put("IPRC//REJT","Rejected");
        mappings.put("IPRC//REPR","Acknowledged");
        mappings.put("MTCH//MACH","Matched");
        mappings.put("MTCH//NMAT","Unmatched");
        mappings.put("SETT//PEND","Acknowledged");
        mappings.put("SETT//PENF","Acknowledged");
        mappings.put("SPRC//REJT","Rejected");
        mappings.put("TPRC//REJT","Rejected");

        return mappings.containsKey(swiftStatus)? mappings.get(swiftStatus) : "Unknown" ;
    }
}
