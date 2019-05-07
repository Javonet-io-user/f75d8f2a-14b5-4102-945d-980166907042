package jio.System.Runtime.InteropServices;

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
import jio.System.*;
import jio.System.Runtime.InteropServices.*;
import jio.System.Runtime.Serialization.*;

public class ExternalException extends SystemException implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public ExternalException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Runtime.InteropServices.ExternalException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExternalException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Runtime.InteropServices.ExternalException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExternalException(java.lang.String message, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Runtime.InteropServices.ExternalException", message, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExternalException(java.lang.String message, java.lang.Integer errorCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Runtime.InteropServices.ExternalException", message, errorCode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExternalException(NObject handle) {
    super(handle);
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
