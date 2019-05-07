package BCE.Data;

public enum DBSettingConstructorType {
  ByConnectionString(0L),
  BySQLAuthentication(1L),
  ByWindowsIntegratedSecurity(2L),
  ;
  private long numVal;

  DBSettingConstructorType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
