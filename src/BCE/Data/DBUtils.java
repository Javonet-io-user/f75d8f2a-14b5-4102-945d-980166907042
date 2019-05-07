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

public class DBUtils {
  protected NObject javonetHandle;

  public DBUtils() {
    try {
      javonetHandle = Javonet.New("BCE.Data.DBUtils");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBUtils Create(DBSetting dbSetting) {
    try {
      Object res = Javonet.getType("BCE.Data.DBUtils").invoke("Create", dbSetting);
      if (res == null) return null;
      return new DBUtils((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] EncryptDDL(
      java.lang.String originalText, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("BCE.Data.DBUtils").invoke("EncryptDDL", originalText);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DecryptDDL(java.lang.Byte[] encrypted) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Data.DBUtils").invoke("DecryptDDL", new Object[] {encrypted});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ReadDDLFile(java.lang.String fileName, java.lang.Boolean isEncrypted) {
    try {
      java.lang.String res = javonetHandle.invoke("ReadDDLFile", fileName, isEncrypted);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ExecuteDDL(java.lang.String fileName, java.lang.Boolean isEncrypted) {
    try {
      javonetHandle.invoke("ExecuteDDL", fileName, isEncrypted);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ExecuteDDL(java.lang.String fileName) {
    try {
      javonetHandle.invoke("ExecuteDDL", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
  public static void TestConnection(
      java.lang.String serverName,
      java.lang.Boolean useWindowsAuthentication,
      java.lang.String userId,
      java.lang.String password) {
    try {
      Javonet.getType("BCE.Data.DBUtils")
          .invoke("TestConnection", serverName, useWindowsAuthentication, userId, password);
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
