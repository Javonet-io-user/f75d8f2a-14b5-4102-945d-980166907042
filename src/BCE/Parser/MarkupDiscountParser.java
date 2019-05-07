package BCE.Parser;

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
import BCE.Parser.*;

public class MarkupDiscountParser {
  protected NObject javonetHandle;

  public MarkupDiscountParser() {
    try {
      javonetHandle = Javonet.New("BCE.Parser.MarkupDiscountParser");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MarkupDiscountParser(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.math.BigDecimal CalcDiscount(
      java.math.BigDecimal amount, java.lang.String formula) {
    try {
      java.math.BigDecimal res =
          Javonet.getType("BCE.Parser.MarkupDiscountParser")
              .invoke("CalcDiscount", amount, formula);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.math.BigDecimal CalcMarkup(
      java.math.BigDecimal amount, java.lang.String formula) {
    try {
      java.math.BigDecimal res =
          Javonet.getType("BCE.Parser.MarkupDiscountParser").invoke("CalcMarkup", amount, formula);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
