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
import jio.System.Globalization.*;

public class Convert {
  protected NObject javonetHandle;

  public Convert() {
    try {
      javonetHandle = Javonet.New("BCE.Data.Convert");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Convert(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String BooleanToText(java.lang.Boolean TF) {
    try {
      java.lang.String res = Javonet.getType("BCE.Data.Convert").invoke("BooleanToText", TF);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean TextToBoolean(Object obj) {
    try {
      java.lang.Boolean res = Javonet.getType("BCE.Data.Convert").invoke("TextToBoolean", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToBooleanText(Object obj) {
    try {
      java.lang.String res = Javonet.getType("BCE.Data.Convert").invoke("ToBooleanText", obj);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ToBoolean(Object obj) {
    try {
      java.lang.Boolean res = Javonet.getType("BCE.Data.Convert").invoke("ToBoolean", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ToDateTime(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDateTime", obj);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.math.BigDecimal ToDecimal(Object obj) {
    try {
      java.math.BigDecimal res = Javonet.getType("BCE.Data.Convert").invoke("ToDecimal", obj);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte ToSByte(Object obj) {
    try {
      java.lang.Byte res = Javonet.getType("BCE.Data.Convert").invoke("ToSByte", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Short ToInt16(Object obj) {
    try {
      java.lang.Short res = Javonet.getType("BCE.Data.Convert").invoke("ToInt16", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ToInt32(Object obj) {
    try {
      java.lang.Integer res = Javonet.getType("BCE.Data.Convert").invoke("ToInt32", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long ToInt64(Object obj) {
    try {
      java.lang.Long res = Javonet.getType("BCE.Data.Convert").invoke("ToInt64", obj);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.math.BigInteger ToUInt64(Object obj) {
    try {
      java.math.BigInteger res = Javonet.getType("BCE.Data.Convert").invoke("ToUInt64", obj);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Guid ToGuid(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToGuid", obj);
      if (res == null) return null;
      return new Guid((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBInt16 ToDBInt16(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBInt16", obj);
      if (res == null) return null;
      return new DBInt16((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBInt32 ToDBInt32(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBInt32", obj);
      if (res == null) return null;
      return new DBInt32((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBInt64 ToDBInt64(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBInt64", obj);
      if (res == null) return null;
      return new DBInt64((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBDecimal ToDBDecimal(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBDecimal", obj);
      if (res == null) return null;
      return new DBDecimal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBString ToDBString(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBString", obj);
      if (res == null) return null;
      return new DBString((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBDateTime ToDBDateTime(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBDateTime", obj);
      if (res == null) return null;
      return new DBDateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DBBoolean ToDBBoolean(Object obj) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBBoolean", obj);
      if (res == null) return null;
      return new DBBoolean((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ToDBObject(DBString aDBType) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBObject", aDBType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ToDBObject(DBDecimal aDBType) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBObject", aDBType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ToDBObject(DBInt16 aDBType) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBObject", aDBType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ToDBObject(DBInt32 aDBType) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBObject", aDBType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ToDBObject(DBInt64 aDBType) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBObject", aDBType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ToDBObject(DBDateTime aDBType) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBObject", aDBType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ToDBObject(DBBoolean aDBType) {
    try {
      Object res = Javonet.getType("BCE.Data.Convert").invoke("ToDBObject", aDBType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.math.BigDecimal RoundToNearest5Cents(java.math.BigDecimal d) {
    try {
      java.math.BigDecimal res =
          Javonet.getType("BCE.Data.Convert").invoke("RoundToNearest5Cents", d);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToCultureInfoNumberWording(
      java.math.BigDecimal amount, CultureInfo cultureInfo) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Data.Convert")
              .invoke("ToCultureInfoNumberWording", amount, cultureInfo);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToEnglish(java.math.BigDecimal amount) {
    try {
      java.lang.String res = Javonet.getType("BCE.Data.Convert").invoke("ToEnglish", amount);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToBahasa(java.math.BigDecimal amount) {
    try {
      java.lang.String res = Javonet.getType("BCE.Data.Convert").invoke("ToBahasa", amount);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToIndonesian(
      java.math.BigDecimal amount, java.lang.String currencyWord) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Data.Convert").invoke("ToIndonesian", amount, currencyWord);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToChinese(
      java.math.BigDecimal amount, java.lang.Boolean isSimplifiedChinese) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Data.Convert").invoke("ToChinese", amount, isSimplifiedChinese);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToVietnamese(java.math.BigDecimal amount) {
    try {
      java.lang.String res = Javonet.getType("BCE.Data.Convert").invoke("ToVietnamese", amount);
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
