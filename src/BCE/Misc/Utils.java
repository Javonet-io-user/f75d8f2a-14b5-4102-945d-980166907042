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

public class Utils {
  protected NObject javonetHandle;

  public Utils() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.Utils");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Utils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String BooleanToReadableText(
      java.lang.String caption, java.lang.Boolean option) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.Utils").invoke("BooleanToReadableText", caption, option);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String NumberToMonth(java.lang.Integer month) {
    try {
      java.lang.String res = Javonet.getType("BCE.Misc.Utils").invoke("NumberToMonth", month);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertCompanyNameRemarkToFilename(
      java.lang.String companyName, java.lang.String remark) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.Utils")
              .invoke("ConvertCompanyNameRemarkToFilename", companyName, remark);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
