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

public class CurrentUserDeviceSetting {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLanguage() {
    try {
      java.lang.String res = javonetHandle.get("Language");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setLanguage(java.lang.String param) {
    try {
      javonetHandle.set("Language", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUILanguage() {
    try {
      java.lang.String res = javonetHandle.get("UILanguage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setUILanguage(java.lang.String param) {
    try {
      javonetHandle.set("UILanguage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowPrintDialog() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowPrintDialog");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowPrintDialog(java.lang.Boolean param) {
    try {
      javonetHandle.set("ShowPrintDialog", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getResizeLetterToA4() {
    try {
      java.lang.Boolean res = javonetHandle.get("ResizeLetterToA4");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setResizeLetterToA4(java.lang.Boolean param) {
    try {
      javonetHandle.set("ResizeLetterToA4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAlwaysPrintInBlack() {
    try {
      java.lang.Boolean res = javonetHandle.get("AlwaysPrintInBlack");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAlwaysPrintInBlack(java.lang.Boolean param) {
    try {
      javonetHandle.set("AlwaysPrintInBlack", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowReportMarginWarning() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowReportMarginWarning");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowReportMarginWarning(java.lang.Boolean param) {
    try {
      javonetHandle.set("ShowReportMarginWarning", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseReportMargin() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseReportMargin");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseReportMargin(java.lang.Boolean param) {
    try {
      javonetHandle.set("UseReportMargin", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReportMarginLeft() {
    try {
      java.lang.Integer res = javonetHandle.get("ReportMarginLeft");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setReportMarginLeft(java.lang.Integer param) {
    try {
      javonetHandle.set("ReportMarginLeft", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReportMarginRight() {
    try {
      java.lang.Integer res = javonetHandle.get("ReportMarginRight");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setReportMarginRight(java.lang.Integer param) {
    try {
      javonetHandle.set("ReportMarginRight", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReportMarginTop() {
    try {
      java.lang.Integer res = javonetHandle.get("ReportMarginTop");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setReportMarginTop(java.lang.Integer param) {
    try {
      javonetHandle.set("ReportMarginTop", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReportMarginBottom() {
    try {
      java.lang.Integer res = javonetHandle.get("ReportMarginBottom");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setReportMarginBottom(java.lang.Integer param) {
    try {
      javonetHandle.set("ReportMarginBottom", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSetLabelPaddingToZero() {
    try {
      java.lang.Boolean res = javonetHandle.get("SetLabelPaddingToZero");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSetLabelPaddingToZero(java.lang.Boolean param) {
    try {
      javonetHandle.set("SetLabelPaddingToZero", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CurrentUserDeviceSetting() {
    try {
      javonetHandle = Javonet.New("BCE.Application.CurrentUserDeviceSetting");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CurrentUserDeviceSetting(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadSetting(java.lang.String fileName) {
    try {
      javonetHandle.invoke("LoadSetting", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveSetting(java.lang.String fileName) {
    try {
      javonetHandle.invoke("SaveSetting", fileName);
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
