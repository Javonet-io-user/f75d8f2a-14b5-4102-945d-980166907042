package BCE.LCP;

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
import BCE.LCP.*;

public class CustomizedModuleHelper {
  protected NObject javonetHandle;

  public CustomizedModuleHelper() {
    try {
      javonetHandle = Javonet.New("BCE.LCP.CustomizedModuleHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CustomizedModuleHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateCustomizedCode(
      java.lang.String key, java.lang.String companyName, java.lang.String address1) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.LCP.CustomizedModuleHelper")
              .invoke("CreateCustomizedCode", key, companyName, address1);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateCustomizedCodeFromDongleSerialNumber(
      java.lang.String key, java.lang.Byte[] dongleSerialNumber) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.LCP.CustomizedModuleHelper")
              .invoke(
                  "CreateCustomizedCodeFromDongleSerialNumber",
                  key,
                  new Object[] {dongleSerialNumber});
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
