package jio.System.Data.Common;

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
import jio.System.ComponentModel.*;
import jio.System.*;
import jio.System.Data.*;
import jio.System.Data.Common.*;

public abstract class DbCommand extends Component implements IComponent, IDisposable, IDbCommand {
  protected NObject javonetHandle;

  public DbCommand(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbConnection getConnection() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_Connection");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConnection(IDbConnection value) {
    try {
      javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("set_Connection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDbTransaction getTransaction() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_Transaction");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTransaction(IDbTransaction value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Data.IDbCommand")
          .invoke("set_Transaction", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDataParameterCollection getParameters() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("get_Parameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDbDataParameter CreateParameter() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("CreateParameter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDataReader ExecuteReader() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Data.IDbCommand").invoke("ExecuteReader");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDataReader ExecuteReader(CommandBehavior behavior) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.IDbCommand")
              .invoke("ExecuteReader", NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
