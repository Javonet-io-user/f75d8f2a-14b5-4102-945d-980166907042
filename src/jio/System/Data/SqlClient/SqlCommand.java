package jio.System.Data.SqlClient;

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
import jio.System.Data.Common.*;
import jio.System.Data.SqlClient.*;
import jio.System.ComponentModel.*;
import jio.System.*;
import jio.System.Data.*;

public class SqlCommand extends DbCommand
    implements IComponent, IDisposable, IDbCommand, ICloneable {
  protected NObject javonetHandle;

  public SqlCommand() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SqlClient.SqlCommand");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlCommand(java.lang.String cmdText) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SqlClient.SqlCommand", cmdText);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlCommand(java.lang.String cmdText, SqlConnection connection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SqlClient.SqlCommand", cmdText, connection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlCommand(
      java.lang.String cmdText, SqlConnection connection, SqlTransaction transaction) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Data.SqlClient.SqlCommand", cmdText, connection, transaction);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlCommand(
      java.lang.String cmdText,
      SqlConnection connection,
      SqlTransaction transaction,
      SqlCommandColumnEncryptionSetting columnEncryptionSetting) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SqlClient.SqlCommand",
              cmdText,
              connection,
              transaction,
              NEnum.fromJavaEnum(columnEncryptionSetting));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlCommand(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object Clone() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
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
