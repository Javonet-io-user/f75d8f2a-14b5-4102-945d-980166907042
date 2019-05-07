package BCE.Win32;

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
import BCE.Win32.*;
import jio.System.*;

public class ShellFileOperation {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void sethwnd(IntPtr value) {
    try {
      javonetHandle.set("hwnd", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setwFunc(ShellFileOperation.FO_Func value) {
    try {
      javonetHandle.set("wFunc", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setpFrom(java.lang.String value) {
    try {
      javonetHandle.set("pFrom", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setpTo(java.lang.String value) {
    try {
      javonetHandle.set("pTo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setfAnyOperationsAborted(java.lang.Boolean value) {
    try {
      javonetHandle.set("fAnyOperationsAborted", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void sethNameMappings(IntPtr value) {
    try {
      javonetHandle.set("hNameMappings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setlpszProgressTitle(java.lang.String value) {
    try {
      javonetHandle.set("lpszProgressTitle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public ShellFileOperation.FILEOP_FLAGS getfFlags() {
    try {
      Object res = javonetHandle.<NObject>get("fFlags");
      if (res == null) return null;
      return new ShellFileOperation.FILEOP_FLAGS((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setfFlags(ShellFileOperation.FILEOP_FLAGS param) {
    try {
      javonetHandle.set("fFlags", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ShellFileOperation() {
    try {
      javonetHandle = Javonet.New("BCE.Win32.ShellFileOperation");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ShellFileOperation(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Execute() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Execute");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public enum FO_Func {
    FO_MOVE(1L),
    FO_COPY(2L),
    FO_DELETE(3L),
    FO_RENAME(4L),
    ;
    private long numVal;

    FO_Func(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public static class FILEOP_FLAGS {
    protected NObject javonetHandle;
    /** GetProperty */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getFlag() {
      try {
        java.lang.Integer res = javonetHandle.get("Flag");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_MULTIDESTFILES() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_MULTIDESTFILES");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_MULTIDESTFILES(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_MULTIDESTFILES", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_CONFIRMMOUSE() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_CONFIRMMOUSE");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_CONFIRMMOUSE(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_CONFIRMMOUSE", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_SILENT() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_SILENT");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_SILENT(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_SILENT", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_RENAMEONCOLLISION() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_RENAMEONCOLLISION");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_RENAMEONCOLLISION(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_RENAMEONCOLLISION", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_NOCONFIRMATION() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_NOCONFIRMATION");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_NOCONFIRMATION(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_NOCONFIRMATION", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_WANTMAPPINGHANDLE() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_WANTMAPPINGHANDLE");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_WANTMAPPINGHANDLE(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_WANTMAPPINGHANDLE", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_ALLOWUNDO() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_ALLOWUNDO");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_ALLOWUNDO(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_ALLOWUNDO", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_FILESONLY() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_FILESONLY");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_FILESONLY(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_FILESONLY", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_SIMPLEPROGRESS() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_SIMPLEPROGRESS");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_SIMPLEPROGRESS(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_SIMPLEPROGRESS", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_NOCONFIRMMKDIR() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_NOCONFIRMMKDIR");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_NOCONFIRMMKDIR(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_NOCONFIRMMKDIR", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_NOERRORUI() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_NOERRORUI");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_NOERRORUI(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_NOERRORUI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_NOCOPYSECURITYATTRIBS() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_NOCOPYSECURITYATTRIBS");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_NOCOPYSECURITYATTRIBS(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_NOCOPYSECURITYATTRIBS", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_NORECURSION() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_NORECURSION");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_NORECURSION(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_NORECURSION", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_NO_CONNECTED_ELEMENTS() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_NO_CONNECTED_ELEMENTS");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_NO_CONNECTED_ELEMENTS(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_NO_CONNECTED_ELEMENTS", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_WANTNUKEWARNING() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_WANTNUKEWARNING");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_WANTNUKEWARNING(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_WANTNUKEWARNING", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Boolean getFOF_NORECURSEREPARSE() {
      try {
        java.lang.Boolean res = javonetHandle.get("FOF_NORECURSEREPARSE");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setFOF_NORECURSEREPARSE(java.lang.Boolean param) {
      try {
        javonetHandle.set("FOF_NORECURSEREPARSE", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public FILEOP_FLAGS() {
      try {
        javonetHandle = Javonet.New("BCE.Win32.ShellFileOperation+FILEOP_FLAGS");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public FILEOP_FLAGS(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
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
