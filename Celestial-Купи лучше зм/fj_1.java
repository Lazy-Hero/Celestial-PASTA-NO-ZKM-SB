/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.Z.i;
import net.minecraft.Z.l;
import net.minecraft.ah.t;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fj
implements m {
    private /* synthetic */ int l;
    private static final /* synthetic */ int s;
    private /* synthetic */ R[] w;
    public /* synthetic */ String o;
    public static final /* synthetic */ String p;
    public static final /* synthetic */ String z;
    public static final /* synthetic */ String r;
    private /* synthetic */ int m;
    public static final /* synthetic */ String k;
    private static final /* synthetic */ int h;
    private static final /* synthetic */ int c;
    private static final /* synthetic */ int d;
    private /* synthetic */ float[][] u;
    private /* synthetic */ int v;
    private /* synthetic */ int b;
    public static final /* synthetic */ String[] a;
    private /* synthetic */ int x;
    public static final /* synthetic */ String g;
    private /* synthetic */ int e;
    public static final /* synthetic */ String f;
    public static final /* synthetic */ String i;
    public /* synthetic */ String t;
    public static final /* synthetic */ String q;
    private /* synthetic */ String y;
    public static final /* synthetic */ String j;
    private /* synthetic */ int[] n;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int h() {
        String string = K.d();
        fj fj2 = this;
        if (string == null) {
            if (fj2.l == 2) {
                return 1;
            }
            fj2 = this;
        }
        int n2 = fj2.n.length;
        return n2;
    }

    public String toString() {
        return "" + this.t + "/" + this.o + ", blocks: " + fU.a(this.w) + ", source: " + this.y;
    }

    public float[][] f() {
        String string = K.d();
        float[][] arrf = this.u;
        if (string == null) {
            if (arrf == null) {
                this.u = fj.a(this.n);
            }
            arrf = this.u;
        }
        return arrf;
    }

    private int a(net.minecraft.A.h h2, n n2) {
        int n3 = net.minecraft.A.h.b(h2);
        int n4 = n2.b() - this.x;
        String string = K.d();
        int n5 = this.v;
        if (string == null) {
            if (n5 > 0) {
                int n6 = n2.e() << 16 + n2.a();
                int n7 = fU.a(n6);
                int n8 = this.v * 2 + 1;
                int n9 = (n7 & 0xFF) % n8 - this.v;
                n4 += n9;
            }
            n5 = this.a(n3, n4);
        }
        return n5;
    }

    @Override
    public boolean a() {
        String string = K.d();
        boolean bl2 = this.l;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public boolean a(l l2) {
        return gc.a(l2, this.w);
    }

    public int a(t t2, double d10, double d11, double d12, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        block5: {
            String string = K.d();
            int n9 = this.l;
            if (string == null) {
                if (n9 == 2) {
                    return this.b;
                }
                n9 = net.minecraft.k.h.f(d10);
            }
            int n10 = n9;
            int n11 = net.minecraft.k.h.f(d11);
            int n12 = net.minecraft.k.h.f(d12);
            int n13 = 0;
            int n14 = 0;
            n8 = 0;
            n7 = 0;
            fZ fZ2 = new fZ(0, 0, 0);
            n6 = n10 - n2;
            while (n6 <= n10 + n2) {
                block6: {
                    n5 = n12 - n2;
                    if (string != null) break block5;
                    for (n4 = v1248714; n4 <= n12 + n2; ++n4) {
                        fZ2.a(n6, n11, n4);
                        n3 = this.a(t2, (n)fZ2);
                        n13 += n3 >> 16 & 0xFF;
                        n14 += n3 >> 8 & 0xFF;
                        n8 += n3 & 0xFF;
                        ++n7;
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block6;
                    }
                    ++n6;
                }
                if (string == null) continue;
            }
            n6 = n13 / n7;
            n5 = n14 / n7;
        }
        n4 = n5;
        n3 = n8 / n7;
        return n6 << 16 | n4 << 8 | n3;
    }

    public int g() {
        return this.e;
    }

    private static String a(String string, String string2, String string3) {
        int n2;
        int n3;
        String string4 = K.d();
        String string5 = string;
        if (string4 == null) {
            if (string5 != null) {
                string = string.trim();
                String string6 = ".png";
                String string7 = string;
                String string8 = string6;
                if (string4 == null) {
                    if (string7.endsWith(string8)) {
                        string = string.substring(0, string.length() - string6.length());
                    }
                    string7 = string;
                    string8 = string3;
                }
                string = fj.a(string7, string8);
                return string;
            }
            string5 = string2;
        }
        String string9 = string5;
        int n4 = n3 = string2.lastIndexOf(47);
        if (string4 == null) {
            if (n4 >= 0) {
                string9 = string2.substring(n3 + 1);
            }
            n4 = n2 = string9.lastIndexOf(46);
        }
        if (string4 == null) {
            if (n2 >= 0) {
                string9 = string9.substring(0, n2);
            }
            string9 = fj.a(string9, string3);
        }
        return string9;
    }

    static {
        p = "vanilla";
        s = -1;
        c = 1;
        g = "source";
        j = "yVariance";
        i = "fixed";
        z = "yOffset";
        h = 0;
        f = "color";
        d = 2;
        r = "grid";
        q = "format";
        k = "blocks";
        a = new String[]{"vanilla", "grid", "fixed"};
    }

    private static void d(String string) {
    }

    /*
     * Exception decompiling
     */
    private void c() {
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

    private int c(net.minecraft.A.h h2, n n2) {
        double d10 = net.minecraft.k.h.c(h2.a(n2), 0.0f, 1.0f);
        double d11 = net.minecraft.k.h.c(h2.q(), 0.0f, 1.0f);
        int n3 = (int)((1.0 - d10) * (double)(this.e - 1));
        int n4 = (int)((1.0 - (d11 *= d10)) * (double)(this.m - 1));
        return this.a(n3, n4);
    }

    public boolean a(String string) {
        int n2;
        block14: {
            block15: {
                fj fj2;
                String string2;
                block12: {
                    block13: {
                        string2 = K.d();
                        fj2 = this;
                        if (string2 != null) break block12;
                        if (fj2.l == 0) break block13;
                        fj2 = this;
                        if (string2 != null) break block12;
                        if (fj2.l == 1) break block13;
                        n2 = this.l;
                        if (string2 == null) {
                            if (n2 != 2) {
                                return false;
                            }
                            n2 = this.b;
                        }
                        if (string2 != null) break block14;
                        if (n2 >= 0) break block15;
                        this.b = 0xFFFFFF;
                        if (string2 == null) break block15;
                    }
                    fj2 = this;
                }
                if (string2 == null) {
                    if (fj2.y == null) {
                        fj.d("Source not defined: " + string);
                        return false;
                    }
                    this.c();
                    fj2 = this;
                }
                if (string2 == null) {
                    if (fj2.n == null) {
                        return false;
                    }
                    fj2 = this;
                }
                n2 = fj2.b;
                if (string2 != null) break block14;
                if (n2 >= 0) break block15;
                n2 = this.l;
                if (string2 == null) {
                    if (n2 == 0) {
                        this.b = this.a(127, 127);
                    }
                    n2 = this.l;
                }
                if (string2 != null) break block14;
                if (n2 == 1) {
                    this.b = this.a(net.minecraft.u.d.s, new n(0, 64, 0));
                }
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public int d() {
        String string = K.d();
        int n2 = this.l;
        if (string == null) {
            if (n2 == 2) {
                return this.b;
            }
            n2 = fa.t.nextInt(this.n.length);
        }
        int n3 = n2;
        return this.n[n3];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private int c(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 0;
            }
            string3 = string = string.trim();
        }
        int n2 = string3.equals("vanilla");
        if (string2 == null) {
            if (n2 != 0) {
                return 0;
            }
            n2 = string.equals("grid");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.equals("fixed") ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 2;
            }
            fj.d("Unknown format: " + string);
            n2 = -1;
        }
        return n2;
    }

    public int a(int n2, int n3) {
        n2 = fU.a(n2, 0, this.e - 1);
        n3 = fU.a(n3, 0, this.m - 1);
        return this.n[n3 * this.e + n2] & 0xFFFFFF;
    }

    public boolean e(String string) {
        block3: {
            block4: {
                R[] arrr;
                block2: {
                    String string2 = K.d();
                    arrr = this.w;
                    if (string2 != null) break block2;
                    if (arrr != null) break block3;
                    this.w = this.b();
                    if (string2 != null) break block4;
                    arrr = this.w;
                }
                if (arrr != null) break block3;
                fj.d("Match blocks not defined: " + string);
            }
            return false;
        }
        return true;
    }

    private R[] b() {
        Object object;
        block5: {
            int n2;
            int n3;
            block6: {
                Matcher matcher;
                String string;
                block4: {
                    Matcher matcher2;
                    net.minecraft.W.K k2 = net.minecraft.W.K.d(this.o);
                    string = K.d();
                    if (k2 != null) {
                        return new R[]{new R(net.minecraft.W.K.b(k2))};
                    }
                    Pattern pattern = Pattern.compile("^block([0-9]+).*$");
                    matcher = matcher2 = pattern.matcher(this.o);
                    if (string != null) break block4;
                    if (!matcher.matches()) break block5;
                    matcher = matcher2;
                }
                object = matcher.group(1);
                n2 = n3 = fU.b((String)object, -1);
                if (string != null) break block6;
                if (n2 < 0) break block5;
                n2 = 1;
            }
            R[] arrr = new R[n2];
            arrr[0] = new R(n3);
            return arrr;
        }
        object = new ha("Colormap");
        R[] arrr = ((ha)object).l(this.o);
        return arrr;
    }

    private static float[][] a(int[] arrn) {
        float[][] arrf;
        block2: {
            float[][] arrf2 = new float[arrn.length][3];
            String string = K.d();
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                int n2 = arrn[i2];
                float f10 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f11 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f12 = (float)(n2 & 0xFF) / 255.0f;
                arrf = arrf2;
                if (string == null) {
                    float[] arrf3 = arrf[i2];
                    arrf3[0] = f10;
                    arrf3[1] = f11;
                    arrf3[2] = f12;
                    if (string == null) continue;
                }
                break block2;
            }
            arrf = arrf2;
        }
        return arrf;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int b(net.minecraft.A.h h2, n n2) {
        int n3;
        fj fj2;
        block6: {
            int n4;
            block5: {
                String string = K.d();
                n4 = this.l;
                if (string != null) break block5;
                if (n4 == 0) {
                    return this.c(h2, n2);
                }
                fj2 = this;
                if (string != null) break block6;
                n4 = fj2.l;
            }
            if (n4 == 1) {
                n3 = this.a(h2, n2);
                return n3;
            }
            fj2 = this;
        }
        n3 = fj2.b;
        return n3;
    }

    public int b(int n2) {
        n2 = fU.a(n2, 0, this.n.length - 1);
        return this.n[n2] & 0xFFFFFF;
    }

    public int a() {
        return this.m;
    }

    private static String a(String string, String string2) {
        String string3;
        block14: {
            boolean bl2;
            block13: {
                String string4;
                String string5;
                block12: {
                    boolean bl3;
                    block10: {
                        block11: {
                            string = fp.a(string, string2);
                            string5 = K.d();
                            bl3 = string.startsWith(string2);
                            if (string5 != null) break block10;
                            if (bl3) break block11;
                            bl3 = string.startsWith("textures/");
                            if (string5 != null) break block10;
                            if (bl3) break block11;
                            bl3 = string.startsWith("mcpatcher/");
                            if (string5 != null) break block10;
                            if (!bl3) {
                                string = string2 + "/" + string;
                            }
                        }
                        string4 = string;
                        if (string5 != null) break block12;
                        bl3 = string4.endsWith(".png");
                    }
                    if (bl3) {
                        string = string.substring(0, string.length() - 4);
                    }
                    string4 = "textures/blocks/";
                }
                String string6 = string4;
                bl2 = string.startsWith(string6);
                if (string5 != null) break block13;
                if (bl2) {
                    string = string.substring(string6.length());
                }
                string3 = string;
                if (string5 != null) break block14;
                bl2 = string3.startsWith("/");
            }
            if (bl2) {
                string = string.substring(1);
            }
            string3 = string;
        }
        return string3;
    }

    public void b(int n2, int n3) {
        block3: {
            block2: {
                R r2 = this.a(n2);
                String string = K.d();
                if (r2 == null) break block2;
                if (n3 < 0) break block3;
                r2.a(n3);
                if (string == null) break block3;
            }
            this.a(new R(n2, n3));
        }
    }

    private static void b(String string) {
    }

    public void a(R r2) {
        String string = K.d();
        fj fj2 = this;
        if (string == null) {
            if (fj2.w == null) {
                this.w = new R[0];
            }
            fj2 = this;
        }
        fj2.w = (R[])fU.a((Object[])this.w, (Object)r2);
    }

    public int a(t t2, n n2) {
        net.minecraft.A.h h2 = fa.a(t2, n2);
        return this.b(h2, n2);
    }

    public int[] e() {
        int[] arrn;
        block8: {
            Object[] arrobject;
            int n2;
            Object[] arrobject2;
            String string;
            block7: {
                string = K.d();
                if (this.w == null) {
                    return null;
                }
                HashSet<Integer> hashSet = new HashSet<Integer>();
                arrobject2 = this.w;
                int n3 = arrobject2.length;
                n2 = 0;
                while (n2 < n3) {
                    arrobject = arrobject2;
                    if (string == null) {
                        Object object = arrobject[n2];
                        if (string == null) {
                            if (((R)object).a() >= 0) {
                                hashSet.add(((R)object).a());
                            }
                            ++n2;
                        }
                        if (string == null) continue;
                    }
                    break block7;
                }
                arrobject = hashSet.toArray(new Integer[0]);
            }
            arrobject2 = (Integer[])arrobject;
            int[] arrn2 = new int[arrobject2.length];
            for (n2 = 0; n2 < arrobject2.length; ++n2) {
                arrn = arrn2;
                if (string == null) {
                    arrn[n2] = (Integer)arrobject2[n2];
                    if (string == null) continue;
                }
                break block8;
            }
            arrn = arrn2;
        }
        return arrn;
    }

    @Override
    public int a(i i2, t t2, n n2) {
        return this.a(t2, n2);
    }

    public fj(Properties properties, String string, int n2, int n3, String string2) {
        this.o = null;
        this.t = null;
        this.l = -1;
        this.w = null;
        this.y = null;
        this.b = -1;
        this.v = 0;
        this.x = 0;
        this.e = 0;
        this.m = 0;
        this.n = null;
        this.u = null;
        ha ha2 = new ha("Colormap");
        this.o = ha2.m(string);
        this.t = ha2.h(string);
        this.l = this.c(properties.getProperty("format", string2));
        this.w = ha2.j(properties.getProperty("blocks"));
        this.y = fj.a(properties.getProperty("source"), string, this.t);
        this.b = ha.a(properties.getProperty("color"), -1);
        this.v = ha2.b(properties.getProperty("yVariance"), 0);
        this.x = ha2.b(properties.getProperty("yOffset"), 0);
        this.e = n2;
        this.m = n3;
    }

    private R a(int n2) {
        block7: {
            R[] arrr;
            String string;
            block6: {
                string = K.d();
                arrr = this.w;
                if (string != null) break block6;
                if (arrr == null) break block7;
                arrr = this.w;
            }
            R[] arrr2 = arrr;
            int n3 = arrr2.length;
            int n4 = 0;
            while (n4 < n3) {
                R r2 = arrr2[n4];
                if (string == null) {
                    if (r2.a() == n2) {
                        return r2;
                    }
                    ++n4;
                }
                if (string == null) continue;
            }
        }
        return null;
    }
}

