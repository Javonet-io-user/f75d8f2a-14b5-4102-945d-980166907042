package BCE.Application;

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
import BCE.Application.*;
import jio.System.*;

public class PathHelper {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCommonApplicationDataPath() {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Application.PathHelper").get("CommonApplicationDataPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getApplicationDataPath() {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Application.PathHelper").get("ApplicationDataPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUserSettingDataPath() {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Application.PathHelper").get("UserSettingDataPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PathHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SetStartupPath(java.lang.String path) {
    try {
      Javonet.getType("BCE.Application.PathHelper").invoke("SetStartupPath", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetStartupFile(java.lang.String fileName) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Application.PathHelper").invoke("GetStartupFile", fileName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SaveUserSetting(Object obj, java.lang.String fileName) {
    try {
      Javonet.getType("BCE.Application.PathHelper").invoke("SaveUserSetting", obj, fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object LoadUserSetting(java.lang.String fileName) {
    try {
      Object res =
          Javonet.getType("BCE.Application.PathHelper").invoke("LoadUserSetting", fileName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
