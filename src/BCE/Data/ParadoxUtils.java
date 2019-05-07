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

public class ParadoxUtils {
  protected NObject javonetHandle;

  public ParadoxUtils() {
    try {
      javonetHandle = Javonet.New("BCE.Data.ParadoxUtils");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParadoxUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateParadoxOleDbConnectionString(java.lang.String Path) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Data.ParadoxUtils")
              .invoke("CreateParadoxOleDbConnectionString", Path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateParadoxOdbcConnectionString(
      java.lang.String Path, java.lang.String NetFileDir) {
    try {
      java.lang.String res =
          Javonet.getType("BCE.Data.ParadoxUtils")
              .invoke("CreateParadoxOdbcConnectionString", Path, NetFileDir);
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
