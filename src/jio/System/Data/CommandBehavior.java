package jio.System.Data;

public enum CommandBehavior {
  Default(0L),
  SingleResult(1L),
  SchemaOnly(2L),
  KeyInfo(4L),
  SingleRow(8L),
  SequentialAccess(16L),
  CloseConnection(32L),
  ;
  private long numVal;

  CommandBehavior(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
