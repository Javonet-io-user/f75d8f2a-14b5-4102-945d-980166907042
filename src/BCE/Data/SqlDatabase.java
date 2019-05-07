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
import jio.System.Data.*;
import jio.System.*;
import jio.System.Xml.*;

public class SqlDatabase implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public DBSetting getDBSetting() {
    try {
      Object res = javonetHandle.<NObject>get("DBSetting");
      if (res == null) return null;
      return new DBSetting((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SqlDatabase(DBSetting dbSetting) {
    try {
      javonetHandle = Javonet.New("BCE.Data.SqlDatabase", dbSetting);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlDatabase(DBSetting dbSetting, TransactionOption option) {
    try {
      javonetHandle = Javonet.New("BCE.Data.SqlDatabase", dbSetting, NEnum.fromJavaEnum(option));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlDatabase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public void Close() {
    try {
      javonetHandle.invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  public SqlCommand CreateCommand(java.lang.String commandText, SqlParameter[] parameters) {
    try {
      Object res = javonetHandle.invoke("CreateCommand", commandText, new Object[] {parameters});
      if (res == null) return null;
      return new SqlCommand((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable ExecuteDataTable(SqlCommand command, java.lang.Boolean addSchema) {
    try {
      Object res = javonetHandle.invoke("ExecuteDataTable", command, addSchema);
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataTable ExecuteDataTable(
      java.lang.String commandText, java.lang.Boolean addSchema, SqlParameter[] parameters) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteDataTable", commandText, addSchema, new Object[] {parameters});
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataSet ExecuteDataSet(
      SqlCommand command, java.lang.String[] tableNames, java.lang.Boolean addSchema) {
    try {
      Object res =
          javonetHandle.invoke("ExecuteDataSet", command, new Object[] {tableNames}, addSchema);
      if (res == null) return null;
      return new DataSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataSet ExecuteDataSet(
      java.lang.String commandText,
      java.lang.String tableName,
      java.lang.Boolean addSchema,
      SqlParameter[] parameters) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteDataSet", commandText, tableName, addSchema, new Object[] {parameters});
      if (res == null) return null;
      return new DataSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DataSet ExecuteDataSet(
      java.lang.String commandText,
      java.lang.String[] tableNames,
      java.lang.Boolean addSchema,
      SqlParameter[] parameters) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteDataSet",
              commandText,
              new Object[] {tableNames},
              addSchema,
              new Object[] {parameters});
      if (res == null) return null;
      return new DataSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ExecuteNonQuery(SqlCommand command) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ExecuteNonQuery", command);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ExecuteNonQuery(
      java.lang.String commandText, SqlParameter[] parameters) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("ExecuteNonQuery", commandText, new Object[] {parameters});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SqlDataReader ExecuteReader(SqlCommand command, CommandBehavior behavior) {
    try {
      Object res = javonetHandle.invoke("ExecuteReader", command, NEnum.fromJavaEnum(behavior));
      if (res == null) return null;
      return new SqlDataReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SqlDataReader ExecuteReader(java.lang.String commandText, SqlParameter[] parameters) {
    try {
      Object res = javonetHandle.invoke("ExecuteReader", commandText, new Object[] {parameters});
      if (res == null) return null;
      return new SqlDataReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SqlDataReader ExecuteReader(
      java.lang.String commandText, CommandBehavior behavior, SqlParameter[] parameters) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteReader",
              commandText,
              NEnum.fromJavaEnum(behavior),
              new Object[] {parameters});
      if (res == null) return null;
      return new SqlDataReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ExecuteScalar(SqlCommand command, Object nullValue) {
    try {
      Object res = javonetHandle.invoke("ExecuteScalar", command, nullValue);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ExecuteScalar(java.lang.String commandText, SqlParameter[] parameters) {
    try {
      Object res = javonetHandle.invoke("ExecuteScalar", commandText, new Object[] {parameters});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ExecuteScalar(
      java.lang.String commandText, Object nullValue, SqlParameter[] parameters) {
    try {
      Object res =
          javonetHandle.invoke("ExecuteScalar", commandText, nullValue, new Object[] {parameters});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XmlReader ExecuteXmlReader(SqlCommand command) {
    try {
      Object res = javonetHandle.invoke("ExecuteXmlReader", command);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XmlReader ExecuteXmlReader(java.lang.String commandText, SqlParameter[] parameters) {
    try {
      Object res = javonetHandle.invoke("ExecuteXmlReader", commandText, new Object[] {parameters});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(
      SqlCommand command,
      DataSet dataSet,
      java.lang.String[] tableNames,
      java.lang.Boolean addSchema) {
    try {
      javonetHandle.invoke("LoadData", command, dataSet, new Object[] {tableNames}, addSchema);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(
      java.lang.String commandText,
      DataSet dataSet,
      java.lang.String tableName,
      java.lang.Boolean addSchema,
      SqlParameter[] parameters) {
    try {
      javonetHandle.invoke(
          "LoadData", commandText, dataSet, tableName, addSchema, new Object[] {parameters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(
      java.lang.String commandText,
      DataSet dataSet,
      java.lang.String[] tableNames,
      java.lang.Boolean addSchema,
      SqlParameter[] parameters) {
    try {
      javonetHandle.invoke(
          "LoadData",
          commandText,
          dataSet,
          new Object[] {tableNames},
          addSchema,
          new Object[] {parameters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(SqlCommand command, DataTable table, java.lang.Boolean addSchema) {
    try {
      javonetHandle.invoke("LoadData", command, table, addSchema);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(
      java.lang.String commandText,
      DataTable table,
      java.lang.Boolean addSchema,
      SqlParameter[] parameters) {
    try {
      javonetHandle.invoke("LoadData", commandText, table, addSchema, new Object[] {parameters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadSchema(java.lang.String tableName, DataSet dataSet, java.lang.String srcTable) {
    try {
      javonetHandle.invoke("LoadSchema", tableName, dataSet, srcTable);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadSchema(java.lang.String tableName, DataSet dataSet) {
    try {
      javonetHandle.invoke("LoadSchema", tableName, dataSet);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadSchema(java.lang.String tableName, DataTable table) {
    try {
      javonetHandle.invoke("LoadSchema", tableName, table);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer UpdateData(
      DataSet dataSet,
      java.lang.String srcTable,
      SqlCommand insertCommand,
      SqlCommand updateCommand,
      SqlCommand deleteCommand) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "UpdateData", dataSet, srcTable, insertCommand, updateCommand, deleteCommand);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer UpdateData(
      DataTable table,
      SqlCommand insertCommand,
      SqlCommand updateCommand,
      SqlCommand deleteCommand) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("UpdateData", table, insertCommand, updateCommand, deleteCommand);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer UpdateData(
      DataSet dataSet, java.lang.String tableName, java.lang.String srcTable) {
    try {
      java.lang.Integer res = javonetHandle.invoke("UpdateData", dataSet, tableName, srcTable);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer UpdateData(DataSet dataSet, java.lang.String tableName) {
    try {
      java.lang.Integer res = javonetHandle.invoke("UpdateData", dataSet, tableName);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer UpdateData(DataTable table, java.lang.String tableName) {
    try {
      java.lang.Integer res = javonetHandle.invoke("UpdateData", table, tableName);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
