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
import jio.System.Drawing.*;

public class RgbHsl {
  protected NObject javonetHandle;

  public RgbHsl() {
    try {
      javonetHandle = Javonet.New("BCE.Misc.RgbHsl");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RgbHsl(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color SetBrightness(Color c, java.lang.Double brightness) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("SetBrightness", c, brightness);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color ModifyBrightness(Color c, java.lang.Double brightness) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("ModifyBrightness", c, brightness);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color SetSaturation(Color c, java.lang.Double Saturation) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("SetSaturation", c, Saturation);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color ModifySaturation(Color c, java.lang.Double Saturation) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("ModifySaturation", c, Saturation);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color SetHue(Color c, java.lang.Double Hue) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("SetHue", c, Hue);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color ModifyHue(Color c, java.lang.Double Hue) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("ModifyHue", c, Hue);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color HSL_to_RGB(RgbHsl.HSL hsl) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("HSL_to_RGB", hsl);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RgbHsl.HSL RGB_to_HSL(Color c) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("RGB_to_HSL", c);
      if (res == null) return null;
      return new RgbHsl.HSL((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color GetOppositeColor(Color c) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("GetOppositeColor", c);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Color GetOppositeColor2(Color c) {
    try {
      Object res = Javonet.getType("BCE.Misc.RgbHsl").invoke("GetOppositeColor2", c);
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class HSL {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setH(java.lang.Double value) {
      try {
        javonetHandle.set("H", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Double getH() {
      try {
        java.lang.Double res = javonetHandle.get("H");
        if (res == null) return 0.0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0.0;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setS(java.lang.Double value) {
      try {
        javonetHandle.set("S", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Double getS() {
      try {
        java.lang.Double res = javonetHandle.get("S");
        if (res == null) return 0.0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0.0;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setL(java.lang.Double value) {
      try {
        javonetHandle.set("L", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Double getL() {
      try {
        java.lang.Double res = javonetHandle.get("L");
        if (res == null) return 0.0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0.0;
      }
    }

    public HSL() {
      try {
        javonetHandle = Javonet.New("BCE.Misc.RgbHsl+HSL");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public HSL(NObject handle) {
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
