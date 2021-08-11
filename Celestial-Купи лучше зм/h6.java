/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.B.X;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;
import net.minecraft.client.j.c;
import net.minecraft.client.j.d;
import net.minecraft.client.j.j;
import net.minecraft.client.j.u;
import net.minecraft.client.x.J;
import net.minecraft.client.x.M;
import net.minecraft.client.x.N;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.g;
import net.minecraft.client.x.l;
import net.minecraft.client.x.n;
import net.minecraft.client.x.x;
import net.minecraft.client.x.z;
import net.minecraft.u.h;
import net.minecraft.w.aU;
import net.minecraft.w.k;
import net.minecraft.w.m;
import org.lwjgl.opengl.GL11;

public class h6 {
    public static final /* synthetic */ int m;
    public /* synthetic */ float s;
    public /* synthetic */ Y x;
    public /* synthetic */ Map<String, Y> G;
    public /* synthetic */ int z;
    public /* synthetic */ Y A;
    public /* synthetic */ float n;
    public /* synthetic */ int[] F;
    public /* synthetic */ cZ D;
    public static final /* synthetic */ String j;
    private /* synthetic */ int y;
    public /* synthetic */ int k;
    public /* synthetic */ String I;
    public static final /* synthetic */ int r;
    public static final /* synthetic */ int h;
    public /* synthetic */ Map<String, Y> c;
    public /* synthetic */ cZ e;
    public /* synthetic */ dr[] g;
    public /* synthetic */ Map<String, String> N;
    public /* synthetic */ int K;
    public /* synthetic */ boolean o;
    public /* synthetic */ Map<String, String> O;
    public /* synthetic */ String L;
    public /* synthetic */ Map v;
    public /* synthetic */ int C;
    public /* synthetic */ float d;
    public /* synthetic */ v f;
    public /* synthetic */ int i;
    public /* synthetic */ String u;
    public static final /* synthetic */ int J;
    private /* synthetic */ int B;
    public /* synthetic */ cZ M;
    public /* synthetic */ Map E;
    public static final /* synthetic */ int w;
    public /* synthetic */ c a;
    public /* synthetic */ int l;
    public static final /* synthetic */ int t;
    public /* synthetic */ String p;
    public static final /* synthetic */ int q;
    public /* synthetic */ cZ b;
    public static final /* synthetic */ int H;

