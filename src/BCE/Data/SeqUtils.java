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

public class SeqUtils {
  protected NObject javonetHandle;

  public SeqUtils() {
    try {
      javonetHandle = Javonet.New("BCE.Data.SeqUtils");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SeqUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer GetLastSeq(DataRow[] rowList) {
    try {
      java.lang.Integer res =
          Javonet.getType("BCE.Data.SeqUtils").invoke("GetLastSeq", new Object[] {rowList});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer GetNewSeqAtThisIndex(java.lang.Integer index, DataRow[] rowList) {
    try {
      java.lang.Integer res =
          Javonet.getType("BCE.Data.SeqUtils")
              .invoke("GetNewSeqAtThisIndex", index, new Object[] {rowList});
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
