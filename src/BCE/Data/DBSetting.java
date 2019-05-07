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
import jio.System.Data.SqlClient.*;
import jio.System.*;
import jio.System.Data.*;

public class DBSetting implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public DBServerType getServerType() {
    try {
      Object res = javonetHandle.<NEnum>get("ServerType");
      if (res == null) return null;
      return DBServerType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServerName() {
    try {
      java.lang.String res = javonetHandle.get("ServerName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDBName() {
    try {
      java.lang.String res = javonetHandle.get("DBName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConnectionString() {
    try {
      java.lang.String res = javonetHandle.get("ConnectionString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCommandTimeOut(java.lang.Integer value) {
    try {
      javonetHandle.set("CommandTimeOut", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCommandTimeOut() {
    try {
      java.lang.Integer res = javonetHandle.get("CommandTimeOut");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStoredProcedure(java.lang.Boolean value) {
    try {
      javonetHandle.set("StoredProcedure", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getStoredProcedure() {
    try {
      java.lang.Boolean res = javonetHandle.get("StoredProcedure");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTransactionLevel() {
    try {
      java.lang.Integer res = javonetHandle.get("TransactionLevel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPrivateDataPath() {
    try {
      java.lang.String res = javonetHandle.get("PrivateDataPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPrivateCachingDataPath() {
    try {
      java.lang.String res = javonetHandle.get("PrivateCachingDataPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPrivateCriteriaDataPath() {
    try {
      java.lang.String res = javonetHandle.get("PrivateCriteriaDataPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SqlConnection getConnection() {
    try {
      Object res = javonetHandle.<NObject>get("Connection");
      if (res == null) return null;
      return new SqlConnection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SqlTransaction getTransaction() {
    try {
      Object res = javonetHandle.<NObject>get("Transaction");
      if (res == null) return null;
      return new SqlTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DBSetting(DBServerType serverType, java.lang.String connectionString) {
    try {
      javonetHandle =
          Javonet.New("BCE.Data.DBSetting", NEnum.fromJavaEnum(serverType), connectionString);
      javonetHandle.addEventListener(
          "BeforeOpenConnectionEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (BeforeOpenConnectionEventHandler handler : _BeforeOpenConnectionEventListeners) {
                handler.Invoke(Convert(objects[0], DBSetting.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBSetting(
      DBServerType serverType,
      java.lang.String serverName,
      java.lang.String userId,
      java.lang.String password,
      java.lang.String dbName) {
    try {
      javonetHandle =
          Javonet.New(
              "BCE.Data.DBSetting",
              NEnum.fromJavaEnum(serverType),
              serverName,
              userId,
              password,
              dbName);
      javonetHandle.addEventListener(
          "BeforeOpenConnectionEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (BeforeOpenConnectionEventHandler handler : _BeforeOpenConnectionEventListeners) {
                handler.Invoke(Convert(objects[0], DBSetting.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBSetting(
      DBServerType serverType,
      java.lang.String serverName,
      java.lang.String userId,
      java.lang.String password,
      java.lang.String dbName,
      java.lang.Boolean usePool) {
    try {
      javonetHandle =
          Javonet.New(
              "BCE.Data.DBSetting",
              NEnum.fromJavaEnum(serverType),
              serverName,
              userId,
              password,
              dbName,
              usePool);
      javonetHandle.addEventListener(
          "BeforeOpenConnectionEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (BeforeOpenConnectionEventHandler handler : _BeforeOpenConnectionEventListeners) {
                handler.Invoke(Convert(objects[0], DBSetting.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBSetting(DBServerType serverType, java.lang.String serverName, java.lang.String dbName) {
    try {
      javonetHandle =
          Javonet.New("BCE.Data.DBSetting", NEnum.fromJavaEnum(serverType), serverName, dbName);
      javonetHandle.addEventListener(
          "BeforeOpenConnectionEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (BeforeOpenConnectionEventHandler handler : _BeforeOpenConnectionEventListeners) {
                handler.Invoke(Convert(objects[0], DBSetting.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBSetting(
      DBServerType serverType,
      java.lang.String serverName,
      java.lang.String dbName,
      java.lang.Boolean usePool) {
    try {
      javonetHandle =
          Javonet.New(
              "BCE.Data.DBSetting", NEnum.fromJavaEnum(serverType), serverName, dbName, usePool);
      javonetHandle.addEventListener(
          "BeforeOpenConnectionEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (BeforeOpenConnectionEventHandler handler : _BeforeOpenConnectionEventListeners) {
                handler.Invoke(Convert(objects[0], DBSetting.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DBSetting(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBSetting CreateAutoCountDefaultDBSetting(
      java.lang.String serverName, java.lang.String dbName) {
    try {
      Object res =
          Javonet.getType("BCE.Data.DBSetting")
              .invoke("CreateAutoCountDefaultDBSetting", serverName, dbName);
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ThrowServerTypeNotSupportedException() {
    try {
      javonetHandle.invoke("ThrowServerTypeNotSupportedException");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DBSetting Copy() {
    try {
      Object res = javonetHandle.invoke("Copy");
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DBSetting CopyWithNewDBName(java.lang.String newDBName) {
    try {
      Object res = javonetHandle.invoke("CopyWithNewDBName", newDBName);
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SqlCommand CreateCommand() {
    try {
      Object res = javonetHandle.invoke("CreateCommand");
      if (res == null) return null;
      return new SqlCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SqlCommand CreateCommand(java.lang.String cmdText, Object[] parameters) {
    try {
      Object res = javonetHandle.invoke("CreateCommand", cmdText, new Object[] {parameters});
      if (res == null) return null;
      return new SqlCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DBSetting StartTransaction() {
    try {
      Object res = javonetHandle.invoke("StartTransaction");
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DBSetting StartTransaction(java.lang.Integer commandTimeout) {
    try {
      Object res = javonetHandle.invoke("StartTransaction", commandTimeout);
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Commit() {
    try {
      javonetHandle.invoke("Commit");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Rollback() {
    try {
      javonetHandle.invoke("Rollback");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndTransaction() {
    try {
      javonetHandle.invoke("EndTransaction");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ExecuteScalar(java.lang.String cmdText, Object[] parameters) {
    try {
      Object res = javonetHandle.invoke("ExecuteScalar", cmdText, new Object[] {parameters});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ExecuteNonQuery(java.lang.String cmdText, Object[] parameters) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("ExecuteNonQuery", cmdText, new Object[] {parameters});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataRow GetFirstDataRow(java.lang.String cmdText, Object[] parameters) {
    try {
      Object res = javonetHandle.invoke("GetFirstDataRow", cmdText, new Object[] {parameters});
      if (res == null) return null;
      return new DataRow((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetDataTable(
      java.lang.String cmdText, java.lang.Boolean loadSchema, Object[] parameters) {
    try {
      Object res =
          javonetHandle.invoke("GetDataTable", cmdText, loadSchema, new Object[] {parameters});
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable GetSchema(java.lang.String selectCmdText) {
    try {
      Object res = javonetHandle.invoke("GetSchema", selectCmdText);
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer LoadDataTable(
      DataTable table,
      java.lang.String cmdText,
      java.lang.Boolean loadSchema,
      Object[] parameters) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LoadDataTable", table, cmdText, loadSchema, new Object[] {parameters});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer LoadDataSet(
      DataSet ds,
      java.lang.String tableName,
      java.lang.String cmdText,
      java.lang.Boolean loadSchema,
      Object[] parameters) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "LoadDataSet", ds, tableName, cmdText, loadSchema, new Object[] {parameters});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadSchema(DataTable table, java.lang.String selectCmdText) {
    try {
      javonetHandle.invoke("LoadSchema", table, selectCmdText);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadSchema(DataSet ds, java.lang.String tableName, java.lang.String selectCmdText) {
    try {
      javonetHandle.invoke("LoadSchema", ds, tableName, selectCmdText);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SimpleSaveDataTable(DataTable table, java.lang.String selectCmdText) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SimpleSaveDataTable", table, selectCmdText);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SimpleSaveDataTable(
      DataTable table,
      java.lang.String selectCmdText,
      java.lang.Boolean returnIdentityColumnValue) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "SimpleSaveDataTable", table, selectCmdText, returnIdentityColumnValue);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SimpleSaveDataSet(
      DataSet ds, java.lang.String tableName, java.lang.String selectCmdText) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("SimpleSaveDataSet", ds, tableName, selectCmdText);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SimpleSaveDataSet(
      DataSet ds,
      java.lang.String tableName,
      java.lang.String selectCmdText,
      java.lang.Boolean returnIdentityColumnValue) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "SimpleSaveDataSet", ds, tableName, selectCmdText, returnIdentityColumnValue);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime GetServerTime() {
    try {
      Object res = javonetHandle.invoke("GetServerTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DBSetting CopyForTransaction() {
    try {
      Object res = javonetHandle.invoke("CopyForTransaction");
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SqlTransaction BeginTransaction() {
    try {
      Object res = javonetHandle.invoke("BeginTransaction");
      if (res == null) return null;
      return new SqlTransaction((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DBSetting BeginTransaction(
      java.lang.Boolean alwaysUseTransaction, SqlConnection conn, SqlTransaction tran) {
    try {
      Object res = javonetHandle.invoke("BeginTransaction", alwaysUseTransaction, conn, tran);
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<BeforeOpenConnectionEventHandler>
      _BeforeOpenConnectionEventListeners =
          new java.util.ArrayList<BeforeOpenConnectionEventHandler>();

  public void addBeforeOpenConnectionEvent(BeforeOpenConnectionEventHandler toAdd) {
    _BeforeOpenConnectionEventListeners.add(toAdd);
  }

  public void removeBeforeOpenConnectionEvent(BeforeOpenConnectionEventHandler toRemove) {
    _BeforeOpenConnectionEventListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
