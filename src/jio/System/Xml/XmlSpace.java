package jio.System.Xml;

public enum XmlSpace {
  None(0L),
  Default(1L),
  Preserve(2L),
  ;
  private long numVal;

  XmlSpace(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
