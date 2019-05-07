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
import jio.System.*;

public class User32 {
  protected NObject javonetHandle;

  public User32() {
    try {
      javonetHandle = Javonet.New("BCE.Win32.User32");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public User32(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr FindWindow(java.lang.String lpClassName, java.lang.String lpWindowName) {
    try {
      Object res =
          Javonet.getType("BCE.Win32.User32").invoke("FindWindow", lpClassName, lpWindowName);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr GetDesktopWindow() {
    try {
      Object res = Javonet.getType("BCE.Win32.User32").invoke("GetDesktopWindow");
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr GetWindowDC(IntPtr hWnd) {
    try {
      Object res = Javonet.getType("BCE.Win32.User32").invoke("GetWindowDC", hWnd);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ReleaseDC(IntPtr hWnd, IntPtr hDC) {
    try {
      java.lang.Integer res = Javonet.getType("BCE.Win32.User32").invoke("ReleaseDC", hWnd, hDC);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
