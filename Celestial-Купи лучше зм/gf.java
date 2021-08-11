/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import net.minecraft.A.h;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ar.aC;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.k.m;
import net.minecraft.u.g;

public class gf {
    public static final /* synthetic */ int x;
    public static final /* synthetic */ int y;
    public /* synthetic */ i p;
    public static final /* synthetic */ int D;
    public static final /* synthetic */ int E;
    public static final /* synthetic */ int N;
    public /* synthetic */ c[] o;
    public /* synthetic */ int[] X;
    public /* synthetic */ String a;
    public static final /* synthetic */ int z;
    public /* synthetic */ int V;
    public static final /* synthetic */ int L;
    public /* synthetic */ R[] O;
    public /* synthetic */ R[] t;
    public /* synthetic */ int T;
    public static final /* synthetic */ int Q;
    public static final /* synthetic */ int e;
    public /* synthetic */ int U;
    public static final /* synthetic */ int ag;
    public static final /* synthetic */ int C;
    public static final /* synthetic */ int c;
    public /* synthetic */ int F;
    public /* synthetic */ String[] J;
    public /* synthetic */ int j;
    public static final /* synthetic */ int ae;
    public static final /* synthetic */ int H;
    public /* synthetic */ int n;
    public /* synthetic */ int[] w;
    public static final /* synthetic */ int Z;
    public static final /* synthetic */ int u;
    public /* synthetic */ int[] ab;
    public static final /* synthetic */ int R;
    public static final /* synthetic */ int l;
    public static final /* synthetic */ int m;
    public /* synthetic */ int h;
    public /* synthetic */ int W;
    public static final /* synthetic */ int ac;
    public static final /* synthetic */ int B;
    public static final /* synthetic */ int K;
    public static final /* synthetic */ int Y;
    public /* synthetic */ h[] d;
    public static final /* synthetic */ int s;
    public /* synthetic */ String[] f;
    public static final /* synthetic */ int S;
    public /* synthetic */ int af;
    public /* synthetic */ boolean r;
    public static final /* synthetic */ int M;
    public /* synthetic */ String I;
    public /* synthetic */ int v;
    public static final /* synthetic */ int ad;
    public /* synthetic */ c[] k;
    public static final /* synthetic */ int P;
    public /* synthetic */ String[] i;
    public static final /* synthetic */ int aa;
    public /* synthetic */ aC b;
    public /* synthetic */ c[] g;
    public static final /* synthetic */ int q;
    public /* synthetic */ int[] G;
    public /* synthetic */ int A;

    private int a(int[] arrn, int n2) {
        int n3;
        block5: {
            String string = K.d();
            if (arrn == null) {
                return n2;
            }
            int n4 = 0;
            while (n4 < arrn.length) {
                int n5 = arrn[n4];
                if (string == null) {
                    n3 = n5;
                    if (string != null) break block5;
                    if (n3 > n2) {
                        n2 = n5;
                    }
                    ++n4;
                }
                if (string == null) continue;
            }
            n3 = n2;
        }
        return n3;
    }

    private boolean r(String string) {
        block12: {
            aC aC2;
            block11: {
                gf gf2;
                String string2;
                block10: {
                    String[] arrstring;
                    block9: {
                        string2 = K.d();
                        arrstring = this.J;
                        if (string2 != null) break block9;
                        if (arrstring == null) {
                            this.J = this.c("0-16");
                        }
                        gf2 = this;
                        if (string2 != null) break block10;
                        arrstring = gf2.J;
                    }
                    if (arrstring.length < 17) {
                        fU.h("Invalid tiles, must be at least 17: " + string);
                        return false;
                    }
                    gf2 = this;
                }
                aC2 = gf2.b;
                if (string2 != null) break block11;
                if (aC2 == null) break block12;
                aC2 = this.b;
            }
            if (aC2 != aC.SOLID) {
                return true;
            }
        }
        fU.h("Invalid overlay layer: " + (Object)((Object)this.b));
        return false;
    }

