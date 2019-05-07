package FAXCOMEXLib;

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
import FAXCOMEXLib.*;
import jio.System.*;

public interface IFaxDocument {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Object Submit(java.lang.String bstrFaxServerName);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBody();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public FaxSender getSender();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public FaxRecipients getRecipients();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCoverPage();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSubject();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNote();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDocumentName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public FAX_COVERPAGE_TYPE_ENUM getCoverPageType();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setBody(java.lang.String pbstrBody);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCoverPage(java.lang.String pbstrCoverPage);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSubject(java.lang.String pbstrSubject);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setNote(java.lang.String pbstrNote);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentName(java.lang.String pbstrDocumentName);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCoverPageType(FAX_COVERPAGE_TYPE_ENUM pCoverPageType);
}
