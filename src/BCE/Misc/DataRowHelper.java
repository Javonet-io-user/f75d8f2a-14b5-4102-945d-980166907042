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

public class DataRowHelper {
  protected NObject javonetHandle;

  public DataRowHelper() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.DataRowHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataRowHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void CopyDataRow(
      DataRow fromRow,
      DataRow toRow,
      java.lang.String fromFieldList,
      java.lang.String toFieldList) {
    try {
      Javonet.getType("BCE.Misc.DataRowHelper")
          .invoke("CopyDataRow", fromRow, toRow, fromFieldList, toFieldList);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void CopyDataRow(DataRow fromRow, DataRow toRow, java.lang.String fieldList) {
    try {
      Javonet.getType("BCE.Misc.DataRowHelper").invoke("CopyDataRow", fromRow, toRow, fieldList);
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
