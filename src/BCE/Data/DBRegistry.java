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

public class DBRegistry {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUseCache(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseCache", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseCache() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseCache");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public DBRegistry(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBRegistry Create(DBSetting dbSetting) {
    try {
      Object res = Javonet.getType("BCE.Data.DBRegistry").invoke("Create", dbSetting);
      if (res == null) return null;
      return new DBRegistry((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long IncOne(java.lang.Integer regID, java.lang.Long startValue) {
    try {
      java.lang.Long res = javonetHandle.invoke("IncOne", regID, startValue);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long IncOne(IRegistryID reg) {
    try {
      java.lang.Long res = javonetHandle.invoke("IncOne", reg);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetValue(java.lang.Integer regID, Object startValue) {
    try {
      Object res = javonetHandle.invoke("GetValue", regID, startValue);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetValue(IRegistryID reg) {
    try {
      Object res = javonetHandle.invoke("GetValue", reg);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte GetSByte(IRegistryID reg) {
    try {
      java.lang.Byte res = javonetHandle.invoke("GetSByte", reg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Short GetInt16(IRegistryID reg) {
    try {
      java.lang.Short res = javonetHandle.invoke("GetInt16", reg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetInt32(IRegistryID reg) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetInt32", reg);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long GetInt64(IRegistryID reg) {
    try {
      java.lang.Long res = javonetHandle.invoke("GetInt64", reg);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigInteger GetUInt64(IRegistryID reg) {
    try {
      java.math.BigInteger res = javonetHandle.invoke("GetUInt64", reg);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetDecimal(IRegistryID reg) {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetDecimal", reg);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetBoolean(IRegistryID reg) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("GetBoolean", reg);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetString(IRegistryID reg) {
    try {
      java.lang.String res = javonetHandle.invoke("GetString", reg);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetValue(java.lang.Integer regID, Object regValue) {
    try {
      javonetHandle.invoke("SetValue", regID, regValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetValue(IRegistryID reg) {
    try {
      javonetHandle.invoke("SetValue", reg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ForceSetValue(java.lang.Integer regID, Object regValue) {
    try {
      javonetHandle.invoke("ForceSetValue", regID, regValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ForceSetValue(IRegistryID reg) {
    try {
      javonetHandle.invoke("ForceSetValue", reg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
