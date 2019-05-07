package jio.System.Data;

public enum DataRowVersion {
  Original(256L),
  Current(512L),
  Proposed(1024L),
  Default(1536L),
  ;
  private long numVal;

  DataRowVersion(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
