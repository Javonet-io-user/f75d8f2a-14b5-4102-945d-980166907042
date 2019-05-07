package BCE.Misc;

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
import BCE.Misc.*;
import jio.System.Collections.*;
import jio.System.Data.*;

public class StringHelper {
  protected NObject javonetHandle;

  public StringHelper() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.StringHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String IListToDelimiterString(IList list, java.lang.String delimiter) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper")
              .invoke("IListToDelimiterString", list, delimiter);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String IListToCommaString(IList list) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("IListToCommaString", list);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String IListToList2(IList list) {
    try {
      java.lang.String res = Javonet.getType("BCE.Misc.StringHelper").invoke("IListToList2", list);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ArrayListToDelimiterString(
      jio.System.Collections.ArrayList arrayList, java.lang.String delimiter) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper")
              .invoke("ArrayListToDelimiterString", arrayList, delimiter);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ArrayListToCommaString(
      jio.System.Collections.ArrayList arrayList) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("ArrayListToCommaString", arrayList);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String StringArrayToDelimiterString(
      java.lang.String[] strings, java.lang.String delimiter) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper")
              .invoke("StringArrayToDelimiterString", new Object[] {strings}, delimiter);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String StringArrayToMultiLineString(java.lang.String[] strings) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper")
              .invoke("StringArrayToMultiLineString", new Object[] {strings});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToCSharpString(java.lang.String aStr) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("ToCSharpString", aStr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToSingleQuoteString(java.lang.String aStr) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("ToSingleQuoteString", aStr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToDoubleQuoteString(java.lang.String aStr) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("ToDoubleQuoteString", aStr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String AddDoubleQuoteString(java.lang.String aStr) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("AddDoubleQuoteString", aStr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToCSVString(java.lang.String aStr) {
    try {
      java.lang.String res = Javonet.getType("BCE.Misc.StringHelper").invoke("ToCSVString", aStr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String[] ToMultiLineString(java.lang.String s, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("BCE.Misc.StringHelper").invoke("ToMultiLineString", s);
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToList2String(java.lang.String[] ss) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("ToList2String", new Object[] {ss});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CompareVersionString(
      java.lang.String ver1, java.lang.String ver2) {
    try {
      java.lang.Integer res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("CompareVersionString", ver1, ver2);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DataTable TabDelimittedTextToDataTable(java.lang.String tabText) {
    try {
      Object res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("TabDelimittedTextToDataTable", tabText);
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertToValidFilename(java.lang.String fileName) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.StringHelper").invoke("ConvertToValidFilename", fileName);
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
