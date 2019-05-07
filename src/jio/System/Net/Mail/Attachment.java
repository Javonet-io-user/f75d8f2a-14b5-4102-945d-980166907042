package jio.System.Net.Mail;

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
import jio.System.Net.Mail.*;
import jio.System.Net.Mime.*;
import jio.System.IO.*;
import jio.System.*;

public class Attachment extends AttachmentBase implements IDisposable {
  protected NObject javonetHandle;

  public Attachment(java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Net.Mail.Attachment", fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Attachment(java.lang.String fileName, java.lang.String mediaType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Net.Mail.Attachment", fileName, mediaType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Attachment(java.lang.String fileName, ContentType contentType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Net.Mail.Attachment", fileName, contentType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Attachment(Stream contentStream, java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Net.Mail.Attachment", contentStream, name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Attachment(Stream contentStream, java.lang.String name, java.lang.String mediaType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Net.Mail.Attachment", contentStream, name, mediaType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Attachment(Stream contentStream, ContentType contentType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Net.Mail.Attachment", contentStream, contentType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Attachment(NObject handle) {
    super(handle);
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
