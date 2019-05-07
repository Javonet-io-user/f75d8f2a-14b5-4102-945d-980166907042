package BCE.Messaging;

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
import BCE.Messaging.*;
import jio.System.*;

public class Mail {
  protected NObject javonetHandle;

  public Mail() {
    try {
      javonetHandle = Javonet.New("BCE.Messaging.Mail");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Mail(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSubject(java.lang.String subject) {
    try {
      javonetHandle.invoke("SetSubject", subject);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetBody(java.lang.String body) {
    try {
      javonetHandle.invoke("SetBody", body);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddRecipient(java.lang.String name, java.lang.String address, java.lang.Boolean cc) {
    try {
      javonetHandle.invoke("AddRecipient", name, address, cc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ClearRecipients() {
    try {
      javonetHandle.invoke("ClearRecipients");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddAttachment(java.lang.String path, java.lang.String filename) {
    try {
      javonetHandle.invoke("AddAttachment", path, filename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ClearAttachments() {
    try {
      javonetHandle.invoke("ClearAttachments");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Send() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Send");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Send(IntPtr hwnd, java.lang.Boolean showDialog) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Send", hwnd, showDialog);
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
