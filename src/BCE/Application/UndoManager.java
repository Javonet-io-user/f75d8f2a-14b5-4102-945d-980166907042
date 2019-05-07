package BCE.Application;

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
import BCE.Application.*;
import jio.System.*;
import jio.System.Collections.*;
import jio.System.Data.*;

public class UndoManager implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCanUndo() {
    try {
      java.lang.Boolean res = javonetHandle.get("CanUndo");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.ArrayList getExcludeFields() {
    try {
      Object res = javonetHandle.<NObject>get("ExcludeFields");
      if (res == null) return null;
      return new jio.System.Collections.ArrayList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParentUndoManager(UndoManager value) {
    try {
      javonetHandle.set("ParentUndoManager", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public UndoManager getParentUndoManager() {
    try {
      Object res = javonetHandle.<NObject>get("ParentUndoManager");
      if (res == null) return null;
      return new UndoManager((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public UndoManager(DataTable table, java.lang.Boolean isMasterRecord) {
    try {
      javonetHandle = Javonet.New("BCE.Application.UndoManager", table, isMasterRecord);
      javonetHandle.addEventListener(
          "CanUndoChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _CanUndoChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UndoManager(DataTable table, java.lang.Boolean isMasterRecord, FillRowValueDelegate f) {
    try {
      javonetHandle = Javonet.New("BCE.Application.UndoManager", table, isMasterRecord, f);
      javonetHandle.addEventListener(
          "CanUndoChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler handler : _CanUndoChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UndoManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PauseCapture() {
    try {
      javonetHandle.invoke("PauseCapture");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResumeCapture() {
    try {
      javonetHandle.invoke("ResumeCapture");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsPauseCapture() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsPauseCapture");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Reset() {
    try {
      javonetHandle.invoke("Reset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveState() {
    try {
      javonetHandle.invoke("SaveState");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Undo() {
    try {
      javonetHandle.invoke("Undo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void KeepCurrentChanges() {
    try {
      javonetHandle.invoke("KeepCurrentChanges");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler> _CanUndoChangedListeners =
      new java.util.ArrayList<EventHandler>();

  public void addCanUndoChanged(EventHandler toAdd) {
    _CanUndoChangedListeners.add(toAdd);
  }

  public void removeCanUndoChanged(EventHandler toRemove) {
    _CanUndoChangedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
