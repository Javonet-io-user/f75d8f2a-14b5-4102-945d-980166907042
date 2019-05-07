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

public class Gdi32 {
  protected NObject javonetHandle;

  public Gdi32() {
    try {
      javonetHandle = Javonet.New("BCE.Win32.Gdi32");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Gdi32(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean BitBlt(
      IntPtr hdcDest,
      java.lang.Integer nXDest,
      java.lang.Integer nYDest,
      java.lang.Integer nWidth,
      java.lang.Integer nHeight,
      IntPtr hdcSrc,
      java.lang.Integer nXSrc,
      java.lang.Integer nYSrc,
      java.lang.Integer dwRop) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Win32.Gdi32")
              .invoke(
                  "BitBlt", hdcDest, nXDest, nYDest, nWidth, nHeight, hdcSrc, nXSrc, nYSrc, dwRop);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr CreateCompatibleBitmap(
      IntPtr hdc, java.lang.Integer nWidth, java.lang.Integer nHeight) {
    try {
      Object res =
          Javonet.getType("BCE.Win32.Gdi32").invoke("CreateCompatibleBitmap", hdc, nWidth, nHeight);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr CreateCompatibleDC(IntPtr hdc) {
    try {
      Object res = Javonet.getType("BCE.Win32.Gdi32").invoke("CreateCompatibleDC", hdc);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeleteDC(IntPtr hdc) {
    try {
      java.lang.Boolean res = Javonet.getType("BCE.Win32.Gdi32").invoke("DeleteDC", hdc);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeleteObject(IntPtr hObject) {
    try {
      java.lang.Boolean res = Javonet.getType("BCE.Win32.Gdi32").invoke("DeleteObject", hObject);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer GetDeviceCaps(IntPtr hdc, java.lang.Integer nIndex) {
    try {
      java.lang.Integer res =
          Javonet.getType("BCE.Win32.Gdi32").invoke("GetDeviceCaps", hdc, nIndex);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr SelectObject(IntPtr hdc, IntPtr hgdiobj) {
    try {
      Object res = Javonet.getType("BCE.Win32.Gdi32").invoke("SelectObject", hdc, hgdiobj);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
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
