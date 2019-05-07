package BCE.POS.Device;

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
import BCE.POS.Device.*;

public class CashDrawer {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setPortName(java.lang.String value) {
    try {
      javonetHandle.set("PortName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPortName() {
    try {
      java.lang.String res = javonetHandle.get("PortName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSerialSettings(SerialSettings value) {
    try {
      javonetHandle.set("SerialSettings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SerialSettings getSerialSettings() {
    try {
      Object res = javonetHandle.<NObject>get("SerialSettings");
      if (res == null) return null;
      return new SerialSettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOpenDrawerCommand(java.lang.String value) {
    try {
      javonetHandle.set("OpenDrawerCommand", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getOpenDrawerCommand() {
    try {
      java.lang.String res = javonetHandle.get("OpenDrawerCommand");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CashDrawer(java.lang.String portName, java.lang.String command) {
    try {
      javonetHandle = Javonet.New("BCE.POS.Device.CashDrawer", portName, command);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CashDrawer(SerialSettings setting, java.lang.String command) {
    try {
      javonetHandle = Javonet.New("BCE.POS.Device.CashDrawer", setting, command);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CashDrawer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] ParseCommand(java.lang.String command, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("BCE.POS.Device.CashDrawer").invoke("ParseCommand", command);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OpenDrawer() {
    try {
      javonetHandle.invoke("OpenDrawer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
