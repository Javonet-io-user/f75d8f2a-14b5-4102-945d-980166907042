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
import jio.System.Data.*;

public class DataTableHelper {
  protected NObject javonetHandle;

  public DataTableHelper() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.DataTableHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataTableHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long[] GetSelectedKeyArray(
      java.lang.String selectedColumnName,
      java.lang.String keyColumnName,
      DataTable table,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("BCE.Misc.DataTableHelper")
              .invoke("GetSelectedKeyArray", selectedColumnName, keyColumnName, table);
      if (res == null) return null;
      return (java.lang.Long[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetSelectedKeyCommaString(
      java.lang.String selectedColumnName, java.lang.String keyColumnName, DataTable table) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Misc.DataTableHelper")
              .invoke("GetSelectedKeyCommaString", selectedColumnName, keyColumnName, table);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsTablesEqual(DataTable t1, DataTable t2) {
    try {
      java.lang.Boolean res =
          Javonet.getType("BCE.Misc.DataTableHelper").invoke("IsTablesEqual", t1, t2);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
