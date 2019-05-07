package BCE.Configuration;

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
import BCE.Configuration.*;
import jio.System.Xml.*;

public class AppConfig {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.get("Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLastOpenFilename() {
    try {
      java.lang.String res = javonetHandle.get("LastOpenFilename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAppConfigFileType() {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Configuration.AppConfig").get("AppConfigFileType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAppConfigFileType(java.lang.String param) {
    try {
      Javonet.getType("BCE.Configuration.AppConfig").set("AppConfigFileType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppConfig(java.lang.String applicationName, java.lang.String version) {
    try {
      javonetHandle = Javonet.New("BCE.Configuration.AppConfig", applicationName, version);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppConfig(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddConfigInfo(java.lang.String type, java.lang.String path) {
    try {
      javonetHandle.invoke("AddConfigInfo", type, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ConfigInfo GetConfigInfo(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("GetConfigInfo", index);
      if (res == null) return null;
      return new ConfigInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String fileName) {
    try {
      javonetHandle.invoke("Save", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save() {
    try {
      javonetHandle.invoke("Save");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ParseXmlElement(
      XmlTextReader tr, java.lang.String elementName, AtomicReference<java.lang.String> element) {
    try {
      javonetHandle.invoke("ParseXmlElement", tr, elementName, new NRef(element));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Load(java.lang.String fileName) {
    try {
      javonetHandle.invoke("Load", fileName);
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
