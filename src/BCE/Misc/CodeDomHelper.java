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
import jio.System.CodeDom.*;
import jio.System.CodeDom.Compiler.*;
import jio.System.IO.*;

public class CodeDomHelper {
  protected NObject javonetHandle;

  public CodeDomHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GenerateCode(
      CodeCompileUnit compileUnit, CodeDomProvider provider, TextWriter writer) {
    try {
      Javonet.getType("BCE.Misc.CodeDomHelper")
          .invoke("GenerateCode", compileUnit, provider, writer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static CompilerResults CompileCode(
      CodeCompileUnit compileUnit,
      CodeDomProvider provider,
      java.lang.String[] referencedAssemblies) {
    try {
      Object res =
          Javonet.getType("BCE.Misc.CodeDomHelper")
              .invoke("CompileCode", compileUnit, provider, new Object[] {referencedAssemblies});
      if (res == null) return null;
      return new CompilerResults((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
