package jio.System.Security;

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
import jio.System.Security.*;
import jio.System.*;

public class SecureString implements IDisposable {
  protected NObject javonetHandle;

  public SecureString() {
    try {
      javonetHandle = Javonet.New("System.Security.SecureString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SecureString(java.lang.Character value, java.lang.Integer length) {
    try {
      javonetHandle = Javonet.New("System.Security.SecureString", value, length);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SecureString(NObject handle) {
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
