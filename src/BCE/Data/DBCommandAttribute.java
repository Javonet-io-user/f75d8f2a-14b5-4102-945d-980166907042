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
import jio.System.*;
import BCE.Data.*;
import jio.System.Runtime.InteropServices.*;

public class DBCommandAttribute extends Attribute implements _Attribute {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCommandText() {
    try {
      java.lang.String res = javonetHandle.get("CommandText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getNullReturnValue() {
    try {
      Object res = javonetHandle.<NObject>get("NullReturnValue");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAddSchema() {
    try {
      java.lang.Boolean res = javonetHandle.get("AddSchema");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsQueryCommand() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsQueryCommand");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public DBCommandAttribute(java.lang.String commandText) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("BCE.Data.DBCommandAttribute", commandText);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBCommandAttribute(java.lang.String commandText, Object nullReturnValue) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("BCE.Data.DBCommandAttribute", commandText, nullReturnValue);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBCommandAttribute(java.lang.String commandText, java.lang.Boolean addSchema) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("BCE.Data.DBCommandAttribute", commandText, addSchema);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBCommandAttribute(
      java.lang.String commandText, Object nullReturnValue, java.lang.Boolean addSchema) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("BCE.Data.DBCommandAttribute", commandText, nullReturnValue, addSchema);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBCommandAttribute(NObject handle) {
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
