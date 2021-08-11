/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ar.K;
import net.minecraft.ar.T;

public class f6 {
    public static final /* synthetic */ String k;
    public static final /* synthetic */ String g;
    public static final /* synthetic */ String A;
    public static final /* synthetic */ String e;
    public static final /* synthetic */ String l;
    public static final /* synthetic */ String c;
    public static final /* synthetic */ String x;
    public static final /* synthetic */ String q;
    public static final /* synthetic */ String p;
    public static final /* synthetic */ String z;
    public static final /* synthetic */ String r;
    public static final /* synthetic */ String n;
    public static final /* synthetic */ String o;
    public static final /* synthetic */ String y;
    public static final /* synthetic */ String s;
    public static final /* synthetic */ String d;
    public static final /* synthetic */ String m;
    private static final /* synthetic */ String j;
    public static final /* synthetic */ String b;
    public static final /* synthetic */ String a;
    public static final /* synthetic */ String w;
    public static final /* synthetic */ String h;
    public static final /* synthetic */ String t;
    public static final /* synthetic */ String v;
    public static final /* synthetic */ String u;
    private static /* synthetic */ String[] C;
    public static final /* synthetic */ String f;
    public static final /* synthetic */ String B;
    public static final /* synthetic */ String i;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static String e() {
        K k2 = T.a();
        switch (k2) {
            case WINDOWS: {
                return "MC_OS_WINDOWS";
            }
            case OSX: {
                return "MC_OS_MAC";
            }
            case LINUX: {
                return "MC_OS_LINUX";
            }
        }
        return "MC_OS_OTHER";
    }

    public static String a() {
        StringBuilder stringBuilder;
        block8: {
            stringBuilder = new StringBuilder();
            f6.a(stringBuilder, "MC_VERSION", fU.K());
            String string = dB.i();
            f6.a(stringBuilder, "MC_GL_VERSION " + fU.I().d());
            f6.a(stringBuilder, "MC_GLSL_VERSION " + fU.bn().d());
            String string2 = string;
            f6.a(stringBuilder, f6.e());
            f6.a(stringBuilder, f6.d());
            f6.a(stringBuilder, f6.b());
            int n2 = cS.bl;
            if (string2 != null) {
                if (n2 > 0) {
                    f6.a(stringBuilder, "MC_FXAA_LEVEL", cS.bl);
                }
                n2 = cS.o ? 1 : 0;
            }
            if (string2 != null) {
                if (n2 != 0) {
                    f6.a(stringBuilder, "MC_NORMAL_MAP");
                }
                n2 = cS.aT ? 1 : 0;
            }
            if (string2 != null) {
                if (n2 != 0) {
                    f6.a(stringBuilder, "MC_SPECULAR_MAP");
                }
                f6.a(stringBuilder, "MC_RENDER_QUALITY", cS.cp);
                f6.a(stringBuilder, "MC_SHADOW_QUALITY", cS.dL);
                f6.a(stringBuilder, "MC_HAND_DEPTH", cS.cd);
                n2 = cS.aG() ? 1 : 0;
            }
            if (string2 != null) {
                if (n2 != 0) {
                    f6.a(stringBuilder, "MC_OLD_HAND_LIGHT");
                }
                n2 = cS.p() ? 1 : 0;
            }
            if (n2 == 0) break block8;
            f6.a(stringBuilder, "MC_OLD_LIGHTING");
        }
        return stringBuilder.toString();
    }

