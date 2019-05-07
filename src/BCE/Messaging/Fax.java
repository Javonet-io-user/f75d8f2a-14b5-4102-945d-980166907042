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

public class Fax {
  protected NObject javonetHandle;

  public Fax() {
    try {
      javonetHandle = Javonet.New("BCE.Messaging.Fax");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Fax(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsServiceInstalled() {
    try {
      java.lang.Boolean res = Javonet.getType("BCE.Messaging.Fax").invoke("IsServiceInstalled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String[] GetFaxServers(Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("BCE.Messaging.Fax").invoke("GetFaxServers");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetCoverPage(CoverPage cover) {
    try {
      javonetHandle.invoke("SetCoverPage", NEnum.fromJavaEnum(cover));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
  public void SetNote(java.lang.String note) {
    try {
      javonetHandle.invoke("SetNote", note);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetDocument(java.lang.String documentName, java.lang.String path) {
    try {
      javonetHandle.invoke("SetDocument", documentName, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddRecipient(java.lang.String name, java.lang.String faxNumber) {
    try {
      javonetHandle.invoke("AddRecipient", name, faxNumber);
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
  public java.lang.Boolean Send(java.lang.String serverName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Send", serverName);
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
