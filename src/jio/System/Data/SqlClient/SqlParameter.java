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
import jio.System.Data.*;
import jio.System.*;

public class SqlParameter extends DbParameter
    implements IDbDataParameter, IDataParameter, ICloneable {
  protected NObject javonetHandle;

  public SqlParameter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SqlClient.SqlParameter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlParameter(
      java.lang.String parameterName,
      SqlDbType dbType,
      java.lang.Integer size,
      ParameterDirection direction,
      java.lang.Boolean isNullable,
      java.lang.Byte precision,
      java.lang.Byte scale,
      java.lang.String sourceColumn,
      DataRowVersion sourceVersion,
      Object value) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SqlClient.SqlParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              size,
              NEnum.fromJavaEnum(direction),
              isNullable,
              precision,
              scale,
              sourceColumn,
              NEnum.fromJavaEnum(sourceVersion),
              value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlParameter(
      java.lang.String parameterName,
      SqlDbType dbType,
      java.lang.Integer size,
      ParameterDirection direction,
      java.lang.Byte precision,
      java.lang.Byte scale,
      java.lang.String sourceColumn,
      DataRowVersion sourceVersion,
      java.lang.Boolean sourceColumnNullMapping,
      Object value,
      java.lang.String xmlSchemaCollectionDatabase,
      java.lang.String xmlSchemaCollectionOwningSchema,
      java.lang.String xmlSchemaCollectionName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SqlClient.SqlParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              size,
              NEnum.fromJavaEnum(direction),
              precision,
              scale,
              sourceColumn,
              NEnum.fromJavaEnum(sourceVersion),
              sourceColumnNullMapping,
              value,
              xmlSchemaCollectionDatabase,
              xmlSchemaCollectionOwningSchema,
              xmlSchemaCollectionName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlParameter(java.lang.String parameterName, SqlDbType dbType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SqlClient.SqlParameter", parameterName, NEnum.fromJavaEnum(dbType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlParameter(java.lang.String parameterName, Object value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SqlClient.SqlParameter", parameterName, value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlParameter(java.lang.String parameterName, SqlDbType dbType, java.lang.Integer size) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SqlClient.SqlParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              size);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlParameter(
      java.lang.String parameterName,
      SqlDbType dbType,
      java.lang.Integer size,
      java.lang.String sourceColumn) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SqlClient.SqlParameter",
              parameterName,
              NEnum.fromJavaEnum(dbType),
              size,
              sourceColumn);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlParameter(NObject handle) {
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
