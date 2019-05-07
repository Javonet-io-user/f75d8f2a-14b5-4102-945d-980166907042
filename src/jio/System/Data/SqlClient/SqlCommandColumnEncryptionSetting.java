package jio.System.Data.SqlClient;

public enum SqlCommandColumnEncryptionSetting {
  UseConnectionSetting(0L),
  Enabled(1L),
  ResultSetOnly(2L),
  Disabled(3L),
  ;
  private long numVal;

  SqlCommandColumnEncryptionSetting(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
