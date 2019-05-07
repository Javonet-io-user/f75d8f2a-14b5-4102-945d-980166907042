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
import jio.System.Text.*;
import jio.System.Net.Mail.*;

public class ErrorLog {
  protected NObject javonetHandle;

  public ErrorLog() {
    try {
      javonetHandle = Javonet.New("BCE.Application.ErrorLog");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ErrorLog(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WriteMessage(java.lang.String message) {
    try {
      Javonet.getType("BCE.Application.ErrorLog").invoke("WriteMessage", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WriteStrings(jio.System.Text.StringBuilder sb) {
    try {
      Javonet.getType("BCE.Application.ErrorLog").invoke("WriteStrings", sb);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean EmailToAutoCountError(
      java.lang.String subject, java.lang.String body, Attachment[] attachments) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Application.ErrorLog")
              .invoke("EmailToAutoCountError", subject, body, new Object[] {attachments});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean EmailErrorLogToAutoCountError(
      java.lang.String subject, java.lang.String body) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Application.ErrorLog")
              .invoke("EmailErrorLogToAutoCountError", subject, body);
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
