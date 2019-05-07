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

public class SerialSettings {
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
  public void setBaudRate(java.lang.Integer value) {
    try {
      javonetHandle.set("BaudRate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getBaudRate() {
    try {
      java.lang.Integer res = javonetHandle.get("BaudRate");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParity(java.lang.Integer value) {
    try {
      javonetHandle.set("Parity", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getParity() {
    try {
      java.lang.Integer res = javonetHandle.get("Parity");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDataBits(java.lang.Integer value) {
    try {
      javonetHandle.set("DataBits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDataBits() {
    try {
      java.lang.Integer res = javonetHandle.get("DataBits");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStopBits(java.lang.Integer value) {
    try {
      javonetHandle.set("StopBits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getStopBits() {
    try {
      java.lang.Integer res = javonetHandle.get("StopBits");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public SerialSettings(java.lang.String portName) {
    try {
      javonetHandle = Javonet.New("BCE.POS.Device.SerialSettings", portName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SerialSettings(
      java.lang.String portName,
      java.lang.Integer baudRate,
      java.lang.Integer parity,
      java.lang.Integer dataBits,
      java.lang.Integer stopBits) {
    try {
      javonetHandle =
          Javonet.New(
              "BCE.POS.Device.SerialSettings", portName, baudRate, parity, dataBits, stopBits);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SerialSettings(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
