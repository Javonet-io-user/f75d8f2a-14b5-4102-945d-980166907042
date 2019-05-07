package jio.System.Xml;

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
import jio.System.Xml.*;
import jio.System.IO.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class XmlTextReader extends XmlReader
    implements IDisposable, IXmlLineInfo, IXmlNamespaceResolver {
  protected NObject javonetHandle;

  public XmlTextReader(Stream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(java.lang.String url, Stream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", url, input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(Stream input, XmlNameTable nt) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", input, nt);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(java.lang.String url, Stream input, XmlNameTable nt) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", url, input, nt);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(TextReader input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(java.lang.String url, TextReader input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", url, input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(TextReader input, XmlNameTable nt) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", input, nt);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(java.lang.String url, TextReader input, XmlNameTable nt) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", url, input, nt);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(Stream xmlFragment, XmlNodeType fragType, XmlParserContext context) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Xml.XmlTextReader", xmlFragment, NEnum.fromJavaEnum(fragType), context);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(
      java.lang.String xmlFragment, XmlNodeType fragType, XmlParserContext context) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Xml.XmlTextReader", xmlFragment, NEnum.fromJavaEnum(fragType), context);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(java.lang.String url) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", url);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(java.lang.String url, XmlNameTable nt) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.XmlTextReader", url, nt);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlTextReader(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDictionary<java.lang.String, java.lang.String> GetNamespacesInScope(
      XmlNamespaceScope scope) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Xml.IXmlNamespaceResolver")
              .invoke("GetNamespacesInScope", NEnum.fromJavaEnum(scope));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String LookupNamespace(java.lang.String prefix) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Xml.IXmlNamespaceResolver")
              .invoke("LookupNamespace", prefix);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String LookupPrefix(java.lang.String namespaceName) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Xml.IXmlNamespaceResolver")
              .invoke("LookupPrefix", namespaceName);
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
