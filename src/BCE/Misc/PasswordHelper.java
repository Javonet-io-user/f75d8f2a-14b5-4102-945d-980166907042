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

public class PasswordHelper {
  protected NObject javonetHandle;

  public PasswordHelper() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.PasswordHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PasswordHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PasswordHelper.PasswordStrength GetPasswordStrength(java.lang.String password) {
    try {
      Object res =
          Javonet.getType("BCE.Misc.PasswordHelper").invoke("GetPasswordStrength", password);
      if (res == null) return null;
      return PasswordHelper.PasswordStrength.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ComputePasswordHash(java.lang.String password) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.PasswordHelper").invoke("ComputePasswordHash", password);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean VerifyPassword(
      java.lang.String hashPassword, java.lang.String password) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Misc.PasswordHelper")
              .invoke("VerifyPassword", hashPassword, password);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public enum PasswordStrength {
    Weak(0L),
    Medium(1L),
    Strong(2L),
    ;
    private long numVal;

    PasswordStrength(long numVal) {
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
