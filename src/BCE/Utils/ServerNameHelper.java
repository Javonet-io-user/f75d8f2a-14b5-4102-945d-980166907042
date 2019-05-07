package BCE.Utils;

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
import BCE.Utils.*;

public class ServerNameHelper {
  protected NObject javonetHandle;

  public ServerNameHelper() {
    try {
      javonetHandle = Javonet.New("BCE.Utils.ServerNameHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ServerNameHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetHostName(java.lang.String serverName) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Utils.ServerNameHelper").invoke("GetHostName", serverName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsLocalServerName(java.lang.String serverName) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Utils.ServerNameHelper").invoke("IsLocalServerName", serverName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetRealHostName(java.lang.String serverName) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Utils.ServerNameHelper").invoke("GetRealHostName", serverName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsLocalPC(
      java.lang.String serverName, AtomicReference<java.lang.String> realHostName) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Utils.ServerNameHelper")
              .invoke(
                  "IsLocalPC",
                  serverName,
                  new NOut(
                      realHostName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ConvertToRealServerName(java.lang.String serverName) {
    try {
      java.lang.String res = javonetHandle.invoke("ConvertToRealServerName", serverName);
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
