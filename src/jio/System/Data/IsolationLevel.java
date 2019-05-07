package jio.System.Data;

public enum IsolationLevel {
  Chaos(16L),
  ReadUncommitted(256L),
  ReadCommitted(4096L),
  RepeatableRead(65536L),
  Serializable(1048576L),
  Snapshot(16777216L),
  Unspecified(-1L),
  ;
  private long numVal;

  IsolationLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
