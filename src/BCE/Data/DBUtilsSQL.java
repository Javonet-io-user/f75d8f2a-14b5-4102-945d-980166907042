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
import jio.System.Data.*;

public class DBUtilsSQL extends DBUtils {
  protected NObject javonetHandle;

  public DBUtilsSQL() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("BCE.Data.DBUtilsSQL");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBUtilsSQL(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ExecuteDDLText(java.lang.String DDL) {
    try {
      javonetHandle.invoke("ExecuteDDLText", DDL);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateDatabase(java.lang.String dbName, java.lang.String dbFileName) {
    try {
      javonetHandle.invoke("CreateDatabase", dbName, dbFileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsDatabaseExists(java.lang.String dbName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsDatabaseExists", dbName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetUserDatabaseList() {
    try {
      Object res = javonetHandle.invoke("GetUserDatabaseList");
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DropDatabase(java.lang.String dbName) {
    try {
      javonetHandle.invoke("DropDatabase", dbName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AttachDatabase(
      java.lang.String dbName, java.lang.String dataFileName, java.lang.String logFileName) {
    try {
      javonetHandle.invoke("AttachDatabase", dbName, dataFileName, logFileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetSQLServerFullVersion() {
    try {
      java.lang.String res = javonetHandle.invoke("GetSQLServerFullVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetSQLServerEdition() {
    try {
      java.lang.String res = javonetHandle.invoke("GetSQLServerEdition");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetSQLServerProductVersion() {
    try {
      java.lang.String res = javonetHandle.invoke("GetSQLServerProductVersion");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetSQLServerProductLevel() {
    try {
      java.lang.String res = javonetHandle.invoke("GetSQLServerProductLevel");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
