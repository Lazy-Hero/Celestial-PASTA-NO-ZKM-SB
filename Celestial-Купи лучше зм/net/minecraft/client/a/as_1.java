/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.Sys
 *  org.lwjgl.opengl.ARBFramebufferObject
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexBufferObject
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.EXTBlendFuncSeparate
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 */
package net.minecraft.client.a;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.ar.K;
import net.minecraft.ar.T;
import net.minecraft.client.Q;
import net.minecraft.client.a.H;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aH;
import net.minecraft.client.a.v;
import net.minecraft.client.y.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class as {
    private static /* synthetic */ boolean P;
    public static /* synthetic */ int Q;
    public static /* synthetic */ boolean T;
    public static /* synthetic */ boolean y;
    public static /* synthetic */ float x;
    public static /* synthetic */ int M;
    public static /* synthetic */ int k;
    public static /* synthetic */ int S;
    public static /* synthetic */ int j;
    public static /* synthetic */ int l;
    public static /* synthetic */ int X;
    private static /* synthetic */ boolean N;
    public static /* synthetic */ int c;
    public static /* synthetic */ int U;
    private static /* synthetic */ boolean h;
    public static /* synthetic */ int C;
    public static /* synthetic */ int W;
    public static /* synthetic */ int A;
    private static /* synthetic */ String q;
    public static /* synthetic */ int R;
    private static /* synthetic */ boolean Z;
    public static /* synthetic */ int O;
    public static /* synthetic */ int K;
    public static /* synthetic */ int r;
    public static /* synthetic */ int o;
    private static /* synthetic */ boolean G;
    private static final /* synthetic */ Logger w;
    public static /* synthetic */ int ad;
    public static /* synthetic */ int p;
    public static /* synthetic */ int z;
    public static /* synthetic */ int u;
    public static /* synthetic */ int i;
    private static /* synthetic */ boolean J;
    public static /* synthetic */ int E;
    public static /* synthetic */ int n;
    public static /* synthetic */ int B;
    public static /* synthetic */ int H;
    public static /* synthetic */ boolean d;
    public static /* synthetic */ int D;
    public static /* synthetic */ int f;
    public static /* synthetic */ int t;
    public static /* synthetic */ boolean m;
    private static /* synthetic */ H ac;
    public static /* synthetic */ int Y;
    public static /* synthetic */ int aa;
    public static /* synthetic */ int V;
    public static /* synthetic */ int F;
    public static /* synthetic */ boolean s;
    public static /* synthetic */ boolean a;
    public static /* synthetic */ int e;
    public static /* synthetic */ boolean I;
    public static /* synthetic */ int ab;
    private static /* synthetic */ String L;
    public static /* synthetic */ boolean ae;
    public static /* synthetic */ int b;
    public static /* synthetic */ float v;
    public static /* synthetic */ int g;

    public static void m(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = h;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBMultitexture.glActiveTextureARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL13.glActiveTexture((int)n3);
        }
    }

    public static void a(int n2, boolean bl2, FloatBuffer floatBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniformMatrix2ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniformMatrix2((int)n3, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    public static void b(int n2, IntBuffer intBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform4ARB((int)n2, (IntBuffer)intBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform4((int)n3, (IntBuffer)intBuffer);
        }
    }

    public static boolean d() {
        return m;
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glShaderSourceARB((int)n2, (ByteBuffer)byteBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glShaderSource((int)n3, (ByteBuffer)byteBuffer);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int f(int n2, int n3) {
        int n4;
        String string = net.minecraft.client.a.I.j();
        int n5 = Z;
        if (string == null) {
            if (n5 != 0) {
                n4 = ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)n3);
                return n4;
            }
            n5 = n2;
        }
        n4 = GL20.glGetShaderi((int)n5, (int)n3);
        return n4;
    }

    public static void d(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glLinkProgramARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glLinkProgram((int)n3);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void e(int var0, int var1_1) {
        var2_2 = net.minecraft.client.a.I.j();
        v0 = as.T;
        if (var2_2 == null) {
            if (v0 == 0) return;
            v0 = aH.a[as.ac.ordinal()];
        }
        if (var2_2 != null) ** GOTO lbl10
        switch (v0 ? 1 : 0) {
            case 1: {
                v0 = var0;
lbl10:
                // 2 sources

                GL30.glBindRenderbuffer((int)v0, (int)var1_1);
                if (var2_2 == null) return;
            }
            case 2: {
                ARBFramebufferObject.glBindRenderbuffer((int)var0, (int)var1_1);
                if (var2_2 == null) return;
            }
            case 3: {
                EXTFramebufferObject.glBindRenderbufferEXT((int)var0, (int)var1_1);
                return;
            }
        }
    }

    public static void c(int n2, FloatBuffer floatBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform3ARB((int)n2, (FloatBuffer)floatBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform3((int)n3, (FloatBuffer)floatBuffer);
        }
    }

    public static int i() {
        String string = net.minecraft.client.a.I.j();
        int n2 = T;
        if (string == null) {
            if (n2 == 0) {
                return -1;
            }
            n2 = aH.a[ac.ordinal()];
        }
        if (string == null) {
            switch (n2) {
                case 1: {
                    return GL30.glGenFramebuffers();
                }
                case 2: {
                    return ARBFramebufferObject.glGenFramebuffers();
                }
                case 3: {
                    return EXTFramebufferObject.glGenFramebuffersEXT();
                }
            }
            n2 = -1;
        }
        return n2;
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform4ARB((int)n2, (FloatBuffer)floatBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform4((int)n3, (FloatBuffer)floatBuffer);
        }
    }

    public static void f(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = h;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBMultitexture.glClientActiveTextureARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL13.glClientActiveTexture((int)n3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void b(int var0, int var1_1, int var2_2, int var3_3) {
        var4_4 = net.minecraft.client.a.I.j();
        v0 = as.T;
        if (var4_4 == null) {
            if (v0 == 0) return;
            v0 = aH.a[as.ac.ordinal()];
        }
        if (var4_4 != null) ** GOTO lbl10
        switch (v0 ? 1 : 0) {
            case 1: {
                v0 = var0;
lbl10:
                // 2 sources

                GL30.glRenderbufferStorage((int)v0, (int)var1_1, (int)var2_2, (int)var3_3);
                if (var4_4 == null) return;
            }
            case 2: {
                ARBFramebufferObject.glRenderbufferStorage((int)var0, (int)var1_1, (int)var2_2, (int)var3_3);
                if (var4_4 == null) return;
            }
            case 3: {
                EXTFramebufferObject.glRenderbufferStorageEXT((int)var0, (int)var1_1, (int)var2_2, (int)var3_3);
                return;
            }
        }
    }

    public static int j(int n2) {
        String string = net.minecraft.client.a.I.j();
        int n3 = T;
        if (string == null) {
            if (n3 == 0) {
                return -1;
            }
            n3 = aH.a[ac.ordinal()];
        }
        if (string == null) {
            switch (n3) {
                case 1: {
                    return GL30.glCheckFramebufferStatus((int)n2);
                }
                case 2: {
                    return ARBFramebufferObject.glCheckFramebufferStatus((int)n2);
                }
                case 3: {
                    return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n2);
                }
            }
            n3 = -1;
        }
        return n3;
    }

    public static void a(File file) {
        String string;
        String string2;
        block10: {
            string2 = file.getAbsolutePath();
            string = net.minecraft.client.a.I.j();
            K k2 = net.minecraft.ar.T.a();
            K k3 = net.minecraft.ar.K.OSX;
            if (string == null) {
                if (k2 == k3) {
                    try {
                        w.info(string2);
                        Runtime.getRuntime().exec(new String[]{"/usr/bin/open", string2});
                        return;
                    }
                    catch (IOException iOException) {
                        w.error("Couldn't open file", (Throwable)iOException);
                        if (string == null) break block10;
                    }
                }
                k2 = net.minecraft.ar.T.a();
                k3 = net.minecraft.ar.K.WINDOWS;
            }
            if (k2 == k3) {
                String string3 = String.format("cmd.exe /C start \"Open file\" \"%s\"", string2);
                try {
                    Runtime.getRuntime().exec(string3);
                    return;
                }
                catch (IOException iOException) {
                    w.error("Couldn't open file", (Throwable)iOException);
                }
            }
        }
        boolean bl2 = false;
        try {
            Class<?> class_ = Class.forName("java.awt.Desktop");
            Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            class_.getMethod("browse", URI.class).invoke(object, file.toURI());
        }
        catch (Throwable throwable) {
            w.error("Couldn't open link", throwable);
            bl2 = true;
        }
        boolean bl3 = bl2;
        if (string == null && bl3) {
            w.info("Opening via system class!");
            bl3 = Sys.openURL((String)("file://" + string2));
        }
    }

    static {
        w = LogManager.getLogger();
        L = "";
        v = 0.0f;
        x = 0.0f;
    }

    public static void d(int n2, IntBuffer intBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform3ARB((int)n2, (IntBuffer)intBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform3((int)n3, (IntBuffer)intBuffer);
        }
    }

    public static void d(int n2, int n3) {
        block4: {
            int n4;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n4 = Z;
                    if (string != null) break block2;
                    if (n4 == 0) break block3;
                    ARBShaderObjects.glUniform1iARB((int)n2, (int)n3);
                    if (string == null) break block4;
                }
                n4 = n2;
            }
            GL20.glUniform1i((int)n4, (int)n3);
        }
    }

    public static void c(int n2, IntBuffer intBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform2ARB((int)n2, (IntBuffer)intBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform2((int)n3, (IntBuffer)intBuffer);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(int n2, CharSequence charSequence) {
        int n3;
        String string = net.minecraft.client.a.I.j();
        int n4 = Z;
        if (string == null) {
            if (n4 != 0) {
                n3 = ARBShaderObjects.glGetUniformLocationARB((int)n2, (CharSequence)charSequence);
                return n3;
            }
            n4 = n2;
        }
        n3 = GL20.glGetUniformLocation((int)n4, (CharSequence)charSequence);
        return n3;
    }

    public static void a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUseProgramObjectARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUseProgram((int)n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int g(int n2) {
        int n3;
        String string = net.minecraft.client.a.I.j();
        int n4 = Z;
        if (string == null) {
            if (n4 != 0) {
                n3 = ARBShaderObjects.glCreateShaderObjectARB((int)n2);
                return n3;
            }
            n4 = n2;
        }
        n3 = GL20.glCreateShader((int)n4);
        return n3;
    }

    public static void g(int n2, int n3) {
        block4: {
            int n4;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n4 = J;
                    if (string != null) break block2;
                    if (n4 == 0) break block3;
                    ARBVertexBufferObject.glBindBufferARB((int)n2, (int)n3);
                    if (string == null) break block4;
                }
                n4 = n2;
            }
            GL15.glBindBuffer((int)n4, (int)n3);
        }
    }

    public static void b(int n2, boolean bl2, FloatBuffer floatBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniformMatrix3ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniformMatrix3((int)n3, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c() {
        String string = net.minecraft.client.a.I.j();
        boolean bl2 = fU.aw();
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = fU.m();
        }
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = T;
        }
        if (string == null) {
            if (!bl2) return false;
            bl2 = net.minecraft.client.Q.P().ac.bt;
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void d(int n2, FloatBuffer floatBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform1ARB((int)n2, (FloatBuffer)floatBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform1((int)n3, (FloatBuffer)floatBuffer);
        }
    }

    public static int g() {
        String string = net.minecraft.client.a.I.j();
        int n2 = T;
        if (string == null) {
            if (n2 == 0) {
                return -1;
            }
            n2 = aH.a[ac.ordinal()];
        }
        if (string == null) {
            switch (n2) {
                case 1: {
                    return GL30.glGenRenderbuffers();
                }
                case 2: {
                    return ARBFramebufferObject.glGenRenderbuffers();
                }
                case 3: {
                    return EXTFramebufferObject.glGenRenderbuffersEXT();
                }
            }
            n2 = -1;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(int var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        var5_5 = net.minecraft.client.a.I.j();
        v0 = as.T;
        if (var5_5 == null) {
            if (v0 == 0) return;
            v0 = aH.a[as.ac.ordinal()];
        }
        if (var5_5 != null) ** GOTO lbl10
        switch (v0 ? 1 : 0) {
            case 1: {
                v0 = var0;
lbl10:
                // 2 sources

                GL30.glFramebufferTexture2D((int)v0, (int)var1_1, (int)var2_2, (int)var3_3, (int)var4_4);
                if (var5_5 == null) return;
            }
            case 2: {
                ARBFramebufferObject.glFramebufferTexture2D((int)var0, (int)var1_1, (int)var2_2, (int)var3_3, (int)var4_4);
                if (var5_5 == null) return;
            }
            case 3: {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)var0, (int)var1_1, (int)var2_2, (int)var3_3, (int)var4_4);
                return;
            }
        }
    }

    public static void a(int n2, float f10, float f11) {
        block5: {
            block4: {
                int n3;
                block2: {
                    block3: {
                        String string = net.minecraft.client.a.I.j();
                        n3 = h;
                        if (string != null) break block2;
                        if (n3 == 0) break block3;
                        ARBMultitexture.glMultiTexCoord2fARB((int)n2, (float)f10, (float)f11);
                        if (string == null) break block4;
                    }
                    n3 = n2;
                }
                GL13.glMultiTexCoord2f((int)n3, (float)f10, (float)f11);
            }
            if (n2 != p) break block5;
            v = f10;
            x = f11;
        }
    }

    public static String b() {
        return L;
    }

    public static void i(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glDeleteObjectARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glDeleteProgram((int)n3);
        }
    }

    /*
     * Exception decompiling
     */
    public static void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public static int e() {
        String string = net.minecraft.client.a.I.j();
        int n2 = J;
        if (string == null) {
            n2 = n2 != 0 ? ARBVertexBufferObject.glGenBuffersARB() : GL15.glGenBuffers();
        }
        return n2;
    }

    public static void e(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = J;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBVertexBufferObject.glDeleteBuffersARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL15.glDeleteBuffers((int)n3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean f() {
        String string = net.minecraft.client.a.I.j();
        boolean bl2 = fU.aR();
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = ae;
        }
        if (string == null) {
            if (!bl2) return false;
            bl2 = net.minecraft.client.Q.P().ac.bz;
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void c(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glDeleteObjectARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glDeleteShader((int)n3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void b(int var0, int var1_1) {
        var2_2 = net.minecraft.client.a.I.j();
        v0 = as.T;
        if (var2_2 == null) {
            if (v0 == 0) return;
            v0 = aH.a[as.ac.ordinal()];
        }
        if (var2_2 != null) ** GOTO lbl10
        switch (v0 ? 1 : 0) {
            case 1: {
                v0 = var0;
lbl10:
                // 2 sources

                GL30.glBindFramebuffer((int)v0, (int)var1_1);
                if (var2_2 == null) return;
            }
            case 2: {
                ARBFramebufferObject.glBindFramebuffer((int)var0, (int)var1_1);
                if (var2_2 == null) return;
            }
            case 3: {
                EXTFramebufferObject.glBindFramebufferEXT((int)var0, (int)var1_1);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(int n2, CharSequence charSequence) {
        int n3;
        String string = net.minecraft.client.a.I.j();
        int n4 = Z;
        if (string == null) {
            if (n4 != 0) {
                n3 = ARBVertexShader.glGetAttribLocationARB((int)n2, (CharSequence)charSequence);
                return n3;
            }
            n4 = n2;
        }
        n3 = GL20.glGetAttribLocation((int)n4, (CharSequence)charSequence);
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void b(int var0) {
        var1_1 = net.minecraft.client.a.I.j();
        v0 = as.T;
        if (var1_1 == null) {
            if (v0 == 0) return;
            v0 = aH.a[as.ac.ordinal()];
        }
        if (var1_1 != null) ** GOTO lbl10
        switch (v0 ? 1 : 0) {
            case 1: {
                v0 = var0;
lbl10:
                // 2 sources

                GL30.glDeleteFramebuffers((int)v0);
                if (var1_1 == null) return;
            }
            case 2: {
                ARBFramebufferObject.glDeleteFramebuffers((int)var0);
                if (var1_1 == null) return;
            }
            case 3: {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)var0);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int h(int n2, int n3) {
        int n4;
        String string = net.minecraft.client.a.I.j();
        int n5 = Z;
        if (string == null) {
            if (n5 != 0) {
                n4 = ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)n3);
                return n4;
            }
            n5 = n2;
        }
        n4 = GL20.glGetProgrami((int)n5, (int)n3);
        return n4;
    }

    public static String j() {
        String string = net.minecraft.client.a.I.j();
        String string2 = q;
        if (string == null) {
            string2 = string2 == null ? "<unknown>" : q;
        }
        return string2;
    }

    public static void c(int n2, boolean bl2, FloatBuffer floatBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniformMatrix4ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniformMatrix4((int)n3, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(int var0, int var1_1, int var2_2, int var3_3) {
        var4_4 = net.minecraft.client.a.I.j();
        v0 = as.T;
        if (var4_4 == null) {
            if (v0 == 0) return;
            v0 = aH.a[as.ac.ordinal()];
        }
        if (var4_4 != null) ** GOTO lbl10
        switch (v0 ? 1 : 0) {
            case 1: {
                v0 = var0;
lbl10:
                // 2 sources

                GL30.glFramebufferRenderbuffer((int)v0, (int)var1_1, (int)var2_2, (int)var3_3);
                if (var4_4 == null) return;
            }
            case 2: {
                ARBFramebufferObject.glFramebufferRenderbuffer((int)var0, (int)var1_1, (int)var2_2, (int)var3_3);
                if (var4_4 == null) return;
            }
            case 3: {
                EXTFramebufferObject.glFramebufferRenderbufferEXT((int)var0, (int)var1_1, (int)var2_2, (int)var3_3);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String i(int n2, int n3) {
        String string;
        String string2 = net.minecraft.client.a.I.j();
        int n4 = Z;
        if (string2 == null) {
            if (n4 != 0) {
                string = ARBShaderObjects.glGetInfoLogARB((int)n2, (int)n3);
                return string;
            }
            n4 = n2;
        }
        string = GL20.glGetShaderInfoLog((int)n4, (int)n3);
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void k(int var0) {
        var1_1 = net.minecraft.client.a.I.j();
        v0 = as.T;
        if (var1_1 == null) {
            if (v0 == 0) return;
            v0 = aH.a[as.ac.ordinal()];
        }
        if (var1_1 != null) ** GOTO lbl10
        switch (v0 ? 1 : 0) {
            case 1: {
                v0 = var0;
lbl10:
                // 2 sources

                GL30.glDeleteRenderbuffers((int)v0);
                if (var1_1 == null) return;
            }
            case 2: {
                ARBFramebufferObject.glDeleteRenderbuffers((int)var0);
                if (var1_1 == null) return;
            }
            case 3: {
                EXTFramebufferObject.glDeleteRenderbuffersEXT((int)var0);
                return;
            }
        }
    }

    public static int h() {
        String string = net.minecraft.client.a.I.j();
        int n2 = Z;
        if (string == null) {
            n2 = n2 != 0 ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(int n2, int n3) {
        String string;
        String string2 = net.minecraft.client.a.I.j();
        int n4 = Z;
        if (string2 == null) {
            if (n4 != 0) {
                string = ARBShaderObjects.glGetInfoLogARB((int)n2, (int)n3);
                return string;
            }
            n4 = n2;
        }
        string = GL20.glGetProgramInfoLog((int)n4, (int)n3);
        return string;
    }

    public static void h(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glCompileShaderARB((int)n2);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glCompileShader((int)n3);
        }
    }

    public static void a(int n2, IntBuffer intBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform1ARB((int)n2, (IntBuffer)intBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform1((int)n3, (IntBuffer)intBuffer);
        }
    }

    public static void c(int n2, int n3, int n4, int n5) {
        block6: {
            int n6;
            block2: {
                block3: {
                    int n7;
                    String string;
                    block4: {
                        block5: {
                            string = net.minecraft.client.a.I.j();
                            n6 = P;
                            if (string != null) break block2;
                            if (n6 == 0) break block3;
                            n7 = d;
                            if (string != null) break block4;
                            if (n7 == 0) break block5;
                            EXTBlendFuncSeparate.glBlendFuncSeparateEXT((int)n2, (int)n3, (int)n4, (int)n5);
                            if (string == null) break block6;
                        }
                        n7 = n2;
                    }
                    GL14.glBlendFuncSeparate((int)n7, (int)n3, (int)n4, (int)n5);
                    if (string == null) break block6;
                }
                n6 = n2;
            }
            GL11.glBlendFunc((int)n6, (int)n3);
        }
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        block4: {
            int n4;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n4 = J;
                    if (string != null) break block2;
                    if (n4 == 0) break block3;
                    ARBVertexBufferObject.glBufferDataARB((int)n2, (ByteBuffer)byteBuffer, (int)n3);
                    if (string == null) break block4;
                }
                n4 = n2;
            }
            GL15.glBufferData((int)n4, (ByteBuffer)byteBuffer, (int)n3);
        }
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n3 = Z;
                    if (string != null) break block2;
                    if (n3 == 0) break block3;
                    ARBShaderObjects.glUniform2ARB((int)n2, (FloatBuffer)floatBuffer);
                    if (string == null) break block4;
                }
                n3 = n2;
            }
            GL20.glUniform2((int)n3, (FloatBuffer)floatBuffer);
        }
    }

    public static void l(int n2) {
        net.minecraft.client.a.v.L();
        net.minecraft.client.a.v.a(false);
        W w2 = net.minecraft.client.a.W.c();
        I i2 = w2.b();
        GL11.glLineWidth((float)4.0f);
        i2.a(1, net.minecraft.client.y.b.i);
        i2.c(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
        i2.c((double)n2, 0.0, 0.0).b(0, 0, 0, 255).d();
        i2.c(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
        i2.c(0.0, (double)n2, 0.0).b(0, 0, 0, 255).d();
        i2.c(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
        i2.c(0.0, 0.0, (double)n2).b(0, 0, 0, 255).d();
        w2.a();
        GL11.glLineWidth((float)2.0f);
        i2.a(1, net.minecraft.client.y.b.i);
        i2.c(0.0, 0.0, 0.0).b(255, 0, 0, 255).d();
        i2.c((double)n2, 0.0, 0.0).b(255, 0, 0, 255).d();
        i2.c(0.0, 0.0, 0.0).b(0, 255, 0, 255).d();
        i2.c(0.0, (double)n2, 0.0).b(0, 255, 0, 255).d();
        i2.c(0.0, 0.0, 0.0).b(127, 127, 255, 255).d();
        i2.c(0.0, 0.0, (double)n2).b(127, 127, 255, 255).d();
        w2.a();
        GL11.glLineWidth((float)1.0f);
        net.minecraft.client.a.v.a(true);
        net.minecraft.client.a.v.x();
    }

    public static void c(int n2, int n3) {
        block4: {
            int n4;
            block2: {
                block3: {
                    String string = net.minecraft.client.a.I.j();
                    n4 = Z;
                    if (string != null) break block2;
                    if (n4 == 0) break block3;
                    ARBShaderObjects.glAttachObjectARB((int)n2, (int)n3);
                    if (string == null) break block4;
                }
                n4 = n2;
            }
            GL20.glAttachShader((int)n4, (int)n3);
        }
    }
}

