package jio.System.Xml;

public enum XmlNamespaceScope {
  All(0L),
  ExcludeXml(1L),
  Local(2L),
  ;
  private long numVal;

  XmlNamespaceScope(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
