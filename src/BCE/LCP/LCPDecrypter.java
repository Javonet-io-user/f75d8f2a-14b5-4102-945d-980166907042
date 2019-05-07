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

public class LCPDecrypter {
  protected NObject javonetHandle;

  public LCPDecrypter() {
    try {
      javonetHandle = Javonet.New("BCE.LCP.LCPDecrypter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LCPDecrypter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static LCPModule Decrypt(java.lang.String identity, java.lang.String regCode) {
    try {
      Object res = Javonet.getType("BCE.LCP.LCPDecrypter").invoke("Decrypt", identity, regCode);
      if (res == null) return null;
      return new LCPModule((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DigitalSign(java.lang.String plainText) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.LCP.LCPDecrypter").invoke("DigitalSign", plainText);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateNewLCPIdentity(
      java.lang.String companyName, java.lang.String address1) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.LCP.LCPDecrypter")
              .invoke("CreateNewLCPIdentity", companyName, address1);
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
