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
import jio.System.Text.*;

public class XmlParserContext {
  public NObject javonetHandle;

  public XmlParserContext(
      XmlNameTable nt, XmlNamespaceManager nsMgr, java.lang.String xmlLang, XmlSpace xmlSpace) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Xml.XmlParserContext", nt, nsMgr, xmlLang, NEnum.fromJavaEnum(xmlSpace));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlParserContext(
      XmlNameTable nt,
      XmlNamespaceManager nsMgr,
      java.lang.String xmlLang,
      XmlSpace xmlSpace,
      Encoding enc) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Xml.XmlParserContext", nt, nsMgr, xmlLang, NEnum.fromJavaEnum(xmlSpace), enc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlParserContext(
      XmlNameTable nt,
      XmlNamespaceManager nsMgr,
      java.lang.String docTypeName,
      java.lang.String pubId,
      java.lang.String sysId,
      java.lang.String internalSubset,
      java.lang.String baseURI,
      java.lang.String xmlLang,
      XmlSpace xmlSpace) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Xml.XmlParserContext",
              nt,
              nsMgr,
              docTypeName,
              pubId,
              sysId,
              internalSubset,
              baseURI,
              xmlLang,
              NEnum.fromJavaEnum(xmlSpace));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlParserContext(
      XmlNameTable nt,
      XmlNamespaceManager nsMgr,
      java.lang.String docTypeName,
      java.lang.String pubId,
      java.lang.String sysId,
      java.lang.String internalSubset,
      java.lang.String baseURI,
      java.lang.String xmlLang,
      XmlSpace xmlSpace,
      Encoding enc) {
    try {
      javonetHandle =
          Javonet.New(
              "System.Xml.XmlParserContext",
              nt,
              nsMgr,
              docTypeName,
              pubId,
              sysId,
              internalSubset,
              baseURI,
              xmlLang,
              NEnum.fromJavaEnum(xmlSpace),
              enc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlParserContext(NObject handle) {
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
