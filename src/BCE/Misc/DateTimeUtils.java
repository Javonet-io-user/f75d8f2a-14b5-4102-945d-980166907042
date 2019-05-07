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
import jio.System.*;

public class DateTimeUtils {
  protected NObject javonetHandle;

  public DateTimeUtils() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.DateTimeUtils");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ParseDate(java.lang.String str, DateTimeUtils.DateFormat dateFormat) {
    try {
      Object res =
          Javonet.getType("BCE.Misc.DateTimeUtils")
              .invoke("ParseDate", str, NEnum.fromJavaEnum(dateFormat));
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public enum DateFormat {
    DDMMYY(0L),
    MMDDYY(1L),
    YYMMDD(2L),
    DDYYMM(3L),
    MMYYDD(4L),
    YYDDMM(5L),
    ;
    private long numVal;

    DateFormat(long numVal) {
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
