package BCE.Utils.com.autocountsoft.www;

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
import jio.System.Web.Services.Protocols.*;
import BCE.Utils.com.autocountsoft.www.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public class ErrorReport extends SoapHttpClientProtocol implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUrl(java.lang.String value) {
    try {
      javonetHandle.set("Url", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUrl() {
    try {
      java.lang.String res = javonetHandle.get("Url");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseDefaultCredentials(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseDefaultCredentials", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseDefaultCredentials() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseDefaultCredentials");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ErrorReport() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("BCE.Utils.com.autocountsoft.www.ErrorReport");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "SendErrorReportCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (SendErrorReportCompletedEventHandler handler :
                  _SendErrorReportCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], SendErrorReportCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetErrorKeyArrayCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetErrorKeyArrayCompletedEventHandler handler :
                  _GetErrorKeyArrayCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetErrorKeyArrayCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetErrorCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetErrorCompletedEventHandler handler : _GetErrorCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetErrorCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteErrorCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DeleteErrorCompletedEventHandler handler : _DeleteErrorCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DeleteErrorCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ErrorReport(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SendErrorReport(
      java.lang.String productName,
      java.lang.String machineName,
      java.lang.String userName,
      java.lang.String replyUserName,
      java.lang.String replyEmailAddress,
      java.lang.String[] errorMessage,
      java.lang.String[] userMessage,
      java.lang.Byte[] screenByteArray) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "SendErrorReport",
              productName,
              machineName,
              userName,
              replyUserName,
              replyEmailAddress,
              new Object[] {errorMessage},
              new Object[] {userMessage},
              new Object[] {screenByteArray});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginSendErrorReport(
      java.lang.String productName,
      java.lang.String machineName,
      java.lang.String userName,
      java.lang.String replyUserName,
      java.lang.String replyEmailAddress,
      java.lang.String[] errorMessage,
      java.lang.String[] userMessage,
      java.lang.Byte[] screenByteArray,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginSendErrorReport",
              productName,
              machineName,
              userName,
              replyUserName,
              replyEmailAddress,
              new Object[] {errorMessage},
              new Object[] {userMessage},
              new Object[] {screenByteArray},
              callback,
              asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndSendErrorReport(IAsyncResult asyncResult) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("EndSendErrorReport", asyncResult);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SendErrorReportAsync(
      java.lang.String productName,
      java.lang.String machineName,
      java.lang.String userName,
      java.lang.String replyUserName,
      java.lang.String replyEmailAddress,
      java.lang.String[] errorMessage,
      java.lang.String[] userMessage,
      java.lang.Byte[] screenByteArray) {
    try {
      javonetHandle.invoke(
          "SendErrorReportAsync",
          productName,
          machineName,
          userName,
          replyUserName,
          replyEmailAddress,
          new Object[] {errorMessage},
          new Object[] {userMessage},
          new Object[] {screenByteArray});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SendErrorReportAsync(
      java.lang.String productName,
      java.lang.String machineName,
      java.lang.String userName,
      java.lang.String replyUserName,
      java.lang.String replyEmailAddress,
      java.lang.String[] errorMessage,
      java.lang.String[] userMessage,
      java.lang.Byte[] screenByteArray,
      Object userState) {
    try {
      javonetHandle.invoke(
          "SendErrorReportAsync",
          productName,
          machineName,
          userName,
          replyUserName,
          replyEmailAddress,
          new Object[] {errorMessage},
          new Object[] {userMessage},
          new Object[] {screenByteArray},
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer[] GetErrorKeyArray(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetErrorKeyArray");
      if (res == null) return null;
      return (java.lang.Integer[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetErrorKeyArray(AsyncCallback callback, Object asyncState) {
    try {
      Object res = javonetHandle.invoke("BeginGetErrorKeyArray", callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer[] EndGetErrorKeyArray(
      IAsyncResult asyncResult, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("EndGetErrorKeyArray", asyncResult);
      if (res == null) return null;
      return (java.lang.Integer[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetErrorKeyArrayAsync() {
    try {
      javonetHandle.invoke("GetErrorKeyArrayAsync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetErrorKeyArrayAsync(Object userState) {
    try {
      javonetHandle.invoke("GetErrorKeyArrayAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean GetError(
      java.lang.Integer errorKey,
      AtomicReference<java.lang.String> productName,
      AtomicReference<java.lang.String> machineName,
      AtomicReference<java.lang.String> userName,
      AtomicReference<java.lang.String> replyUserName,
      AtomicReference<java.lang.String> replyEmailAddress,
      AtomicReference<java.lang.String> errorMessage,
      AtomicReference<java.lang.String> userMessage,
      Object screenByteArray) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "GetError",
              errorKey,
              new NRef(productName),
              new NRef(machineName),
              new NRef(userName),
              new NRef(replyUserName),
              new NRef(replyEmailAddress),
              new NRef(errorMessage),
              new NRef(userMessage),
              screenByteArray);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginGetError(
      java.lang.Integer errorKey,
      java.lang.String productName,
      java.lang.String machineName,
      java.lang.String userName,
      java.lang.String replyUserName,
      java.lang.String replyEmailAddress,
      java.lang.String errorMessage,
      java.lang.String userMessage,
      Object screenByteArray,
      AsyncCallback callback,
      Object asyncState) {
    try {
      Object res =
          javonetHandle.invoke(
              "BeginGetError",
              errorKey,
              productName,
              machineName,
              userName,
              replyUserName,
              replyEmailAddress,
              errorMessage,
              userMessage,
              screenByteArray,
              callback,
              asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndGetError(
      IAsyncResult asyncResult,
      AtomicReference<java.lang.String> productName,
      AtomicReference<java.lang.String> machineName,
      AtomicReference<java.lang.String> userName,
      AtomicReference<java.lang.String> replyUserName,
      AtomicReference<java.lang.String> replyEmailAddress,
      AtomicReference<java.lang.String> errorMessage,
      AtomicReference<java.lang.String> userMessage,
      Object screenByteArray) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "EndGetError",
              asyncResult,
              new NOut(productName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(machineName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(userName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(replyUserName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(
                  replyEmailAddress, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(errorMessage, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(userMessage, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              screenByteArray);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetErrorAsync(
      java.lang.Integer errorKey,
      java.lang.String productName,
      java.lang.String machineName,
      java.lang.String userName,
      java.lang.String replyUserName,
      java.lang.String replyEmailAddress,
      java.lang.String errorMessage,
      java.lang.String userMessage,
      Object screenByteArray) {
    try {
      javonetHandle.invoke(
          "GetErrorAsync",
          errorKey,
          productName,
          machineName,
          userName,
          replyUserName,
          replyEmailAddress,
          errorMessage,
          userMessage,
          screenByteArray);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetErrorAsync(
      java.lang.Integer errorKey,
      java.lang.String productName,
      java.lang.String machineName,
      java.lang.String userName,
      java.lang.String replyUserName,
      java.lang.String replyEmailAddress,
      java.lang.String errorMessage,
      java.lang.String userMessage,
      Object screenByteArray,
      Object userState) {
    try {
      javonetHandle.invoke(
          "GetErrorAsync",
          errorKey,
          productName,
          machineName,
          userName,
          replyUserName,
          replyEmailAddress,
          errorMessage,
          userMessage,
          screenByteArray,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DeleteError(java.lang.Integer errorKey) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("DeleteError", errorKey);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IAsyncResult BeginDeleteError(
      java.lang.Integer errorKey, AsyncCallback callback, Object asyncState) {
    try {
      Object res = javonetHandle.invoke("BeginDeleteError", errorKey, callback, asyncState);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EndDeleteError(IAsyncResult asyncResult) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("EndDeleteError", asyncResult);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteErrorAsync(java.lang.Integer errorKey) {
    try {
      javonetHandle.invoke("DeleteErrorAsync", errorKey);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DeleteErrorAsync(java.lang.Integer errorKey, Object userState) {
    try {
      javonetHandle.invoke("DeleteErrorAsync", errorKey, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CancelAsync(Object userState) {
    try {
      javonetHandle.invoke("CancelAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<SendErrorReportCompletedEventHandler>
      _SendErrorReportCompletedListeners =
          new java.util.ArrayList<SendErrorReportCompletedEventHandler>();

  public void addSendErrorReportCompleted(SendErrorReportCompletedEventHandler toAdd) {
    _SendErrorReportCompletedListeners.add(toAdd);
  }

  public void removeSendErrorReportCompleted(SendErrorReportCompletedEventHandler toRemove) {
    _SendErrorReportCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetErrorKeyArrayCompletedEventHandler>
      _GetErrorKeyArrayCompletedListeners =
          new java.util.ArrayList<GetErrorKeyArrayCompletedEventHandler>();

  public void addGetErrorKeyArrayCompleted(GetErrorKeyArrayCompletedEventHandler toAdd) {
    _GetErrorKeyArrayCompletedListeners.add(toAdd);
  }

  public void removeGetErrorKeyArrayCompleted(GetErrorKeyArrayCompletedEventHandler toRemove) {
    _GetErrorKeyArrayCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetErrorCompletedEventHandler> _GetErrorCompletedListeners =
      new java.util.ArrayList<GetErrorCompletedEventHandler>();

  public void addGetErrorCompleted(GetErrorCompletedEventHandler toAdd) {
    _GetErrorCompletedListeners.add(toAdd);
  }

  public void removeGetErrorCompleted(GetErrorCompletedEventHandler toRemove) {
    _GetErrorCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DeleteErrorCompletedEventHandler> _DeleteErrorCompletedListeners =
      new java.util.ArrayList<DeleteErrorCompletedEventHandler>();

  public void addDeleteErrorCompleted(DeleteErrorCompletedEventHandler toAdd) {
    _DeleteErrorCompletedListeners.add(toAdd);
  }

  public void removeDeleteErrorCompleted(DeleteErrorCompletedEventHandler toRemove) {
    _DeleteErrorCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
