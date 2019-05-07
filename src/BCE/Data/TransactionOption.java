package BCE.Data;

public enum TransactionOption {
  Disabled(0L),
  Required(1L),
  Supported(2L),
  ;
  private long numVal;

  TransactionOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
