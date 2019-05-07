package jio.System.Globalization;

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
import jio.System.Globalization.*;
import jio.System.*;

public class CultureInfo implements ICloneable, IFormatProvider {
  protected NObject javonetHandle;

  public CultureInfo(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("System.Globalization.CultureInfo", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CultureInfo(java.lang.String name, java.lang.Boolean useUserOverride) {
    try {
      javonetHandle = Javonet.New("System.Globalization.CultureInfo", name, useUserOverride);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CultureInfo(java.lang.Integer culture) {
    try {
      javonetHandle = Javonet.New("System.Globalization.CultureInfo", culture);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CultureInfo(java.lang.Integer culture, java.lang.Boolean useUserOverride) {
    try {
      javonetHandle = Javonet.New("System.Globalization.CultureInfo", culture, useUserOverride);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CultureInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