    static {
        A = "MC_FXAA_LEVEL";
        x = "MC_OS_OTHER";
        e = "MC_GL_RENDERER_GEFORCE";
        p = "MC_VERSION";
        B = "MC_GL_RENDERER_GALLIUM";
        c = "MC_GL_VENDOR_INTEL";
        k = "MC_HAND_DEPTH";
        j = "MC_";
        f = "MC_GL_RENDERER_QUADRO";
        q = "MC_GL_RENDERER_MESA";
        t = "MC_OS_LINUX";
        r = "MC_GL_RENDERER_INTEL";
        b = "MC_GL_VENDOR_NVIDIA";
        v = "MC_GL_RENDERER_RADEON";
        a = "MC_OS_MAC";
        z = "MC_GL_VENDOR_ATI";
        s = "MC_SPECULAR_MAP";
        w = "MC_RENDER_QUALITY";
        l = "MC_OLD_HAND_LIGHT";
        g = "MC_GL_VERSION";
        i = "MC_GL_VENDOR_OTHER";
        d = "MC_OLD_LIGHTING";
        u = "MC_SHADOW_QUALITY";
        y = "MC_OS_WINDOWS";
        h = "MC_NORMAL_MAP";
        m = "MC_GL_RENDERER_OTHER";
        n = "MC_GL_VENDOR_XORG";
        o = "MC_GLSL_VERSION";
    }

    public static String b() {
        String string;
        block23: {
            boolean bl2;
            block22: {
                String string2 = fU.D;
                String string3 = dB.i();
                String string4 = string2;
                if (string3 != null) {
                    if (string4 == null) {
                        return "MC_GL_RENDERER_OTHER";
                    }
                    string4 = string2 = string2.toLowerCase();
                }
                bl2 = string4.startsWith("amd");
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_RADEON";
                    }
                    bl2 = string2.startsWith("ati");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_RADEON";
                    }
                    bl2 = string2.startsWith("radeon");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_RADEON";
                    }
                    bl2 = string2.startsWith("gallium");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_GALLIUM";
                    }
                    bl2 = string2.startsWith("intel");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_INTEL";
                    }
                    bl2 = string2.startsWith("geforce");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_GEFORCE";
                    }
                    bl2 = string2.startsWith("nvidia");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_GEFORCE";
                    }
                    bl2 = string2.startsWith("quadro");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_RENDERER_QUADRO";
                    }
                    bl2 = string2.startsWith("nvs");
                }
                if (string3 == null) break block22;
                if (bl2) {
                    return "MC_GL_RENDERER_QUADRO";
                }
                string = string2;
                if (string3 == null) break block23;
                bl2 = string.startsWith("mesa");
            }
            string = bl2 ? "MC_GL_RENDERER_MESA" : "MC_GL_RENDERER_OTHER";
        }
        return string;
    }

    public static String[] f() {
        String string = dB.i();
        String[] arrstring = C;
        if (string != null) {
            block4: {
                if (arrstring == null) {
                    String[] arrstring2 = fU.aE();
                    String[] arrstring3 = new String[arrstring2.length];
                    for (int i2 = 0; i2 < arrstring2.length; ++i2) {
                        arrstring3[i2] = "MC_" + arrstring2[i2];
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break block4;
                    }
                    C = arrstring3;
                }
            }
            arrstring = C;
        }
        return arrstring;
    }

    public static String d() {
        String string;
        block11: {
            boolean bl2;
            block10: {
                String string2 = fU.m;
                String string3 = dB.i();
                String string4 = string2;
                if (string3 != null) {
                    if (string4 == null) {
                        return "MC_GL_VENDOR_OTHER";
                    }
                    string4 = string2 = string2.toLowerCase();
                }
                bl2 = string4.startsWith("ati");
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_VENDOR_ATI";
                    }
                    bl2 = string2.startsWith("intel");
                }
                if (string3 != null) {
                    if (bl2) {
                        return "MC_GL_VENDOR_INTEL";
                    }
                    bl2 = string2.startsWith("nvidia");
                }
                if (string3 == null) break block10;
                if (bl2) {
                    return "MC_GL_VENDOR_NVIDIA";
                }
                string = string2;
                if (string3 == null) break block11;
                bl2 = string.startsWith("x.org");
            }
            string = bl2 ? "MC_GL_VENDOR_XORG" : "MC_GL_VENDOR_OTHER";
        }
        return string;
    }

    private static void a(StringBuilder stringBuilder, String string, int n2) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(n2);
        stringBuilder.append("\n");
    }

    public static String c() {
        return "MC_";
    }

    private static void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append("\n");
    }

    private static void a(StringBuilder stringBuilder, String string, float f10) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(f10);
        stringBuilder.append("\n");
    }
}

