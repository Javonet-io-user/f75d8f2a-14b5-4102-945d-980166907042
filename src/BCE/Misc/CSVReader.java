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
import jio.System.*;
import jio.System.IO.*;
import jio.System.Text.*;

public class CSVReader implements IDisposable {
  protected NObject javonetHandle;

  public CSVReader(Stream s) {
    try {
      javonetHandle = Javonet.New("BCE.Misc.CSVReader", s);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CSVReader(Stream s, Encoding enc) {
    try {
      javonetHandle = Javonet.New("BCE.Misc.CSVReader", s, enc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CSVReader(java.lang.String filename) {
    try {
      javonetHandle = Javonet.New("BCE.Misc.CSVReader", filename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CSVReader(java.lang.String filename, Encoding enc) {
    try {
      javonetHandle = Javonet.New("BCE.Misc.CSVReader", filename, enc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CSVReader(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetCSVLine(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetCSVLine");
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
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
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
