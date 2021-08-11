/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.Sys
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.opengl.PixelFormat
 *  org.lwjgl.util.glu.GLU
 */
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.minecraft.af.c;
import net.minecraft.ah.A;
import net.minecraft.ah.G;
import net.minecraft.ah.p;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.D.i;
import net.minecraft.client.D.o;
import net.minecraft.client.D.t;
import net.minecraft.client.D.w;
import net.minecraft.client.L;
import net.minecraft.client.Q;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.x;
import net.minecraft.client.b.l;
import net.minecraft.client.j.f;
import net.minecraft.client.j.j;
import net.minecraft.client.j.u;
import net.minecraft.k.n;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class fU {
    private static /* synthetic */ Thread y;
    public static /* synthetic */ boolean u;
    public static final /* synthetic */ String h;
    private static /* synthetic */ boolean w;
    private static /* synthetic */ o k;
    private static /* synthetic */ String A;
    public static /* synthetic */ String D;
    private static /* synthetic */ int v;
    private static final /* synthetic */ Logger b;
    private static /* synthetic */ boolean f;
    private static /* synthetic */ boolean g;
    public static /* synthetic */ int F;
    public static final /* synthetic */ String o;
    private static /* synthetic */ net.minecraft.client.l.c p;
    public static final /* synthetic */ Float t;
    private static /* synthetic */ DisplayMode E;
    public static /* synthetic */ String r;
    public static /* synthetic */ String[] s;
    private static final /* synthetic */ Q l;
    private static /* synthetic */ int i;
    public static final /* synthetic */ String x;
    public static /* synthetic */ boolean c;
    public static final /* synthetic */ String a;
    private static /* synthetic */ int j;
    private static /* synthetic */ DisplayMode[] z;
    public static final /* synthetic */ String C;
    public static /* synthetic */ k n;
    public static /* synthetic */ boolean q;
    public static /* synthetic */ k d;
    private static /* synthetic */ boolean B;
    public static /* synthetic */ String m;
    public static /* synthetic */ boolean e;

    public static void b(String string) {
        b.info("[OptiFine] " + string);
    }

    public static void x() {
        int n2 = Q.aL();
        String string = fU.c(fU.l.j);
        int n3 = fU.l.a2.A();
        int n4 = fU.l.a2.k();
        int n5 = fU.l.a2.c();
        String string2 = "" + n2 + " fps, C: " + n3 + ", E: " + n4 + "+" + n5 + ", U: " + string;
        fU.l.a6.b(string2, 2.0f, 2.0f, -2039584);
    }

    public static String bk() {
        Object[] arrobject;
        block5: {
            String string = K.d();
            if (l.aa() == null) {
                return "";
            }
            a[] arra = fU.bf();
            int n2 = arra.length;
            if (string == null) {
                if (n2 <= 0) {
                    return fU.l().b();
                }
                n2 = arra.length;
            }
            Object[] arrobject2 = new String[n2];
            for (int i2 = 0; i2 < arra.length; ++i2) {
                arrobject = arrobject2;
                if (string == null) {
                    arrobject[i2] = arra[i2].b();
                    if (string == null) continue;
                }
                break block5;
            }
            arrobject = arrobject2;
        }
        String string = fU.a(arrobject);
        return string;
    }

    public static boolean a4() {
        String string = K.d();
        boolean bl2 = fU.p.e;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static InputStream a(v v2) throws IOException {
        return fU.b(l.O(), v2);
    }

    public static void aj() {
        block3: {
            x x2;
            block2: {
                String string = K.d();
                l.ao().a(fU.l.P, fU.l.aT);
                String string2 = string;
                x2 = fU.l.Y;
                if (string2 != null) break block2;
                if (x2 == null) break block3;
                x2 = fU.l.Y;
            }
            x2.a(fU.l.P, fU.l.aT);
        }
    }

    public static void bg() {
        fU.B();
        v = fU.p.a;
        fU.af();
        fU.ai();
        y = Thread.currentThread();
        fU.Y();
        cS.a(Q.P());
    }

    public static boolean ad() {
        return u;
    }

    public static boolean aC() {
        return fU.p.s;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static k a(String var0, k var1_1) {
        var2_2 = K.d();
        try {
            v0 = var0;
            if (var2_2 == null) {
                if (v0 == null) {
                    return var1_1;
                }
                v0 = "([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?";
            }
            var3_3 = Pattern.compile(v0);
            var4_5 = var3_3.matcher(var0);
            v1 = var4_5.matches();
            if (var2_2 == null) {
                if (v1 == 0) {
                    return var1_1;
                }
                v1 = Integer.parseInt(var4_5.group(1));
            }
            var5_6 = v1;
            var6_7 = Integer.parseInt(var4_5.group(2));
            v2 = var4_5.group(4);
            if (var2_2 != null) ** GOTO lbl21
            if (v2 != null) {
                v2 = var4_5.group(4);
lbl21:
                // 2 sources

                v3 = Integer.parseInt(v2);
            } else {
                v3 = 0;
            }
            var7_8 = v3;
            var8_9 = var4_5.group(5);
            return new k(var5_6, var6_7, var7_8, var8_9);
        }
        catch (Exception var3_4) {
            var3_4.printStackTrace();
            return var1_1;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void f() {
        fU.j = 0;
        var0 = K.d();
        v0 = var1_1 = fU.ba();
        if (var0 != null) ** GOTO lbl8
        if (v0 == null) return;
        try {
            v0 = var1_1;
lbl8:
            // 2 sources

            if ((var2_2 = v0.a(new v("mcpatcher/color.properties")).c()) == null) {
                return;
            }
            var3_4 = new Properties();
            var3_4.load(var2_2);
            var2_2.close();
            v1 = var4_5 = var3_4.getProperty("clouds");
            if (var0 == null) {
                if (v1 == null) {
                    return;
                }
                fU.b("Texture pack clouds: " + var4_5);
                v1 = var4_5 = var4_5.toLowerCase();
            }
            v2 = v1.equals("fast");
            if (var0 == null) {
                if (v2 != 0) {
                    fU.j = 1;
                }
                v2 = var4_5.equals("fancy");
            }
            if (var0 == null) {
                if (v2 != 0) {
                    fU.j = 2;
                }
                v2 = var4_5.equals("off");
            }
            if (var0 == null) {
                if (v2 == 0) return;
                v2 = 3;
            }
            fU.j = v2 ? 1 : 0;
            return;
        }
        catch (Exception var2_3) {
            // empty catch block
        }
    }

    public static k bn() {
        k k2;
        block4: {
            block5: {
                String string = K.d();
                k2 = d;
                if (string != null) break block4;
                if (k2 != null) break block5;
                String string2 = GL11.glGetString((int)35724);
                k2 = d = fU.a(string2, null);
                if (string != null) break block4;
                if (k2 == null) {
                    d = new k(1, 10);
                }
            }
            k2 = d;
        }
        return k2;
    }

    public static a c(v v2) {
        block17: {
            o o2;
            block16: {
                boolean bl2;
                block12: {
                    String string;
                    w w2;
                    block14: {
                        a a10;
                        block15: {
                            a a11;
                            block13: {
                                w2 = l.aa();
                                a11 = w2.a();
                                string = K.d();
                                a10 = a11;
                                if (string != null) break block13;
                                if (a10 == null) break block14;
                                a10 = a11;
                            }
                            if (string != null) break block15;
                            if (!a10.b(v2)) break block14;
                            a10 = a11;
                        }
                        return a10;
                    }
                    List<i> list = w2.g;
                    int n2 = list.size() - 1;
                    while (n2 >= 0) {
                        i i2 = list.get(n2);
                        a a12 = i2.e();
                        if (string == null) {
                            bl2 = a12.b(v2);
                            if (string != null) break block12;
                            if (bl2) {
                                return a12;
                            }
                            --n2;
                        }
                        if (string == null) continue;
                    }
                    o2 = fU.l();
                    if (string != null) break block16;
                    bl2 = o2.b(v2);
                }
                if (!bl2) break block17;
                o2 = fU.l();
            }
            return o2;
        }
        return null;
    }

    public static boolean aJ() {
        return fU.p.aY;
    }

    private static void C() {
        gJ gJ2 = new gJ();
        gJ2.start();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static DisplayMode bc() {
        DisplayMode displayMode;
        DisplayMode displayMode2;
        block9: {
            int n2;
            int n3;
            block8: {
                DisplayMode[] arrdisplayMode = fU.c();
                String string = K.d();
                DisplayMode[] arrdisplayMode2 = arrdisplayMode;
                if (string == null) {
                    if (arrdisplayMode2 == null) return E;
                    arrdisplayMode2 = arrdisplayMode;
                }
                if (string == null) {
                    if (arrdisplayMode2.length < 1) return E;
                    arrdisplayMode2 = arrdisplayMode;
                }
                displayMode2 = arrdisplayMode2[arrdisplayMode.length - 1];
                n3 = E.getWidth();
                n2 = displayMode2.getWidth();
                if (string == null) {
                    if (n3 > n2) {
                        return E;
                    }
                    n3 = E.getWidth();
                    n2 = displayMode2.getWidth();
                }
                if (string != null) break block8;
                if (n3 != n2) break block9;
                displayMode = E;
                if (string != null) return displayMode;
                n3 = displayMode.getHeight();
                n2 = displayMode2.getHeight();
            }
            if (n3 > n2) {
                displayMode = E;
                return displayMode;
            }
        }
        displayMode = displayMode2;
        return displayMode;
    }

    public static int aP() {
        String[] arrstring = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        String string = K.d();
        int n2 = 0;
        while (n2 < arrstring.length) {
            block3: {
                block4: {
                    int n3;
                    block5: {
                        String string2 = arrstring[n2];
                        String string3 = System.getProperty(string2);
                        if (string != null) break block3;
                        if (string3 == null) break block4;
                        n3 = string3.contains("64");
                        if (string != null) break block5;
                        if (n3 == 0) break block4;
                        n3 = 64;
                    }
                    return n3;
                }
                ++n2;
            }
            if (string == null) continue;
        }
        return 32;
    }

    public static boolean aH() {
        return fU.p.bT;
    }

    public static boolean a(String string, boolean bl2) {
        String string2 = K.d();
        try {
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return bl2;
                }
                string3 = string = string.trim();
            }
            return Boolean.parseBoolean(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return bl2;
        }
    }

    public static boolean a_() {
        String string = K.d();
        boolean bl2 = fU.p.af;
        if (string == null) {
            if (!bl2) {
                return fU.p.aC;
            }
            bl2 = fU.p.af;
        }
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static Object[] a(Object[] arrobject, Object[] arrobject2) {
        String string = K.d();
        Object[] arrobject3 = arrobject;
        if (string == null) {
            if (arrobject3 == null) {
                throw new NullPointerException("The given array is NULL");
            }
            arrobject3 = arrobject2;
        }
        int n2 = arrobject3.length;
        if (string == null) {
            if (n2 == 0) {
                return arrobject;
            }
            n2 = arrobject.length;
        }
        int n3 = n2;
        int n4 = n3 + arrobject2.length;
        Object[] arrobject4 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n4);
        System.arraycopy(arrobject, 0, arrobject4, 0, n3);
        System.arraycopy(arrobject2, 0, arrobject4, n3, arrobject2.length);
        return arrobject4;
    }

    public static boolean e() {
        return fU.p.u;
    }

    public static boolean bb() {
        String string = K.d();
        boolean bl2 = fU.p.b;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static int a(int n2, int n3, int n4) {
        int n5;
        block5: {
            int n6;
            block4: {
                String string = K.d();
                n5 = n2;
                n6 = n3;
                if (string != null) break block4;
                if (n5 < n6) {
                    return n3;
                }
                n5 = n2;
                if (string != null) break block5;
                n6 = n4;
            }
            n5 = n5 > n6 ? n4 : n2;
        }
        return n5;
    }

    public static boolean as() {
        return fU.p.bs;
    }

    public static int b(String string, int n2) {
        String string2 = K.d();
        try {
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return n2;
                }
                string3 = string = string.trim();
            }
            return Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static float U() {
        return fU.p.an;
    }

    public static String P() {
        String string;
        StringBuffer stringBuffer = new StringBuffer(32);
        String string2 = K.d();
        if (string2 == null) {
            if (fU.bi()) {
                stringBuffer.append("DL: ");
                stringBuffer.append(gk.a());
                stringBuffer.append(", ");
            }
            stringBuffer.append("OptiFine_1.12.2_HD_U_C6");
        }
        String string3 = string = cS.w();
        if (string2 == null) {
            if (string3 != null) {
                stringBuffer.append(", ");
                stringBuffer.append(string);
            }
            string3 = stringBuffer.toString();
        }
        return string3;
    }

    public static boolean R() {
        return fU.p.am;
    }

    public static boolean an() {
        return fU.p.I;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean aY() {
        var0 = K.d();
        v0 = fU.p.o;
        if (var0 == null) {
            if (v0) {
                v1 = fU.p.o;
                if (var0 != null) return (boolean)v1;
                if (v1 != 2) return (boolean)0;
                return (boolean)1;
            }
            v0 = (boolean)(fU.ag() ? 1 : 0);
        }
        if (var0 == null) {
            if (v0) {
                v0 = cS.ak.b();
                if (var0 == null) {
                    if (!v0) {
                        return cS.ak.d();
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = fU.j;
            }
        }
        if (var0 != null) return v0;
        if (!v0) {
            v0 = fU.p.aC;
            return v0;
        }
        v2 = fU.j;
        if (var0 != null) return (boolean)v2;
        if (v2 != 2) return (boolean)0;
        return (boolean)1;
    }

    public static f a(f f10) {
        String string = K.d();
        try {
            BufferedImage bufferedImage;
            InputStream inputStream;
            v v2 = new v("textures/gui/title/mojang.png");
            InputStream inputStream2 = inputStream = fU.a(v2);
            if (string == null) {
                if (inputStream2 == null) {
                    return f10;
                }
                inputStream2 = inputStream;
            }
            if ((bufferedImage = ImageIO.read(inputStream2)) == null) {
                return f10;
            }
            f f11 = new f(bufferedImage);
            return f11;
        }
        catch (Exception exception) {
            fU.h(exception.getClass().getName() + ": " + exception.getMessage());
            return f10;
        }
    }

    public static boolean A() {
        return fU.p.p;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static void T() {
        fU.e(fU.z());
        fU.e("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        String string = K.d();
        fU.e("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        fU.e("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        fU.e("LWJGL: " + Sys.getVersion());
        r = GL11.glGetString((int)7938);
        D = GL11.glGetString((int)7937);
        m = GL11.glGetString((int)7936);
        fU.e("OpenGL: " + D + ", version " + r + ", " + m);
        String string2 = string;
        fU.e("OpenGL Version: " + fU.aZ());
        int n2 = GLContext.getCapabilities().OpenGL12;
        if (string2 == null) {
            if (n2 == 0) {
                fU.e("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
            }
            e = GLContext.getCapabilities().GL_NV_fog_distance;
            n2 = e;
        }
        if (string2 == null) {
            if (n2 == 0) {
                fU.e("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
            }
            u = GLContext.getCapabilities().GL_ARB_occlusion_query;
            n2 = u ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 == 0) {
                fU.e("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
            }
            n2 = fp.b();
        }
        int n3 = n2;
    }

    public static DisplayMode a(Dimension dimension) throws LWJGLException {
        DisplayMode displayMode;
        block3: {
            DisplayMode[] arrdisplayMode = fU.c();
            String string = K.d();
            int n2 = 0;
            while (n2 < arrdisplayMode.length) {
                block4: {
                    block5: {
                        DisplayMode displayMode2;
                        block6: {
                            DisplayMode displayMode3 = arrdisplayMode[n2];
                            if (string != null) break block4;
                            displayMode = displayMode3;
                            if (string != null) break block3;
                            if (displayMode.getWidth() != dimension.width) break block5;
                            displayMode2 = displayMode3;
                            if (string != null) break block6;
                            if (displayMode2.getHeight() != dimension.height) break block5;
                            displayMode2 = displayMode3;
                        }
                        return displayMode2;
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            displayMode = E;
        }
        return displayMode;
    }

    public static int a0() {
        return i;
    }

    public static boolean S() {
        String string = K.d();
        boolean bl2 = fU.p.bV;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static boolean bm() {
        return fU.p.aJ;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aT() {
        String string = K.d();
        boolean bl2 = fU.an();
        if (string == null) {
            if (!bl2) {
                return false;
            }
            bl2 = fU.ag();
        }
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = cS.t();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String string = K.d();
        byte[] arrby = new byte[1024];
        while (true) {
            int n2;
            if ((n2 = inputStream.read(arrby)) < 0) {
                inputStream.close();
                byte[] arrby2 = byteArrayOutputStream.toByteArray();
                if (string != null) continue;
                return arrby2;
            }
            byteArrayOutputStream.write(arrby, 0, n2);
        }
    }

    public static boolean ac() {
        String string = K.d();
        boolean bl2 = fU.p.H;
        if (string == null) {
            if (!bl2) {
                return fU.p.aC;
            }
            bl2 = fU.p.H;
        }
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean b() {
        var0 = K.d();
        v0 = fU.ag();
        if (var0 == null) {
            if (v0 != 0) {
                v0 = cS.i();
                if (var0 == null) {
                    if (v0 == 0) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = fU.p.bp;
            }
        }
        if (var0 == null) {
            if (v0 == 0) {
                return fU.p.aC;
            }
            v0 = fU.p.bp;
        }
        if (var0 != null) return (boolean)v0;
        if (v0 != 2) return (boolean)0;
        return (boolean)1;
    }

    public static float a(String string, float f10) {
        String string2 = K.d();
        try {
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return f10;
                }
                string3 = string = string.trim();
            }
            return Float.parseFloat(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return f10;
        }
    }

    public static void d(String string) {
        b.error("[OptiFine] " + string);
    }

    public static Dimension aa() {
        String[] arrstring;
        String string;
        String string2 = K.d();
        if (E == null) {
            return null;
        }
        net.minecraft.client.l.c c10 = p;
        if (string2 == null) {
            if (c10 == null) {
                return new Dimension(E.getWidth(), E.getHeight());
            }
            c10 = p;
        }
        String string3 = string = c10.l;
        String string4 = "Default";
        if (string2 == null) {
            if (string3.equals(string4)) {
                return new Dimension(E.getWidth(), E.getHeight());
            }
            string3 = string;
            string4 = " x";
        }
        return (arrstring = fU.c(string3, string4)).length < 2 ? new Dimension(E.getWidth(), E.getHeight()) : new Dimension(fU.b(arrstring[0], -1), fU.b(arrstring[1], -1));
    }

    public static A aq() {
        G g10;
        c c10;
        net.minecraft.client.E.l l2 = fU.l.e;
        String string = K.d();
        if (l2 == null) {
            return null;
        }
        Q q2 = l;
        if (string == null) {
            if (!q2.n()) {
                return null;
            }
            q2 = l;
        }
        if ((c10 = q2.ae()) == null) {
            return null;
        }
        G g11 = g10 = l2.D;
        if (string == null) {
            if (g11 == null) {
                return null;
            }
            g11 = g10;
        }
        p p2 = g11.r();
        try {
            A a10 = c10.c(p2.a());
            return a10;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public static boolean J() {
        return fU.p.R;
    }

    public static boolean ah() {
        return fU.p.by;
    }

    public static boolean u() {
        return fU.p.h;
    }

    public static boolean aN() {
        float f10 = fU.n();
        String string = K.d();
        float f11 = f10 - (t.floatValue() + 1.0E-5f);
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (string == null) {
            f12 = f12 > 0 ? 1.0f : 0.0f;
        }
        return (boolean)f12;
    }

    private static DisplayMode[] a(DisplayMode[] arrdisplayMode, Dimension dimension) {
        ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
        for (int i2 = 0; i2 < arrdisplayMode.length; ++i2) {
            DisplayMode displayMode = arrdisplayMode[i2];
            if ((double)displayMode.getWidth() != dimension.getWidth() || (double)displayMode.getHeight() != dimension.getHeight()) continue;
            arrayList.add(displayMode);
        }
        DisplayMode[] arrdisplayMode2 = arrayList.toArray((T[])new DisplayMode[arrayList.size()]);
        return arrdisplayMode2;
    }

    public static boolean a(int n2, int[] arrn) {
        int n3;
        block3: {
            String string = K.d();
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                n3 = arrn[i2];
                if (string == null) {
                    boolean bl2;
                    if (string == null) {
                        if (n3 != n2) continue;
                        bl2 = true;
                    }
                    return bl2;
                }
                break block3;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public static boolean L() {
        String string = K.d();
        boolean bl2 = fU.p.bV;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean a3() {
        String string = K.d();
        boolean bl2 = fU.p.ce;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean b(Object object, Object[] arrobject) {
        boolean bl2;
        block5: {
            String string = K.d();
            if (arrobject == null) {
                return false;
            }
            int n2 = 0;
            while (n2 < arrobject.length) {
                Object object2 = arrobject[n2];
                if (string == null) {
                    bl2 = fU.a(object, object2);
                    if (string != null) break block5;
                    if (bl2) {
                        return true;
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static int be() {
        switch (fU.p.b6) {
            case 0: {
                return 9986;
            }
            case 1: {
                return 9986;
            }
            case 2: {
                if (fU.aR()) {
                    return 9985;
                }
                return 9986;
            }
            case 3: {
                if (fU.aR()) {
                    return 9987;
                }
                return 9986;
            }
        }
        return 9986;
    }

    public static boolean s() {
        String string = K.d();
        boolean bl2 = fU.p.b;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static boolean e(v v2) {
        a a10 = fU.c(v2);
        return a10 == fU.l();
    }

    public static boolean p() {
        return fU.p.aO;
    }

    public static int ak() {
        return v;
    }

    public static boolean H() {
        return fU.p.aB;
    }

    public static boolean W() {
        String string = K.d();
        boolean bl2 = fU.p.af;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean bi() {
        String string = K.d();
        boolean bl2 = fU.p.aN;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static boolean E() {
        return fU.p.a1;
    }

    public static boolean aL() {
        return e;
    }

    public static o l() {
        o o2;
        block2: {
            block3: {
                w w2;
                block4: {
                    w w3;
                    String string = K.d();
                    o2 = k;
                    if (string != null) break block2;
                    if (o2 != null) break block3;
                    Q q2 = Q.P();
                    o2 = k = (o)cq.a(q2, cq.bF);
                    if (string != null) break block2;
                    if (o2 != null) break block3;
                    w2 = w3 = q2.aa();
                    if (string != null) break block4;
                    if (w2 == null) break block3;
                    w2 = w3;
                }
                k = (o)w2.j;
            }
            o2 = k;
        }
        return o2;
    }

    public static net.minecraft.client.D.v d(v v2) throws IOException {
        return l.O().a(v2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static InputStream b(t t2, v v2) throws IOException {
        net.minecraft.client.D.v v3 = t2.a(v2);
        String string = K.d();
        net.minecraft.client.D.v v4 = v3;
        if (string == null) {
            if (v4 == null) {
                return null;
            }
            v4 = v3;
        }
        InputStream inputStream = v4.c();
        return inputStream;
    }

    private static void a(String string, int n2) {
        block8: {
            String string2 = K.d();
            try {
                ThreadGroup threadGroup;
                ThreadGroup threadGroup2 = threadGroup = Thread.currentThread().getThreadGroup();
                if (string2 == null) {
                    if (threadGroup2 == null) {
                        return;
                    }
                    threadGroup2 = threadGroup;
                }
                int n3 = (threadGroup2.activeCount() + 10) * 2;
                Thread[] arrthread = new Thread[n3];
                threadGroup.enumerate(arrthread, false);
                int n4 = 0;
                while (n4 < arrthread.length) {
                    block9: {
                        block10: {
                            Thread thread;
                            block11: {
                                Thread thread2 = arrthread[n4];
                                if (string2 != null) break block8;
                                if (string2 != null) break block9;
                                if (thread2 == null) break block10;
                                thread = thread2;
                                if (string2 != null) break block11;
                                if (!thread.getName().startsWith(string)) break block10;
                                thread = thread2;
                            }
                            thread.setPriority(n2);
                        }
                        ++n4;
                    }
                    if (string2 == null) continue;
                    break;
                }
            }
            catch (Throwable throwable) {
                fU.h(throwable.getClass().getName() + ": " + throwable.getMessage());
            }
        }
    }

    public static int a(n n2, int n3) {
        int n4 = fU.a(n3 + 37);
        n4 = fU.a(n4 + n2.e());
        n4 = fU.a(n4 + n2.a());
        n4 = fU.a(n4 + n2.b());
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aB() {
        String string = K.d();
        boolean bl2 = fU.bi();
        if (string == null) {
            if (!bl2) {
                return false;
            }
            bl2 = fU.ag();
        }
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = cS.b();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static boolean v() {
        return fU.p.N;
    }

    public static String aZ() {
        k k2 = fU.I();
        String string = "" + k2.a() + "." + k2.b() + "." + k2.c();
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b(String string, String string2) {
        String[] arrstring = fU.f(string);
        String[] arrstring2 = fU.f(string2);
        String string3 = arrstring[0];
        String string4 = K.d();
        String string5 = arrstring2[0];
        int n2 = string3.equals(string5);
        if (string4 == null) {
            if (n2 == 0) {
                return string3.compareTo(string5);
            }
            n2 = fU.b(arrstring[1], -1);
        }
        int n3 = n2;
        int n4 = fU.b(arrstring2[1], -1);
        int n6 = n3;
        n6 = n4;
        if (string4 != null) return n5 - n6;
        if (n5 != n6) {
            int n6 = n3;
            n6 = n4;
            return n5 - n6;
        }
        String string6 = arrstring[2];
        String string7 = arrstring2[2];
        int n7 = string6.equals(string7);
        if (string4 != null) return n7;
        if (n7 == 0) {
            n7 = string6.isEmpty() ? 1 : 0;
            if (string4 == null) {
                if (n7 != 0) {
                    return 1;
                }
                n7 = string7.isEmpty() ? 1 : 0;
            }
            if (string4 != null) return n7;
            if (n7 != 0) {
                return -1;
            }
        }
        n7 = string6.compareTo(string7);
        return n7;
    }

    public static DisplayMode[] c() {
        if (z == null) {
            try {
                DisplayMode[] arrdisplayMode = Display.getAvailableDisplayModes();
                Set<Dimension> set = fU.a(arrdisplayMode);
                ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
                for (Dimension dimension : set) {
                    DisplayMode[] arrdisplayMode2 = fU.a(arrdisplayMode, dimension);
                    DisplayMode displayMode = fU.a(arrdisplayMode2, E);
                    if (displayMode == null) continue;
                    arrayList.add(displayMode);
                }
                DisplayMode[] arrdisplayMode3 = arrayList.toArray((T[])new DisplayMode[arrayList.size()]);
                Arrays.sort(arrdisplayMode3, new gt());
                return arrdisplayMode3;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                z = new DisplayMode[]{E};
            }
        }
        return z;
    }

    public static String a(InputStream inputStream) throws IOException {
        return fU.a(inputStream, "ASCII");
    }

    public static String a(int[] arrn) {
        String string = K.d();
        if (arrn == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(arrn.length * 5);
        int n2 = 0;
        while (n2 < arrn.length) {
            int n3 = arrn[n2];
            if (string == null) {
                if (n2 > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(n3);
                ++n2;
            }
            if (string == null) continue;
        }
        return stringBuffer.toString();
    }

    public static boolean bl() {
        String string = K.d();
        boolean bl2 = fU.p.a9;
        if (string == null) {
            if (!bl2) {
                return fU.p.aC;
            }
            bl2 = fU.p.a9;
        }
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static String[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return fU.d(fileInputStream);
    }

    public static boolean w() {
        return fU.p.z;
    }

    public static boolean O() {
        return fU.p.a7;
    }

    public static boolean bd() {
        return fU.p.bj;
    }

    public static j ax() {
        return fU.aX().an();
    }

    public static boolean a6() {
        return fU.p.aH;
    }

    public static boolean a7() {
        String string = K.d();
        boolean bl2 = fU.p.aN;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean a(Object object, Object[] arrobject) {
        String string = K.d();
        if (arrobject == null) {
            return false;
        }
        int n2 = 0;
        while (n2 < arrobject.length) {
            Object object2 = arrobject[n2];
            if (string == null) {
                if (object == object2) {
                    return true;
                }
                ++n2;
            }
            if (string == null) continue;
        }
        return false;
    }

    public static void a(net.minecraft.client.l.c c10) {
        block3: {
            net.minecraft.client.l.c c11;
            block2: {
                String string = K.d();
                c11 = p;
                if (string != null) break block2;
                if (c11 != null) break block3;
                c11 = c10;
            }
            p = c11;
            E = Display.getDesktopDisplayMode();
            fU.t();
            ea.a("optifine.ForgeSplashCompatible", Boolean.TRUE);
        }
    }

    public static boolean ab() {
        return fU.p.bi;
    }

    public static Q aX() {
        return l;
    }

    public static boolean aG() {
        return fU.p.ap;
    }

    public static float n() {
        return t.floatValue();
    }

    static {
        o = "OptiFine_1.12.2_HD_U_C6";
        a = "1.12.2";
        x = "C6";
        h = "HD_U";
        C = "OptiFine";
        A = null;
        f = false;
        r = null;
        D = null;
        m = null;
        s = null;
        n = null;
        d = null;
        F = -1;
        e = false;
        u = false;
        p = null;
        l = Q.P();
        B = false;
        y = null;
        E = null;
        z = null;
        v = 0;
        i = 0;
        q = false;
        j = 0;
        c = false;
        g = false;
        w = false;
        k = null;
        t = Float.valueOf(0.1f);
        b = LogManager.getLogger();
    }

    public static boolean i() {
        return fU.p.al;
    }

    public static int bh() {
        return fU.p.n;
    }

    public static void e(String string) {
        fU.b(string);
    }

    public static aF ao() {
        return fU.l.a2;
    }

    public static int a1() {
        return fU.p.Y;
    }

    public static boolean ar() {
        String string = K.d();
        boolean bl2 = fU.p.J;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static void g(String string) {
        block3: {
            int n2;
            int n3;
            block2: {
                n3 = GL11.glGetError();
                String string2 = K.d();
                n2 = n3;
                if (string2 != null) break block2;
                if (n2 == 0) break block3;
                n2 = n3;
            }
            String string3 = GLU.gluErrorString((int)n2);
            fU.d("OpenGlError: " + n3 + " (" + string3 + "), at: " + string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void af() {
        int n2 = fU.ak();
        String string = K.d();
        if (n2 > 0) {
            DisplayMode displayMode = Display.getDisplayMode();
            fU.b("FSAA Samples: " + n2);
            try {
                Display.destroy();
                Display.setDisplayMode((DisplayMode)displayMode);
                Display.create((PixelFormat)new PixelFormat().withDepthBits(24).withSamples(n2));
                Display.setResizable((boolean)false);
                Display.setResizable((boolean)true);
            }
            catch (LWJGLException lWJGLException) {
                fU.h("Error setting FSAA: " + n2 + "x");
                lWJGLException.printStackTrace();
                try {
                    Display.setDisplayMode((DisplayMode)displayMode);
                    Display.create((PixelFormat)new PixelFormat().withDepthBits(24));
                    Display.setResizable((boolean)false);
                    Display.setResizable((boolean)true);
                }
                catch (LWJGLException lWJGLException2) {
                    lWJGLException2.printStackTrace();
                    try {
                        Display.setDisplayMode((DisplayMode)displayMode);
                        Display.create();
                        Display.setResizable((boolean)false);
                        Display.setResizable((boolean)true);
                    }
                    catch (LWJGLException lWJGLException3) {
                        lWJGLException3.printStackTrace();
                    }
                }
            }
            if (!Q.I && fU.l() != null) {
                InputStream inputStream;
                block12: {
                    InputStream inputStream2;
                    InputStream inputStream3;
                    block13: {
                        inputStream3 = null;
                        inputStream2 = null;
                        try {
                            inputStream3 = fU.l().c(new v("icons/icon_16x16.png"));
                            inputStream2 = fU.l().c(new v("icons/icon_32x32.png"));
                            inputStream = inputStream3;
                            if (string != null) break block12;
                            if (inputStream == null) break block13;
                            inputStream = inputStream2;
                            if (string != null) break block12;
                            if (inputStream == null) break block13;
                            Display.setIcon((ByteBuffer[])new ByteBuffer[]{fU.c(inputStream3), fU.c(inputStream2)});
                        }
                        catch (IOException iOException) {
                            try {
                                fU.h("Error setting window icon: " + iOException.getClass().getName() + ": " + iOException.getMessage());
                            }
                            catch (Throwable throwable) {
                                IOUtils.closeQuietly(inputStream3);
                                IOUtils.closeQuietly(inputStream2);
                                throw throwable;
                            }
                            IOUtils.closeQuietly((InputStream)inputStream3);
                            IOUtils.closeQuietly((InputStream)inputStream2);
                        }
                    }
                    IOUtils.closeQuietly((InputStream)inputStream3);
                    inputStream = inputStream2;
                }
                IOUtils.closeQuietly((InputStream)inputStream);
            }
        }
    }

    public static String a(Object[] arrobject) {
        if (arrobject == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(arrobject.length * 5);
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Object object = arrobject[i2];
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(object);
        }
        return stringBuffer.toString();
    }

    public static Object[] a(Object[] arrobject, Object object, int n2) {
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(arrobject));
        arrayList.add(n2, object);
        Object[] arrobject2 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), arrayList.size());
        return arrayList.toArray(arrobject2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ap() {
        String string = K.d();
        boolean bl2 = fU.G();
        if (string == null) {
            if (!bl2) return false;
            bl2 = fU.p.E;
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static String a(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            string3 = string3 == null ? "" : string;
        }
        return string3;
    }

    public static float a(float f10) {
        float f11;
        block5: {
            float f12;
            block4: {
                String string = K.d();
                float f13 = f10 - 0.0f;
                f12 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                if (string != null) break block4;
                if (f12 < 0) {
                    return 0.0f;
                }
                f11 = f10;
                if (string != null) break block5;
                float f14 = f11 - 1.0f;
                f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            }
            f11 = f12 > 0 ? 1.0f : f10;
        }
        return f11;
    }

    public static boolean aU() {
        String string = K.d();
        boolean bl2 = fU.p.e;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean aK() {
        return fU.p.Z;
    }

    private static Set<Dimension> a(DisplayMode[] arrdisplayMode) {
        HashSet<Dimension> hashSet = new HashSet<Dimension>();
        for (int i2 = 0; i2 < arrdisplayMode.length; ++i2) {
            DisplayMode displayMode = arrdisplayMode[i2];
            Dimension dimension = new Dimension(displayMode.getWidth(), displayMode.getHeight());
            hashSet.add(dimension);
        }
        return hashSet;
    }

    public static int[] a(int[] arrn, int[] arrn2) {
        block5: {
            int[] arrn3;
            block3: {
                int[] arrn4;
                String string;
                block6: {
                    block4: {
                        string = K.d();
                        arrn4 = arrn;
                        if (string != null) break block4;
                        if (arrn4 == null) break block5;
                        arrn4 = arrn2;
                    }
                    if (string != null) break block6;
                    if (arrn4 == null) break block5;
                    arrn4 = arrn;
                }
                int n2 = arrn4.length;
                int n3 = n2 + arrn2.length;
                int[] arrn5 = new int[n3];
                System.arraycopy(arrn, 0, arrn5, 0, n2);
                for (int i2 = 0; i2 < arrn2.length; ++i2) {
                    arrn3 = arrn5;
                    if (string == null) {
                        arrn3[i2 + n2] = arrn2[i2];
                        if (string == null) continue;
                    }
                    break block3;
                }
                arrn3 = arrn5;
            }
            return arrn3;
        }
        throw new NullPointerException("The given array is NULL");
    }

    public static boolean aR() {
        if (fU.bh() > 1) {
            return true;
        }
        return fU.ak() > 0;
    }

    public static boolean aW() {
        return fU.p.S;
    }

    public static u o() {
        return l.aN();
    }

    public static void Y() {
        block5: {
            block2: {
                block3: {
                    String string;
                    block4: {
                        String string2 = K.d();
                        fU.t();
                        string = string2;
                        int n2 = 8;
                        if (string != null) break block2;
                        if (!fU.G()) break block3;
                        if (!fU.J()) break block4;
                        y.setPriority(10);
                        fU.a("Server thread", 1);
                        if (string == null) break block5;
                    }
                    y.setPriority(5);
                    fU.a("Server thread", 5);
                    if (string == null) break block5;
                }
                y.setPriority(10);
            }
            fU.a("Server thread", 5);
        }
    }

    public static boolean m() {
        String string = K.d();
        boolean bl2 = fU.ak();
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public static void a(long l2) {
        try {
            Thread.sleep(l2);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(int n2, int n3, int n4) {
        String string = K.d();
        boolean bl2 = n2;
        int n5 = n3;
        if (string == null) {
            if (bl2 < n5) return false;
            bl2 = n2;
            if (string != null) return bl2;
            n5 = n4;
        }
        if (bl2 > n5) return false;
        return true;
    }

    public static boolean j() {
        return fU.p.bw;
    }

    public static boolean bj() {
        String string = K.d();
        boolean bl2 = fU.p.J;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean g() {
        return fU.p.aX;
    }

    public static double a(double d10, double d11, double d12) {
        double d13;
        block5: {
            double d14;
            block4: {
                String string = K.d();
                d14 = d10 == d11 ? 0 : (d10 < d11 ? -1 : 1);
                if (string != null) break block4;
                if (d14 < 0) {
                    return d11;
                }
                d13 = d10;
                if (string != null) break block5;
                double d15 = d13 - d12;
                d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
            }
            d13 = d14 > 0 ? d12 : d10;
        }
        return d13;
    }

    public static String[] aI() {
        String[] arrstring;
        block2: {
            DisplayMode[] arrdisplayMode = fU.c();
            String string = K.d();
            String[] arrstring2 = new String[arrdisplayMode.length];
            for (int i2 = 0; i2 < arrdisplayMode.length; ++i2) {
                DisplayMode displayMode = arrdisplayMode[i2];
                String string2 = "" + displayMode.getWidth() + "x" + displayMode.getHeight();
                arrstring = arrstring2;
                if (string == null) {
                    arrstring[i2] = string2;
                    if (string == null) continue;
                }
                break block2;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }

    public static int a9() {
        String string = K.d();
        net.minecraft.client.l.c c10 = p;
        if (string == null) {
            if (c10 == null) {
                return 10;
            }
            c10 = p;
        }
        int n2 = c10.bf;
        return n2;
    }

    private static ByteBuffer c(InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer;
        block2: {
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            int[] arrn = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
            byteBuffer = ByteBuffer.allocate(4 * arrn.length);
            int[] arrn2 = arrn;
            int n2 = arrn2.length;
            String string = K.d();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = arrn2[i2];
                byteBuffer.putInt(n3 << 8 | n3 >> 24 & 0xFF);
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            byteBuffer.flip();
        }
        return byteBuffer;
    }

    public static a[] bf() {
        ArrayList<a> arrayList;
        block3: {
            w w2 = l.aa();
            List<i> list = w2.b();
            arrayList = new ArrayList<a>();
            String string = K.d();
            for (i i2 : list) {
                arrayList.add(i2.e());
                if (string == null) {
                    if (string == null) continue;
                }
                break block3;
            }
            if (w2.a() != null) {
                arrayList.add(w2.a());
            }
        }
        a[] arra = arrayList.toArray(new a[arrayList.size()]);
        return arra;
    }

    public static void h(String string) {
        b.warn("[OptiFine] " + string);
    }

    public static boolean G() {
        String string = K.d();
        boolean bl2 = fU.a0();
        if (string == null) {
            bl2 = bl2 <= true;
        }
        return bl2;
    }

    public static boolean ae() {
        return fU.p.bQ;
    }

    public static k I() {
        k k2;
        block6: {
            block7: {
                String string = K.d();
                k2 = n;
                if (string != null) break block6;
                if (k2 != null) break block7;
                String string2 = GL11.glGetString((int)7938);
                k2 = n = fU.a(string2, null);
                if (string == null) {
                    if (k2 == null) {
                        n = fU.aF();
                    }
                    k2 = n;
                }
                if (string != null) break block6;
                if (k2 == null) {
                    n = new k(1, 0);
                }
            }
            k2 = n;
        }
        return k2;
    }

    public static void t() {
        i = Runtime.getRuntime().availableProcessors();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void ai() {
        var0 = K.d();
        try {
            block22: {
                block23: {
                    block25: {
                        block24: {
                            v0 = fU.l.aM();
                            if (var0 != null) break block22;
                            if (!v0) break block23;
                            v1 = fU.g;
                            if (var0 == null) {
                                if (v1) {
                                    return;
                                }
                                fU.g = true;
                                v1 = false;
                            }
                            fU.w = v1;
                            var1_1 = Display.getDisplayMode();
                            var2_3 = fU.aa();
                            if (var2_3 == null) {
                                return;
                            }
                            v2 = var1_1;
                            if (var0 == null) {
                                if (v2.getWidth() == var2_3.width) {
                                    v2 = var1_1;
                                    if (var0 == null) {
                                        if (v2.getHeight() == var2_3.height) {
                                            return;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    v2 = fU.a(var2_3);
                                }
                            }
                            v3 = var3_4 = v2;
                            if (var0 == null) {
                                if (v3 == null) {
                                    return;
                                }
                                v3 = var3_4;
                            }
                            Display.setDisplayMode((DisplayMode)v3);
                            fU.l.P = Display.getDisplayMode().getWidth();
                            fU.l.aT = Display.getDisplayMode().getHeight();
                            v4 = fU.l.P;
                            if (var0 != null) break block24;
                            if (v4 <= 0) {
                                fU.l.P = 1;
                            }
                            v5 = fU.l;
                            if (var0 != null) break block25;
                            v4 = v5.aT;
                        }
                        if (v4 <= 0) {
                            fU.l.aT = 1;
                        }
                        v5 = fU.l;
                    }
                    if (var0 == null) {
                        if (v5.aO != null) {
                            var4_5 = new l(fU.l);
                            var5_6 = var4_5.e();
                            var6_7 = var4_5.a();
                            fU.l.aO.a(fU.l, var5_6, var6_7);
                        }
                        fU.l.ar = new L(fU.l);
                        fU.aj();
                        Display.setFullscreen((boolean)true);
                        v5 = fU.l;
                    }
                    v5.ac.g();
                    net.minecraft.client.a.v.x();
                    if (var0 == null) return;
                }
                v0 = fU.w;
            }
            if (var0 == null) {
                if (v0) {
                    return;
                }
                fU.w = true;
                fU.g = false;
                fU.l.ac.g();
                Display.update();
                net.minecraft.client.a.v.x();
                Display.setResizable((boolean)false);
                v0 = true;
            }
            Display.setResizable((boolean)v0);
            return;
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
            fU.p.l = "Default";
            fU.p.h();
        }
    }

    public static boolean ag() {
        return cS.E;
    }

    public static void a(boolean bl2) {
        f = bl2;
    }

    public static boolean at() {
        return fU.p.a3;
    }

    public static boolean X() {
        String string = K.d();
        boolean bl2 = fU.p.D;
        if (string == null) {
            if (!bl2) {
                boolean bl3 = fU.p.aC;
                if (string == null) {
                    bl3 = !bl3;
                }
                return bl3;
            }
            bl2 = fU.p.D;
        }
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean aO() {
        return fU.p.aE;
    }

    public static boolean k() {
        return fU.p.au;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean d() {
        var0 = K.d();
        v0 = fU.p.o;
        if (var0 == null) {
            if (v0) {
                v1 = fU.p.o;
                if (var0 != null) return (boolean)v1;
                if (v1 != 3) return (boolean)0;
                return (boolean)1;
            }
            v0 = (boolean)(fU.ag() ? 1 : 0);
        }
        if (var0 == null) {
            if (v0) {
                v0 = cS.ak.b();
                if (var0 == null) {
                    if (!v0) {
                        return cS.ak.c();
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = fU.j;
            }
        }
        if (var0 != null) return v0;
        if (!v0) {
            return false;
        }
        v2 = fU.j;
        if (var0 != null) return (boolean)v2;
        if (v2 != 3) return (boolean)0;
        return (boolean)1;
    }

    public static boolean h() {
        String string = K.d();
        boolean bl2 = fU.p.D;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean aD() {
        return fU.p.cd;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Object object, Object object2) {
        String string = K.d();
        Object object3 = object;
        if (string == null) {
            if (object3 == object2) {
                return true;
            }
            object3 = object;
        }
        if (string == null) {
            if (object3 == null) return false;
            object3 = object;
        }
        boolean bl2 = object3.equals(object2);
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static boolean am() {
        String string = K.d();
        boolean bl2 = fU.p.i;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static int F() {
        return fU.p.b2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean V() {
        String string = K.d();
        boolean bl2 = fU.an();
        if (string == null) {
            if (!bl2) {
                return false;
            }
            bl2 = fU.ag();
        }
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = cS.aN();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static net.minecraft.client.l.c a() {
        return p;
    }

    private static k aF() {
        String string = K.d();
        boolean bl2 = GLContext.getCapabilities().OpenGL44;
        if (string == null) {
            if (bl2) {
                return new k(4, 4);
            }
            bl2 = GLContext.getCapabilities().OpenGL43;
        }
        if (string == null) {
            if (bl2) {
                return new k(4, 3);
            }
            bl2 = GLContext.getCapabilities().OpenGL42;
        }
        if (string == null) {
            if (bl2) {
                return new k(4, 2);
            }
            bl2 = GLContext.getCapabilities().OpenGL41;
        }
        if (string == null) {
            if (bl2) {
                return new k(4, 1);
            }
            bl2 = GLContext.getCapabilities().OpenGL40;
        }
        if (string == null) {
            if (bl2) {
                return new k(4, 0);
            }
            bl2 = GLContext.getCapabilities().OpenGL33;
        }
        if (string == null) {
            if (bl2) {
                return new k(3, 3);
            }
            bl2 = GLContext.getCapabilities().OpenGL32;
        }
        if (string == null) {
            if (bl2) {
                return new k(3, 2);
            }
            bl2 = GLContext.getCapabilities().OpenGL31;
        }
        if (string == null) {
            if (bl2) {
                return new k(3, 1);
            }
            bl2 = GLContext.getCapabilities().OpenGL30;
        }
        if (string == null) {
            if (bl2) {
                return new k(3, 0);
            }
            bl2 = GLContext.getCapabilities().OpenGL21;
        }
        if (string == null) {
            if (bl2) {
                return new k(2, 1);
            }
            bl2 = GLContext.getCapabilities().OpenGL20;
        }
        if (string == null) {
            if (bl2) {
                return new k(2, 0);
            }
            bl2 = GLContext.getCapabilities().OpenGL15;
        }
        if (string == null) {
            if (bl2) {
                return new k(1, 5);
            }
            bl2 = GLContext.getCapabilities().OpenGL14;
        }
        if (string == null) {
            if (bl2) {
                return new k(1, 4);
            }
            bl2 = GLContext.getCapabilities().OpenGL13;
        }
        if (string == null) {
            if (bl2) {
                return new k(1, 3);
            }
            bl2 = GLContext.getCapabilities().OpenGL12;
        }
        if (string == null) {
            if (bl2) {
                return new k(1, 2);
            }
            bl2 = GLContext.getCapabilities().OpenGL11;
        }
        return bl2 ? new k(1, 1) : new k(1, 0);
    }

    public static String[] aE() {
        String string = K.d();
        String[] arrstring = s;
        if (string == null) {
            if (arrstring == null) {
                s = fU.D();
            }
            arrstring = s;
        }
        return arrstring;
    }

    public static boolean az() {
        String string = K.d();
        boolean bl2 = fU.bh();
        if (string == null) {
            bl2 = bl2 > true;
        }
        return bl2;
    }

    public static boolean ay() {
        return fU.p.aI;
    }

    public static int a(int n2) {
        n2 = n2 ^ 0x3D ^ n2 >> 16;
        n2 += n2 << 3;
        n2 ^= n2 >> 4;
        n2 *= 668265261;
        n2 ^= n2 >> 15;
        return n2;
    }

    public static void B() {
        block3: {
            boolean bl2;
            block4: {
                String string;
                block2: {
                    string = K.d();
                    bl2 = B;
                    if (string != null) break block2;
                    if (bl2) break block3;
                    bl2 = Display.isCreated();
                }
                if (string != null) break block4;
                if (!bl2) break block3;
                bl2 = true;
            }
            B = bl2;
            fU.T();
            fU.C();
        }
    }

    private static DisplayMode a(DisplayMode[] arrdisplayMode, DisplayMode displayMode) {
        if (displayMode != null) {
            for (int i2 = 0; i2 < arrdisplayMode.length; ++i2) {
                DisplayMode displayMode2 = arrdisplayMode[i2];
                if (displayMode2.getBitsPerPixel() != displayMode.getBitsPerPixel() || displayMode2.getFrequency() != displayMode.getFrequency()) continue;
                return displayMode2;
            }
        }
        if (arrdisplayMode.length <= 0) {
            return null;
        }
        Arrays.sort(arrdisplayMode, new gt());
        return arrdisplayMode[arrdisplayMode.length - 1];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static String[] f(String var0) {
        var1_1 = K.d();
        v0 = var0;
        if (var1_1 != null) ** GOTO lbl6
        if (v0 != null) {
            v0 = var0;
lbl6:
            // 2 sources

            v1 = v0.length();
            if (var1_1 == null) {
                if (v1 > 0) {
                    var2_2 = Pattern.compile("([A-Z])([0-9]+)(.*)");
                    v2 = var3_3 = var2_2.matcher(var0);
                    if (var1_1 == null) {
                        if (!v2.matches()) {
                            return new String[]{"", "", ""};
                        }
                        v2 = var3_3;
                    }
                    var4_4 = fU.a(v2.group(1));
                    var5_5 = fU.a(var3_3.group(2));
                    var6_6 = fU.a(var3_3.group(3));
                    return new String[]{var4_4, var5_5, var6_6};
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v1 = 3;
        }
        v3 = new String[v1];
        v3[0] = "";
        v3[1] = "";
        v3[2] = "";
        return v3;
    }

    public static net.minecraft.client.x.x a2() {
        return fU.l.Y().e;
    }

    public static boolean a8() {
        return Thread.currentThread() == y;
    }

    public static String[] d(InputStream inputStream) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);
        String string = K.d();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String string2;
            if ((string2 = bufferedReader.readLine()) == null) {
                String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
                if (string != null) continue;
                return arrstring;
            }
            arrayList.add(string2);
        }
    }

    public static boolean a(t t2, v v2) {
        try {
            net.minecraft.client.D.v v3 = t2.a(v2);
            return v3 != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static boolean aS() {
        String string = K.d();
        boolean bl2 = fU.a().a;
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public static void a(String string, String string2) {
        dT dT2 = new dT(fU.l.aO, string, string2);
        l.a(dT2);
    }

    public static String b(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return fU.a(fileInputStream, "ASCII");
    }

    private static String[] D() {
        Object object;
        block8: {
            String string = K.d();
            try {
                String[] arrstring;
                block9: {
                    int n2;
                    object = fU.I();
                    int n3 = ((k)object).a();
                    if (string == null) {
                        if (n3 < 3) break block8;
                        n3 = GL11.glGetInteger((int)33309);
                    }
                    int n4 = n2 = n3;
                    if (string == null) {
                        if (n4 <= 0) break block8;
                        n4 = n2;
                    }
                    String[] arrstring2 = new String[n4];
                    for (int i2 = 0; i2 < n2; ++i2) {
                        arrstring = arrstring2;
                        if (string == null) {
                            arrstring[i2] = GL30.glGetStringi((int)7939, (int)i2);
                            if (string == null) continue;
                        }
                        break block9;
                    }
                    arrstring = arrstring2;
                }
                return arrstring;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        try {
            object = GL11.glGetString((int)7939);
            String[] arrstring = ((String)object).split(" ");
            return arrstring;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String[0];
        }
    }

    public static void a(File file, String string) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] arrby = string.getBytes(StandardCharsets.US_ASCII);
        fileOutputStream.write(arrby);
        fileOutputStream.close();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float q() {
        float f10;
        block5: {
            int n2;
            block4: {
                String string = K.d();
                n2 = fU.ag();
                if (string != null) break block4;
                if (n2 == 0) break block5;
                f10 = cS.as;
                if (string != null) return f10;
                float f11 = f10 - 0.0f;
                n2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            }
            if (n2 >= 0) {
                f10 = cS.as;
                return f10;
            }
        }
        f10 = fU.p.aG;
        return f10;
    }

    public static String y() {
        return A;
    }

    public static String z() {
        return "OptiFine_1.12.2_HD_U_C6";
    }

    public static int Q() {
        return fU.p.c;
    }

    public static float a(float f10, float f11, float f12) {
        float f13;
        block5: {
            float f14;
            block4: {
                String string = K.d();
                f14 = f10 == f11 ? 0 : (f10 < f11 ? -1 : 1);
                if (string != null) break block4;
                if (f14 < 0) {
                    return f11;
                }
                f13 = f10;
                if (string != null) break block5;
                float f15 = f13 - f12;
                f14 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            }
            f13 = f14 > 0 ? f12 : f10;
        }
        return f13;
    }

    public static boolean b(v v2) {
        a a10 = fU.c(v2);
        return a10 != null;
    }

    public static Object[] a(Object[] arrobject, Object object) {
        String string = K.d();
        Object[] arrobject2 = arrobject;
        if (string == null) {
            if (arrobject2 == null) {
                throw new NullPointerException("The given array is NULL");
            }
            arrobject2 = arrobject;
        }
        int n2 = arrobject2.length;
        int n3 = n2 + 1;
        Object[] arrobject3 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n3);
        System.arraycopy(arrobject, 0, arrobject3, 0, n2);
        arrobject3[n2] = object;
        return arrobject3;
    }

    public static String[] c(String string, String string2) {
        ArrayList<String[]> arrayList;
        String[] arrstring;
        ArrayList<String[]> arrayList2;
        block2: {
            StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
            String string3 = K.d();
            arrayList2 = new ArrayList<String[]>();
            while (stringTokenizer.hasMoreTokens()) {
                arrstring = stringTokenizer.nextToken();
                arrayList = arrayList2;
                if (string3 == null) {
                    arrayList.add(arrstring);
                    if (string3 == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        arrstring = arrayList.toArray(new String[arrayList2.size()]);
        return arrstring;
    }

    public static boolean M() {
        return fU.p.aF;
    }

    public static int K() {
        int n2;
        block7: {
            block8: {
                int n3;
                block10: {
                    int n4;
                    int n5;
                    String[] arrstring;
                    block9: {
                        String string = K.d();
                        n2 = F;
                        if (string != null) break block7;
                        if (n2 >= 0) break block8;
                        arrstring = fU.c("1.12.2", ".");
                        n5 = 0;
                        n3 = arrstring.length;
                        if (string == null) {
                            if (n3 > 0) {
                                n5 += 10000 * fU.b(arrstring[0], 0);
                            }
                            n3 = arrstring.length;
                        }
                        n4 = 1;
                        if (string != null) break block9;
                        if (n3 > n4) {
                            n5 += 100 * fU.b(arrstring[1], 0);
                        }
                        n3 = arrstring.length;
                        if (string != null) break block10;
                        n4 = 2;
                    }
                    if (n3 > n4) {
                        n5 += 1 * fU.b(arrstring[2], 0);
                    }
                    n3 = n5;
                }
                F = n3;
            }
            n2 = F;
        }
        return n2;
    }

    public static boolean bo() {
        String string = K.d();
        boolean bl2 = fU.p.c;
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public static DisplayMode r() {
        return E;
    }

    public static boolean N() {
        String string = K.d();
        boolean bl2 = fU.p.b;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static int[] a(int[] arrn, int n2) {
        return fU.a(arrn, new int[]{n2});
    }

    public static boolean aQ() {
        String string = K.d();
        int n2 = fU.aL();
        if (string == null) {
            if (n2 == 0) {
                return false;
            }
            n2 = fU.p.i;
        }
        if (string == null) {
            n2 = n2 == 2 ? 1 : 0;
        }
        return n2 != 0;
    }

    public static boolean aA() {
        return f;
    }

    private static String c(String string) {
        int n2;
        int n3 = string.indexOf(40);
        String string2 = K.d();
        int n4 = n3;
        if (string2 == null) {
            if (n4 < 0) {
                return "";
            }
            n4 = string.indexOf(32, n3);
        }
        return (n2 = n4) < 0 ? "" : string.substring(n3 + 1, n2);
    }

    public static void i(String string) {
        A = string;
    }

    public static String a(InputStream inputStream, String string) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuffer stringBuffer = new StringBuffer();
        String string2 = K.d();
        while (true) {
            StringBuffer stringBuffer2;
            String string3;
            if ((string3 = bufferedReader.readLine()) == null) {
                stringBuffer2 = stringBuffer;
                if (string2 != null) continue;
                return stringBuffer2.toString();
            }
            stringBuffer.append(string3);
            stringBuffer2 = stringBuffer.append("\n");
        }
    }

    public static boolean a5() {
        return false;
    }

    public static boolean av() {
        String string = K.d();
        boolean bl2 = fU.p.D;
        if (string == null) {
            if (!bl2) {
                return fU.p.aC;
            }
            bl2 = fU.p.D;
        }
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static boolean aw() {
        return fU.p.as;
    }

    public static t ba() {
        return l.O();
    }

    public static int aV() {
        String string = System.getenv("ProgramFiles(X86)");
        return string != null ? 64 : 32;
    }

    public static boolean al() {
        String string = K.d();
        boolean bl2 = fU.p.ce;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static boolean au() {
        return fU.p.bh;
    }

    public static boolean aM() {
        String string = K.d();
        boolean bl2 = fU.p.i;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static boolean Z() {
        return fU.p.M;
    }
}

