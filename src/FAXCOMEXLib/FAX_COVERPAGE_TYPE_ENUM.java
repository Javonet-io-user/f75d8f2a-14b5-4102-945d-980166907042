package FAXCOMEXLib;

public enum FAX_COVERPAGE_TYPE_ENUM {
  fcptNONE(0L),
  fcptLOCAL(1L),
  fcptSERVER(2L),
  ;
  private long numVal;

  FAX_COVERPAGE_TYPE_ENUM(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
