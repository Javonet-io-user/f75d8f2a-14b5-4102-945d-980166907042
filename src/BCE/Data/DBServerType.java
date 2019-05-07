package BCE.Data;

public enum DBServerType {
  SQL2000(0L),
  Firebird(1L),
  ;
  private long numVal;

  DBServerType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
