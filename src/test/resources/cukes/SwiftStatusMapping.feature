Feature: Match Status Derivation from Swift Field 25D

The 25D Status field within the Swift MT548 or MT537 message is mapped to a generalised Match Status to be displayed to users.

Match Status Meanings

| Match Status | Description |
| ------------ | ----------- |
|              | No 25D status has been received for this settlement instruction |
| Acknowledged | The settlement instruction has been acknowledged by the swift network |
| Unmatched    | The settlement instruction is unmatched at the custodian |
| Matched      | The settlement instruction is matched at the custodian |
| Rejected     | The settlement instruction has been rejected |
| Market Cancellation | The settlement instruction has been cancelled at the custodian |


  Scenario Outline: Match Status is derived from the Swift 25D Status

    Given a swift message containing a 25D status of <Swift Status>
    When this is mapped to the Match Status
    Then the Match Status is <Match Status>

    Examples:

      | Swift Status | Match Status |
      | CALL//CACK |Acknowledged |
      | CALL//DEND |Unmatched |
      | CPRC//CAND |Market Cancellation |
      | CPRC//PACK |Market Cancellation |
      | INMH//MACH |Matched |
      | INMH//NMAT |Unmatched |
      | IPRC//CAND |Market Cancellation |
      | IPRC//CGEN |Acknowledged |
      | IPRC//PACK |Acknowledged |
      | IPRC//PPRC |Acknowledged |
      | IPRC//REJT |Rejected |
      | IPRC//REPR |Acknowledged |
      | MTCH//MACH |Matched |
      | MTCH//NMAT |Unmatched |
      | SETT//PEND |Acknowledged |
      | SETT//PENF |Acknowledged |
      | SPRC//REJT |Rejected |
      | TPRC//REJT |Rejected |