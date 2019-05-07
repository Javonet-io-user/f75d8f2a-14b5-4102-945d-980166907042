package jio.System.Drawing;

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
import jio.System.*;
import jio.System.Drawing.*;
import jio.System.IO.*;
import jio.System.Runtime.Serialization.*;

public class Icon extends MarshalByRefObject implements ISerializable, ICloneable, IDisposable {
  protected NObject javonetHandle;

  public Icon(java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(java.lang.String fileName, Size size) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", fileName, size);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(java.lang.String fileName, java.lang.Integer width, java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", fileName, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(Icon original, Size size) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", original, size);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(Icon original, java.lang.Integer width, java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", original, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(jio.System.Type type, java.lang.String resource) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", type, resource);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(Stream stream) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", stream);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(Stream stream, Size size) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", stream, size);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(Stream stream, java.lang.Integer width, java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Icon", stream, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Icon(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetObjectData(SerializationInfo si, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", si, context);
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