    public float a(u u2) {
        int n2;
        block6: {
            block7: {
                String string = K.d();
                n2 = this.B;
                if (string != null) break block6;
                if (n2 > 0) break block7;
                h6 h62 = this;
                if (string == null) {
                    if (h62.f != null) {
                        d d10 = u2.a(this.f);
                        int n3 = d10.c();
                        int n4 = net.minecraft.client.a.v.N();
                        net.minecraft.client.a.v.t(n3);
                        this.B = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4097);
                        net.minecraft.client.a.v.t(n4);
                    }
                    h62 = this;
                }
                n2 = h62.B;
                if (string != null) break block6;
                if (n2 <= 0) {
                    this.B = 16;
                }
            }
            n2 = this.B;
        }
        return n2;
    }

    private static String b(String string) {
        int n2;
        int n3;
        String string2 = string;
        String string3 = K.d();
        int n4 = n3 = string.lastIndexOf(47);
        if (string3 == null) {
            if (n4 >= 0) {
                string2 = string.substring(n3 + 1);
            }
            n4 = string2.lastIndexOf(46);
        }
        if ((n2 = n4) >= 0) {
            string2 = string2.substring(0, n2);
        }
        return string2;
    }

    private e3 d(String string) {
        block23: {
            int n2;
            int n3;
            int n4;
            block22: {
                int[] arrn;
                String string2;
                block19: {
                    block21: {
                        block20: {
                            string2 = K.d();
                            String string3 = string;
                            if (string2 == null) {
                                if (string3 == null) {
                                    return null;
                                }
                                string3 = string = string.trim();
                            }
                            int n5 = string3.length() - string.replace("-", "").length();
                            if (string2 != null) break block20;
                            if (n5 <= 1) break block21;
                            fU.h("Invalid range: " + string);
                        }
                        return null;
                    }
                    String[] arrstring = fU.c(string, "- ");
                    arrn = new int[arrstring.length];
                    n4 = 0;
                    while (n4 < arrstring.length) {
                        String string4 = arrstring[n4];
                        int n6 = fU.b(string4, -1);
                        if (string2 == null) {
                            n3 = n6;
                            if (string2 != null) break block19;
                            if (n3 < 0) {
                                fU.h("Invalid range: " + string);
                                return null;
                            }
                            arrn[n4] = n6;
                            ++n4;
                        }
                        if (string2 == null) continue;
                    }
                    n3 = arrn.length;
                }
                n2 = 1;
                if (string2 == null) {
                    if (n3 == n2) {
                        n4 = arrn[0];
                        boolean bl2 = string.startsWith("-");
                        if (string2 == null) {
                            if (bl2) {
                                return new e3(0, n4);
                            }
                            bl2 = string.endsWith("-");
                        }
                        if (bl2) {
                            return new e3(n4, 65535);
                        }
                        return new e3(n4, n4);
                    }
                    n3 = arrn.length;
                    n2 = 2;
                }
                if (string2 != null) break block22;
                if (n3 != n2) break block23;
                n4 = Math.min(arrn[0], arrn[1]);
                n3 = arrn[0];
                n2 = arrn[1];
            }
            int n7 = Math.max(n3, n2);
            return new e3(n4, n7);
        }
        fU.h("Invalid range: " + string);
        return null;
    }

    private float a(String string, float f10) {
        float f11;
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return f10;
            }
            string3 = string = string.trim();
        }
        float f12 = f11 = fU.a(string3, Float.MIN_VALUE);
        if (string2 == null) {
            if (f12 == Float.MIN_VALUE) {
                fU.h("Invalid float: " + string);
                return f10;
            }
            f12 = f11;
        }
        return f12;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean f(String var1_1) {
        block25: {
            block26: {
                block35: {
                    block36: {
                        block32: {
                            block33: {
                                block34: {
                                    block30: {
                                        block31: {
                                            block27: {
                                                block29: {
                                                    block28: {
                                                        var2_2 = K.d();
                                                        v0 = this.p;
                                                        if (var2_2 != null) break block25;
                                                        if (v0 == null) break block26;
                                                        v1 = this.p.length();
                                                        if (var2_2 != null) return (boolean)v1;
                                                        if (v1 <= 0) break block26;
                                                        v2 = this;
                                                        if (var2_2 == null) {
                                                            if (v2.I == null) {
                                                                fU.h("No base path found: " + var1_1);
                                                                return false;
                                                            }
                                                            v2 = this;
                                                        }
                                                        v3 = v2.z;
                                                        if (var2_2 == null) {
                                                            if (v3 == 0) {
                                                                fU.h("No type defined: " + var1_1);
                                                                return false;
                                                            }
                                                            v3 = this.z;
                                                        }
                                                        v4 = 4;
                                                        if (var2_2 != null) break block27;
                                                        if (v3 != v4) break block28;
                                                        v5 = this;
                                                        if (var2_2 != null) break block29;
                                                        if (v5.F == null) {
                                                            this.F = new int[]{net.minecraft.w.k.a(net.minecraft.u.h.cf)};
                                                        }
                                                    }
                                                    v5 = this;
                                                }
                                                if (var2_2 != null) break block30;
                                                v3 = v5.z;
                                                v4 = 1;
                                            }
                                            if (v3 == v4) break block31;
                                            v5 = this;
                                            if (var2_2 != null) break block30;
                                            if (v5.z == 3) break block31;
                                            v6 = this;
                                            if (var2_2 != null) break block32;
                                            if (v6.z != 4) break block33;
                                        }
                                        v5 = this;
                                    }
                                    v7 = v5.F;
                                    if (var2_2 != null) break block34;
                                    if (v7 == null) {
                                        this.F = this.d();
                                    }
                                    v6 = this;
                                    if (var2_2 != null) break block32;
                                    v7 = v6.F;
                                }
                                if (v7 == null) {
                                    fU.h("No items defined: " + var1_1);
                                    return false;
                                }
                            }
                            v6 = this;
                        }
                        if (var2_2 != null) break block35;
                        if (v6.L != null) break block36;
                        v6 = this;
                        if (var2_2 != null) break block35;
                        if (v6.O != null) break block36;
                        v6 = this;
                        if (var2_2 == null) {
                            if (v6.u == null) {
                                v6 = this;
                                if (var2_2 == null) {
                                    if (v6.N == null) {
                                        fU.h("No texture or model specified: " + var1_1);
                                        return false;
                                    } else {
                                        ** GOTO lbl75
                                    }
                                } else {
                                    ** GOTO lbl74
                                }
                            } else {
                                ** GOTO lbl73
                            }
                        }
                        break block35;
lbl73:
                        // 2 sources

                        break block36;
lbl74:
                        // 2 sources

                        break block35;
                    }
                    v6 = this;
                }
                v8 = v6.z;
                if (var2_2 != null) return (boolean)v8;
                if (v8 != 2) return (boolean)1;
                if (this.M != null) return (boolean)1;
                fU.h("No enchantmentIDs specified: " + var1_1);
                return false;
            }
            v0 = "No name found: " + var1_1;
        }
        fU.h(v0);
        return (boolean)0;
    }

    public String toString() {
        return "" + this.I + "/" + this.p + ", type: " + this.z + ", items: [" + fU.a(this.F) + "], textture: " + this.L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static v h(String string) {
        v v2;
        block5: {
            boolean bl2;
            block6: {
                String string2;
                block4: {
                    string2 = K.d();
                    bl2 = cq.x.c();
                    if (string2 != null) break block4;
                    if (!bl2) break block5;
                    bl2 = string.startsWith("mcpatcher/");
                }
                if (string2 != null) break block6;
                if (bl2) break block5;
                bl2 = string.startsWith("optifine/");
            }
            if (!bl2) {
                v2 = new v("models/" + string);
                return v2;
            }
        }
        v2 = new v(string);
        return v2;
    }

    private int i(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 0;
            }
            string3 = string = string.toLowerCase();
        }
        int n2 = string3.equals("any");
        if (string2 == null) {
            if (n2 != 0) {
                return 0;
            }
            n2 = string.equals("main");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.equals("off") ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 2;
            }
            fU.h("Invalid hand: " + string);
            n2 = 0;
        }
        return n2;
    }

    public void a(J j2) {
        block7: {
            Map<String, String> map;
            String string;
            block8: {
                h6 h62;
                block6: {
                    string = K.d();
                    h62 = this;
                    if (string == null) {
                        if (h62.u != null) {
                            h6.a(j2, this.u);
                        }
                        h62 = this;
                    }
                    if (string != null) break block6;
                    if (h62.z != 1) break block7;
                    h62 = this;
                }
                map = h62.N;
                if (string != null) break block8;
                if (map == null) break block7;
                map = this.N;
            }
            for (String string2 : map.keySet()) {
                block11: {
                    String string3;
                    block10: {
                        boolean bl2;
                        block9: {
                            string3 = this.N.get(string2);
                            String string4 = dQ.f(string2, "model.");
                            bl2 = string4.startsWith("bow");
                            if (string != null) break block9;
                            if (bl2) break block10;
                            bl2 = string4.startsWith("fishing_rod");
                        }
                        if (!bl2) break block11;
                    }
                    h6.a(j2, string3);
                }
                if (string == null) continue;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Y a(v v2, boolean bl2) {
        Y y2;
        Map<String, Y> map;
        Y y3;
        String string;
        block6: {
            block5: {
                string = K.d();
                if (!bl2) break block5;
                y3 = this.A;
                map = this.c;
                if (string == null) break block6;
            }
            y3 = this.x;
            map = this.G;
        }
        if (v2 != null && map != null) {
            Y y4;
            String string2 = v2.a();
            y2 = y4 = map.get(string2);
            if (string != null) return y2;
            if (y2 != null) {
                return y4;
            }
        }
        y2 = y3;
        return y2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(String string, String string2, String string3, int n2, Map<String, String> map) {
        String string4;
        block12: {
            String string5;
            Object object;
            String string6;
            block11: {
                block10: {
                    String string7;
                    block9: {
                        string6 = K.d();
                        string7 = string;
                        if (string6 != null) break block9;
                        if (string7 == null) break block10;
                        string7 = ".json";
                    }
                    String string8 = string7;
                    String string9 = string;
                    String string10 = string8;
                    if (string6 != null) return h6.c(string9, string10);
                    if (string9.endsWith(string10)) {
                        string = string.substring(0, string.length() - string8.length());
                    }
                    string9 = string;
                    string10 = string3;
                    return h6.c(string9, string10);
                }
                if (n2 == 3) {
                    return null;
                }
                object = map;
                if (string6 != null) break block11;
                if (object == null) break block12;
                object = map.get("model.bow_standby");
            }
            string4 = string5 = (String)object;
            if (string6 != null) return string4;
            if (string4 != null) {
                return string5;
            }
        }
        string4 = string;
        return string4;
    }

    private static Map a(Properties properties, String string) {
        LinkedHashMap linkedHashMap;
        block4: {
            Map map;
            String string2 = "texture.";
            String string3 = K.d();
            Map map2 = map = h6.c(properties, string2);
            if (string3 == null) {
                if (map2.size() <= 0) {
                    return null;
                }
                map2 = map;
            }
            Set set = map2.keySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object k2 : set) {
                String string4 = (String)map.get(k2);
                string4 = h6.b(string4, string);
                linkedHashMap = linkedHashMap2;
                if (string3 == null) {
                    linkedHashMap.put(k2, string4);
                    if (string3 == null) continue;
                }
                break block4;
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    private v a(v v2) {
        String string = v2.a();
        string = dQ.f(string, "textures/");
        string = dQ.g(string, ".png");
        v v3 = new v(v2.c(), string);
        return v3;
    }

    private static Map b(Properties properties, String string) {
        LinkedHashMap linkedHashMap;
        block4: {
            String string2 = "model.";
            Map map = h6.c(properties, string2);
            String string3 = K.d();
            Map map2 = map;
            if (string3 == null) {
                if (map2.size() <= 0) {
                    return null;
                }
                map2 = map;
            }
            Set set = map2.keySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object k2 : set) {
                String string4 = (String)map.get(k2);
                string4 = h6.c(string4, string);
                linkedHashMap = linkedHashMap2;
                if (string3 == null) {
                    linkedHashMap.put(k2, string4);
                    if (string3 == null) continue;
                }
                break block4;
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    private static String a(String string) {
        int n2 = string.lastIndexOf(47);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    private static Y a(j j2, net.minecraft.client.x.v v2, boolean bl2) {
        g g10 = net.minecraft.client.x.g.X0_Y0;
        boolean bl3 = false;
        String string = v2.c("particle");
        String string2 = K.d();
        c c10 = j2.b(new v(string).toString());
        net.minecraft.client.x.h h2 = new net.minecraft.client.x.h(v2, v2.k()).a(c10);
        Iterator<l> iterator = v2.h().iterator();
        block0: while (true) {
            boolean bl4 = iterator.hasNext();
            block1: while (bl4) {
                l l2 = iterator.next();
                for (aA aA2 : l2.c.keySet()) {
                    block9: {
                        P p2;
                        z z2;
                        block8: {
                            block7: {
                                z2 = l2.c.get(aA2);
                                bl4 = bl2;
                                if (string2 != null) continue block1;
                                if (!bl4) {
                                    z2 = new z(z2.c, -1, z2.b, z2.e);
                                }
                                String string3 = v2.c(z2.b);
                                c c11 = j2.b(new v(string3).toString());
                                p2 = h6.a(l2, z2, c11, aA2, g10, bl3);
                                if (string2 != null) break block7;
                                if (z2.c != null) break block8;
                                h2.a(p2);
                            }
                            if (string2 == null) break block9;
                        }
                        h2.a(g10.b(z2.c), p2);
                    }
                    if (string2 == null) continue;
                }
                if (string2 == null) continue block0;
            }
            break;
        }
        return h2.a();
    }

    public void a(j j2, M m2) {
        block5: {
            Map<String, String> map;
            boolean bl2;
            String string;
            block7: {
                h6 h62;
                block6: {
                    h6 h63;
                    block3: {
                        block4: {
                            string = K.d();
                            h63 = this;
                            if (string != null) break block3;
                            if (h63.L != null) break block4;
                            h63 = this;
                            if (string != null) break block3;
                            if (h63.O == null) break block5;
                        }
                        h63 = this;
                    }
                    String[] arrstring = h63.b();
                    bl2 = this.a();
                    this.x = h6.a(j2, m2, arrstring, bl2);
                    h62 = this;
                    if (string != null) break block6;
                    if (h62.z != 1) break block5;
                    h62 = this;
                }
                map = h62.O;
                if (string != null) break block7;
                if (map == null) break block5;
                map = this.O;
            }
            for (String string2 : map.keySet()) {
                block10: {
                    Y y2;
                    String string3;
                    block12: {
                        block11: {
                            int n2;
                            String string4;
                            block8: {
                                block9: {
                                    string4 = this.O.get(string2);
                                    string3 = dQ.f(string2, "texture.");
                                    n2 = string3.startsWith("bow");
                                    if (string != null) break block8;
                                    if (n2 != 0) break block9;
                                    n2 = string3.startsWith("fishing_rod") ? 1 : 0;
                                    if (string != null) break block8;
                                    if (n2 == 0) break block10;
                                }
                                n2 = 1;
                            }
                            String[] arrstring = new String[n2];
                            arrstring[0] = string4;
                            String[] arrstring2 = arrstring;
                            y2 = h6.a(j2, m2, arrstring2, bl2);
                            h6 h64 = this;
                            if (string != null) break block11;
                            if (h64.G != null) break block12;
                            h64 = this;
                        }
                        h64.G = new HashMap<String, Y>();
                    }
                    String string5 = "item/" + string3;
                    this.G.put(string5, y2);
                }
                if (string == null) continue;
            }
        }
    }

    private static Y a(j j2, M m2, String[] arrstring, boolean bl2) {
        String[] arrstring2;
        Object object;
        block2: {
            String[] arrstring3 = new String[arrstring.length];
            String string = K.d();
            for (int i2 = 0; i2 < arrstring3.length; ++i2) {
                object = arrstring[i2];
                arrstring2 = arrstring3;
                if (string == null) {
                    arrstring2[i2] = dQ.f((String)object, "textures/");
                    if (string == null) continue;
                }
                break block2;
            }
            arrstring2 = arrstring3;
        }
        net.minecraft.client.x.v v2 = h6.a(arrstring2);
        object = m2.a(j2, v2);
        Y y2 = h6.a(j2, (net.minecraft.client.x.v)object, bl2);
        return y2;
    }

    /*
     * Exception decompiling
     */
    private static String c(String var0, String var1_1) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private String[] b() {
        block16: {
            block17: {
                block20: {
                    block19: {
                        block18: {
                            var1_1 = K.d();
                            v0 = this.z;
                            if (var1_1 != null) break block16;
                            if (v0 != 1) break block17;
                            v0 = this.F.length;
                            if (var1_1 != null) break block16;
                            if (v0 != 1) break block17;
                            v1 = var2_2 = net.minecraft.w.k.a(this.F[0]);
                            v2 = net.minecraft.u.h.V;
                            if (var1_1 != null) break block18;
                            if (v1 == v2) ** GOTO lbl-1000
                            v1 = var2_2;
                            v2 = net.minecraft.u.h.b3;
                        }
                        if (var1_1 != null) break block19;
                        if (v1 == v2) ** GOTO lbl-1000
                        v1 = var2_2;
                        v2 = net.minecraft.u.h.W;
                    }
                    if (v1 == v2) lbl-1000:
                    // 3 sources

                    {
                        v3 = 1;
                    } else {
                        v3 = 0;
                    }
                    v0 = var3_3 = v3;
                    if (var1_1 != null) break block20;
                    if (v0 == 0) ** GOTO lbl-1000
                    v4 = this.D;
                    if (var1_1 != null) ** GOTO lbl31
                    if (v4 != null) {
                        v4 = this.D;
lbl31:
                        // 2 sources

                        v0 = v4.a();
                        if (var1_1 == null) {
                            if (v0 > 0) {
                                var4_4 = this.D.a(0);
                                var5_6 = var4_4.b();
                                v5 = var5_6 & 16384;
                                if (var1_1 == null) {
                                    v5 = v5 != 0 ? 1 : 0;
                                }
                                var6_8 = v5;
                                var7_10 = this.a(this.O, "texture.potion_overlay", "items/potion_overlay");
                                var8_12 = null;
                                var8_12 = var6_8 != 0 ? this.a(this.O, "texture.potion_bottle_splash", "items/potion_bottle_splash") : this.a(this.O, "texture.potion_bottle_drinkable", "items/potion_bottle_drinkable");
                                return new String[]{var7_10, var8_12};
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 4 sources

                    {
                        v0 = var2_2 instanceof m;
                    }
                }
                if (var1_1 == null) {
                    if (v0 != 0 && (var4_5 = (m)var2_2).c() == aU.LEATHER) {
                        var5_7 = "leather";
                        var6_9 = "helmet";
                        v6 = var4_5.A;
                        v7 = X.HEAD;
                        if (var1_1 == null) {
                            if (v6 == v7) {
                                var6_9 = "helmet";
                            }
                            v6 = var4_5.A;
                            v7 = X.CHEST;
                        }
                        if (var1_1 == null) {
                            if (v6 == v7) {
                                var6_9 = "chestplate";
                            }
                            v6 = var4_5.A;
                            v7 = X.LEGS;
                        }
                        if (var1_1 == null) {
                            if (v6 == v7) {
                                var6_9 = "leggings";
                            }
                            v6 = var4_5.A;
                            v7 = X.FEET;
                        }
                        if (v6 == v7) {
                            var6_9 = "boots";
                        }
                        var7_11 = var5_7 + "_" + var6_9;
                        var8_13 = this.a(this.O, "texture." + var7_11, "items/" + var7_11);
                        var9_14 = this.a(this.O, "texture." + var7_11 + "_overlay", "items/" + var7_11 + "_overlay");
                        return new String[]{var8_13, var9_14};
                    } else {
                        ** GOTO lbl75
                    }
                }
                break block16;
            }
            v0 = 1;
        }
        v8 = new String[v0];
        v8[0] = this.L;
        return v8;
    }

    private boolean a() {
        return true;
    }

    private static net.minecraft.client.x.v a(String[] arrstring) {
        Object object;
        StringBuffer stringBuffer;
        block4: {
            stringBuffer = new StringBuffer();
            String string = K.d();
            stringBuffer.append("{\"parent\": \"builtin/generated\",\"textures\": {");
            int n2 = 0;
            while (n2 < arrstring.length) {
                object = arrstring[n2];
                if (string == null) {
                    if (string == null) {
                        if (n2 > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append("\"layer" + n2 + "\": \"" + (String)object + "\"");
                        ++n2;
                    }
                    if (string == null) continue;
                }
                break block4;
            }
            stringBuffer.append("}}");
        }
        String string = stringBuffer.toString();
        object = net.minecraft.client.x.v.a(string);
        return object;
    }

    public void a(j j2) {
        block11: {
            Map<String, String> map;
            String string;
            block10: {
                h6 h62;
                block8: {
                    block9: {
                        string = K.d();
                        h62 = this;
                        if (string != null) break block8;
                        if (h62.L == null) break block9;
                        this.f = this.g(this.L);
                        h62 = this;
                        if (string != null) break block8;
                        if (h62.z == 1) {
                            v v2 = this.a(this.f);
                            this.a = j2.c(v2);
                        }
                    }
                    h62 = this;
                }
                map = h62.O;
                if (string != null) break block10;
                if (map == null) break block11;
                this.v = new HashMap();
                this.E = new HashMap();
                map = this.O;
            }
            for (String string2 : map.keySet()) {
                block13: {
                    h6 h63;
                    v v3;
                    block12: {
                        String string3 = this.O.get(string2);
                        v3 = this.g(string3);
                        this.v.put(string2, v3);
                        h63 = this;
                        if (string != null) break block12;
                        if (h63.z != 1) break block13;
                        h63 = this;
                    }
                    v v4 = h63.a(v3);
                    c c10 = j2.c(v4);
                    this.E.put(string2, c10);
                }
                if (string == null) continue;
            }
        }
    }

    public void c() {
        block11: {
            Map<String, String> map;
            Y y2;
            String string;
            x x2;
            block12: {
                h6 h62;
                block10: {
                    block8: {
                        block9: {
                            x2 = fU.a2();
                            string = K.d();
                            y2 = x2.c();
                            h62 = this;
                            if (string != null) break block8;
                            if (h62.u == null) break block9;
                            v v2 = h6.h(this.u);
                            n object = new n(v2, "inventory");
                            this.A = x2.a(object);
                            h62 = this;
                            if (string != null) break block8;
                            if (h62.A == y2) {
                                fU.h("Custom Items: Model not found " + object.a());
                                this.A = null;
                            }
                        }
                        h62 = this;
                    }
                    if (string != null) break block10;
                    if (h62.z != 1) break block11;
                    h62 = this;
                }
                map = h62.N;
                if (string != null) break block12;
                if (map == null) break block11;
                map = this.N;
            }
            for (String string2 : map.keySet()) {
                block15: {
                    Y y3;
                    String string3;
                    block19: {
                        block18: {
                            block17: {
                                block16: {
                                    String string4;
                                    block13: {
                                        String string5;
                                        block14: {
                                            string5 = this.N.get(string2);
                                            string4 = string3 = dQ.f(string2, "model.");
                                            if (string != null) break block13;
                                            if (string4.startsWith("bow")) break block14;
                                            string4 = string3;
                                            if (string != null) break block13;
                                            if (!string4.startsWith("fishing_rod")) break block15;
                                        }
                                        string4 = string5;
                                    }
                                    v v2 = h6.h(string4);
                                    n n2 = new n(v2, "inventory");
                                    y3 = x2.a(n2);
                                    if (string != null) break block16;
                                    if (y3 != y2) break block17;
                                    fU.h("Custom Items: Model not found " + n2.a());
                                }
                                if (string == null) break block15;
                            }
                            h6 h63 = this;
                            if (string != null) break block18;
                            if (h63.c != null) break block19;
                            h63 = this;
                        }
                        h63.c = new HashMap<String, Y>();
                    }
                    String string6 = "item/" + string3;
                    this.c.put(string6, y3);
                }
                if (string == null) continue;
            }
        }
    }

    static {
        r = 2;
        w = 3;
        q = 1;
        h = 1;
        J = 4;
        t = 0;
        j = "inventory";
        m = 0;
        H = 2;
    }

    private static void a(Object object, String string) throws NullPointerException {
        if (object == null) {
            throw new NullPointerException(string);
        }
    }

    private String a(Map<String, String> map, String string, String string2) {
        String string3;
        String string4 = K.d();
        Object object = map;
        if (string4 == null) {
            if (object == null) {
                return string2;
            }
            object = map.get(string);
        }
        String string5 = string3 = (String)object;
        if (string4 == null) {
            string5 = string5 == null ? string2 : string3;
        }
        return string5;
    }

    private dr[] a(Properties properties) {
        ArrayList<dr> arrayList;
        ArrayList<dr> arrayList2;
        block3: {
            String string = "nbt.";
            String string2 = K.d();
            Map map = h6.c(properties, string);
            if (map.size() <= 0) {
                return null;
            }
            arrayList2 = new ArrayList<dr>();
            for (Object k2 : map.keySet()) {
                String string3 = (String)map.get(k2);
                String string4 = ((String)k2).substring(string.length());
                dr dr2 = new dr(string4, string3);
                arrayList = arrayList2;
                if (string2 == null) {
                    arrayList.add(dr2);
                    if (string2 == null) continue;
                }
                break block3;
            }
            arrayList = arrayList2;
        }
        dr[] arrdr = arrayList.toArray(new dr[arrayList2.size()]);
        return arrdr;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int[] d() {
        int n2;
        k k2 = net.minecraft.w.k.a(this.p);
        String string = K.d();
        k k3 = k2;
        if (string == null) {
            if (k3 == null) {
                return null;
            }
            k3 = k2;
        }
        int n3 = n2 = net.minecraft.w.k.a(k3);
        if (string == null) {
            if (n3 <= 0) {
                return null;
            }
            n3 = 1;
        }
        int[] arrn = new int[n3];
        int[] arrn2 = arrn;
        arrn[0] = n2;
        return arrn2;
    }

    private static Map c(Properties properties, String string) {
        LinkedHashMap<Object, String> linkedHashMap = new LinkedHashMap<Object, String>();
        Iterator<Object> iterator = properties.keySet().iterator();
        String string2 = K.d();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            String string3 = properties.getProperty((String)object);
            String string4 = (String)object;
            if (string2 == null && string4.startsWith(string)) {
                string4 = linkedHashMap.put(object, string3);
            }
            if (string2 == null) continue;
        }
        return linkedHashMap;
    }

    private cZ a(String string, di di2) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return null;
            }
            string3 = string;
        }
        String[] arrstring = fU.c(string3, " ");
        cZ cZ2 = new cZ();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            e3 e32;
            block13: {
                block12: {
                    String string4;
                    block10: {
                        block11: {
                            di di3;
                            block9: {
                                string4 = arrstring[i2];
                                di3 = di2;
                                if (string2 != null) break block9;
                                if (di3 == null) break block10;
                                di3 = di2;
                            }
                            int n2 = di3.a(string4, Integer.MIN_VALUE);
                            if (string2 != null) break block11;
                            if (n2 == Integer.MIN_VALUE) break block10;
                            cZ2.a(new e3(n2, n2));
                        }
                        if (string2 == null) continue;
                    }
                    e32 = this.d(string4);
                    if (string2 != null) break block12;
                    if (e32 != null) break block13;
                    fU.h("Invalid range list: " + string);
                }
                return null;
            }
            cZ2.a(e32);
            if (string2 == null) continue;
        }
        return cZ2;
    }

    private int e(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 1;
            }
            string3 = string;
        }
        int n2 = string3.equals("item");
        if (string2 == null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.equals("enchantment");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 2;
            }
            n2 = string.equals("armor");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 3;
            }
            n2 = string.equals("elytra") ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 4;
            }
            fU.h("Unknown method: " + string);
            n2 = 0;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static void a(J var0, String var1_1) {
        block4: {
            var3_2 = h6.h(var1_1);
            var2_3 = K.d();
            var4_4 = new n(var3_2, "inventory");
            v0 = cq.x;
            if (var2_3 != null) ** GOTO lbl9
            if (!v0.c()) break block4;
            try {
                v0 = cq.aM.b();
lbl9:
                // 2 sources

                var5_5 = v0;
                h6.a(var5_5, "vanillaLoader is null");
                var6_7 = cq.d(var5_5, cq.dt, new Object[]{var4_4});
                h6.a(var6_7, "iModel is null");
                var7_8 = (Map)cq.a(var0, cq.dR);
                h6.a(var7_8, "stateModels is null");
                var7_8.put(var4_4, var6_7);
                var8_9 = (Set)cq.d6.b();
                h6.a(var8_9, "registryTextures is null");
                var9_10 = (Collection)cq.d(var6_7, cq.ci, new Object[0]);
                h6.a(var9_10, "modelTextures is null");
                var8_9.addAll(var9_10);
                return;
            }
            catch (Exception var5_6) {
                fU.h("Error registering model: " + var4_4 + ", " + var5_6.getClass().getName() + ": " + var5_6.getMessage());
                if (var2_3 == null) return;
            }
        }
        var0.a(var3_2.toString(), var4_4, var3_2);
    }

    private int[] a(String string, String string2) {
        Object object;
        block18: {
            int n2;
            Object object2;
            Object[] arrobject;
            String string3;
            block17: {
                string3 = K.d();
                String string4 = string;
                if (string3 == null) {
                    if (string4 == null) {
                        string = string2;
                    }
                    string4 = string;
                }
                if (string3 == null) {
                    if (string4 == null) {
                        return null;
                    }
                    string4 = string.trim();
                }
                string = string4;
                TreeSet<Integer> treeSet = new TreeSet<Integer>();
                String[] arrstring = fU.c(string, " ");
                block0: for (int i2 = 0; i2 < arrstring.length; ++i2) {
                    int n3;
                    String[] arrstring2;
                    Object object3;
                    block20: {
                        block21: {
                            int n4;
                            int n5;
                            block22: {
                                int n6;
                                block19: {
                                    arrobject = arrstring;
                                    if (string3 != null) break block17;
                                    object2 = arrobject[i2];
                                    n6 = n2 = fU.b((String)object2, -1);
                                    if (string3 != null) break block19;
                                    if (n6 >= 0) {
                                        treeSet.add(new Integer(n2));
                                        if (string3 == null) continue;
                                    }
                                    object3 = object2;
                                    if (string3 != null) break block20;
                                    n6 = ((String)object3).contains("-") ? 1 : 0;
                                }
                                if (n6 == 0) break block21;
                                object3 = object2;
                                if (string3 != null) break block20;
                                arrstring2 = fU.c((String)object3, "-");
                                if (arrstring2.length != 2) break block21;
                                n3 = fU.b(arrstring2[0], -1);
                                object3 = arrstring2[1];
                                if (string3 != null) break block20;
                                n5 = fU.b((String)object3, -1);
                                if (n3 < 0) break block21;
                                n4 = n5;
                                if (string3 != null) break block22;
                                if (n4 < 0) break block21;
                                n4 = Math.min(n3, n5);
                            }
                            int n7 = n4;
                            int n8 = Math.max(n3, n5);
                            int n9 = n7;
                            do {
                                if (n9 > n8) {
                                    if (string3 != null) continue;
                                    if (string3 == null) continue block0;
                                }
                                treeSet.add(new Integer(n9));
                                ++n9;
                            } while (string3 == null);
                        }
                        object3 = object2;
                    }
                    String[] arrstring3 = arrstring2 = net.minecraft.w.k.a((String)object3);
                    if (string3 == null) {
                        if (arrstring3 == null) {
                            fU.h("Item not found: " + (String)object2);
                            if (string3 == null) continue;
                        }
                        arrstring3 = arrstring2;
                    }
                    int n10 = n3 = net.minecraft.w.k.a((k)arrstring3);
                    if (string3 != null) continue;
                    if (n10 <= 0) {
                        fU.h("Item not found: " + (String)object2);
                        if (string3 == null) continue;
                    }
                    n10 = treeSet.add(new Integer(n3)) ? 1 : 0;
                    if (string3 == null) continue;
                }
                arrobject = treeSet.toArray(new Integer[treeSet.size()]);
            }
            Integer[] arrinteger = (Integer[])arrobject;
            object2 = new int[arrinteger.length];
            for (n2 = 0; n2 < ((Object)object2).length; ++n2) {
                object = object2;
                if (string3 == null) {
                    object[n2] = arrinteger[n2];
                    if (string3 == null) continue;
                }
                break block18;
            }
            object = object2;
        }
        return object;
    }

    private int a(String string, int n2) {
        int n3;
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return n2;
            }
            string3 = string = string.trim();
        }
        int n4 = n3 = fU.b(string3, Integer.MIN_VALUE);
        if (string2 == null) {
            if (n4 == Integer.MIN_VALUE) {
                fU.h("Invalid integer: " + string);
                return n2;
            }
            n4 = n3;
        }
        return n4;
    }

    private cZ c(String string) {
        return this.a(string, (di)null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public h6(Properties var1_1, String var2_2) {
        block4: {
            super();
            this.p = null;
            this.I = null;
            this.z = 1;
            this.F = null;
            this.L = null;
            this.O = null;
            this.u = null;
            this.N = null;
            this.D = null;
            this.o = false;
            this.C = 0;
            this.e = null;
            this.M = null;
            this.b = null;
            this.g = null;
            this.k = 0;
            this.K = 1;
            this.d = 0.0f;
            this.n = 0.0f;
            this.l = 0;
            this.s = 1.0f;
            this.i = 0;
            this.f = null;
            this.v = null;
            this.a = null;
            this.E = null;
            this.x = null;
            var3_3 = K.d();
            this.G = null;
            this.A = null;
            this.c = null;
            this.y = 0;
            this.B = 0;
            this.p = h6.b(var2_2);
            this.I = h6.a(var2_2);
            this.z = this.e(var1_1.getProperty("type"));
            this.F = this.a(var1_1.getProperty("items"), var1_1.getProperty("matchItems"));
            this.N = h6.b(var1_1, this.I);
            this.u = h6.a(var1_1.getProperty("model"), var2_2, this.I, this.z, this.N);
            this.O = h6.a(var1_1, this.I);
            v0 = this;
            if (var3_3 != null) break block4;
            if (v0.N != null) ** GOTO lbl-1000
            v0 = this;
        }
        if (v0.u == null) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        var4_4 = v1;
        this.L = h6.a(var1_1.getProperty("texture"), var1_1.getProperty("tile"), var1_1.getProperty("source"), var2_2, this.I, this.z, this.O, var4_4);
        var5_5 = var1_1.getProperty("damage");
        if (var3_3 == null) {
            if (var5_5 != null) {
                this.o = var5_5.contains("%");
                var5_5 = var5_5.replace("%", "");
                this.D = this.c(var5_5);
                this.C = this.a(var1_1.getProperty("damageMask"), 0);
            }
            this.e = this.c(var1_1.getProperty("stackSize"));
            this.M = this.a(var1_1.getProperty("enchantmentIDs"), new eS());
            this.b = this.c(var1_1.getProperty("enchantmentLevels"));
            this.g = this.a(var1_1);
            this.k = this.i(var1_1.getProperty("hand"));
            this.K = bv.a(var1_1.getProperty("blend"));
            this.d = this.a(var1_1.getProperty("speed"), 0.0f);
            this.n = this.a(var1_1.getProperty("rotation"), 0.0f);
            this.l = this.a(var1_1.getProperty("layer"), 0);
            this.i = this.a(var1_1.getProperty("weight"), 0);
            this.s = this.a(var1_1.getProperty("duration"), 1.0f);
        }
        if (var3_3 == null) return;
        net.minecraft.k.m.b(net.minecraft.k.m.d() == false);
    }

    private static P a(l l2, z z2, c c10, aA aA2, g g10, boolean bl2) {
        N n2 = new N();
        return n2.a(l2.e, l2.d, z2, c10, aA2, g10, l2.a, bl2, l2.b);
    }

    private static String a(String string, String string2, String string3, String string4, String string5, int n2, Map<String, String> map, boolean bl2) {
        int n3;
        int n4;
        String string6;
        String string7;
        block21: {
            String string8;
            block22: {
                Object object;
                block20: {
                    block19: {
                        String string9;
                        block18: {
                            string7 = K.d();
                            string9 = string;
                            if (string7 == null) {
                                if (string9 == null) {
                                    string = string2;
                                }
                                string9 = string;
                            }
                            if (string7 == null) {
                                if (string9 == null) {
                                    string = string3;
                                }
                                string9 = string;
                            }
                            if (string7 != null) break block18;
                            if (string9 == null) break block19;
                            string9 = ".png";
                        }
                        String string10 = string9;
                        String string11 = string;
                        String string12 = string10;
                        if (string7 == null) {
                            if (string11.endsWith(string12)) {
                                string = string.substring(0, string.length() - string10.length());
                            }
                            string11 = string;
                            string12 = string5;
                        }
                        string = h6.b(string11, string12);
                        return string;
                    }
                    if (n2 == 3) {
                        return null;
                    }
                    object = map;
                    if (string7 != null) break block20;
                    if (object == null) break block21;
                    object = map.get("texture.bow_standby");
                }
                string8 = string6 = (String)object;
                if (string7 != null) break block22;
                if (string8 == null) break block21;
                string8 = string6;
            }
            return string8;
        }
        if (!bl2) {
            return null;
        }
        string6 = string4;
        int n5 = n4 = string4.lastIndexOf(47);
        if (string7 == null) {
            if (n5 >= 0) {
                string6 = string4.substring(n4 + 1);
            }
            n5 = n3 = string6.lastIndexOf(46);
        }
        if (string7 == null) {
            if (n3 >= 0) {
                string6 = string6.substring(0, n3);
            }
            string6 = h6.b(string6, string5);
        }
        return string6;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public float b(u u2) {
        int n2;
        block6: {
            block7: {
                String string = K.d();
                n2 = this.y;
                if (string != null) break block6;
                if (n2 > 0) break block7;
                h6 h62 = this;
                if (string == null) {
                    if (h62.f != null) {
                        d d10 = u2.a(this.f);
                        int n3 = d10.c();
                        int n4 = net.minecraft.client.a.v.N();
                        net.minecraft.client.a.v.t(n3);
                        this.y = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4096);
                        net.minecraft.client.a.v.t(n4);
                    }
                    h62 = this;
                }
                n2 = h62.y;
                if (string != null) break block6;
                if (n2 <= 0) {
                    this.y = 16;
                }
            }
            n2 = this.y;
        }
        return n2;
    }

    private v g(String string) {
        v v2;
        block3: {
            String string2;
            boolean bl2;
            String string3;
            String string4 = K.d();
            if (string == null) {
                return null;
            }
            v v3 = new v(string);
            String string5 = v3.c();
            String string6 = string3 = v3.a();
            if (string4 == null) {
                if (!string6.contains("/")) {
                    string3 = "textures/items/" + string3;
                }
                string6 = string3 + ".png";
            }
            if (bl2 = fU.b(v2 = new v(string5, string2 = string6))) break block3;
            fU.h("File not found: " + string2);
        }
        return v2;
    }

    private static String b(String string, String string2) {
        String string3;
        block12: {
            boolean bl2;
            block11: {
                String string4;
                block9: {
                    block10: {
                        string = fp.a(string, string2);
                        string4 = K.d();
                        bl2 = string.startsWith(string2);
                        if (string4 != null) break block9;
                        if (bl2) break block10;
                        bl2 = string.startsWith("textures/");
                        if (string4 != null) break block9;
                        if (bl2) break block10;
                        bl2 = string.startsWith("mcpatcher/");
                        if (string4 != null) break block9;
                        if (!bl2) {
                            string = string2 + "/" + string;
                        }
                    }
                    bl2 = string.endsWith(".png");
                }
                if (string4 != null) break block11;
                if (bl2) {
                    string = string.substring(0, string.length() - 4);
                }
                string3 = string;
                if (string4 != null) break block12;
                bl2 = string3.startsWith("/");
            }
            if (bl2) {
                string = string.substring(1);
            }
            string3 = string;
        }
        return string3;
    }
}

