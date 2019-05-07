package jio.System.Xml;

public enum XmlNodeType {
  None(0L),
  Element(1L),
  Attribute(2L),
  Text(3L),
  CDATA(4L),
  EntityReference(5L),
  Entity(6L),
  ProcessingInstruction(7L),
  Comment(8L),
  Document(9L),
  DocumentType(10L),
  DocumentFragment(11L),
  Notation(12L),
  Whitespace(13L),
  SignificantWhitespace(14L),
  EndElement(15L),
  EndEntity(16L),
  XmlDeclaration(17L),
  ;
  private long numVal;

  XmlNodeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
