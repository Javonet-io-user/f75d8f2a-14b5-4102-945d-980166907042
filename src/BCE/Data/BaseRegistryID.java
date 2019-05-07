package BCE.Data;

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
import BCE.Data.*;
import jio.System.*;

public abstract class BaseRegistryID implements IRegistryID {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getID() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("BCE.Data.IRegistryID").invoke("get_ID");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getDefaultValue() {
    try {
      Object res =
          javonetHandle.explicitInterface("BCE.Data.IRegistryID").invoke("get_DefaultValue");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNewValue(Object value) {
    try {
      javonetHandle.set("NewValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getNewValue() {
    try {
      Object res = javonetHandle.explicitInterface("BCE.Data.IRegistryID").invoke("get_NewValue");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BaseRegistryID() {
    try {
      javonetHandle = Javonet.New("BCE.Data.BaseRegistryID");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseRegistryID(Object newValue) {
    try {
      javonetHandle = Javonet.New("BCE.Data.BaseRegistryID", newValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseRegistryID(NObject handle) {
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
