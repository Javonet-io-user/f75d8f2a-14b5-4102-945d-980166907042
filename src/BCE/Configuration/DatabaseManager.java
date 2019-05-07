package BCE.Configuration;

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
import BCE.Configuration.*;
import jio.System.Data.*;
import jio.System.Xml.*;

public class DatabaseManager {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultServerName(java.lang.String value) {
    try {
      javonetHandle.set("DefaultServerName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultServerName() {
    try {
      java.lang.String res = javonetHandle.get("DefaultServerName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultSAName(java.lang.String value) {
    try {
      javonetHandle.set("DefaultSAName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultSAName() {
    try {
      java.lang.String res = javonetHandle.get("DefaultSAName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultDatabaseFolder(java.lang.String value) {
    try {
      javonetHandle.set("DefaultDatabaseFolder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultDatabaseFolder() {
    try {
      java.lang.String res = javonetHandle.get("DefaultDatabaseFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultServerBackupFolder(java.lang.String value) {
    try {
      javonetHandle.set("DefaultServerBackupFolder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultServerBackupFolder() {
    try {
      java.lang.String res = javonetHandle.get("DefaultServerBackupFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultClientBackupFolder(java.lang.String value) {
    try {
      javonetHandle.set("DefaultClientBackupFolder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultClientBackupFolder() {
    try {
      java.lang.String res = javonetHandle.get("DefaultClientBackupFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DataTable getDatabaseInfoTable() {
    try {
      Object res = javonetHandle.<NObject>get("DatabaseInfoTable");
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMainServerName(java.lang.String value) {
    try {
      javonetHandle.set("MainServerName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMainServerName() {
    try {
      java.lang.String res = javonetHandle.get("MainServerName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMainServerSAName(java.lang.String value) {
    try {
      javonetHandle.set("MainServerSAName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMainServerSAName() {
    try {
      java.lang.String res = javonetHandle.get("MainServerSAName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMainServerSAPassword(java.lang.String value) {
    try {
      javonetHandle.set("MainServerSAPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMainServerSAPassword() {
    try {
      java.lang.String res = javonetHandle.get("MainServerSAPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLastOpenFilename() {
    try {
      java.lang.String res = javonetHandle.get("LastOpenFilename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.get("Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public DatabaseManager(java.lang.String applicationName, java.lang.String version) {
    try {
      javonetHandle = Javonet.New("BCE.Configuration.DatabaseManager", applicationName, version);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddDatabaseInfo(
      java.lang.String serverName,
      java.lang.String saName,
      java.lang.String saPassword,
      java.lang.String databaseName,
      java.lang.String serverBackupFolder,
      java.lang.String clientBackupFolder,
      java.lang.String companyName,
      java.lang.String remark,
      java.lang.Integer remarkColor,
      java.lang.String databaseVersion,
      java.lang.Boolean isRegistered) {
    try {
      javonetHandle.invoke(
          "AddDatabaseInfo",
          serverName,
          saName,
          saPassword,
          databaseName,
          serverBackupFolder,
          clientBackupFolder,
          companyName,
          remark,
          remarkColor,
          databaseVersion,
          isRegistered);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddDatabaseInfo(
      java.lang.String databaseName,
      java.lang.String serverBackupFolder,
      java.lang.String clientBackupFolder,
      java.lang.String companyName,
      java.lang.String remark,
      java.lang.Integer remarkColor,
      java.lang.String databaseVersion,
      java.lang.Boolean isRegistered) {
    try {
      javonetHandle.invoke(
          "AddDatabaseInfo",
          databaseName,
          serverBackupFolder,
          clientBackupFolder,
          companyName,
          remark,
          remarkColor,
          databaseVersion,
          isRegistered);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DatabaseInfo GetDatabaseInfo(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("GetDatabaseInfo", index);
      if (res == null) return null;
      return new DatabaseInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DatabaseInfo GetDatabaseInfo(DataRow row) {
    try {
      Object res = javonetHandle.invoke("GetDatabaseInfo", row);
      if (res == null) return null;
      return new DatabaseInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveDatabaseInfo(java.lang.Integer index) {
    try {
      javonetHandle.invoke("RemoveDatabaseInfo", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveDatabaseInfo(DataRow row) {
    try {
      javonetHandle.invoke("RemoveDatabaseInfo", row);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String fileName) {
    try {
      javonetHandle.invoke("Save", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save() {
    try {
      javonetHandle.invoke("Save");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ParseXmlElement(
      XmlTextReader tr, java.lang.String elementName, AtomicReference<java.lang.String> element) {
    try {
      javonetHandle.invoke("ParseXmlElement", tr, elementName, new NRef(element));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Load(java.lang.String fileName) {
    try {
      javonetHandle.invoke("Load", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String EncryptPassword(java.lang.String originalText) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Configuration.DatabaseManager")
              .invoke("EncryptPassword", originalText);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DecryptPassword(java.lang.String encryptedBase64) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Configuration.DatabaseManager")
              .invoke("DecryptPassword", encryptedBase64);
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
