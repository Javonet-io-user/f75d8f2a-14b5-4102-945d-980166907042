package BCE.Messaging;

public enum CoverPage {
  None(0L),
  Confident(1L),
  Fyi(2L),
  Generic(3L),
  Urgent(4L),
  ;
  private long numVal;

  CoverPage(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
