package jio.System.Data;

public enum ParameterDirection {
  Input(1L),
  Output(2L),
  InputOutput(3L),
  ReturnValue(6L),
  ;
  private long numVal;

  ParameterDirection(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
