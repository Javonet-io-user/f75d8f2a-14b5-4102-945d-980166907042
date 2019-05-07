package jio.System.Data;

public enum SqlDbType {
  BigInt(0L),
  Binary(1L),
  Bit(2L),
  Char(3L),
  DateTime(4L),
  Decimal(5L),
  Float(6L),
  Image(7L),
  Int(8L),
  Money(9L),
  NChar(10L),
  NText(11L),
  NVarChar(12L),
  Real(13L),
  UniqueIdentifier(14L),
  SmallDateTime(15L),
  SmallInt(16L),
  SmallMoney(17L),
  Text(18L),
  Timestamp(19L),
  TinyInt(20L),
  VarBinary(21L),
  VarChar(22L),
  Variant(23L),
  Xml(25L),
  Udt(29L),
  Structured(30L),
  Date(31L),
  Time(32L),
  DateTime2(33L),
  DateTimeOffset(34L),
  ;
  private long numVal;

  SqlDbType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
