/*
 * Decompiled with CFR 0.150.
 */
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import net.minecraft.A.h;
import net.minecraft.W.S;
import net.minecraft.W.X;
import net.minecraft.W.bN;
import net.minecraft.W.bU;
import net.minecraft.W.bd;
import net.minecraft.W.bg;
import net.minecraft.Z.i;
import net.minecraft.Z.l;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.Q;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class cJ {
    private static final /* synthetic */ hu[] x;
    private static final /* synthetic */ int f;
    private static final /* synthetic */ hu[] p;
    private static final /* synthetic */ hu[] b;
    private static final /* synthetic */ hu[] w;
    protected static final /* synthetic */ int B;
    private static /* synthetic */ Map[] c;
    protected static final /* synthetic */ int C;
    private static final /* synthetic */ hu[] g;
    private static final /* synthetic */ hu[] z;
    private static final /* synthetic */ hu[] D;
    protected static final /* synthetic */ int A;
    private static final /* synthetic */ hu[] a;
    protected static final /* synthetic */ int r;
    private static /* synthetic */ gf[][] F;
    private static final /* synthetic */ hu[] y;
    private static final /* synthetic */ hu[] H;
    private static /* synthetic */ gf[][] d;
    protected static final /* synthetic */ int i;
    private static /* synthetic */ Map[] e;
    protected static final /* synthetic */ int q;
    private static final /* synthetic */ hu[] k;
    private static /* synthetic */ Map[][] u;
    private static final /* synthetic */ hu[] E;
    private static final /* synthetic */ hu[] m;
    protected static final /* synthetic */ int l;
    private static final /* synthetic */ hu[] j;
    private static /* synthetic */ c h;
    private static final /* synthetic */ int t;
    private static final /* synthetic */ hu[] n;
    private static /* synthetic */ boolean o;
    private static final /* synthetic */ hu[] v;
    public static final /* synthetic */ i G;
    private static final /* synthetic */ int s;

    private static c a(net.minecraft.ah.t t2, i i2, n n2, i i3, int n3) {
        List list;
        aA aA2;
        String string;
        block10: {
            int n4;
            List list2;
            Y y2;
            block9: {
                i3 = i3.b().e(i3, t2, n2);
                y2 = Q.P().W().b().b(i3);
                string = K.d();
                if (y2 == null) {
                    return null;
                }
                aA2 = cJ.a(n3);
                list2 = y2.a(i3, aA2, 0L);
                n4 = fU.a4();
                if (string != null) break block9;
                if (n4 != 0) {
                    list2 = aB.b(t2, i3, n2, aA2, list2);
                }
                list = list2;
                if (string != null) break block10;
                n4 = list.size();
            }
            if (n4 > 0) {
                P p2 = list2.get(0);
                return p2.p();
            }
            list = y2.a(i3, null, 0L);
        }
        List list3 = list;
        int n5 = 0;
        while (n5 < list3.size()) {
            P p3 = (P)list3.get(n5);
            if (string == null) {
                if (p3.b() == aA2) {
                    return p3.p();
                }
                ++n5;
            }
            if (string == null) continue;
        }
        return null;
    }

    private static P a(c c10, P p2) {
        block10: {
            int n2;
            int n3;
            String string;
            block9: {
                string = K.d();
                if (c == null) {
                    return p2;
                }
                n2 = n3 = c10.h();
                if (string != null) break block9;
                if (n2 < 0) break block10;
                n2 = n3;
            }
            if (n2 < c.length) {
                P p3;
                IdentityHashMap<P, P> identityHashMap;
                IdentityHashMap<P, P> identityHashMap2 = identityHashMap = c[n3];
                if (string == null) {
                    if (identityHashMap2 == null) {
                        cJ.c[n3] = identityHashMap = new IdentityHashMap<P, P>(1);
                    }
                    identityHashMap2 = identityHashMap.get(p2);
                }
                P p4 = p3 = (P)((Object)identityHashMap2);
                if (string == null) {
                    if (p4 == null) {
                        p3 = cJ.a(p2, c10);
                        identityHashMap.put(p2, p3);
                    }
                    p4 = p3;
                }
                return p4;
            }
        }
        return p2;
    }

    private static gf[][] a(List list) {
        gf[][] arrgf = new gf[list.size()][];
        int n2 = 0;
        String string = K.d();
        while (n2 < list.size()) {
            List list2 = (List)list.get(n2);
            if (string == null) {
                if (list2 != null) {
                    gf[] arrgf2 = list2.toArray(new gf[list2.size()]);
                    arrgf[n2] = arrgf2;
                }
                ++n2;
            }
            if (string == null) continue;
        }
        return arrgf;
    }

    private static void a(j j2) {
    }

    public static void b(j j2) {
        block8: {
            gf[][] arrgf;
            block10: {
                int n2;
                block9: {
                    String string;
                    block7: {
                        d = null;
                        F = null;
                        string = K.d();
                        c = null;
                        u = null;
                        if (!fU.ar()) break block8;
                        a[] arra = fU.bf();
                        for (int i2 = arra.length - 1; i2 >= 0; --i2) {
                            a a10 = arra[i2];
                            cJ.a(j2, a10);
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block7;
                        }
                        cJ.a(j2, fU.l());
                    }
                    v v2 = new v("mcpatcher/ctm/default/empty");
                    h = j2.c(v2);
                    c = new Map[j2.a() + 1];
                    e = new Map[j2.a() + 1];
                    u = new Map[j2.a() + 1][];
                    n2 = d.length;
                    if (string != null) break block9;
                    if (n2 <= 0) {
                        d = null;
                    }
                    arrgf = F;
                    if (string != null) break block10;
                    n2 = arrgf.length;
                }
                if (n2 > 0) break block8;
                arrgf = null;
            }
            F = arrgf;
        }
    }

    private static c a(gf gf2) {
        return gf2.g[0];
    }

    private static P[] a(gf gf2, net.minecraft.ah.t t2, i i2, n n2, int n3, int n4, P p2, int n5, e9 e92) {
        c c10 = p2.p();
        int n6 = cJ.b(gf2, t2, i2, n2, n3, n4, c10, n5, e92);
        return t.a(n6, gf2, n4, p2, e92);
    }

    private static hu[] b(int n2, int n3) {
        switch (n2) {
            case 0: {
                return w;
            }
            case 1: {
                return k;
            }
            case 2: {
                if (n3 == 1) {
                    return H;
                }
                return a;
            }
            case 3: {
                return v;
            }
            case 4: {
                return x;
            }
            case 5: {
                if (n3 == 2) {
                    return E;
                }
                return m;
            }
        }
        throw new IllegalArgumentException("Unknown side: " + n2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static boolean b(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, c var5_5, int var6_6) {
        block11: {
            var8_7 = var1_1.d(var3_3);
            var7_8 = K.d();
            if (var8_7 == cJ.G) {
                return false;
            }
            v0 = var0;
            if (var7_8 != null) break block11;
            if (v0.O == null) ** GOTO lbl-1000
            v1 = var8_7;
            if (var7_8 != null) ** GOTO lbl12
            if (v1 instanceof l) {
                v1 = var8_7;
lbl12:
                // 2 sources

                var9_9 = (l)v1;
                v0 = var0;
                if (var7_8 == null) {
                    if (!v0.a(var9_9.a(), var9_9.c())) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                v0 = var0;
            }
        }
        if (v0.o != null) {
            v2 = var1_1;
            if (var7_8 == null) {
                var9_9 = cJ.a(v2, var2_2, var3_3, var8_7, var4_4);
                if (var9_9 != var5_5) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v2 = var1_1;
        }
        var9_9 = v2.d(var3_3.a(cJ.a(var4_4)));
        v3 = var9_9.i();
        if (var7_8 == null) {
            if (v3 != 0) {
                return false;
            }
            v3 = var4_4;
        }
        if (var7_8 != null) return (boolean)v3;
        if (v3 != 1) return (boolean)1;
        if (var9_9.b() != net.minecraft.u.g.o) return (boolean)1;
        return (boolean)0;
    }

    private static c a(gf gf2, net.minecraft.ah.t t2, i i2, n n2, int n3, int n4, c c10, int n5, e9 e92) {
        int n6 = cJ.b(gf2, t2, i2, n2, n3, n4, c10, n5, e92);
        return gf2.g[n6];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private static c b(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, int var5_5, c var6_6, int var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 12[CASE]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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
    private static boolean c(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, c var5_5, int var6_6) {
        var8_7 = var1_1.d(var3_3);
        var7_8 = K.d();
        v0 = cJ.a(var8_7);
        if (var7_8 != null) return v0;
        if (!v0) {
            return false;
        }
        v1 = var0;
        if (var7_8 == null) {
            if (v1.t != null) {
                var9_9 = (l)var8_7;
                v2 = gc.a(var9_9.a(), var9_9.c(), var0.t);
                if (var7_8 != null) return v2;
                if (!v2) {
                    return false;
                }
            }
            v1 = var0;
        }
        if (v1.k != null) {
            v3 = var1_1;
            if (var7_8 == null) {
                var9_9 = cJ.a(v3, var2_2, var3_3, var8_7, var4_4);
                if (!fU.a(var9_9, (Object[])var0.k)) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v3 = var1_1;
        }
        var9_9 = v3.d(var3_3.a(cJ.a(var4_4)));
        v4 = var9_9.i();
        if (var7_8 == null) {
            if (v4 != 0) {
                return false;
            }
            v4 = var4_4;
        }
        if (var7_8 == null) {
            if (v4 == 1 && var9_9.b() == net.minecraft.u.g.o) {
                return false;
            }
            v4 = cJ.a(var0, var1_1, var2_2, var3_3, var8_7, var4_4, var5_5, var6_6) ? 1 : 0;
        }
        if (var7_8 != null) return (boolean)v4;
        if (v4 != 0) return (boolean)0;
        return (boolean)1;
    }

    private static String[] b() {
        String[] arrstring;
        block10: {
            ArrayList<String> arrayList = new ArrayList<String>();
            String string = "mcpatcher/ctm/default/";
            String string2 = K.d();
            int n2 = fU.e(new v("textures/blocks/glass.png"));
            if (string2 == null) {
                if (n2 != 0) {
                    arrayList.add(string + "glass.properties");
                    arrayList.add(string + "glasspane.properties");
                }
                n2 = fU.e(new v("textures/blocks/bookshelf.png")) ? 1 : 0;
            }
            if (string2 == null) {
                if (n2 != 0) {
                    arrayList.add(string + "bookshelf.properties");
                }
                n2 = fU.e(new v("textures/blocks/sandstone_normal.png")) ? 1 : 0;
            }
            if (string2 == null) {
                if (n2 != 0) {
                    arrayList.add(string + "sandstone.properties");
                }
                n2 = 16;
            }
            String[] arrstring2 = new String[n2];
            arrstring2[0] = "white";
            arrstring2[1] = "orange";
            arrstring2[2] = "magenta";
            arrstring2[3] = "light_blue";
            arrstring2[4] = "yellow";
            arrstring2[5] = "lime";
            arrstring2[6] = "pink";
            arrstring2[7] = "gray";
            arrstring2[8] = "silver";
            arrstring2[9] = "cyan";
            arrstring2[10] = "purple";
            arrstring2[11] = "blue";
            arrstring2[12] = "brown";
            arrstring2[13] = "green";
            arrstring2[14] = "red";
            arrstring2[15] = "black";
            String[] arrstring3 = arrstring2;
            int n3 = 0;
            while (n3 < arrstring3.length) {
                arrstring = arrstring3;
                if (string2 == null) {
                    String string3 = arrstring[n3];
                    if (string2 == null) {
                        if (fU.e(new v("textures/blocks/glass_" + string3 + ".png"))) {
                            arrayList.add(string + n3 + "_glass_" + string3 + "/glass_" + string3 + ".properties");
                            arrayList.add(string + n3 + "_glass_" + string3 + "/glass_pane_" + string3 + ".properties");
                        }
                        ++n3;
                    }
                    if (string2 == null) continue;
                }
                break block10;
            }
            arrstring = arrayList.toArray(new String[arrayList.size()]);
        }
        String[] arrstring4 = arrstring;
        return arrstring4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static c a(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, int var5_5, c var6_6, int var7_7) {
        block25: {
            var9_8 = 0;
            var8_9 = K.d();
            var10_10 = 0;
            v0 = var4_4;
            if (var8_9 != null) break block25;
            switch (v0) {
                case 0: {
                    v1 = var5_5;
                    if (var8_9 == null) {
                        if (v1 == 1) {
                            var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.j(), var5_5, var6_6, var7_7) ? 1 : 0;
                            var10_10 = cJ.a(var0, var1_1, var2_2, var3_3.i(), var5_5, var6_6, var7_7) ? 1 : 0;
                            if (var8_9 == null) break;
                        }
                        v1 = var5_5;
                    }
                    if (var8_9 == null) {
                        if (v1 == 0) {
                            var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.i(), var5_5, var6_6, var7_7) ? 1 : 0;
                            var10_10 = cJ.a(var0, var1_1, var2_2, var3_3.j(), var5_5, var6_6, var7_7) ? 1 : 0;
                            if (var8_9 == null) break;
                        }
                        var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.k(), var5_5, var6_6, var7_7) ? 1 : 0;
                        v1 = var10_10 = (int)(cJ.a(var0, var1_1, var2_2, var3_3.a(), var5_5, var6_6, var7_7) ? 1 : 0);
                    }
                    if (var8_9 == null) break;
                }
                case 1: {
                    v2 = var5_5;
                    v3 = 3;
                    if (var8_9 != null) ** GOTO lbl34
                    if (v2 == v3) {
                        var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.k(), var5_5, var6_6, var7_7) ? 1 : 0;
                        var10_10 = cJ.a(var0, var1_1, var2_2, var3_3.a(), var5_5, var6_6, var7_7) ? 1 : 0;
                        if (var8_9 == null) break;
                    }
                    v2 = var5_5;
                    if (var8_9 != null) ** GOTO lbl40
                    v3 = 2;
lbl34:
                    // 2 sources

                    if (v2 == v3) {
                        var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.a(), var5_5, var6_6, var7_7) ? 1 : 0;
                        var10_10 = cJ.a(var0, var1_1, var2_2, var3_3.k(), var5_5, var6_6, var7_7) ? 1 : 0;
                        if (var8_9 == null) break;
                    }
                    var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.j(), var5_5, var6_6, var7_7) ? 1 : 0;
                    v2 = var10_10 = (int)(cJ.a(var0, var1_1, var2_2, var3_3.i(), var5_5, var6_6, var7_7) ? 1 : 0);
lbl40:
                    // 2 sources

                    if (var8_9 == null) break;
                }
                case 2: {
                    v4 = var5_5;
                    v5 = 5;
                    if (var8_9 != null) ** GOTO lbl52
                    if (v4 == v5) {
                        var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.a(), var5_5, var6_6, var7_7) ? 1 : 0;
                        var10_10 = cJ.a(var0, var1_1, var2_2, var3_3.k(), var5_5, var6_6, var7_7) ? 1 : 0;
                        if (var8_9 == null) break;
                    }
                    v4 = var5_5;
                    if (var8_9 != null) ** GOTO lbl58
                    v5 = 4;
lbl52:
                    // 2 sources

                    if (v4 == v5) {
                        var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.k(), var5_5, var6_6, var7_7) ? 1 : 0;
                        var10_10 = cJ.a(var0, var1_1, var2_2, var3_3.a(), var5_5, var6_6, var7_7) ? 1 : 0;
                        if (var8_9 == null) break;
                    }
                    var9_8 = cJ.a(var0, var1_1, var2_2, var3_3.b(), var5_5, var6_6, var7_7) ? 1 : 0;
                    v4 = cJ.a(var0, var1_1, var2_2, var3_3.m(), var5_5, var6_6, var7_7) ? 1 : 0;
lbl58:
                    // 2 sources

                    var10_10 = v4;
                    break;
                }
            }
            v0 = 3;
        }
        var11_11 = v0;
        v6 = var9_8;
        if (var8_9 == null) {
            if (v6 != 0) {
                v7 = var10_10;
                if (var8_9 == null) {
                    if (v7 != 0) {
                        var11_11 = 1;
                        if (var8_9 == null) return var0.g[var11_11];
                    }
                    v7 = 2;
                }
                var11_11 = v7;
                if (var8_9 == null) return var0.g[var11_11];
            }
            v6 = var10_10;
        }
        if (var8_9 == null) {
            if (v6 != 0) {
                var11_11 = 0;
                if (var8_9 == null) return var0.g[var11_11];
            }
            v6 = 3;
        }
        var11_11 = v6;
        return var0.g[var11_11];
    }

    private static boolean a(i i2) {
        String string = K.d();
        i i3 = i2;
        if (string == null) {
            if (i3.k()) {
                return true;
            }
            i3 = i2;
        }
        net.minecraft.W.K k2 = i3.b();
        boolean bl2 = k2 instanceof S;
        if (string == null) {
            if (bl2) {
                return true;
            }
            bl2 = k2 instanceof X;
        }
        return bl2;
    }

    private static c b(gf gf2, n n2, int n3) {
        String string = K.d();
        int n4 = gf2.g.length;
        if (string == null) {
            if (n4 == 1) {
                return gf2.g[0];
            }
            n4 = n2.e();
        }
        int n5 = n4;
        int n6 = n2.b();
        int n7 = n2.a();
        int n8 = 0;
        int n9 = 0;
        int n10 = n3;
        if (string == null) {
            switch (n10) {
                case 0: {
                    n8 = n5;
                    n9 = n7;
                    if (string == null) break;
                }
                case 1: {
                    n8 = n5;
                    n9 = n7;
                    if (string == null) break;
                }
                case 2: {
                    n8 = -n5 - 1;
                    n9 = -n6;
                    if (string == null) break;
                }
                case 3: {
                    n8 = n5;
                    n9 = -n6;
                    if (string == null) break;
                }
                case 4: {
                    n8 = n7;
                    n9 = -n6;
                    if (string == null) break;
                }
                case 5: {
                    n8 = -n7 - 1;
                    n9 = -n6;
                }
            }
            n9 %= gf2.v;
            n10 = n8 %= gf2.U;
        }
        if (string == null) {
            if (n10 < 0) {
                n8 += gf2.U;
            }
            n10 = n9;
        }
        if (string == null) {
            if (n10 < 0) {
                n9 += gf2.v;
            }
            n10 = n9 * gf2.U + n8;
        }
        int n11 = n10;
        return gf2.g[n11];
    }

    private static void a(gf gf2, List list) {
        block6: {
            String string = K.d();
            if (gf2.o == null) break block6;
            for (int i2 = 0; i2 < gf2.o.length; ++i2) {
                int n2;
                block8: {
                    block7: {
                        c c10 = gf2.o[i2];
                        int n3 = c10 instanceof c;
                        if (string == null) {
                            if (n3 == 0) {
                                fU.h("TextureAtlasSprite is not TextureAtlasSprite: " + c10 + ", name: " + c10.e());
                                if (string == null) continue;
                            }
                            n3 = n2 = c10.h();
                        }
                        if (string != null) break block7;
                        if (n2 >= 0) break block8;
                        fU.h("Invalid tile ID: " + n2 + ", icon: " + c10.e());
                    }
                    if (string == null) continue;
                }
                cJ.a(gf2, list, n2);
                if (string == null) continue;
            }
        }
    }

    public static void a(j j2, a a10) {
        block8: {
            String string = K.d();
            Object[] arrobject = ci.a(a10, "mcpatcher/ctm/", ".properties", cJ.b());
            Arrays.sort(arrobject);
            List list = cJ.a(F);
            List list2 = cJ.a(d);
            String string2 = string;
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                Object object = arrobject[i2];
                fU.b("ConnectedTextures: " + (String)object);
                try {
                    gf gf2;
                    InputStream inputStream;
                    block10: {
                        block9: {
                            v v2 = new v((String)object);
                            inputStream = a10.a(v2);
                            if (string2 != null) break block8;
                            if (string2 != null) break block9;
                            if (inputStream != null) break block10;
                            fU.h("ConnectedTextures file not found: " + (String)object);
                        }
                        if (string2 == null) continue;
                    }
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    gf gf3 = gf2 = new gf(properties, (String)object);
                    if (string2 == null) {
                        if (!gf3.e((String)object)) continue;
                        gf2.a(j2);
                        cJ.a(gf2, list);
                        gf3 = gf2;
                    }
                    cJ.b(gf3, list2);
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    fU.h("ConnectedTextures file not found: " + (String)object);
                    continue;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (string2 == null) continue;
            }
            d = cJ.a(list2);
            F = cJ.a(list);
            o = cJ.c();
            fU.b("Multipass connected textures: " + o);
        }
    }

    public static int a(aA aA2) {
        String string = K.d();
        if (aA2 == null) {
            return -1;
        }
        int n2 = eN.a[aA2.ordinal()];
        if (string == null) {
            switch (n2) {
                case 1: {
                    return 0;
                }
                case 2: {
                    return 1;
                }
                case 3: {
                    return 5;
                }
                case 4: {
                    return 4;
                }
                case 5: {
                    return 2;
                }
                case 6: {
                    return 3;
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
    public static P[] a(net.minecraft.ah.t var0, i var1_1, n var2_2, aA var3_3, P var4_4, boolean var5_5, int var6_6, e9 var7_7) {
        block16: {
            block17: {
                block12: {
                    block13: {
                        block14: {
                            var9_8 = var1_1.b();
                            var8_9 = K.d();
                            v0 = var1_1;
                            if (var8_9 == null) {
                                if (!(v0 instanceof l)) {
                                    return var7_7.b(var4_4);
                                }
                                v0 = var1_1;
                            }
                            var10_10 = (l)v0;
                            var11_11 = var4_4.p();
                            v1 = cJ.F;
                            if (var8_9 != null) break block12;
                            if (v1 == null) break block13;
                            v2 = var12_12 = var11_11.h();
                            if (var8_9 != null) break block14;
                            if (v2 < 0) break block13;
                            v2 = var12_12;
                        }
                        if (v2 >= cJ.F.length) break block13;
                        v1 = cJ.F;
                        if (var8_9 != null) break block12;
                        var13_13 = v1[var12_12];
                        if (var13_13 == null) break block13;
                        var14_14 = cJ.a(var3_3);
                        var15_15 = 0;
                        while (var15_15 < var13_13.length) {
                            block15: {
                                var16_16 = var13_13[var15_15];
                                if (var8_9 != null) break block15;
                                v3 = var16_16;
                                if (var8_9 != null) ** GOTO lbl61
                                if (v3 == null) ** GOTO lbl-1000
                                v4 = var16_16;
                                if (var8_9 != null) ** GOTO lbl35
                                if (v4.a(var10_10.a())) {
                                    v4 = var16_16;
lbl35:
                                    // 2 sources

                                    var17_17 = cJ.a(v4, var0, var10_10, var2_2, var14_14, var4_4, var6_6, var7_7);
                                    if (var8_9 == null) {
                                        if (var17_17 != null) {
                                            return var17_17;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 4 sources

                                {
                                    ++var15_15;
                                }
                            }
                            if (var8_9 == null) continue;
                        }
                    }
                    v1 = cJ.d;
                }
                if (v1 == null) break block16;
                v5 = var5_5;
                if (var8_9 != null) break block17;
                if (v5 == 0) break block16;
                v6 = var7_7;
                if (var8_9 != null) return v6.b(var4_4);
                v5 = v6.n();
            }
            if ((var12_12 = v5) < 0 || var12_12 >= cJ.d.length || (var13_13 = cJ.d[var12_12]) == null) break block16;
            var14_14 = cJ.a(var3_3);
            var15_15 = 0;
            while (var15_15 < var13_13.length) {
                block18: {
                    var16_16 = var13_13[var15_15];
                    if (var8_9 != null) break block18;
                    v3 = var16_16;
lbl61:
                    // 2 sources

                    if (v3 == null) ** GOTO lbl-1000
                    v7 = var16_16;
                    if (var8_9 != null) ** GOTO lbl66
                    if (v7.a(var11_11)) {
                        v7 = var16_16;
lbl66:
                        // 2 sources

                        var17_17 = cJ.a(v7, var0, var10_10, var2_2, var14_14, var4_4, var6_6, var7_7);
                        if (var8_9 == null) {
                            if (var17_17 != null) {
                                return var17_17;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 4 sources

                    {
                        ++var15_15;
                    }
                }
                if (var8_9 == null) continue;
            }
        }
        v6 = var7_7;
        return v6.b(var4_4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static P[] a(gf var0, net.minecraft.ah.t var1_1, l var2_2, n var3_3, int var4_4, P var5_5, int var6_6, e9 var7_7) {
        block38: {
            block39: {
                block36: {
                    block37: {
                        var9_8 = 0;
                        var11_10 = var10_9 = var2_2.c();
                        var12_11 = var2_2.b();
                        var8_12 = K.d();
                        v0 = var12_11 instanceof bU;
                        if (var8_12 != null) break block36;
                        if (v0 == 0) break block37;
                        var9_8 = cJ.a(var4_4, var10_9);
                        v0 = var0.c();
                        if (var8_12 != null) break block36;
                        if (v0 <= 3) {
                            var11_10 = var10_9 & 3;
                        }
                    }
                    v0 = var12_11 instanceof bd;
                }
                if (var8_12 != null) break block38;
                if (v0 == 0) break block39;
                var9_8 = cJ.e(var4_4, var10_9);
                v0 = var0.c();
                if (var8_12 != null) break block38;
                if (v0 > 2) break block39;
                v0 = var11_10;
                if (var8_12 != null) break block38;
                if (v0 > 2) {
                    var11_10 = 2;
                }
            }
            v0 = var0.a(var2_2.a(), var11_10) ? 1 : 0;
        }
        if (var8_12 == null) {
            if (v0 == 0) {
                return null;
            }
            v0 = var4_4;
        }
        if (var8_12 != null) ** GOTO lbl50
        if (v0 < 0) ** GOTO lbl-1000
        v0 = var0.af;
        if (var8_12 == null) {
            ** if (v0 == 63) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                var13_13 = var4_4;
                v1 = var9_8;
                if (var8_12 == null) {
                    if (v1 != 0) {
                        var13_13 = cJ.c((int)var4_4, (int)var9_8);
                    } else {
                        ** GOTO lbl43
                    }
lbl43:
                    // 3 sources

                    v1 = 1 << var13_13 & var0.af;
                } else {
                    ** GOTO lbl44
                }
lbl44:
                // 3 sources

                if (var8_12 == null) {
                    if (v1 == 0) {
                        return null;
                    } else {
                        ** GOTO lbl-1000
                    }
                } else {
                    ** GOTO lbl47
                }
lbl47:
                // 2 sources

                ** GOTO lbl51
            }
        }
        ** GOTO lbl50
lbl-1000:
        // 4 sources

        {
            v0 = var3_3.b();
lbl50:
            // 3 sources

            v1 = var13_13 = v0;
        }
lbl51:
        // 2 sources

        v2 = var0.A;
        if (var8_12 == null) {
            if (v1 < v2) return null;
            v1 = var13_13;
            v2 = var0.F;
        }
        if (v1 > v2) return null;
        if (var0.d != null && !var0.a((h)(var14_14 = var1_1.c(var3_3)))) {
            return null;
        }
        var14_14 = var5_5.p();
        v3 = var0;
        if (var8_12 != null) return cJ.b(v3, var1_1, (i)var2_2, var3_3, var9_8, var4_4, var5_5, var10_9, var7_7);
        switch (v3.V) {
            case 1: {
                return cJ.a(cJ.a(var0, var1_1, (i)var2_2, var3_3, var9_8, var4_4, (c)var14_14, var10_9, var7_7), var5_5, var7_7);
            }
            case 2: {
                return cJ.a(cJ.b(var0, var1_1, var2_2, var3_3, var9_8, var4_4, (c)var14_14, var10_9), var5_5, var7_7);
            }
            case 3: {
                return cJ.a(cJ.e(var0, var1_1, var2_2, var3_3, var9_8, var4_4, (c)var14_14, var10_9), var5_5, var7_7);
            }
            case 4: {
                return cJ.a(cJ.a(var0, var3_3, var4_4), var5_5, var7_7);
            }
            case 5: {
                return cJ.a(cJ.b(var0, var3_3, var4_4), var5_5, var7_7);
            }
            case 6: {
                return cJ.a(cJ.a(var0, var1_1, (i)var2_2, var3_3, var9_8, var4_4, (c)var14_14, var10_9), var5_5, var7_7);
            }
            case 7: {
                return cJ.a(cJ.a(var0), var5_5, var7_7);
            }
            case 8: {
                return cJ.a(cJ.c(var0, var1_1, var2_2, var3_3, var9_8, var4_4, (c)var14_14, var10_9), var5_5, var7_7);
            }
            case 9: {
                return cJ.a(cJ.d(var0, var1_1, var2_2, var3_3, var9_8, var4_4, (c)var14_14, var10_9), var5_5, var7_7);
            }
            case 10: {
                if (var6_6 != 0) return null;
                return cJ.a(var0, var1_1, (i)var2_2, var3_3, var9_8, var4_4, var5_5, var10_9, var7_7);
            }
            default: {
                return null;
            }
            case 11: 
        }
        v3 = var0;
        return cJ.b(v3, var1_1, (i)var2_2, var3_3, var9_8, var4_4, var5_5, var10_9, var7_7);
    }

    private static aA a(int n2) {
        switch (n2) {
            case 0: {
                return aA.DOWN;
            }
            case 1: {
                return aA.UP;
            }
            case 2: {
                return aA.NORTH;
            }
            case 3: {
                return aA.SOUTH;
            }
            case 4: {
                return aA.WEST;
            }
            case 5: {
                return aA.EAST;
            }
        }
        return aA.UP;
    }

    private static void a(int[] arrn, int n2, c c10, c c11) {
        int n3 = arrn.length / 4;
        int n4 = n3 * n2;
        float f10 = Float.intBitsToFloat(arrn[n4 + 4]);
        float f11 = Float.intBitsToFloat(arrn[n4 + 4 + 1]);
        double d10 = c10.f(f10);
        double d11 = c10.d(f11);
        arrn[n4 + 4] = Float.floatToRawIntBits(c11.a(d10));
        arrn[n4 + 4 + 1] = Float.floatToRawIntBits(c11.b(d11));
    }

    private static void b(gf gf2, List list) {
        block3: {
            String string = K.d();
            if (gf2.O == null) break block3;
            for (int i2 = 0; i2 < gf2.O.length; ++i2) {
                int n2;
                block5: {
                    block4: {
                        n2 = gf2.O[i2].a();
                        if (string != null) break block4;
                        if (n2 >= 0) break block5;
                        fU.h("Invalid block ID: " + n2);
                    }
                    if (string == null) continue;
                }
                cJ.a(gf2, list, n2);
                if (string == null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static c c(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, int var5_5, c var6_6, int var7_7) {
        block8: {
            block9: {
                var9_8 = var0.g;
                var10_9 = cJ.b(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
                var8_10 = K.d();
                v0 = var10_9;
                if (var8_10 != null) break block8;
                if (v0 == null) break block9;
                v0 = var10_9;
                if (var8_10 != null) break block8;
                if (v0 != var6_6) {
                    v0 = var10_9;
                    if (var8_10 == null) {
                        if (v0 != var9_8[3]) {
                            return var10_9;
                        } else {
                            ** GOTO lbl16
                        }
                    } else {
                        ** GOTO lbl15
                    }
                }
                break block9;
lbl15:
                // 2 sources

                break block8;
            }
            v0 = cJ.a(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
        }
        v1 = var11_11 = v0;
        v2 = var9_8[0];
        if (var8_10 == null) {
            if (v1 == v2) {
                return var9_8[4];
            }
            v1 = var11_11;
            v2 = var9_8[1];
        }
        if (var8_10 == null) {
            if (v1 == v2) {
                return var9_8[5];
            }
            v1 = var11_11;
            if (var8_10 != null) return v1;
            v2 = var9_8[2];
        }
        if (v1 == v2) {
            v1 = var9_8[6];
            return v1;
        }
        v1 = var11_11;
        return v1;
    }

    private static c a(gf gf2, n n2, int n3) {
        int n4;
        block9: {
            int n5;
            String string;
            block8: {
                block7: {
                    string = K.d();
                    int n6 = gf2.g.length;
                    int n7 = 1;
                    if (string == null) {
                        if (n6 == n7) {
                            return gf2.g[0];
                        }
                        n6 = n3 / gf2.n;
                        n7 = gf2.n;
                    }
                    int n8 = n6 * n7;
                    n5 = fU.a(n2, n8) & Integer.MAX_VALUE;
                    n4 = 0;
                    if (string != null) break block7;
                    if (gf2.w != null) break block8;
                    n4 = n5 % gf2.g.length;
                }
                if (string == null) break block9;
            }
            int n9 = n5 % gf2.j;
            int[] arrn = gf2.X;
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                int n10 = n9;
                if (string == null) {
                    if (n10 >= arrn[i2]) continue;
                    n10 = n4 = i2;
                }
                if (string == null) break;
                if (string == null) continue;
                break;
            }
        }
        return gf2.g[n4];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int b(gf gf2, net.minecraft.ah.t t2, i i2, n n2, int n3, int n4, c c10, int n5, e9 e92) {
        int n6;
        int n7;
        block124: {
            int n8;
            String string;
            boolean[] arrbl;
            block209: {
                block211: {
                    block210: {
                        block206: {
                            block208: {
                                block207: {
                                    block203: {
                                        block205: {
                                            block204: {
                                                block200: {
                                                    block202: {
                                                        block201: {
                                                            block197: {
                                                                block199: {
                                                                    block198: {
                                                                        block194: {
                                                                            block196: {
                                                                                block195: {
                                                                                    block191: {
                                                                                        block193: {
                                                                                            block192: {
                                                                                                block188: {
                                                                                                    block190: {
                                                                                                        block189: {
                                                                                                            block185: {
                                                                                                                block187: {
                                                                                                                    block186: {
                                                                                                                        block182: {
                                                                                                                            block184: {
                                                                                                                                block183: {
                                                                                                                                    block179: {
                                                                                                                                        block181: {
                                                                                                                                            block180: {
                                                                                                                                                block176: {
                                                                                                                                                    block178: {
                                                                                                                                                        block177: {
                                                                                                                                                            block173: {
                                                                                                                                                                block175: {
                                                                                                                                                                    block174: {
                                                                                                                                                                        block170: {
                                                                                                                                                                            block172: {
                                                                                                                                                                                block171: {
                                                                                                                                                                                    block167: {
                                                                                                                                                                                        block169: {
                                                                                                                                                                                            block168: {
                                                                                                                                                                                                block164: {
                                                                                                                                                                                                    block166: {
                                                                                                                                                                                                        block165: {
                                                                                                                                                                                                            block161: {
                                                                                                                                                                                                                block163: {
                                                                                                                                                                                                                    block162: {
                                                                                                                                                                                                                        block158: {
                                                                                                                                                                                                                            block160: {
                                                                                                                                                                                                                                block159: {
                                                                                                                                                                                                                                    block155: {
                                                                                                                                                                                                                                        block157: {
                                                                                                                                                                                                                                            block156: {
                                                                                                                                                                                                                                                block152: {
                                                                                                                                                                                                                                                    block154: {
                                                                                                                                                                                                                                                        block153: {
                                                                                                                                                                                                                                                            block149: {
                                                                                                                                                                                                                                                                block151: {
                                                                                                                                                                                                                                                                    block150: {
                                                                                                                                                                                                                                                                        block146: {
                                                                                                                                                                                                                                                                            block148: {
                                                                                                                                                                                                                                                                                block147: {
                                                                                                                                                                                                                                                                                    block143: {
                                                                                                                                                                                                                                                                                        block145: {
                                                                                                                                                                                                                                                                                            block144: {
                                                                                                                                                                                                                                                                                                block140: {
                                                                                                                                                                                                                                                                                                    block142: {
                                                                                                                                                                                                                                                                                                        block141: {
                                                                                                                                                                                                                                                                                                            block137: {
                                                                                                                                                                                                                                                                                                                block139: {
                                                                                                                                                                                                                                                                                                                    block138: {
                                                                                                                                                                                                                                                                                                                        block134: {
                                                                                                                                                                                                                                                                                                                            block136: {
                                                                                                                                                                                                                                                                                                                                block135: {
                                                                                                                                                                                                                                                                                                                                    block131: {
                                                                                                                                                                                                                                                                                                                                        block133: {
                                                                                                                                                                                                                                                                                                                                            block132: {
                                                                                                                                                                                                                                                                                                                                                block128: {
                                                                                                                                                                                                                                                                                                                                                    block130: {
                                                                                                                                                                                                                                                                                                                                                        block129: {
                                                                                                                                                                                                                                                                                                                                                            block125: {
                                                                                                                                                                                                                                                                                                                                                                block127: {
                                                                                                                                                                                                                                                                                                                                                                    block126: {
                                                                                                                                                                                                                                                                                                                                                                        block121: {
                                                                                                                                                                                                                                                                                                                                                                            block123: {
                                                                                                                                                                                                                                                                                                                                                                                block122: {
                                                                                                                                                                                                                                                                                                                                                                                    block120: {
                                                                                                                                                                                                                                                                                                                                                                                        block119: {
                                                                                                                                                                                                                                                                                                                                                                                            block118: {
                                                                                                                                                                                                                                                                                                                                                                                                block91: {
                                                                                                                                                                                                                                                                                                                                                                                                    block116: {
                                                                                                                                                                                                                                                                                                                                                                                                        block117: {
                                                                                                                                                                                                                                                                                                                                                                                                            int n9;
                                                                                                                                                                                                                                                                                                                                                                                                            block114: {
                                                                                                                                                                                                                                                                                                                                                                                                                block115: {
                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl2;
                                                                                                                                                                                                                                                                                                                                                                                                                    block112: {
                                                                                                                                                                                                                                                                                                                                                                                                                        block113: {
                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl3;
                                                                                                                                                                                                                                                                                                                                                                                                                            block110: {
                                                                                                                                                                                                                                                                                                                                                                                                                                block111: {
                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl4;
                                                                                                                                                                                                                                                                                                                                                                                                                                    block108: {
                                                                                                                                                                                                                                                                                                                                                                                                                                        block109: {
                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl5;
                                                                                                                                                                                                                                                                                                                                                                                                                                            block106: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                block107: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    block104: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        block105: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl7;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            block102: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                block103: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl8;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block100: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block101: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl9;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block98: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block99: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl10;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block96: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block97: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block94: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block95: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl12;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block92: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        block93: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl13;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            block89: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                block90: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    int n10;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    block88: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        arrbl = e92.k();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        string = K.d();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n10 = n4;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (string != null) break block88;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        switch (n10) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            case 0: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[0] = cJ.a(gf2, t2, i2, n2.b(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[1] = cJ.a(gf2, t2, i2, n2.m(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[2] = cJ.a(gf2, t2, i2, n2.i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[3] = cJ.a(gf2, t2, i2, n2.j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            case 1: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[0] = cJ.a(gf2, t2, i2, n2.b(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[1] = cJ.a(gf2, t2, i2, n2.m(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[2] = cJ.a(gf2, t2, i2, n2.j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[3] = cJ.a(gf2, t2, i2, n2.i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            case 2: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[0] = cJ.a(gf2, t2, i2, n2.m(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[1] = cJ.a(gf2, t2, i2, n2.b(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[2] = cJ.a(gf2, t2, i2, n2.k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[3] = cJ.a(gf2, t2, i2, n2.a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n10 = n3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (n10 != 1) break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    cJ.a(0, 1, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    cJ.a(2, 3, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                break block88;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            case 3: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[0] = cJ.a(gf2, t2, i2, n2.b(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[1] = cJ.a(gf2, t2, i2, n2.m(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[2] = cJ.a(gf2, t2, i2, n2.k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[3] = cJ.a(gf2, t2, i2, n2.a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            case 4: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[0] = cJ.a(gf2, t2, i2, n2.i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[1] = cJ.a(gf2, t2, i2, n2.j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[2] = cJ.a(gf2, t2, i2, n2.k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[3] = cJ.a(gf2, t2, i2, n2.a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            case 5: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[0] = cJ.a(gf2, t2, i2, n2.j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[1] = cJ.a(gf2, t2, i2, n2.i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[2] = cJ.a(gf2, t2, i2, n2.k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                arrbl[3] = cJ.a(gf2, t2, i2, n2.a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                n10 = n3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (string != null) break block88;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (n10 != 2) break;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                cJ.a(0, 1, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                cJ.a(2, 3, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        n10 = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = n10;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl14 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl15 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl15 = !bl15;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl16 = bl14 & bl15;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl17 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl17 = !bl17;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl18 = bl16 & bl17;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl19 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl19 = !bl19;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    bl13 = bl18 & bl19;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block89;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (!bl13) break block90;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = 3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl13 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl13 = !bl13;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl20 = bl13 & arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl21 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl21 = !bl21;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl22 = bl20 & bl21;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl23 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl23 = !bl23;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            bl12 = bl22 & bl23;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block92;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (!bl12) break block93;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n7 = 1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl12 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl12 = !bl12;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl24 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl24 = !bl24;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl25 = bl12 & bl24 & arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl26 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl26 = !bl26;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    bl11 = bl25 & bl26;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block94;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (!bl11) break block95;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = 12;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl11 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl11 = !bl11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl27 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl27 = !bl27;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl28 = bl11 & bl27;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl29 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl29 = !bl29;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            bl10 = bl28 & bl29 & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block96;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (!bl10) break block97;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n7 = 36;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl10 = arrbl[0] & arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl30 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl30 = !bl30;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl31 = bl10 & bl30;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl32 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl32 = !bl32;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    bl9 = bl31 & bl32;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block98;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (!bl9) break block99;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = 2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl9 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl9 = !bl9;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl33 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl33 = !bl33;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            bl8 = bl9 & bl33 & arrbl[2] & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block100;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (!bl8) break block101;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            n7 = 24;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl8 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl34 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl34 = !bl34;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl35 = bl8 & bl34 & arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl36 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl36 = !bl36;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    bl7 = bl35 & bl36;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block102;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (!bl7) break block103;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = 15;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl7 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl37 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl37 = !bl37;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl38 = bl7 & bl37;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl39 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                bl39 = !bl39;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            bl6 = bl38 & bl39 & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block104;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (!bl6) break block105;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            n7 = 39;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl6 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl6 = !bl6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl40 = bl6 & arrbl[1] & arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl41 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        bl41 = !bl41;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    bl5 = bl40 & bl41;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block106;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (!bl5) break block107;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = 13;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                bl5 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                bl5 = !bl5;
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl42 = bl5 & arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl43 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                bl43 = !bl43;
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            bl4 = bl42 & bl43 & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block108;
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (!bl4) break block109;
                                                                                                                                                                                                                                                                                                                                                                                                                                            n7 = 37;
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        bl4 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        bl4 = !bl4;
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    bl3 = bl4 & arrbl[1] & arrbl[2] & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block110;
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (!bl3) break block111;
                                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = 25;
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                bl3 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            boolean bl44 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                bl44 = !bl44;
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            bl2 = bl3 & bl44 & arrbl[2] & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block112;
                                                                                                                                                                                                                                                                                                                                                                                                                            if (!bl2) break block113;
                                                                                                                                                                                                                                                                                                                                                                                                                            n7 = 27;
                                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        bl2 = arrbl[0] & arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl45 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        bl45 = !bl45;
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    n9 = bl2 & bl45 & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block114;
                                                                                                                                                                                                                                                                                                                                                                                                                    if (n9 == 0) break block115;
                                                                                                                                                                                                                                                                                                                                                                                                                    n7 = 38;
                                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                n9 = arrbl[0] & arrbl[1] & arrbl[2];
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            int n11 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                n11 = n11 == 0 ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            n6 = n9 & n11;
                                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block116;
                                                                                                                                                                                                                                                                                                                                                                                                            if (n6 == 0) break block117;
                                                                                                                                                                                                                                                                                                                                                                                                            n7 = 14;
                                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block91;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        n6 = arrbl[0] & arrbl[1] & arrbl[2] & arrbl[3];
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block118;
                                                                                                                                                                                                                                                                                                                                                                                                    if (n6 != 0) {
                                                                                                                                                                                                                                                                                                                                                                                                        n7 = 26;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                n6 = n7;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                if (n6 == 0) {
                                                                                                                                                                                                                                                                                                                                                                                                    return n7;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                n6 = fU.bj() ? 1 : 0;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                if (n6 == 0) {
                                                                                                                                                                                                                                                                                                                                                                                                    return n7;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                n6 = n4;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block119;
                                                                                                                                                                                                                                                                                                                                                                                            switch (n6) {
                                                                                                                                                                                                                                                                                                                                                                                                case 0: {
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl46 = cJ.a(gf2, t2, i2, n2.m().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl46 = !bl46;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[0] = bl46;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl47 = cJ.a(gf2, t2, i2, n2.b().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl47 = !bl47;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[1] = bl47;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl48 = cJ.a(gf2, t2, i2, n2.m().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl48 = !bl48;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[2] = bl48;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl49 = cJ.a(gf2, t2, i2, n2.b().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl49 = arrbl[3] = !bl49;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                case 1: {
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl50 = cJ.a(gf2, t2, i2, n2.m().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl50 = !bl50;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[0] = bl50;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl51 = cJ.a(gf2, t2, i2, n2.b().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl51 = !bl51;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[1] = bl51;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl52 = cJ.a(gf2, t2, i2, n2.m().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl52 = !bl52;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[2] = bl52;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl53 = cJ.a(gf2, t2, i2, n2.b().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl53 = arrbl[3] = !bl53;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                case 2: {
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl54 = cJ.a(gf2, t2, i2, n2.b().k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl54 = !bl54;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[0] = bl54;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl55 = cJ.a(gf2, t2, i2, n2.m().k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl55 = !bl55;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[1] = bl55;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl56 = cJ.a(gf2, t2, i2, n2.b().a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl56 = !bl56;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[2] = bl56;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl57 = cJ.a(gf2, t2, i2, n2.m().a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl57 = !bl57;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[3] = bl57;
                                                                                                                                                                                                                                                                                                                                                                                                    n6 = n3;
                                                                                                                                                                                                                                                                                                                                                                                                    n8 = 1;
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        if (n6 != n8) break;
                                                                                                                                                                                                                                                                                                                                                                                                        cJ.a(0, 3, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                        cJ.a(1, 2, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                        if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    break block120;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                case 3: {
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl58 = cJ.a(gf2, t2, i2, n2.m().k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl58 = !bl58;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[0] = bl58;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl59 = cJ.a(gf2, t2, i2, n2.b().k(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl59 = !bl59;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[1] = bl59;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl60 = cJ.a(gf2, t2, i2, n2.m().a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl60 = !bl60;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[2] = bl60;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl61 = cJ.a(gf2, t2, i2, n2.b().a(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl61 = arrbl[3] = !bl61;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                case 4: {
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl62 = cJ.a(gf2, t2, i2, n2.k().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl62 = !bl62;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[0] = bl62;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl63 = cJ.a(gf2, t2, i2, n2.k().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl63 = !bl63;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[1] = bl63;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl64 = cJ.a(gf2, t2, i2, n2.a().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl64 = !bl64;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[2] = bl64;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl65 = cJ.a(gf2, t2, i2, n2.a().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl65 = arrbl[3] = !bl65;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                case 5: {
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl66 = cJ.a(gf2, t2, i2, n2.k().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl66 = !bl66;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[0] = bl66;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl67 = cJ.a(gf2, t2, i2, n2.k().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl67 = !bl67;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[1] = bl67;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl68 = cJ.a(gf2, t2, i2, n2.a().i(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl68 = !bl68;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[2] = bl68;
                                                                                                                                                                                                                                                                                                                                                                                                    boolean bl69 = cJ.a(gf2, t2, i2, n2.a().j(), n4, c10, n5);
                                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        bl69 = !bl69;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    arrbl[3] = bl69;
                                                                                                                                                                                                                                                                                                                                                                                                    n6 = n3;
                                                                                                                                                                                                                                                                                                                                                                                                    n8 = 2;
                                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block120;
                                                                                                                                                                                                                                                                                                                                                                                                    if (n6 != n8) break;
                                                                                                                                                                                                                                                                                                                                                                                                    cJ.a(0, 3, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                    cJ.a(1, 2, arrbl);
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            n6 = n7;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        n8 = 13;
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block121;
                                                                                                                                                                                                                                                                                                                                                                                    if (n6 != n8) break block122;
                                                                                                                                                                                                                                                                                                                                                                                    n6 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                                                                    if (string != null) break block123;
                                                                                                                                                                                                                                                                                                                                                                                    if (n6 == 0) break block122;
                                                                                                                                                                                                                                                                                                                                                                                    n7 = 4;
                                                                                                                                                                                                                                                                                                                                                                                    if (string == null) break block124;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                n6 = n7;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            n8 = 15;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        if (string != null) break block125;
                                                                                                                                                                                                                                                                                                                                                                        if (n6 != n8) break block126;
                                                                                                                                                                                                                                                                                                                                                                        n6 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                                                        if (string != null) break block127;
                                                                                                                                                                                                                                                                                                                                                                        if (n6 == 0) break block126;
                                                                                                                                                                                                                                                                                                                                                                        n7 = 5;
                                                                                                                                                                                                                                                                                                                                                                        if (string == null) break block124;
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    n6 = n7;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                n8 = 37;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block128;
                                                                                                                                                                                                                                                                                                                                                            if (n6 != n8) break block129;
                                                                                                                                                                                                                                                                                                                                                            n6 = arrbl[2];
                                                                                                                                                                                                                                                                                                                                                            if (string != null) break block130;
                                                                                                                                                                                                                                                                                                                                                            if (n6 == 0) break block129;
                                                                                                                                                                                                                                                                                                                                                            n7 = 16;
                                                                                                                                                                                                                                                                                                                                                            if (string == null) break block124;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        n6 = n7;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    n8 = 39;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                if (string != null) break block131;
                                                                                                                                                                                                                                                                                                                                                if (n6 != n8) break block132;
                                                                                                                                                                                                                                                                                                                                                n6 = arrbl[3];
                                                                                                                                                                                                                                                                                                                                                if (string != null) break block133;
                                                                                                                                                                                                                                                                                                                                                if (n6 == 0) break block132;
                                                                                                                                                                                                                                                                                                                                                n7 = 17;
                                                                                                                                                                                                                                                                                                                                                if (string == null) break block124;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            n6 = n7;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        n8 = 14;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    if (string != null) break block134;
                                                                                                                                                                                                                                                                                                                                    if (n6 != n8) break block135;
                                                                                                                                                                                                                                                                                                                                    n6 = arrbl[0];
                                                                                                                                                                                                                                                                                                                                    if (string != null) break block136;
                                                                                                                                                                                                                                                                                                                                    if (n6 == 0) break block135;
                                                                                                                                                                                                                                                                                                                                    n6 = arrbl[1];
                                                                                                                                                                                                                                                                                                                                    if (string != null) break block136;
                                                                                                                                                                                                                                                                                                                                    if (n6 == 0) break block135;
                                                                                                                                                                                                                                                                                                                                    n7 = 7;
                                                                                                                                                                                                                                                                                                                                    if (string == null) break block124;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                n6 = n7;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            n8 = 25;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (string != null) break block137;
                                                                                                                                                                                                                                                                                                                        if (n6 != n8) break block138;
                                                                                                                                                                                                                                                                                                                        n6 = arrbl[0];
                                                                                                                                                                                                                                                                                                                        if (string != null) break block139;
                                                                                                                                                                                                                                                                                                                        if (n6 == 0) break block138;
                                                                                                                                                                                                                                                                                                                        n6 = arrbl[2];
                                                                                                                                                                                                                                                                                                                        if (string != null) break block139;
                                                                                                                                                                                                                                                                                                                        if (n6 == 0) break block138;
                                                                                                                                                                                                                                                                                                                        n7 = 6;
                                                                                                                                                                                                                                                                                                                        if (string == null) break block124;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    n6 = n7;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                n8 = 27;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            if (string != null) break block140;
                                                                                                                                                                                                                                                                                                            if (n6 != n8) break block141;
                                                                                                                                                                                                                                                                                                            n6 = arrbl[3];
                                                                                                                                                                                                                                                                                                            if (string != null) break block142;
                                                                                                                                                                                                                                                                                                            if (n6 == 0) break block141;
                                                                                                                                                                                                                                                                                                            n6 = arrbl[1];
                                                                                                                                                                                                                                                                                                            if (string != null) break block142;
                                                                                                                                                                                                                                                                                                            if (n6 == 0) break block141;
                                                                                                                                                                                                                                                                                                            n7 = 19;
                                                                                                                                                                                                                                                                                                            if (string == null) break block124;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        n6 = n7;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    n8 = 38;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                if (string != null) break block143;
                                                                                                                                                                                                                                                                                                if (n6 != n8) break block144;
                                                                                                                                                                                                                                                                                                n6 = arrbl[3];
                                                                                                                                                                                                                                                                                                if (string != null) break block145;
                                                                                                                                                                                                                                                                                                if (n6 == 0) break block144;
                                                                                                                                                                                                                                                                                                n6 = arrbl[2];
                                                                                                                                                                                                                                                                                                if (string != null) break block145;
                                                                                                                                                                                                                                                                                                if (n6 == 0) break block144;
                                                                                                                                                                                                                                                                                                n7 = 18;
                                                                                                                                                                                                                                                                                                if (string == null) break block124;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            n6 = n7;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        n8 = 14;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (string != null) break block146;
                                                                                                                                                                                                                                                                                    if (n6 != n8) break block147;
                                                                                                                                                                                                                                                                                    n6 = arrbl[0];
                                                                                                                                                                                                                                                                                    if (string != null) break block148;
                                                                                                                                                                                                                                                                                    if (n6 != 0) break block147;
                                                                                                                                                                                                                                                                                    n6 = arrbl[1];
                                                                                                                                                                                                                                                                                    if (string != null) break block148;
                                                                                                                                                                                                                                                                                    if (n6 == 0) break block147;
                                                                                                                                                                                                                                                                                    n7 = 31;
                                                                                                                                                                                                                                                                                    if (string == null) break block124;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                n6 = n7;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            n8 = 25;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (string != null) break block149;
                                                                                                                                                                                                                                                                        if (n6 != n8) break block150;
                                                                                                                                                                                                                                                                        n6 = arrbl[0];
                                                                                                                                                                                                                                                                        if (string != null) break block151;
                                                                                                                                                                                                                                                                        if (n6 == 0) break block150;
                                                                                                                                                                                                                                                                        n6 = arrbl[2];
                                                                                                                                                                                                                                                                        if (string != null) break block151;
                                                                                                                                                                                                                                                                        if (n6 != 0) break block150;
                                                                                                                                                                                                                                                                        n7 = 30;
                                                                                                                                                                                                                                                                        if (string == null) break block124;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    n6 = n7;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                n8 = 27;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (string != null) break block152;
                                                                                                                                                                                                                                                            if (n6 != n8) break block153;
                                                                                                                                                                                                                                                            n6 = arrbl[3];
                                                                                                                                                                                                                                                            if (string != null) break block154;
                                                                                                                                                                                                                                                            if (n6 != 0) break block153;
                                                                                                                                                                                                                                                            n6 = arrbl[1];
                                                                                                                                                                                                                                                            if (string != null) break block154;
                                                                                                                                                                                                                                                            if (n6 == 0) break block153;
                                                                                                                                                                                                                                                            n7 = 41;
                                                                                                                                                                                                                                                            if (string == null) break block124;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        n6 = n7;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    n8 = 38;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (string != null) break block155;
                                                                                                                                                                                                                                                if (n6 != n8) break block156;
                                                                                                                                                                                                                                                n6 = arrbl[3];
                                                                                                                                                                                                                                                if (string != null) break block157;
                                                                                                                                                                                                                                                if (n6 == 0) break block156;
                                                                                                                                                                                                                                                n6 = arrbl[2];
                                                                                                                                                                                                                                                if (string != null) break block157;
                                                                                                                                                                                                                                                if (n6 != 0) break block156;
                                                                                                                                                                                                                                                n7 = 40;
                                                                                                                                                                                                                                                if (string == null) break block124;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            n6 = n7;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        n8 = 14;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (string != null) break block158;
                                                                                                                                                                                                                                    if (n6 != n8) break block159;
                                                                                                                                                                                                                                    n6 = arrbl[0];
                                                                                                                                                                                                                                    if (string != null) break block160;
                                                                                                                                                                                                                                    if (n6 == 0) break block159;
                                                                                                                                                                                                                                    n6 = arrbl[1];
                                                                                                                                                                                                                                    if (string != null) break block160;
                                                                                                                                                                                                                                    if (n6 != 0) break block159;
                                                                                                                                                                                                                                    n7 = 29;
                                                                                                                                                                                                                                    if (string == null) break block124;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n6 = n7;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            n8 = 25;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (string != null) break block161;
                                                                                                                                                                                                                        if (n6 != n8) break block162;
                                                                                                                                                                                                                        n6 = arrbl[0];
                                                                                                                                                                                                                        if (string != null) break block163;
                                                                                                                                                                                                                        if (n6 != 0) break block162;
                                                                                                                                                                                                                        n6 = arrbl[2];
                                                                                                                                                                                                                        if (string != null) break block163;
                                                                                                                                                                                                                        if (n6 == 0) break block162;
                                                                                                                                                                                                                        n7 = 28;
                                                                                                                                                                                                                        if (string == null) break block124;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    n6 = n7;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                n8 = 27;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (string != null) break block164;
                                                                                                                                                                                                            if (n6 != n8) break block165;
                                                                                                                                                                                                            n6 = arrbl[3];
                                                                                                                                                                                                            if (string != null) break block166;
                                                                                                                                                                                                            if (n6 == 0) break block165;
                                                                                                                                                                                                            n6 = arrbl[1];
                                                                                                                                                                                                            if (string != null) break block166;
                                                                                                                                                                                                            if (n6 != 0) break block165;
                                                                                                                                                                                                            n7 = 43;
                                                                                                                                                                                                            if (string == null) break block124;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n6 = n7;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    n8 = 38;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (string != null) break block167;
                                                                                                                                                                                                if (n6 != n8) break block168;
                                                                                                                                                                                                n6 = arrbl[3];
                                                                                                                                                                                                if (string != null) break block169;
                                                                                                                                                                                                if (n6 != 0) break block168;
                                                                                                                                                                                                n6 = arrbl[2];
                                                                                                                                                                                                if (string != null) break block169;
                                                                                                                                                                                                if (n6 == 0) break block168;
                                                                                                                                                                                                n7 = 42;
                                                                                                                                                                                                if (string == null) break block124;
                                                                                                                                                                                            }
                                                                                                                                                                                            n6 = n7;
                                                                                                                                                                                        }
                                                                                                                                                                                        n8 = 26;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (string != null) break block170;
                                                                                                                                                                                    if (n6 != n8) break block171;
                                                                                                                                                                                    n6 = arrbl[0];
                                                                                                                                                                                    if (string != null) break block172;
                                                                                                                                                                                    if (n6 == 0) break block171;
                                                                                                                                                                                    n6 = arrbl[1];
                                                                                                                                                                                    if (string != null) break block172;
                                                                                                                                                                                    if (n6 == 0) break block171;
                                                                                                                                                                                    n6 = arrbl[2];
                                                                                                                                                                                    if (string != null) break block172;
                                                                                                                                                                                    if (n6 == 0) break block171;
                                                                                                                                                                                    n6 = arrbl[3];
                                                                                                                                                                                    if (string != null) break block172;
                                                                                                                                                                                    if (n6 == 0) break block171;
                                                                                                                                                                                    n7 = 46;
                                                                                                                                                                                    if (string == null) break block124;
                                                                                                                                                                                }
                                                                                                                                                                                n6 = n7;
                                                                                                                                                                            }
                                                                                                                                                                            n8 = 26;
                                                                                                                                                                        }
                                                                                                                                                                        if (string != null) break block173;
                                                                                                                                                                        if (n6 != n8) break block174;
                                                                                                                                                                        n6 = arrbl[0];
                                                                                                                                                                        if (string != null) break block175;
                                                                                                                                                                        if (n6 != 0) break block174;
                                                                                                                                                                        n6 = arrbl[1];
                                                                                                                                                                        if (string != null) break block175;
                                                                                                                                                                        if (n6 == 0) break block174;
                                                                                                                                                                        n6 = arrbl[2];
                                                                                                                                                                        if (string != null) break block175;
                                                                                                                                                                        if (n6 == 0) break block174;
                                                                                                                                                                        n6 = arrbl[3];
                                                                                                                                                                        if (string != null) break block175;
                                                                                                                                                                        if (n6 == 0) break block174;
                                                                                                                                                                        n7 = 9;
                                                                                                                                                                        if (string == null) break block124;
                                                                                                                                                                    }
                                                                                                                                                                    n6 = n7;
                                                                                                                                                                }
                                                                                                                                                                n8 = 26;
                                                                                                                                                            }
                                                                                                                                                            if (string != null) break block176;
                                                                                                                                                            if (n6 != n8) break block177;
                                                                                                                                                            n6 = arrbl[0];
                                                                                                                                                            if (string != null) break block178;
                                                                                                                                                            if (n6 == 0) break block177;
                                                                                                                                                            n6 = arrbl[1];
                                                                                                                                                            if (string != null) break block178;
                                                                                                                                                            if (n6 != 0) break block177;
                                                                                                                                                            n6 = arrbl[2];
                                                                                                                                                            if (string != null) break block178;
                                                                                                                                                            if (n6 == 0) break block177;
                                                                                                                                                            n6 = arrbl[3];
                                                                                                                                                            if (string != null) break block178;
                                                                                                                                                            if (n6 == 0) break block177;
                                                                                                                                                            n7 = 21;
                                                                                                                                                            if (string == null) break block124;
                                                                                                                                                        }
                                                                                                                                                        n6 = n7;
                                                                                                                                                    }
                                                                                                                                                    n8 = 26;
                                                                                                                                                }
                                                                                                                                                if (string != null) break block179;
                                                                                                                                                if (n6 != n8) break block180;
                                                                                                                                                n6 = arrbl[0];
                                                                                                                                                if (string != null) break block181;
                                                                                                                                                if (n6 == 0) break block180;
                                                                                                                                                n6 = arrbl[1];
                                                                                                                                                if (string != null) break block181;
                                                                                                                                                if (n6 == 0) break block180;
                                                                                                                                                n6 = arrbl[2];
                                                                                                                                                if (string != null) break block181;
                                                                                                                                                if (n6 != 0) break block180;
                                                                                                                                                n6 = arrbl[3];
                                                                                                                                                if (string != null) break block181;
                                                                                                                                                if (n6 == 0) break block180;
                                                                                                                                                n7 = 8;
                                                                                                                                                if (string == null) break block124;
                                                                                                                                            }
                                                                                                                                            n6 = n7;
                                                                                                                                        }
                                                                                                                                        n8 = 26;
                                                                                                                                    }
                                                                                                                                    if (string != null) break block182;
                                                                                                                                    if (n6 != n8) break block183;
                                                                                                                                    n6 = arrbl[0];
                                                                                                                                    if (string != null) break block184;
                                                                                                                                    if (n6 == 0) break block183;
                                                                                                                                    n6 = arrbl[1];
                                                                                                                                    if (string != null) break block184;
                                                                                                                                    if (n6 == 0) break block183;
                                                                                                                                    n6 = arrbl[2];
                                                                                                                                    if (string != null) break block184;
                                                                                                                                    if (n6 == 0) break block183;
                                                                                                                                    n6 = arrbl[3];
                                                                                                                                    if (string != null) break block184;
                                                                                                                                    if (n6 != 0) break block183;
                                                                                                                                    n7 = 20;
                                                                                                                                    if (string == null) break block124;
                                                                                                                                }
                                                                                                                                n6 = n7;
                                                                                                                            }
                                                                                                                            n8 = 26;
                                                                                                                        }
                                                                                                                        if (string != null) break block185;
                                                                                                                        if (n6 != n8) break block186;
                                                                                                                        n6 = arrbl[0];
                                                                                                                        if (string != null) break block187;
                                                                                                                        if (n6 == 0) break block186;
                                                                                                                        n6 = arrbl[1];
                                                                                                                        if (string != null) break block187;
                                                                                                                        if (n6 == 0) break block186;
                                                                                                                        n6 = arrbl[2];
                                                                                                                        if (string != null) break block187;
                                                                                                                        if (n6 != 0) break block186;
                                                                                                                        n6 = arrbl[3];
                                                                                                                        if (string != null) break block187;
                                                                                                                        if (n6 != 0) break block186;
                                                                                                                        n7 = 11;
                                                                                                                        if (string == null) break block124;
                                                                                                                    }
                                                                                                                    n6 = n7;
                                                                                                                }
                                                                                                                n8 = 26;
                                                                                                            }
                                                                                                            if (string != null) break block188;
                                                                                                            if (n6 != n8) break block189;
                                                                                                            n6 = arrbl[0];
                                                                                                            if (string != null) break block190;
                                                                                                            if (n6 != 0) break block189;
                                                                                                            n6 = arrbl[1];
                                                                                                            if (string != null) break block190;
                                                                                                            if (n6 != 0) break block189;
                                                                                                            n6 = arrbl[2];
                                                                                                            if (string != null) break block190;
                                                                                                            if (n6 == 0) break block189;
                                                                                                            n6 = arrbl[3];
                                                                                                            if (string != null) break block190;
                                                                                                            if (n6 == 0) break block189;
                                                                                                            n7 = 22;
                                                                                                            if (string == null) break block124;
                                                                                                        }
                                                                                                        n6 = n7;
                                                                                                    }
                                                                                                    n8 = 26;
                                                                                                }
                                                                                                if (string != null) break block191;
                                                                                                if (n6 != n8) break block192;
                                                                                                n6 = arrbl[0];
                                                                                                if (string != null) break block193;
                                                                                                if (n6 != 0) break block192;
                                                                                                n6 = arrbl[1];
                                                                                                if (string != null) break block193;
                                                                                                if (n6 == 0) break block192;
                                                                                                n6 = arrbl[2];
                                                                                                if (string != null) break block193;
                                                                                                if (n6 != 0) break block192;
                                                                                                n6 = arrbl[3];
                                                                                                if (string != null) break block193;
                                                                                                if (n6 == 0) break block192;
                                                                                                n7 = 23;
                                                                                                if (string == null) break block124;
                                                                                            }
                                                                                            n6 = n7;
                                                                                        }
                                                                                        n8 = 26;
                                                                                    }
                                                                                    if (string != null) break block194;
                                                                                    if (n6 != n8) break block195;
                                                                                    n6 = arrbl[0];
                                                                                    if (string != null) break block196;
                                                                                    if (n6 == 0) break block195;
                                                                                    n6 = arrbl[1];
                                                                                    if (string != null) break block196;
                                                                                    if (n6 != 0) break block195;
                                                                                    n6 = arrbl[2];
                                                                                    if (string != null) break block196;
                                                                                    if (n6 == 0) break block195;
                                                                                    n6 = arrbl[3];
                                                                                    if (string != null) break block196;
                                                                                    if (n6 != 0) break block195;
                                                                                    n7 = 10;
                                                                                    if (string == null) break block124;
                                                                                }
                                                                                n6 = n7;
                                                                            }
                                                                            n8 = 26;
                                                                        }
                                                                        if (string != null) break block197;
                                                                        if (n6 != n8) break block198;
                                                                        n6 = arrbl[0];
                                                                        if (string != null) break block199;
                                                                        if (n6 == 0) break block198;
                                                                        n6 = arrbl[1];
                                                                        if (string != null) break block199;
                                                                        if (n6 != 0) break block198;
                                                                        n6 = arrbl[2];
                                                                        if (string != null) break block199;
                                                                        if (n6 != 0) break block198;
                                                                        n6 = arrbl[3];
                                                                        if (string != null) break block199;
                                                                        if (n6 == 0) break block198;
                                                                        n7 = 34;
                                                                        if (string == null) break block124;
                                                                    }
                                                                    n6 = n7;
                                                                }
                                                                n8 = 26;
                                                            }
                                                            if (string != null) break block200;
                                                            if (n6 != n8) break block201;
                                                            n6 = arrbl[0];
                                                            if (string != null) break block202;
                                                            if (n6 != 0) break block201;
                                                            n6 = arrbl[1];
                                                            if (string != null) break block202;
                                                            if (n6 == 0) break block201;
                                                            n6 = arrbl[2];
                                                            if (string != null) break block202;
                                                            if (n6 == 0) break block201;
                                                            n6 = arrbl[3];
                                                            if (string != null) break block202;
                                                            if (n6 != 0) break block201;
                                                            n7 = 35;
                                                            if (string == null) break block124;
                                                        }
                                                        n6 = n7;
                                                    }
                                                    n8 = 26;
                                                }
                                                if (string != null) break block203;
                                                if (n6 != n8) break block204;
                                                n6 = arrbl[0];
                                                if (string != null) break block205;
                                                if (n6 == 0) break block204;
                                                n6 = arrbl[1];
                                                if (string != null) break block205;
                                                if (n6 != 0) break block204;
                                                n6 = arrbl[2];
                                                if (string != null) break block205;
                                                if (n6 != 0) break block204;
                                                n6 = arrbl[3];
                                                if (string != null) break block205;
                                                if (n6 != 0) break block204;
                                                n7 = 32;
                                                if (string == null) break block124;
                                            }
                                            n6 = n7;
                                        }
                                        n8 = 26;
                                    }
                                    if (string != null) break block206;
                                    if (n6 != n8) break block207;
                                    n6 = arrbl[0];
                                    if (string != null) break block208;
                                    if (n6 != 0) break block207;
                                    n6 = arrbl[1];
                                    if (string != null) break block208;
                                    if (n6 == 0) break block207;
                                    n6 = arrbl[2];
                                    if (string != null) break block208;
                                    if (n6 != 0) break block207;
                                    n6 = arrbl[3];
                                    if (string != null) break block208;
                                    if (n6 != 0) break block207;
                                    n7 = 33;
                                    if (string == null) break block124;
                                }
                                n6 = n7;
                            }
                            n8 = 26;
                        }
                        if (string != null) break block209;
                        if (n6 != n8) break block210;
                        n6 = arrbl[0];
                        if (string != null) break block211;
                        if (n6 != 0) break block210;
                        n6 = arrbl[1];
                        if (string != null) break block211;
                        if (n6 != 0) break block210;
                        n6 = arrbl[2];
                        if (string != null) break block211;
                        if (n6 == 0) break block210;
                        n6 = arrbl[3];
                        if (string != null) break block211;
                        if (n6 != 0) break block210;
                        n7 = 44;
                        if (string == null) break block124;
                    }
                    n6 = n7;
                }
                if (string != null) return n6;
                n8 = 26;
            }
            if (n6 == n8) {
                n6 = arrbl[0];
                if (string != null) return n6;
                if (n6 == 0) {
                    n6 = arrbl[1];
                    if (string != null) return n6;
                    if (n6 == 0) {
                        n6 = arrbl[2];
                        if (string != null) return n6;
                        if (n6 == 0) {
                            n6 = arrbl[3];
                            if (string != null) return n6;
                            if (n6 != 0) {
                                return 45;
                            }
                        }
                    }
                }
            }
        }
        n6 = n7;
        return n6;
    }

    private static void a(gf gf2, List arrayList, int n2) {
        ArrayList<gf> arrayList2;
        ArrayList<gf> arrayList3;
        String string;
        block4: {
            string = K.d();
            while (n2 >= arrayList.size()) {
                arrayList3 = arrayList;
                if (string == null) {
                    arrayList3.add(null);
                    if (string == null) continue;
                }
                break block4;
            }
            arrayList3 = (List)arrayList.get(n2);
        }
        ArrayList<gf> arrayList4 = arrayList2 = arrayList3;
        if (string == null) {
            if (arrayList4 == null) {
                arrayList2 = new ArrayList<gf>();
                arrayList.set(n2, (gf)((Object)arrayList2));
            }
            arrayList4 = arrayList2;
        }
        arrayList4.add(gf2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(gf gf2, net.minecraft.ah.t t2, i i2, n n2, i i3, int n3, c c10, int n4) {
        i i4;
        String string;
        block16: {
            int n5;
            block15: {
                int n6;
                block14: {
                    string = K.d();
                    if (i2 == i3) {
                        return true;
                    }
                    n5 = gf2.h;
                    n6 = 2;
                    if (string != null) break block14;
                    if (n5 == n6) {
                        i i5 = i3;
                        if (string == null) {
                            if (i5 == null) {
                                return false;
                            }
                            i5 = i3;
                        }
                        if (i5 == G) {
                            return false;
                        }
                        c c11 = cJ.a(t2, i2, n2, i3, n3);
                        if (c11 != c10) return false;
                        return true;
                    }
                    n5 = gf2.h;
                    if (string != null) break block15;
                    n6 = 3;
                }
                if (n5 == n6) {
                    i i6 = i3;
                    if (string == null) {
                        if (i6 == null) {
                            return false;
                        }
                        i6 = i3;
                    }
                    if (string == null) {
                        if (i6 == G) {
                            return false;
                        }
                        i6 = i3;
                    }
                    if (i6.o() != i2.o()) return false;
                    return true;
                }
                i4 = i3;
                if (string != null) break block16;
                n5 = i4 instanceof l;
            }
            if (n5 == 0) {
                return false;
            }
            i4 = i3;
        }
        l l2 = (l)i4;
        net.minecraft.W.K k2 = l2.b();
        int n7 = l2.c();
        if (k2 != i2.b()) return 0 != 0;
        int n8 = n7;
        if (string != null) return n8 != 0;
        if (n8 != n4) return 0 != 0;
        return 1 != 0;
    }

    static {
        s = 1;
        l = 4;
        A = 2;
        r = 3;
        i = 0;
        C = 5;
        f = 2;
        t = 0;
        q = -1;
        B = 1;
        c = null;
        e = null;
        u = null;
        d = null;
        F = null;
        o = false;
        G = net.minecraft.u.g.bf.d();
        h = null;
        w = new hu[]{hu.WEST, hu.EAST, hu.NORTH, hu.SOUTH};
        k = new hu[]{hu.WEST, hu.EAST, hu.SOUTH, hu.NORTH};
        a = new hu[]{hu.EAST, hu.WEST, hu.DOWN, hu.UP};
        v = new hu[]{hu.WEST, hu.EAST, hu.DOWN, hu.UP};
        x = new hu[]{hu.NORTH, hu.SOUTH, hu.DOWN, hu.UP};
        m = new hu[]{hu.SOUTH, hu.NORTH, hu.DOWN, hu.UP};
        H = new hu[]{hu.WEST, hu.EAST, hu.UP, hu.DOWN};
        E = new hu[]{hu.NORTH, hu.SOUTH, hu.UP, hu.DOWN};
        p = new hu[]{hu.NORTH_EAST, hu.NORTH_WEST, hu.SOUTH_EAST, hu.SOUTH_WEST};
        g = new hu[]{hu.SOUTH_EAST, hu.SOUTH_WEST, hu.NORTH_EAST, hu.NORTH_WEST};
        b = new hu[]{hu.DOWN_WEST, hu.DOWN_EAST, hu.UP_WEST, hu.UP_EAST};
        j = new hu[]{hu.DOWN_EAST, hu.DOWN_WEST, hu.UP_EAST, hu.UP_WEST};
        y = new hu[]{hu.DOWN_SOUTH, hu.DOWN_NORTH, hu.UP_SOUTH, hu.UP_NORTH};
        n = new hu[]{hu.DOWN_NORTH, hu.DOWN_SOUTH, hu.UP_NORTH, hu.UP_SOUTH};
        D = new hu[]{hu.UP_EAST, hu.UP_WEST, hu.DOWN_EAST, hu.DOWN_WEST};
        z = new hu[]{hu.UP_SOUTH, hu.UP_NORTH, hu.DOWN_SOUTH, hu.DOWN_NORTH};
    }

    private static P a(P p2, c c10) {
        int[] arrn = (int[])p2.d().clone();
        c c11 = p2.p();
        String string = K.d();
        for (int i2 = 0; i2 < 4; ++i2) {
            cJ.a(arrn, i2, c11, c10);
            if (string == null) continue;
        }
        P p3 = new P(arrn, p2.q(), p2.b(), c10);
        return p3;
    }

    private static List a(gf[][] arrgf) {
        ArrayList<ArrayList<gf>> arrayList = new ArrayList<ArrayList<gf>>();
        String string = K.d();
        if (arrgf != null) {
            for (int i2 = 0; i2 < arrgf.length; ++i2) {
                gf[] arrgf2 = arrgf[i2];
                ArrayList<gf> arrayList2 = null;
                if (arrgf2 != null) {
                    arrayList2 = new ArrayList<gf>(Arrays.asList(arrgf2));
                }
                arrayList.add(arrayList2);
                if (string == null) continue;
            }
        }
        return arrayList;
    }

    private static boolean c() {
        Object object;
        String string;
        block16: {
            gf[] arrgf;
            block15: {
                ArrayList<gf> arrayList = new ArrayList<gf>();
                string = K.d();
                int n2 = 0;
                while (n2 < F.length) {
                    object = F[n2];
                    if (string == null) {
                        arrgf = object;
                        if (string != null) break block15;
                        if (arrgf != null) {
                            arrayList.addAll(Arrays.asList(object));
                        }
                        ++n2;
                    }
                    if (string == null) continue;
                }
                n2 = 0;
                while (n2 < d.length) {
                    object = d[n2];
                    if (string == null) {
                        arrgf = object;
                        if (string != null) break block15;
                        if (arrgf != null) {
                            arrayList.addAll(Arrays.asList(object));
                        }
                        ++n2;
                    }
                    if (string == null) continue;
                }
                arrgf = arrayList.toArray(new gf[arrayList.size()]);
            }
            gf[] arrgf2 = arrgf;
            object = new HashSet();
            HashSet<c> hashSet = new HashSet<c>();
            for (int i2 = 0; i2 < arrgf2.length; ++i2) {
                gf gf2 = arrgf2[i2];
                if (string == null) {
                    c[] arrc = gf2.o;
                    if (string == null) {
                        if (arrc != null) {
                            object.addAll(Arrays.asList(gf2.o));
                        }
                        arrc = gf2.g;
                    }
                    if (arrc == null) continue;
                    hashSet.addAll(Arrays.asList(gf2.g));
                    if (string == null) continue;
                }
                break block16;
            }
            object.retainAll(hashSet);
        }
        boolean bl2 = object.isEmpty();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static hu[] d(int n2, int n3) {
        switch (n2) {
            case 0: {
                return p;
            }
            case 1: {
                return g;
            }
            case 2: {
                if (n3 == 1) {
                    return D;
                }
                return b;
            }
            case 3: {
                return j;
            }
            case 4: {
                return y;
            }
            case 5: {
                if (n3 == 2) {
                    return z;
                }
                return n;
            }
        }
        throw new IllegalArgumentException("Unknown side: " + n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static P[] b(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, int var5_5, P var6_6, int var7_7, e9 var8_8) {
        block100: {
            block138: {
                block141: {
                    block139: {
                        block140: {
                            block137: {
                                block133: {
                                    block134: {
                                        block135: {
                                            block136: {
                                                block129: {
                                                    block130: {
                                                        block131: {
                                                            block132: {
                                                                block125: {
                                                                    block126: {
                                                                        block127: {
                                                                            block128: {
                                                                                block124: {
                                                                                    block97: {
                                                                                        block120: {
                                                                                            block121: {
                                                                                                block123: {
                                                                                                    block122: {
                                                                                                        block116: {
                                                                                                            block117: {
                                                                                                                block119: {
                                                                                                                    block118: {
                                                                                                                        block112: {
                                                                                                                            block113: {
                                                                                                                                block115: {
                                                                                                                                    block114: {
                                                                                                                                        block109: {
                                                                                                                                            block96: {
                                                                                                                                                block111: {
                                                                                                                                                    block110: {
                                                                                                                                                        block107: {
                                                                                                                                                            block108: {
                                                                                                                                                                block105: {
                                                                                                                                                                    block106: {
                                                                                                                                                                        block103: {
                                                                                                                                                                            block104: {
                                                                                                                                                                                block101: {
                                                                                                                                                                                    block102: {
                                                                                                                                                                                        block98: {
                                                                                                                                                                                            block99: {
                                                                                                                                                                                                var9_9 = K.d();
                                                                                                                                                                                                v0 = var6_6;
                                                                                                                                                                                                if (var9_9 == null) {
                                                                                                                                                                                                    if (!v0.e()) {
                                                                                                                                                                                                        return null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v0 = var6_6;
                                                                                                                                                                                                }
                                                                                                                                                                                                var10_10 = v0.p();
                                                                                                                                                                                                var11_11 = cJ.b(var5_5, var4_4);
                                                                                                                                                                                                var12_12 = var8_8.k();
                                                                                                                                                                                                for (var13_13 = 0; var13_13 < 4; ++var13_13) {
                                                                                                                                                                                                    var12_12[var13_13] = cJ.c(var0, var1_1, var2_2, var11_11[var13_13].a(var3_3), var5_5, var10_10, var7_7);
                                                                                                                                                                                                    if (var9_9 == null) continue;
                                                                                                                                                                                                }
                                                                                                                                                                                                var13_14 = var8_8.a(var0.b);
                                                                                                                                                                                                v1 = var12_12[0];
                                                                                                                                                                                                if (var9_9 != null) break block98;
                                                                                                                                                                                                if (v1 == 0) break block99;
                                                                                                                                                                                                v1 = var12_12[1];
                                                                                                                                                                                                if (var9_9 != null) break block98;
                                                                                                                                                                                                if (v1 == 0) break block99;
                                                                                                                                                                                                v1 = var12_12[2];
                                                                                                                                                                                                if (var9_9 != null) break block98;
                                                                                                                                                                                                if (v1 == 0) break block99;
                                                                                                                                                                                                v1 = var12_12[3];
                                                                                                                                                                                                if (var9_9 != null) break block98;
                                                                                                                                                                                                if (v1 != 0) break block100;
                                                                                                                                                                                            }
                                                                                                                                                                                            v1 = var12_12[0];
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var9_9 != null) break block101;
                                                                                                                                                                                        if (v1 == 0) break block102;
                                                                                                                                                                                        v1 = var12_12[1];
                                                                                                                                                                                        if (var9_9 != null) break block101;
                                                                                                                                                                                        if (v1 != 0) {
                                                                                                                                                                                            v1 = var12_12[2];
                                                                                                                                                                                            if (var9_9 == null) {
                                                                                                                                                                                                if (v1 != 0) {
                                                                                                                                                                                                    var13_14.a(cJ.a(var0.g[5], var6_6, var0.W), var0.p);
                                                                                                                                                                                                    var14_15 = null;
                                                                                                                                                                                                    var15_20 = var14_15;
                                                                                                                                                                                                    if (var13_14.a() <= 0) return var15_20;
                                                                                                                                                                                                    var8_8.a(true);
                                                                                                                                                                                                    return var15_20;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    ** GOTO lbl46
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                ** GOTO lbl45
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        break block102;
lbl45:
                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                        break block101;
                                                                                                                                                                                    }
                                                                                                                                                                                    v1 = var12_12[0];
                                                                                                                                                                                }
                                                                                                                                                                                if (var9_9 != null) break block103;
                                                                                                                                                                                if (v1 == 0) break block104;
                                                                                                                                                                                v1 = var12_12[2];
                                                                                                                                                                                if (var9_9 != null) break block103;
                                                                                                                                                                                if (v1 != 0) {
                                                                                                                                                                                    v1 = var12_12[3];
                                                                                                                                                                                    if (var9_9 == null) {
                                                                                                                                                                                        if (v1 != 0) {
                                                                                                                                                                                            var13_14.a(cJ.a(var0.g[6], var6_6, var0.W), var0.p);
                                                                                                                                                                                            var14_16 = null;
                                                                                                                                                                                            return var14_16;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            ** GOTO lbl62
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        ** GOTO lbl61
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break block104;
lbl61:
                                                                                                                                                                                // 2 sources

                                                                                                                                                                                break block103;
                                                                                                                                                                            }
                                                                                                                                                                            v1 = var12_12[1];
                                                                                                                                                                        }
                                                                                                                                                                        if (var9_9 != null) break block105;
                                                                                                                                                                        if (v1 == 0) break block106;
                                                                                                                                                                        v1 = var12_12[2];
                                                                                                                                                                        if (var9_9 != null) break block105;
                                                                                                                                                                        if (v1 != 0) {
                                                                                                                                                                            v1 = var12_12[3];
                                                                                                                                                                            if (var9_9 == null) {
                                                                                                                                                                                if (v1 != 0) {
                                                                                                                                                                                    var13_14.a(cJ.a(var0.g[12], var6_6, var0.W), var0.p);
                                                                                                                                                                                    var14_17 = null;
                                                                                                                                                                                    return var14_17;
                                                                                                                                                                                } else {
                                                                                                                                                                                    ** GOTO lbl78
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                ** GOTO lbl77
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break block106;
lbl77:
                                                                                                                                                                        // 2 sources

                                                                                                                                                                        break block105;
                                                                                                                                                                    }
                                                                                                                                                                    v1 = var12_12[0];
                                                                                                                                                                }
                                                                                                                                                                if (var9_9 != null) break block107;
                                                                                                                                                                if (v1 == 0) break block108;
                                                                                                                                                                v1 = var12_12[1];
                                                                                                                                                                if (var9_9 != null) break block107;
                                                                                                                                                                if (v1 != 0) {
                                                                                                                                                                    v1 = var12_12[3];
                                                                                                                                                                    if (var9_9 == null) {
                                                                                                                                                                        if (v1 != 0) {
                                                                                                                                                                            var13_14.a(cJ.a(var0.g[13], var6_6, var0.W), var0.p);
                                                                                                                                                                            var14_18 = null;
                                                                                                                                                                            return var14_18;
                                                                                                                                                                        } else {
                                                                                                                                                                            ** GOTO lbl94
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        ** GOTO lbl93
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                break block108;
lbl93:
                                                                                                                                                                // 2 sources

                                                                                                                                                                break block107;
                                                                                                                                                            }
                                                                                                                                                            v1 = var5_5;
                                                                                                                                                        }
                                                                                                                                                        var15_24 = cJ.d(v1, var4_4);
                                                                                                                                                        var16_25 = var8_8.d();
                                                                                                                                                        for (var17_26 = 0; var17_26 < 4; ++var17_26) {
                                                                                                                                                            var16_25[var17_26] = cJ.c(var0, var1_1, var2_2, var15_24[var17_26].a(var3_3), var5_5, var10_10, var7_7);
                                                                                                                                                            if (var9_9 == null) {
                                                                                                                                                                if (var9_9 == null) continue;
                                                                                                                                                            }
                                                                                                                                                            break block96;
                                                                                                                                                        }
                                                                                                                                                        v2 = var12_12[1];
                                                                                                                                                        if (var9_9 != null) break block109;
                                                                                                                                                        if (!v2) break block96;
                                                                                                                                                        v2 = var12_12[2];
                                                                                                                                                        if (var9_9 != null) break block109;
                                                                                                                                                        if (!v2) break block96;
                                                                                                                                                        v3 = var13_14;
                                                                                                                                                        v4 = cJ.a(var0.g[3], var6_6, var0.W);
                                                                                                                                                        v5 = var0.p;
                                                                                                                                                        if (var9_9 != null) break block110;
                                                                                                                                                        v3.a(v4, v5);
                                                                                                                                                        if (!var16_25[3]) break block111;
                                                                                                                                                        v3 = var13_14;
                                                                                                                                                        v4 = cJ.a(var0.g[16], var6_6, var0.W);
                                                                                                                                                        v5 = var0.p;
                                                                                                                                                    }
                                                                                                                                                    v3.a(v4, v5);
                                                                                                                                                }
                                                                                                                                                var17_27 = null;
                                                                                                                                                return var17_27;
                                                                                                                                            }
                                                                                                                                            v2 = var12_12[0];
                                                                                                                                        }
                                                                                                                                        if (var9_9 != null) break block112;
                                                                                                                                        if (!v2) break block113;
                                                                                                                                        v2 = var12_12[2];
                                                                                                                                        if (var9_9 != null) break block112;
                                                                                                                                        if (!v2) break block113;
                                                                                                                                        v6 = var13_14;
                                                                                                                                        v7 = cJ.a(var0.g[4], var6_6, var0.W);
                                                                                                                                        v8 = var0.p;
                                                                                                                                        if (var9_9 != null) break block114;
                                                                                                                                        v6.a(v7, v8);
                                                                                                                                        if (!var16_25[2]) break block115;
                                                                                                                                        v6 = var13_14;
                                                                                                                                        v7 = cJ.a(var0.g[14], var6_6, var0.W);
                                                                                                                                        v8 = var0.p;
                                                                                                                                    }
                                                                                                                                    v6.a(v7, v8);
                                                                                                                                }
                                                                                                                                var17_28 = null;
                                                                                                                                return var17_28;
                                                                                                                            }
                                                                                                                            v2 = var12_12[1];
                                                                                                                        }
                                                                                                                        if (var9_9 != null) break block116;
                                                                                                                        if (!v2) break block117;
                                                                                                                        v2 = var12_12[3];
                                                                                                                        if (var9_9 != null) break block116;
                                                                                                                        if (!v2) break block117;
                                                                                                                        v9 = var13_14;
                                                                                                                        v10 = cJ.a(var0.g[10], var6_6, var0.W);
                                                                                                                        v11 = var0.p;
                                                                                                                        if (var9_9 != null) break block118;
                                                                                                                        v9.a(v10, v11);
                                                                                                                        if (!var16_25[1]) break block119;
                                                                                                                        v9 = var13_14;
                                                                                                                        v10 = cJ.a(var0.g[2], var6_6, var0.W);
                                                                                                                        v11 = var0.p;
                                                                                                                    }
                                                                                                                    v9.a(v10, v11);
                                                                                                                }
                                                                                                                var17_29 = null;
                                                                                                                return var17_29;
                                                                                                            }
                                                                                                            v12 = var12_12;
                                                                                                            if (var9_9 != null) break block120;
                                                                                                            v2 = v12[0];
                                                                                                        }
                                                                                                        if (!v2) break block121;
                                                                                                        v12 = var12_12;
                                                                                                        if (var9_9 != null) break block120;
                                                                                                        if (!v12[3]) break block121;
                                                                                                        v13 = var13_14;
                                                                                                        v14 = cJ.a(var0.g[11], var6_6, var0.W);
                                                                                                        v15 = var0.p;
                                                                                                        if (var9_9 != null) break block122;
                                                                                                        v13.a(v14, v15);
                                                                                                        if (!var16_25[0]) break block123;
                                                                                                        v13 = var13_14;
                                                                                                        v14 = cJ.a(var0.g[0], var6_6, var0.W);
                                                                                                        v15 = var0.p;
                                                                                                    }
                                                                                                    v13.a(v14, v15);
                                                                                                }
                                                                                                var17_30 = null;
                                                                                                return var17_30;
                                                                                            }
                                                                                            v12 = var8_8.j();
                                                                                        }
                                                                                        var17_31 = v12;
                                                                                        for (var18_36 = 0; var18_36 < 4; ++var18_36) {
                                                                                            var17_31[var18_36] = cJ.b(var0, var1_1, var2_2, var11_11[var18_36].a(var3_3), var5_5, var10_10, var7_7);
                                                                                            if (var9_9 == null) {
                                                                                                if (var9_9 == null) continue;
                                                                                            }
                                                                                            break block97;
                                                                                        }
                                                                                        v16 = var12_12[0];
                                                                                        if (var9_9 != null) break block124;
                                                                                        if (v16) {
                                                                                            var13_14.a(cJ.a(var0.g[9], var6_6, var0.W), var0.p);
                                                                                        }
                                                                                    }
                                                                                    v16 = var12_12[1];
                                                                                }
                                                                                if (var9_9 == null) {
                                                                                    if (v16) {
                                                                                        var13_14.a(cJ.a(var0.g[7], var6_6, var0.W), var0.p);
                                                                                    }
                                                                                    v16 = var12_12[2];
                                                                                }
                                                                                if (var9_9 == null) {
                                                                                    if (v16) {
                                                                                        var13_14.a(cJ.a(var0.g[1], var6_6, var0.W), var0.p);
                                                                                    }
                                                                                    v16 = var12_12[3];
                                                                                }
                                                                                if (var9_9 == null) {
                                                                                    if (v16) {
                                                                                        var13_14.a(cJ.a(var0.g[15], var6_6, var0.W), var0.p);
                                                                                    }
                                                                                    v16 = var16_25[0];
                                                                                }
                                                                                if (var9_9 != null) break block125;
                                                                                if (!v16) break block126;
                                                                                v16 = var17_31[1];
                                                                                if (var9_9 != null) break block127;
                                                                                if (v16) break block128;
                                                                                v16 = var17_31[2];
                                                                                if (var9_9 != null) break block125;
                                                                                if (!v16) break block126;
                                                                            }
                                                                            v16 = var12_12[1];
                                                                        }
                                                                        if (var9_9 != null) break block125;
                                                                        if (v16) break block126;
                                                                        v16 = var12_12[2];
                                                                        if (var9_9 != null) break block125;
                                                                        if (!v16) {
                                                                            var13_14.a(cJ.a(var0.g[0], var6_6, var0.W), var0.p);
                                                                        }
                                                                    }
                                                                    v16 = var16_25[1];
                                                                }
                                                                if (var9_9 != null) break block129;
                                                                if (!v16) break block130;
                                                                v16 = var17_31[0];
                                                                if (var9_9 != null) break block131;
                                                                if (v16) break block132;
                                                                v16 = var17_31[2];
                                                                if (var9_9 != null) break block129;
                                                                if (!v16) break block130;
                                                            }
                                                            v16 = var12_12[0];
                                                        }
                                                        if (var9_9 != null) break block129;
                                                        if (v16) break block130;
                                                        v16 = var12_12[2];
                                                        if (var9_9 != null) break block129;
                                                        if (!v16) {
                                                            var13_14.a(cJ.a(var0.g[2], var6_6, var0.W), var0.p);
                                                        }
                                                    }
                                                    v16 = var16_25[2];
                                                }
                                                if (var9_9 != null) break block133;
                                                if (!v16) break block134;
                                                v16 = var17_31[1];
                                                if (var9_9 != null) break block135;
                                                if (v16) break block136;
                                                v16 = var17_31[3];
                                                if (var9_9 != null) break block133;
                                                if (!v16) break block134;
                                            }
                                            v16 = var12_12[1];
                                        }
                                        if (var9_9 != null) break block133;
                                        if (v16) break block134;
                                        v16 = var12_12[3];
                                        if (var9_9 != null) break block133;
                                        if (!v16) {
                                            var13_14.a(cJ.a(var0.g[14], var6_6, var0.W), var0.p);
                                        }
                                    }
                                    v16 = var16_25[3];
                                }
                                if (var9_9 != null) break block137;
                                if (!v16) break block138;
                                v16 = var17_31[0];
                            }
                            if (var9_9 != null) break block139;
                            if (v16) break block140;
                            v16 = var17_31[3];
                            if (var9_9 != null) break block139;
                            if (!v16) break block138;
                        }
                        v16 = var12_12[0];
                    }
                    if (var9_9 != null) break block141;
                    if (v16) break block138;
                    v16 = var12_12[3];
                }
                if (!v16) {
                    var13_14.a(cJ.a(var0.g[16], var6_6, var0.W), var0.p);
                }
            }
            var18_37 = null;
            return var18_37;
        }
        var13_14.a(cJ.a(var0.g[8], var6_6, var0.W), var0.p);
        var14_19 = null;
        if (var9_9 != null) return var14_19;
        if (var13_14.a() <= 0) return var14_19;
        var8_8.a(true);
        return var14_19;
    }

    private static void a(int n2, int n3, boolean[] arrbl) {
        boolean bl2 = arrbl[n2];
        arrbl[n2] = arrbl[n3];
        arrbl[n3] = bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static c d(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, int var5_5, c var6_6, int var7_7) {
        block8: {
            block9: {
                var9_8 = var0.g;
                var8_9 = K.d();
                v0 = var10_10 = cJ.a(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
                if (var8_9 != null) break block8;
                if (v0 == null) break block9;
                v0 = var10_10;
                if (var8_9 != null) break block8;
                if (v0 != var6_6) {
                    v0 = var10_10;
                    if (var8_9 == null) {
                        if (v0 != var9_8[3]) {
                            return var10_10;
                        } else {
                            ** GOTO lbl15
                        }
                    } else {
                        ** GOTO lbl14
                    }
                }
                break block9;
lbl14:
                // 2 sources

                break block8;
            }
            v0 = cJ.b(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
        }
        v1 = var11_11 = v0;
        v2 = var9_8[0];
        if (var8_9 == null) {
            if (v1 == v2) {
                return var9_8[4];
            }
            v1 = var11_11;
            v2 = var9_8[1];
        }
        if (var8_9 == null) {
            if (v1 == v2) {
                return var9_8[5];
            }
            v1 = var11_11;
            if (var8_9 != null) return v1;
            v2 = var9_8[2];
        }
        if (v1 == v2) {
            v1 = var9_8[6];
            return v1;
        }
        v1 = var11_11;
        return v1;
    }

    private static P[] a(net.minecraft.ah.t t2, i i2, n n2, aA aA2, P p2, e9 e92) {
        P[] arrp;
        block14: {
            int n3;
            List<P> list;
            String string;
            P[] arrp2;
            block12: {
                int n4;
                block17: {
                    P[] arrp3;
                    block18: {
                        block16: {
                            int n5;
                            block15: {
                                arrp2 = cJ.a(t2, i2, n2, aA2, p2, true, 0, e92);
                                string = K.d();
                                n5 = o;
                                if (string != null) break block15;
                                if (n5 == 0) {
                                    return arrp2;
                                }
                                arrp3 = arrp2;
                                if (string != null) break block16;
                                n5 = arrp3.length;
                            }
                            if (n5 != 1) break block17;
                            arrp3 = arrp2;
                        }
                        if (string != null) break block18;
                        if (arrp3[0] != p2) break block17;
                        arrp3 = arrp2;
                    }
                    return arrp3;
                }
                list = e92.a(arrp2);
                n3 = 0;
                block0: while (true) {
                    int n6 = n3;
                    int n7 = list.size();
                    block1: while (n6 < n7) {
                        block13: {
                            P[] arrp4;
                            P p3;
                            P p4 = p3 = list.get(n3);
                            n4 = 0;
                            if (string != null) break block12;
                            for (int i3 = v918566; i3 < 3; ++i3) {
                                P[] arrp5;
                                arrp4 = arrp5 = cJ.a(t2, i2, n2, aA2, p4, false, i3 + 1, e92);
                                if (string == null) {
                                    n6 = arrp4.length;
                                    n7 = 1;
                                    if (string != null) continue block1;
                                    if (n6 != n7) break;
                                    P p5 = arrp5[0];
                                    if (string == null) {
                                        if (p5 == p4 && string == null) break;
                                        p5 = arrp5[0];
                                    }
                                    p4 = p5;
                                    if (string == null) continue;
                                }
                                break block13;
                            }
                            arrp4 = list.set(n3, p4);
                        }
                        ++n3;
                        if (string == null) continue block0;
                    }
                    break;
                }
                n4 = n3 = 0;
            }
            while (n3 < arrp2.length) {
                arrp = arrp2;
                if (string == null) {
                    arrp[n3] = list.get(n3);
                    ++n3;
                    if (string == null) continue;
                }
                break block14;
            }
            arrp = arrp2;
        }
        return arrp;
    }

    private static int a(int n2, int n3) {
        int n4 = (n3 & 0xC) >> 2;
        String string = K.d();
        int n5 = n4;
        if (string == null) {
            switch (n5) {
                case 1: {
                    return 2;
                }
                case 2: {
                    return 1;
                }
            }
            n5 = 0;
        }
        return n5;
    }

    private static int e(int n2, int n3) {
        String string = K.d();
        int n4 = n3;
        if (string == null) {
            switch (n4) {
                case 3: {
                    return 2;
                }
                case 4: {
                    return 1;
                }
            }
            n4 = 0;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static boolean a(net.minecraft.ah.t var0, i var1_1, n var2_2, P var3_3, e9 var4_4) {
        block25: {
            block24: {
                block23: {
                    block22: {
                        var6_5 = var1_1.b();
                        var5_6 = K.d();
                        v0 = var6_5 instanceof bN;
                        if (var5_6 != null) return v0;
                        if (!v0) {
                            return false;
                        }
                        v1 = var7_7 = var3_3.b();
                        v2 = aA.UP;
                        if (var5_6 != null) break block22;
                        if (v1 == v2) break block23;
                        v1 = var7_7;
                        v2 = aA.DOWN;
                    }
                    if (v1 != v2) {
                        return false;
                    }
                }
                v3 = var3_3.i();
                if (var5_6 != null) return v3;
                if (!v3) {
                    return false;
                }
                var8_8 = var2_2.a(var3_3.b());
                var9_9 = var0.d(var8_8);
                v4 = var9_9.b();
                if (var5_6 == null) {
                    if (v4 != var6_5) {
                        return false;
                    }
                    v4 = var6_5;
                }
                if (v4 == net.minecraft.u.g.cv) {
                    v5 = var9_9;
                    if (var5_6 == null) {
                        if (v5.b(bg.F) != var1_1.b(bg.F)) {
                            return false;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v5 = var9_9.c(var0, var8_8);
                }
                var9_9 = v5;
                var10_10 = var3_3.m();
                cfr_temp_0 = var10_10 - 0.4;
                v6 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                if (var5_6 != null) break block24;
                if (v6 < 0) {
                    return var9_9.b(bN.D);
                }
                v7 = var10_10;
                if (var5_6 != null) break block25;
                cfr_temp_1 = v7 - 0.6;
                v6 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
            }
            if (v6 > 0) {
                return var9_9.b(bN.E);
            }
            v7 = var3_3.g();
        }
        var12_11 = v7;
        cfr_temp_2 = var12_11 - 0.4;
        v8 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
        if (var5_6 == null) {
            if (v8 < 0) {
                return var9_9.b(bN.z);
            }
            cfr_temp_3 = var12_11 - 0.6;
            v8 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
        }
        if (var5_6 != null) return (boolean)v8;
        if (v8 <= 0) {
            return true;
        }
        v8 = (double)var9_9.b(bN.A).booleanValue();
        return (boolean)v8;
    }

    private static int c(int n2, int n3) {
        String string = K.d();
        int n4 = n3;
        if (string == null) {
            switch (n4) {
                case 0: {
                    return n2;
                }
                case 1: {
                    int n5 = n2;
                    if (string == null) {
                        switch (n5) {
                            case 0: {
                                return 2;
                            }
                            case 1: {
                                return 3;
                            }
                            case 2: {
                                return 1;
                            }
                            case 3: {
                                return 0;
                            }
                        }
                        n5 = n2;
                    }
                    return n5;
                }
                case 2: {
                    int n6 = n2;
                    if (string == null) {
                        switch (n6) {
                            case 0: {
                                return 4;
                            }
                            case 1: {
                                return 5;
                            }
                            default: {
                                return n2;
                            }
                            case 4: {
                                return 1;
                            }
                            case 5: 
                        }
                        n6 = 0;
                    }
                    return n6;
                }
            }
            n4 = n2;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static c e(gf var0, net.minecraft.ah.t var1_1, i var2_2, n var3_3, int var4_4, int var5_5, c var6_6, int var7_7) {
        block16: {
            var9_8 = 0;
            var8_9 = K.d();
            v0 = var4_4;
            if (var8_9 != null) break block16;
            switch (v0) {
                case 0: {
                    v1 = var5_5;
                    if (var8_9 == null) {
                        if (v1 == 1) return null;
                        v1 = var5_5;
                    }
                    if (var8_9 == null) {
                        if (v1 == 0) {
                            return null;
                        }
                        v1 = var9_8 = (int)(cJ.a(var0, var1_1, var2_2, var3_3.a(), var5_5, var6_6, var7_7) ? 1 : 0);
                    }
                    if (var8_9 == null) break;
                }
                case 1: {
                    v2 = var5_5;
                    v3 = 3;
                    if (var8_9 != null) ** GOTO lbl24
                    if (v2 == v3) return null;
                    v2 = var5_5;
                    if (var8_9 != null) ** GOTO lbl27
                    v3 = 2;
lbl24:
                    // 2 sources

                    if (v2 == v3) {
                        return null;
                    }
                    v2 = var9_8 = (int)(cJ.a(var0, var1_1, var2_2, var3_3.j(), var5_5, var6_6, var7_7) ? 1 : 0);
lbl27:
                    // 2 sources

                    if (var8_9 == null) break;
                }
                case 2: {
                    v4 = var5_5;
                    v5 = 5;
                    if (var8_9 != null) ** GOTO lbl36
                    if (v4 == v5) return null;
                    v4 = var5_5;
                    if (var8_9 != null) ** GOTO lbl39
                    v5 = 4;
lbl36:
                    // 2 sources

                    if (v4 == v5) {
                        return null;
                    }
                    v4 = cJ.a(var0, var1_1, var2_2, var3_3.m(), var5_5, var6_6, var7_7) ? 1 : 0;
lbl39:
                    // 2 sources

                    var9_8 = v4;
                    break;
                }
            }
            v0 = var9_8;
        }
        if (v0 == 0) return null;
        return var0.g[0];
    }

    protected static P[] a(c c10, P p2, e9 e92) {
        String string = K.d();
        c c11 = c10;
        if (string == null) {
            if (c11 == null) {
                return null;
            }
            c11 = c10;
        }
        P p3 = cJ.a(c11, p2);
        P[] arrp = e92.b(p3);
        return arrp;
    }

    private static boolean a(gf gf2, net.minecraft.ah.t t2, i i2, n n2, int n3, c c10, int n4) {
        i i3 = t2.d(n2);
        return cJ.a(gf2, t2, i2, n2, i3, n3, c10, n4);
    }

    public static synchronized P[] b(net.minecraft.ah.t t2, i i2, n n2, P p2, e9 e92) {
        block5: {
            block4: {
                c c10 = p2.p();
                String string = K.d();
                if (c10 == null) {
                    return e92.b(p2);
                }
                net.minecraft.W.K k2 = i2.b();
                if (string != null) break block4;
                if (!cJ.a(t2, i2, n2, p2, e92)) break block5;
                p2 = cJ.a(h, p2);
            }
            return e92.b(p2);
        }
        aA aA2 = p2.b();
        P[] arrp = cJ.a(t2, i2, n2, aA2, p2, e92);
        return arrp;
    }

    protected static Map[][] a() {
        return u;
    }

    private static P a(c c10, P p2, int n2) {
        block9: {
            int n3;
            int n4;
            String string;
            block8: {
                string = K.d();
                if (e == null) {
                    return p2;
                }
                n3 = n4 = c10.h();
                if (string != null) break block8;
                if (n3 < 0) break block9;
                n3 = n4;
            }
            if (n3 < e.length) {
                P p3;
                EnumMap<aA, P> enumMap = e[n4];
                if (enumMap == null) {
                    cJ.e[n4] = enumMap = new EnumMap<aA, P>(aA.class);
                }
                aA aA2 = p2.b();
                P p4 = p3 = (P)enumMap.get(aA2);
                if (string == null) {
                    if (p4 == null) {
                        p3 = fM.a(aA2, c10, n2);
                        enumMap.put(aA2, p3);
                    }
                    p4 = p3;
                }
                return p4;
            }
        }
        return p2;
    }
}

