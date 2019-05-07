package BCE.Win32;

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
import BCE.Win32.*;
import jio.System.Drawing.*;

public class Helper {
  protected NObject javonetHandle;

  public Helper() {
    try {
      javonetHandle = Javonet.New("BCE.Win32.Helper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Helper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Bitmap CaptureScreen() {
    try {
      Object res = Javonet.getType("BCE.Win32.Helper").invoke("CaptureScreen");
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean Is64BitOperatingSystem() {
    try {
      java.lang.Boolean res = Javonet.getType("BCE.Win32.Helper").invoke("Is64BitOperatingSystem");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsGroupSimilarTaskBarButtonsOn() {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Win32.Helper").invoke("IsGroupSimilarTaskBarButtonsOn");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