    private boolean a(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                this.J = this.c("0-4");
            }
            arrstring = this.J;
        }
        int n2 = arrstring.length;
        if (string2 == null) {
            if (n2 < 5) {
                fU.h("Invalid tiles, must be at least 5: " + string);
                return false;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public int c() {
        int n2 = -1;
        String string = K.d();
        int n3 = this.a(this.G, n2);
        if (string == null) {
            n2 = n3;
            if (this.O != null) {
                for (int i2 = 0; i2 < this.O.length; ++i2) {
                    R r2 = this.O[i2];
                    n3 = this.a(r2.b(), n2);
                    if (string == null) {
                        n2 = n3;
                        if (string == null) continue;
                    }
                    break;
                }
            } else {
                n3 = n2;
            }
        }
        return n3;
    }

    private boolean t(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                fU.h("No tiles defined for vertical+horizontal: " + string);
                return false;
            }
            arrstring = this.J;
        }
        int n2 = arrstring.length;
        if (string2 == null) {
            if (n2 != 7) {
                fU.h("Invalid tiles, must be exactly 7: " + string);
                return false;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private boolean k(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                fU.h("No tiles defined for horizontal+vertical: " + string);
                return false;
            }
            arrstring = this.J;
        }
        int n2 = arrstring.length;
        if (string2 == null) {
            if (n2 != 7) {
                fU.h("Invalid tiles, must be exactly 7: " + string);
                return false;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public boolean a(int n2, int n3) {
        String string = K.d();
        boolean bl2 = gc.a(n2, n3, this.O);
        if (string == null) {
            if (!bl2) {
                return false;
            }
            bl2 = gc.a(n3, this.G);
        }
        return bl2;
    }

    private boolean v(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                fU.h("No tiles defined for vertical: " + string);
                return false;
            }
            arrstring = this.J;
        }
        int n2 = arrstring.length;
        if (string2 == null) {
            if (n2 != 4) {
                fU.h("Invalid tiles, must be exactly 4: " + string);
                return false;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private static String s(String string) {
        int n2 = string.lastIndexOf(47);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    private R[] b() {
        R[] arrr;
        block4: {
            int[] arrn = this.a();
            String string = K.d();
            int[] arrn2 = arrn;
            if (string == null) {
                if (arrn2 == null) {
                    return null;
                }
                arrn2 = arrn;
            }
            R[] arrr2 = new R[arrn2.length];
            for (int i2 = 0; i2 < arrr2.length; ++i2) {
                arrr = arrr2;
                if (string == null) {
                    arrr[i2] = new R(arrn[i2]);
                    if (string == null) continue;
                }
                break block4;
            }
            arrr = arrr2;
        }
        return arrr;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean h(String string) {
        String string2 = K.d();
        gf gf2 = this;
        if (string2 == null) {
            if (gf2.J == null) {
                fU.h("Tiles not defined: " + string);
                return false;
            }
            gf2 = this;
        }
        int n2 = gf2.U;
        if (string2 != null) return n2 != 0;
        if (n2 > 0) {
            n2 = this.U;
            if (string2 != null) return n2 != 0;
            if (n2 <= 16) {
                int n3 = this.v;
                if (string2 != null) return n3 != 0;
                if (n3 > 0) {
                    n3 = this.v;
                    if (string2 != null) return n3 != 0;
                    if (n3 <= 16) {
                        int n4 = this.J.length;
                        if (string2 != null) return n4 != 0;
                        if (n4 == this.U * this.v) return 1 != 0;
                        fU.h("Number of tiles does not equal width x height: " + string);
                        return false;
                    }
                }
                fU.h("Invalid height: " + string);
                return 0 != 0;
            }
        }
        fU.h("Invalid width: " + string);
        return 0 != 0;
    }

    private boolean j(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                this.J = this.c("66");
            }
            arrstring = this.J;
        }
        boolean bl2 = arrstring.length;
        if (string2 == null) {
            if (!bl2) {
                fU.h("Invalid tiles, must be exactly 1: " + string);
                return false;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static c o(String string) {
        c c10;
        j j2 = net.minecraft.client.Q.P().an();
        String string2 = K.d();
        c c11 = c10 = j2.d(string);
        if (string2 == null) {
            if (c11 != null) {
                return c10;
            }
            c11 = c10 = j2.d("blocks/" + string);
        }
        return c11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean e(String var1_1) {
        block42: {
            block43: {
                block49: {
                    block48: {
                        block47: {
                            block46: {
                                block44: {
                                    block45: {
                                        var2_2 = K.d();
                                        v0 = this.I;
                                        if (var2_2 != null) break block42;
                                        if (v0 == null) break block43;
                                        v1 = this.I.length();
                                        if (var2_2 != null) return (boolean)v1;
                                        if (v1 <= 0) break block43;
                                        v2 = this;
                                        if (var2_2 == null) {
                                            if (v2.a == null) {
                                                fU.h("No base path found: " + var1_1);
                                                return false;
                                            }
                                            v2 = this;
                                        }
                                        if (var2_2 == null) {
                                            if (v2.O == null) {
                                                this.O = this.b();
                                            }
                                            v2 = this;
                                        }
                                        if (var2_2 != null) break block44;
                                        if (v2.i != null) break block45;
                                        v3 = this.O;
                                        if (var2_2 != null) break block46;
                                        if (v3 == null) {
                                            this.i = this.e();
                                        }
                                    }
                                    v2 = this;
                                }
                                if (var2_2 != null) break block47;
                                v3 = v2.O;
                            }
                            if (v3 == null) {
                                v2 = this;
                                if (var2_2 == null) {
                                    if (v2.i == null) {
                                        fU.h("No matchBlocks or matchTiles specified: " + var1_1);
                                        return false;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v2 = this;
                            }
                        }
                        if (var2_2 == null) {
                            if (v2.V == 0) {
                                fU.h("No method: " + var1_1);
                                return false;
                            }
                            v2 = this;
                        }
                        v4 = v2.J;
                        if (var2_2 != null) break block48;
                        if (v4 == null) break block49;
                        v4 = this.J;
                    }
                    v5 = v4.length;
                    if (var2_2 != null) return v5;
                    if (v5 > false) {
                        v6 = this.h;
                        if (var2_2 == null) {
                            if (!v6) {
                                this.h = this.d();
                            }
                            v6 = this.h;
                        }
                        if (var2_2 == null) {
                            if (v6 == BADBOOL 128) {
                                fU.h("Invalid connect in: " + var1_1);
                                return false;
                            }
                            v6 = this.T;
                        }
                        if (var2_2 == null) {
                            if (v6 > false) {
                                fU.h("Render pass not supported: " + this.T);
                                return false;
                            }
                            v6 = this.af & 128;
                        }
                        if (var2_2 == null) {
                            if (v6) {
                                fU.h("Invalid faces in: " + var1_1);
                                return false;
                            }
                            v6 = this.n & 128;
                        }
                        if (var2_2 == null) {
                            if (v6) {
                                fU.h("Invalid symmetry in: " + var1_1);
                                return false;
                            }
                            v6 = this.V;
                        }
                        if (var2_2 != null) return v6;
                        switch (v6) {
                            case 1: {
                                return this.q(var1_1);
                            }
                            case 2: {
                                return this.d(var1_1);
                            }
                            case 3: {
                                return this.j(var1_1);
                            }
                            case 4: {
                                return this.n(var1_1);
                            }
                            case 5: {
                                return this.h(var1_1);
                            }
                            case 6: {
                                return this.v(var1_1);
                            }
                            case 7: {
                                return this.b(var1_1);
                            }
                            case 8: {
                                return this.k(var1_1);
                            }
                            case 9: {
                                return this.t(var1_1);
                            }
                            case 10: {
                                return this.a(var1_1);
                            }
                            case 11: {
                                return this.r(var1_1);
                            }
                        }
                        fU.h("Unknown method: " + var1_1);
                        return false;
                    }
                }
                fU.h("No tiles specified: " + var1_1);
                return false;
            }
            v0 = "No name found: " + var1_1;
        }
        fU.h(v0);
        return (boolean)0;
    }

    private static int m(String string) {
        int n2;
        block4: {
            String string2 = K.d();
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return 63;
                }
                string3 = string;
            }
            String[] arrstring = fU.c(string3, " ,");
            int n3 = 0;
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string4 = arrstring[i2];
                int n4 = gf.i(string4);
                n2 = n3 | n4;
                if (string2 == null) {
                    n3 = n2;
                    if (string2 == null) continue;
                }
                break block4;
            }
            n2 = n3;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int i(String string) {
        string = string.toLowerCase();
        String string2 = K.d();
        int n2 = string.equals("bottom");
        if (string2 != null) return n2;
        if (n2 != 0) return 1;
        n2 = string.equals("down") ? 1 : 0;
        if (string2 != null) return n2;
        if (n2 != 0) return 1;
        int n3 = string.equals("top");
        if (string2 != null) return n3;
        if (n3 != 0) return 2;
        n3 = string.equals("up") ? 1 : 0;
        if (string2 != null) return n3;
        if (n3 != 0) return 2;
        int n4 = string.equals("north");
        if (string2 == null) {
            if (n4 != 0) {
                return 4;
            }
            n4 = string.equals("south");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 8;
            }
            n4 = string.equals("east");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 32;
            }
            n4 = string.equals("west");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 16;
            }
            n4 = string.equals("sides");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 60;
            }
            n4 = string.equals("all") ? 1 : 0;
        }
        if (string2 != null) return n4;
        if (n4 != 0) {
            return 63;
        }
        fU.h("Unknown face: " + string);
        return 128;
    }

    private boolean b(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                fU.h("Tiles not defined: " + string);
                return false;
            }
            arrstring = this.J;
        }
        boolean bl2 = arrstring.length;
        if (string2 == null) {
            if (!bl2) {
                fU.h("Number of tiles should be 1 for method: fixed.");
                return false;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static int u(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 0;
            }
            string3 = string;
        }
        int n2 = string3.equals("block");
        if (string2 == null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.equals("tile");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 2;
            }
            n2 = string.equals("material") ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 3;
            }
            fU.h("Unknown connect: " + string);
            n2 = 128;
        }
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        return "CTM name: " + this.I + ", basePath: " + this.a + ", matchBlocks: " + fU.a(this.O) + ", matchTiles: " + fU.a(this.i);
    }

    private String[] e() {
        String[] arrstring;
        c c10 = gf.o(this.I);
        if (c10 == null) {
            arrstring = null;
        } else {
            String[] arrstring2 = new String[1];
            arrstring = arrstring2;
            arrstring2[0] = this.I;
        }
        return arrstring;
    }

    private int d() {
        String string = K.d();
        gf gf2 = this;
        if (string == null) {
            if (gf2.O != null) {
                return 1;
            }
            gf2 = this;
        }
        return gf2.i != null ? 2 : 128;
    }

    private boolean n(String string) {
        int n2;
        block18: {
            block16: {
                block17: {
                    int n3;
                    block23: {
                        block20: {
                            int n4;
                            String string2;
                            block15: {
                                int n5;
                                int n6;
                                block22: {
                                    block14: {
                                        int[] arrn;
                                        int n7;
                                        block21: {
                                            int[] arrn2;
                                            block19: {
                                                string2 = K.d();
                                                if (string2 != null) break block16;
                                                if (this.J == null) break block17;
                                                n2 = this.J.length;
                                                if (string2 != null) break block18;
                                                if (n2 <= 0) break block17;
                                                arrn2 = this.w;
                                                if (string2 != null) break block19;
                                                if (arrn2 == null) break block20;
                                                arrn2 = this.w;
                                            }
                                            n6 = arrn2.length;
                                            n7 = this.J.length;
                                            if (string2 != null) break block21;
                                            if (n6 > n7) {
                                                fU.h("More weights defined than tiles, trimming weights: " + string);
                                                arrn = new int[this.J.length];
                                                System.arraycopy(this.w, 0, arrn, 0, arrn.length);
                                                this.w = arrn;
                                            }
                                            n6 = this.w.length;
                                            if (string2 != null) break block22;
                                            n7 = this.J.length;
                                        }
                                        if (n6 < n7) {
                                            fU.h("Less weights defined than tiles, expanding weights: " + string);
                                            arrn = new int[this.J.length];
                                            System.arraycopy(this.w, 0, arrn, 0, this.w.length);
                                            n5 = c5.b(this.w);
                                            for (int i2 = this.w.length; i2 < arrn.length; ++i2) {
                                                arrn[i2] = n5;
                                                if (string2 == null) {
                                                    if (string2 == null) continue;
                                                }
                                                break block14;
                                            }
                                            this.w = arrn;
                                        }
                                        this.X = new int[this.w.length];
                                    }
                                    n6 = 0;
                                }
                                n4 = n6;
                                for (n5 = 0; n5 < this.w.length; ++n5) {
                                    this.X[n5] = n4 += this.w[n5];
                                    if (string2 == null) {
                                        if (string2 == null) continue;
                                    }
                                    break block15;
                                }
                                this.j = n4;
                            }
                            n3 = this.j;
                            if (string2 != null) break block23;
                            if (n3 <= 0) {
                                fU.h("Invalid sum of all weights: " + n4);
                                this.j = 1;
                            }
                        }
                        n3 = 1;
                    }
                    return n3 != 0;
                }
                fU.h("Tiles not defined: " + string);
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    public gf(Properties properties, String string) {
        block0: {
            this.I = null;
            this.a = null;
            this.O = null;
            this.G = null;
            this.i = null;
            this.V = 0;
            this.J = null;
            this.h = 0;
            this.af = 63;
            this.d = null;
            this.A = 0;
            this.F = 1024;
            this.T = 0;
            this.r = false;
            this.ab = null;
            this.U = 0;
            this.v = 0;
            this.w = null;
            this.n = 1;
            String string2 = K.d();
            this.X = null;
            this.j = 1;
            this.o = null;
            this.g = null;
            this.t = null;
            this.f = null;
            this.k = null;
            this.W = -1;
            this.p = net.minecraft.u.g.bf.d();
            this.b = null;
            ha ha2 = new ha("ConnectedTextures");
            this.I = ha2.m(string);
            this.a = ha2.h(string);
            this.O = ha2.j(properties.getProperty("matchBlocks"));
            this.G = ha2.k(properties.getProperty("metadata"));
            this.i = this.p(properties.getProperty("matchTiles"));
            this.V = gf.l(properties.getProperty("method"));
            this.J = this.c(properties.getProperty("tiles"));
            this.h = gf.u(properties.getProperty("connect"));
            this.af = gf.m(properties.getProperty("faces"));
            this.d = ha2.f(properties.getProperty("biomes"));
            this.A = ha2.b(properties.getProperty("minHeight"), -1);
            this.F = ha2.b(properties.getProperty("maxHeight"), 1024);
            this.T = ha2.i(properties.getProperty("renderPass"));
            this.r = ha.b(properties.getProperty("innerSeams"));
            this.ab = this.a(properties);
            this.U = ha2.i(properties.getProperty("width"));
            this.v = ha2.i(properties.getProperty("height"));
            this.w = ha2.k(properties.getProperty("weights"));
            this.n = gf.f(properties.getProperty("symmetry"));
            this.t = ha2.j(properties.getProperty("connectBlocks"));
            this.f = this.p(properties.getProperty("connectTiles"));
            this.W = ha2.i(properties.getProperty("tintIndex"));
            this.p = ha2.a(properties.getProperty("tintBlock"), net.minecraft.u.g.bf.d());
            this.b = ha2.a(properties.getProperty("layer"), aC.CUTOUT_MIPPED);
            if (!net.minecraft.k.m.c()) break block0;
            K.b("x7IY9b");
        }
    }

    static {
        S = 4;
        Y = 4;
        c = 7;
        Z = 3;
        H = 3;
        K = 128;
        Q = 10;
        y = 0;
        q = 1;
        L = 60;
        u = 2;
        N = 5;
        ag = 8;
        C = 32;
        l = 2;
        M = 2;
        z = 2;
        R = 1;
        P = 6;
        ae = 16;
        aa = 63;
        B = 1;
        s = 128;
        e = 1;
        ad = 128;
        x = 8;
        E = 9;
        ac = 11;
        D = 6;
        m = 0;
    }

    private static c[] a(String[] arrstring, j j2) {
        Object[] arrobject;
        block8: {
            String string = K.d();
            if (arrstring == null) {
                return null;
            }
            ArrayList<c> arrayList = new ArrayList<c>();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string2;
                String string3;
                block10: {
                    String string4;
                    String string5;
                    block9: {
                        String string6;
                        v v2;
                        boolean bl2;
                        String string7;
                        arrobject = arrstring;
                        if (string != null) break block8;
                        String string8 = arrobject[i2];
                        v v3 = new v(string8);
                        string3 = v3.c();
                        String string9 = string7 = v3.a();
                        if (string == null) {
                            if (!string9.contains("/")) {
                                string7 = "textures/blocks/" + string7;
                            }
                            string9 = string7 + ".png";
                        }
                        if (!(bl2 = fU.b(v2 = new v(string3, string6 = string9)))) {
                            fU.h("File not found: " + string6);
                        }
                        String string10 = "textures/";
                        string2 = string7;
                        string5 = string7;
                        string4 = string10;
                        if (string != null) break block9;
                        if (!string5.startsWith(string4)) break block10;
                        string5 = string7;
                        string4 = string10;
                    }
                    string2 = string5.substring(string4.length());
                }
                v v4 = new v(string3, string2);
                c c10 = j2.c(v4);
                arrayList.add(c10);
                if (string == null) continue;
            }
            arrobject = arrayList.toArray(new c[arrayList.size()]);
        }
        c[] arrc = (c[])arrobject;
        return arrc;
    }

    private boolean d(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                this.J = this.c("12-15");
            }
            arrstring = this.J;
        }
        int n2 = arrstring.length;
        if (string2 == null) {
            if (n2 != 4) {
                fU.h("Invalid tiles, must be exactly 4: " + string);
                return false;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int[] a() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        String string;
        block7: {
            string = K.d();
            int n7 = this.I.startsWith("block");
            if (string == null) {
                if (n7 == 0) {
                    return null;
                }
                n7 = "block".length();
            }
            for (n6 = n5 = (v1320387); n6 < this.I.length(); ++n6) {
                char c10 = this.I.charAt(n6);
                n4 = c10;
                n3 = 48;
                if (string == null && string == null) {
                    if (n4 < n3 || c10 > '9' && string == null) break;
                    if (string == null) continue;
                }
                break block7;
            }
            n4 = n6;
            n3 = n5;
        }
        if (n4 == n3) {
            return null;
        }
        String string2 = this.I.substring(n5, n6);
        int n8 = n2 = fU.b(string2, -1);
        if (string == null) {
            if (n8 < 0) {
                return null;
            }
            n8 = 1;
        }
        int[] arrn = new int[n8];
        int[] arrn2 = arrn;
        arrn[0] = n2;
        return arrn2;
    }

    private boolean q(String string) {
        String string2 = K.d();
        String[] arrstring = this.J;
        if (string2 == null) {
            if (arrstring == null) {
                this.J = this.c("0-11 16-27 32-43 48-58");
            }
            arrstring = this.J;
        }
        int n2 = arrstring.length;
        if (string2 == null) {
            if (n2 < 47) {
                fU.h("Invalid tiles, must be at least 47: " + string);
                return false;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public boolean a(int n2) {
        return gc.a(n2, this.O);
    }

    public boolean a(c c10) {
        return gc.a(c10, this.o);
    }

    private int[] a(Properties properties) {
        Object object;
        block17: {
            int n2;
            Object object2;
            HashMap<Integer, Integer> hashMap;
            String string;
            block16: {
                string = K.d();
                if (this.J == null) {
                    return null;
                }
                hashMap = new HashMap<Integer, Integer>();
                object2 = properties.keySet().iterator();
                while (object2.hasNext()) {
                    block19: {
                        String string2;
                        block23: {
                            block27: {
                                String string3;
                                block26: {
                                    int n3;
                                    int n4;
                                    int n5;
                                    block25: {
                                        int n6;
                                        block24: {
                                            block22: {
                                                String string4;
                                                block21: {
                                                    String string5;
                                                    String string6;
                                                    String string7;
                                                    block20: {
                                                        Object object3;
                                                        block18: {
                                                            Object object4;
                                                            object3 = object4 = object2.next();
                                                            if (string != null) break block18;
                                                            n2 = object3 instanceof String;
                                                            if (string != null) break block16;
                                                            if (n2 == 0) break block19;
                                                            object3 = object4;
                                                        }
                                                        string7 = (String)object3;
                                                        String string8 = "ctm.";
                                                        String string5 = string7;
                                                        string5 = string8;
                                                        if (string != null) break block20;
                                                        if (!string6.startsWith(string5)) break block19;
                                                        String string5 = string7;
                                                        string5 = string8;
                                                    }
                                                    string2 = string6.substring(string5.length());
                                                    string4 = string3 = properties.getProperty(string7);
                                                    if (string != null) break block21;
                                                    if (string4 == null) break block19;
                                                    string4 = string2;
                                                }
                                                n6 = n5 = fU.b(string4, -1);
                                                if (string != null) break block22;
                                                if (n6 < 0) break block23;
                                                n6 = n5;
                                            }
                                            if (string != null) break block24;
                                            if (n6 > 46) break block23;
                                            n6 = fU.b(string3, -1);
                                        }
                                        n3 = n4 = n6;
                                        if (string != null) break block25;
                                        if (n3 < 0) break block26;
                                        n3 = n4;
                                    }
                                    if (n3 >= this.J.length) break block26;
                                    hashMap.put(n5, n4);
                                    if (string == null) break block27;
                                }
                                fU.h("Invalid CTM tile index: " + string3);
                            }
                            if (string == null) break block19;
                        }
                        fU.h("Invalid CTM index: " + string2);
                    }
                    if (string == null) continue;
                }
                n2 = hashMap.isEmpty();
            }
            if (string == null) {
                if (n2 != 0) {
                    return null;
                }
                n2 = 47;
            }
            object2 = new int[n2];
            int n7 = 0;
            while (n7 < ((Object)object2).length) {
                object = object2;
                if (string == null) {
                    object[n7] = -1;
                    if (string == null) {
                        if (hashMap.containsKey(n7)) {
                            object2[n7] = (Integer)hashMap.get(n7);
                        }
                        ++n7;
                    }
                    if (string == null) continue;
                }
                break block17;
            }
            object = object2;
        }
        return object;
    }

    private static String g(String string) {
        int n2;
        String string2 = string;
        int n3 = string.lastIndexOf(47);
        String string3 = K.d();
        int n4 = n3;
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

    public static a a(String string, Collection collection) {
        Iterator iterator = collection.iterator();
        String string2 = K.d();
        while (iterator.hasNext()) {
            block4: {
                String string3;
                block3: {
                    Object e10 = iterator.next();
                    string3 = string;
                    if (string2 != null) break block3;
                    if (!string3.equals(((a)e10).c())) break block4;
                    string3 = e10;
                }
                return (a)((Object)string3);
            }
            if (string2 == null) continue;
        }
        return null;
    }

    private String[] c(String string) {
        String[] arrstring;
        block24: {
            Object object;
            String[] arrstring2;
            String string2;
            block23: {
                string2 = K.d();
                if (string == null) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<String>();
                String[] arrstring3 = fU.c(string, " ,");
                block0: for (int i2 = 0; i2 < arrstring3.length; ++i2) {
                    arrstring2 = arrstring3;
                    if (string2 == null) {
                        String string3 = arrstring2[i2];
                        int n2 = string3.contains("-");
                        if (string2 != null) continue;
                        if (n2 != 0) {
                            object = fU.c(string3, "-");
                            n2 = ((String[])object).length;
                            if (string2 != null) continue;
                            if (n2 == 2) {
                                int n3 = fU.b((String)object[0], -1);
                                int n4 = fU.b((String)object[1], -1);
                                n2 = n3;
                                if (string2 != null) continue;
                                if (n2 >= 0) {
                                    n2 = n4;
                                    if (string2 != null) continue;
                                    if (n2 >= 0) {
                                        int n5;
                                        int n6 = n3;
                                        if (string2 == null) {
                                            if (n6 > n4) {
                                                fU.h("Invalid interval: " + string3 + ", when parsing: " + string);
                                                if (string2 == null) continue;
                                            }
                                            n6 = n5 = n3;
                                        }
                                        do {
                                            if (n5 > n4) {
                                                if (string2 != null) continue;
                                                if (string2 == null) continue block0;
                                            }
                                            arrayList.add(String.valueOf(n5));
                                            ++n5;
                                        } while (string2 == null);
                                    }
                                }
                            }
                        }
                        n2 = arrayList.add(string3);
                        if (string2 == null) continue;
                    }
                    break block23;
                }
                arrstring2 = arrayList.toArray(new String[arrayList.size()]);
            }
            String[] arrstring4 = arrstring2;
            for (int i3 = 0; i3 < arrstring4.length; ++i3) {
                block30: {
                    Object object2;
                    block29: {
                        boolean bl2;
                        block28: {
                            Object object3;
                            block27: {
                                boolean bl3;
                                block25: {
                                    block26: {
                                        arrstring = arrstring4;
                                        if (string2 != null) break block24;
                                        object = arrstring[i3];
                                        object = fp.a((String)object, this.a);
                                        bl3 = ((String)object).startsWith(this.a);
                                        if (string2 != null) break block25;
                                        if (bl3) break block26;
                                        bl3 = ((String)object).startsWith("textures/");
                                        if (string2 != null) break block25;
                                        if (bl3) break block26;
                                        bl3 = ((String)object).startsWith("mcpatcher/");
                                        if (string2 != null) break block25;
                                        if (!bl3) {
                                            object = this.a + "/" + (String)object;
                                        }
                                    }
                                    object3 = object;
                                    if (string2 != null) break block27;
                                    bl3 = ((String)object3).endsWith(".png");
                                }
                                if (bl3) {
                                    object = ((String)object).substring(0, ((String)object).length() - 4);
                                }
                                object3 = "textures/blocks/";
                            }
                            Object object4 = object3;
                            bl2 = ((String)object).startsWith((String)object4);
                            if (string2 != null) break block28;
                            if (bl2) {
                                object = ((String)object).substring(((String)object4).length());
                            }
                            object2 = object;
                            if (string2 != null) break block29;
                            bl2 = ((String)object2).startsWith("/");
                        }
                        if (!bl2) break block30;
                        object2 = ((String)object).substring(1);
                    }
                    object = object2;
                }
                arrstring4[i3] = object;
                if (string2 == null) continue;
            }
            arrstring = arrstring4;
        }
        return arrstring;
    }

    private String[] p(String string) {
        String[] arrstring;
        block6: {
            String string2 = K.d();
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return null;
                }
                string3 = string;
            }
            String[] arrstring2 = fU.c(string3, " ");
            for (int i2 = 0; i2 < arrstring2.length; ++i2) {
                arrstring = arrstring2;
                if (string2 == null) {
                    String string4;
                    String string5 = string4 = arrstring[i2];
                    String string6 = ".png";
                    if (string2 == null) {
                        if (string5.endsWith(string6)) {
                            string4 = string4.substring(0, string4.length() - 4);
                        }
                        string5 = string4;
                        string6 = this.a;
                    }
                    arrstring2[i2] = string4 = fp.a(string5, string6);
                    if (string2 == null) continue;
                }
                break block6;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }

    public boolean a(h h2) {
        return gc.a(h2, this.d);
    }

    public void a(j j2) {
        block8: {
            block7: {
                gf gf2;
                String[] arrstring;
                block6: {
                    String string = K.d();
                    arrstring = this.i;
                    if (string == null) {
                        if (arrstring != null) {
                            this.o = gf.a(this.i, j2);
                        }
                        arrstring = this.f;
                    }
                    if (string != null) break block6;
                    if (arrstring != null) {
                        this.k = gf.a(this.f, j2);
                    }
                    gf2 = this;
                    if (string != null) break block7;
                    arrstring = gf2.J;
                }
                if (arrstring == null) break block8;
                gf2 = this;
            }
            gf2.g = gf.a(this.J, j2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int l(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 1;
            }
            string3 = string;
        }
        int n2 = string3.equals("ctm");
        if (string2 != null) return n2;
        if (n2 != 0) return 1;
        n2 = string.equals("glass") ? 1 : 0;
        if (string2 != null) return n2;
        if (n2 != 0) return 1;
        int n3 = string.equals("ctm_compact");
        if (string2 == null) {
            if (n3 != 0) {
                return 10;
            }
            n3 = string.equals("horizontal") ? 1 : 0;
        }
        if (string2 != null) return n3;
        if (n3 != 0) return 2;
        n3 = string.equals("bookshelf") ? 1 : 0;
        if (string2 != null) return n3;
        if (n3 != 0) return 2;
        int n4 = string.equals("vertical");
        if (string2 == null) {
            if (n4 != 0) {
                return 6;
            }
            n4 = string.equals("top");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 3;
            }
            n4 = string.equals("random");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 4;
            }
            n4 = string.equals("repeat");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 5;
            }
            n4 = string.equals("fixed");
        }
        if (string2 == null) {
            if (n4 != 0) {
                return 7;
            }
            n4 = string.equals("horizontal+vertical") ? 1 : 0;
        }
        if (string2 != null) return n4;
        if (n4 != 0) return 8;
        n4 = string.equals("h+v") ? 1 : 0;
        if (string2 != null) return n4;
        if (n4 != 0) return 8;
        int n5 = string.equals("vertical+horizontal");
        if (string2 != null) return n5;
        if (n5 != 0) return 9;
        n5 = string.equals("v+h") ? 1 : 0;
        if (string2 != null) return n5;
        if (n5 != 0) return 9;
        int n6 = string.equals("overlay");
        if (string2 != null) return n6;
        if (n6 != 0) {
            return 11;
        }
        fU.h("Unknown method: " + string);
        return 0;
    }

    private static int f(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 1;
            }
            string3 = string;
        }
        int n2 = string3.equals("opposite");
        if (string2 == null) {
            if (n2 != 0) {
                return 2;
            }
            n2 = string.equals("all") ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 6;
            }
            fU.h("Unknown symmetry: " + string);
            n2 = 1;
        }
        return n2;
    }
}

