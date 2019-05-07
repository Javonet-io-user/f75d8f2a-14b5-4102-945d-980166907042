package BCE.Misc;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import BCE.Misc.*;

public class CreditCardHelper {
  protected NObject javonetHandle;

  public CreditCardHelper() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.CreditCardHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CreditCardHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsValidCreditCardNo(java.lang.String cardNo) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Misc.CreditCardHelper").invoke("IsValidCreditCardNo", cardNo);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static CreditCardHelper.CreditCardType GetCreditCardType(java.lang.String cardNo) {
    try {
      Object res = Javonet.getType("BCE.Misc.CreditCardHelper").invoke("GetCreditCardType", cardNo);
      if (res == null) return null;
      return CreditCardHelper.CreditCardType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public enum CreditCardType {
    Unknown(0L),
    AmericanExpress(1L),
    DinersClub(2L),
    CarteBlanche(3L),
    Discover(4L),
    EnRoute(5L),
    JCB(6L),
    MasterCard(7L),
    Visa(8L),
    ;
    private long numVal;

    CreditCardType(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
