/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package net.minecraft.aA;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.aA.f;
import net.minecraft.aA.h;
import net.minecraft.aA.n;
import net.minecraft.ar.aG;
import net.minecraft.k.m;

public class t {
    public /* synthetic */ float aa;
    public /* synthetic */ int o;
    public /* synthetic */ int ap;
    public /* synthetic */ boolean ar;
    public /* synthetic */ int af;
    @VisibleForTesting
    static final /* synthetic */ Gson z;
    public /* synthetic */ int as;
    public /* synthetic */ int b;
    public /* synthetic */ int y;
    public /* synthetic */ int m;
    public /* synthetic */ float S;
    public /* synthetic */ int av;
    public /* synthetic */ float aB;
    public /* synthetic */ int i;
    public /* synthetic */ int N;
    public /* synthetic */ int aq;
    public /* synthetic */ float ak;
    public /* synthetic */ int X;
    public /* synthetic */ int B;
    public /* synthetic */ int P;
    public /* synthetic */ boolean f;
    public /* synthetic */ int j;
    public /* synthetic */ int aj;
    public /* synthetic */ int t;
    public /* synthetic */ int x;
    public /* synthetic */ boolean h;
    public /* synthetic */ int ay;
    public /* synthetic */ int s;
    public /* synthetic */ float R;
    public /* synthetic */ int a;
    public /* synthetic */ int ah;
    public /* synthetic */ float ac;
    public /* synthetic */ int u;
    public /* synthetic */ float D;
    public /* synthetic */ int H;
    public /* synthetic */ int g;
    public /* synthetic */ int A;
    public /* synthetic */ int U;
    public /* synthetic */ int ag;
    public /* synthetic */ int F;
    public /* synthetic */ boolean ao;
    public /* synthetic */ int G;
    public /* synthetic */ boolean K;
    public /* synthetic */ float l;
    public /* synthetic */ float M;
    public /* synthetic */ int az;
    public /* synthetic */ float v;
    public /* synthetic */ float I;
    public /* synthetic */ int C;
    public /* synthetic */ float Z;
    public /* synthetic */ int V;
    public /* synthetic */ boolean Q;
    public /* synthetic */ float L;
    public /* synthetic */ float aw;
    public /* synthetic */ int q;
    public /* synthetic */ int Y;
    public /* synthetic */ int E;
    public /* synthetic */ int w;
    public /* synthetic */ int ae;
    public /* synthetic */ int au;
    public /* synthetic */ int e;
    public /* synthetic */ int an;
    public /* synthetic */ int ad;
    public /* synthetic */ boolean p;
    public /* synthetic */ int n;
    public /* synthetic */ int ai;
    public /* synthetic */ boolean W;
    public /* synthetic */ int al;
    public /* synthetic */ int T;
    public /* synthetic */ boolean am;
    public /* synthetic */ boolean aA;
    public /* synthetic */ boolean c;
    public /* synthetic */ int k;
    public /* synthetic */ float J;
    public /* synthetic */ int ax;
    public /* synthetic */ boolean O;
    public /* synthetic */ int at;
    public /* synthetic */ int d;
    public /* synthetic */ int r;
    public /* synthetic */ float ab;

    public t() {
        this.L = 684.412f;
        this.I = 684.412f;
        this.Z = 512.0f;
        this.S = 512.0f;
        this.l = 200.0f;
        this.ak = 200.0f;
        this.aB = 0.5f;
        this.R = 80.0f;
        this.aw = 160.0f;
        this.ac = 80.0f;
        this.M = 8.5f;
        this.v = 12.0f;
        this.J = 1.0f;
        this.D = 1.0f;
        this.ah = 63;
        this.f = true;
        this.K = true;
        this.Y = 8;
        this.ar = true;
        this.O = true;
        this.Q = true;
        this.aA = true;
        this.h = true;
        this.ao = true;
        this.p = true;
        this.am = true;
        this.ad = 4;
        this.W = true;
        this.a = 80;
        this.j = -1;
        this.B = 4;
        this.r = 4;
        this.i = 33;
        this.X = 10;
        this.s = 256;
        this.d = 33;
        this.q = 8;
        this.ay = 256;
        this.E = 33;
        this.w = 10;
        this.ag = 80;
        this.al = 33;
        this.V = 10;
        this.U = 80;
        this.aj = 33;
        this.t = 10;
        this.g = 80;
        this.ax = 17;
        this.F = 20;
        this.k = 128;
        this.N = 9;
        this.ap = 20;
        this.P = 64;
        this.m = 9;
        this.at = 2;
        this.au = 32;
        this.e = 8;
        this.y = 8;
        this.C = 16;
        this.ae = 8;
        this.T = 1;
        this.aq = 16;
        this.an = 7;
        this.H = 1;
        this.b = 16;
        this.A = 16;
        this.a();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int hashCode() {
        var1_1 = net.minecraft.aA.h.a();
        v0 = this.L;
        if (var1_1) ** GOTO lbl8
        if (v0 == 0.0f) {
            v1 = 0;
        } else {
            v0 = this.L;
lbl8:
            // 2 sources

            v1 = Float.floatToIntBits(v0);
        }
        var2_2 = v1;
        v2 = this.I;
        if (var1_1) ** GOTO lbl16
        if (v2 == 0.0f) {
            v3 = 0;
        } else {
            v2 = this.I;
lbl16:
            // 2 sources

            v3 = Float.floatToIntBits(v2);
        }
        var2_2 = 31 * var2_2 + v3;
        v4 = this.Z;
        if (var1_1) ** GOTO lbl24
        if (v4 == 0.0f) {
            v5 = 0;
        } else {
            v4 = this.Z;
lbl24:
            // 2 sources

            v5 = Float.floatToIntBits(v4);
        }
        var2_2 = 31 * var2_2 + v5;
        v6 = this.S;
        if (var1_1) ** GOTO lbl32
        if (v6 == 0.0f) {
            v7 = 0;
        } else {
            v6 = this.S;
lbl32:
            // 2 sources

            v7 = Float.floatToIntBits(v6);
        }
        var2_2 = 31 * var2_2 + v7;
        v8 = this.l;
        if (var1_1) ** GOTO lbl40
        if (v8 == 0.0f) {
            v9 = 0;
        } else {
            v8 = this.l;
lbl40:
            // 2 sources

            v9 = Float.floatToIntBits(v8);
        }
        var2_2 = 31 * var2_2 + v9;
        v10 = this.ak;
        if (var1_1) ** GOTO lbl48
        if (v10 == 0.0f) {
            v11 = 0;
        } else {
            v10 = this.ak;
lbl48:
            // 2 sources

            v11 = Float.floatToIntBits(v10);
        }
        var2_2 = 31 * var2_2 + v11;
        v12 = this.aB;
        if (var1_1) ** GOTO lbl56
        if (v12 == 0.0f) {
            v13 = 0;
        } else {
            v12 = this.aB;
lbl56:
            // 2 sources

            v13 = Float.floatToIntBits(v12);
        }
        var2_2 = 31 * var2_2 + v13;
        v14 = this.R;
        if (var1_1) ** GOTO lbl64
        if (v14 == 0.0f) {
            v15 = 0;
        } else {
            v14 = this.R;
lbl64:
            // 2 sources

            v15 = Float.floatToIntBits(v14);
        }
        var2_2 = 31 * var2_2 + v15;
        v16 = this.aw;
        if (var1_1) ** GOTO lbl72
        if (v16 == 0.0f) {
            v17 = 0;
        } else {
            v16 = this.aw;
lbl72:
            // 2 sources

            v17 = Float.floatToIntBits(v16);
        }
        var2_2 = 31 * var2_2 + v17;
        v18 = this.ac;
        if (var1_1) ** GOTO lbl80
        if (v18 == 0.0f) {
            v19 = 0;
        } else {
            v18 = this.ac;
lbl80:
            // 2 sources

            v19 = Float.floatToIntBits(v18);
        }
        var2_2 = 31 * var2_2 + v19;
        v20 = this.M;
        if (var1_1) ** GOTO lbl88
        if (v20 == 0.0f) {
            v21 = 0;
        } else {
            v20 = this.M;
lbl88:
            // 2 sources

            v21 = Float.floatToIntBits(v20);
        }
        var2_2 = 31 * var2_2 + v21;
        v22 = this.v;
        if (var1_1) ** GOTO lbl96
        if (v22 == 0.0f) {
            v23 = 0;
        } else {
            v22 = this.v;
lbl96:
            // 2 sources

            v23 = Float.floatToIntBits(v22);
        }
        var2_2 = 31 * var2_2 + v23;
        v24 = this.J;
        if (var1_1) ** GOTO lbl104
        if (v24 == 0.0f) {
            v25 = 0;
        } else {
            v24 = this.J;
lbl104:
            // 2 sources

            v25 = Float.floatToIntBits(v24);
        }
        var2_2 = 31 * var2_2 + v25;
        v26 = this.ab;
        if (var1_1) ** GOTO lbl112
        if (v26 == 0.0f) {
            v27 = 0;
        } else {
            v26 = this.ab;
lbl112:
            // 2 sources

            v27 = Float.floatToIntBits(v26);
        }
        var2_2 = 31 * var2_2 + v27;
        v28 = this.D;
        if (var1_1) ** GOTO lbl120
        if (v28 == 0.0f) {
            v29 = 0;
        } else {
            v28 = this.D;
lbl120:
            // 2 sources

            v29 = Float.floatToIntBits(v28);
        }
        var2_2 = 31 * var2_2 + v29;
        v30 = this.aa;
        if (var1_1) ** GOTO lbl128
        if (v30 == 0.0f) {
            v31 = 0;
        } else {
            v30 = this.aa;
lbl128:
            // 2 sources

            v31 = Float.floatToIntBits(v30);
        }
        var2_2 = 31 * var2_2 + v31;
        var2_2 = 31 * var2_2 + this.ah;
        v32 = this.f;
        if (!var1_1) {
            v32 = v32 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v32;
        v33 = this.K;
        if (!var1_1) {
            v33 = v33 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v33;
        var2_2 = 31 * var2_2 + this.Y;
        v34 = this.ar;
        if (!var1_1) {
            v34 = v34 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v34;
        v35 = this.O;
        if (!var1_1) {
            v35 = v35 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v35;
        v36 = this.Q;
        if (!var1_1) {
            v36 = v36 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v36;
        v37 = this.aA;
        if (!var1_1) {
            v37 = v37 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v37;
        v38 = this.h;
        if (!var1_1) {
            v38 = v38 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v38;
        v39 = this.ao;
        if (!var1_1) {
            v39 = v39 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v39;
        v40 = this.p;
        if (!var1_1) {
            v40 = v40 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v40;
        v41 = this.am;
        if (!var1_1) {
            v41 = v41 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v41;
        var2_2 = 31 * var2_2 + this.ad;
        v42 = this.W;
        if (!var1_1) {
            v42 = v42 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v42;
        var2_2 = 31 * var2_2 + this.a;
        v43 = this.c;
        if (!var1_1) {
            v43 = v43 != 0 ? 1 : 0;
        }
        var2_2 = 31 * var2_2 + v43;
        var2_2 = 31 * var2_2 + this.j;
        var2_2 = 31 * var2_2 + this.B;
        var2_2 = 31 * var2_2 + this.r;
        var2_2 = 31 * var2_2 + this.i;
        var2_2 = 31 * var2_2 + this.X;
        var2_2 = 31 * var2_2 + this.az;
        var2_2 = 31 * var2_2 + this.s;
        var2_2 = 31 * var2_2 + this.d;
        var2_2 = 31 * var2_2 + this.q;
        var2_2 = 31 * var2_2 + this.ai;
        var2_2 = 31 * var2_2 + this.ay;
        var2_2 = 31 * var2_2 + this.E;
        var2_2 = 31 * var2_2 + this.w;
        var2_2 = 31 * var2_2 + this.o;
        var2_2 = 31 * var2_2 + this.ag;
        var2_2 = 31 * var2_2 + this.al;
        var2_2 = 31 * var2_2 + this.V;
        var2_2 = 31 * var2_2 + this.G;
        var2_2 = 31 * var2_2 + this.U;
        var2_2 = 31 * var2_2 + this.aj;
        var2_2 = 31 * var2_2 + this.t;
        var2_2 = 31 * var2_2 + this.u;
        var2_2 = 31 * var2_2 + this.g;
        var2_2 = 31 * var2_2 + this.ax;
        var2_2 = 31 * var2_2 + this.F;
        var2_2 = 31 * var2_2 + this.av;
        var2_2 = 31 * var2_2 + this.k;
        var2_2 = 31 * var2_2 + this.N;
        var2_2 = 31 * var2_2 + this.ap;
        var2_2 = 31 * var2_2 + this.as;
        var2_2 = 31 * var2_2 + this.P;
        var2_2 = 31 * var2_2 + this.m;
        var2_2 = 31 * var2_2 + this.at;
        var2_2 = 31 * var2_2 + this.n;
        var2_2 = 31 * var2_2 + this.au;
        var2_2 = 31 * var2_2 + this.e;
        var2_2 = 31 * var2_2 + this.y;
        var2_2 = 31 * var2_2 + this.af;
        var2_2 = 31 * var2_2 + this.C;
        var2_2 = 31 * var2_2 + this.ae;
        var2_2 = 31 * var2_2 + this.T;
        var2_2 = 31 * var2_2 + this.x;
        var2_2 = 31 * var2_2 + this.aq;
        var2_2 = 31 * var2_2 + this.an;
        var2_2 = 31 * var2_2 + this.H;
        var2_2 = 31 * var2_2 + this.b;
        var2_2 = 31 * var2_2 + this.A;
        if (var1_1 == false) return var2_2;
        net.minecraft.k.m.b(net.minecraft.k.m.c() == false);
        return var2_2;
    }

    public String toString() {
        return z.toJson((Object)this);
    }

    public boolean equals(Object object) {
        block165: {
            int n2;
            block178: {
                int n3;
                block177: {
                    t t2;
                    boolean bl2;
                    block176: {
                        int n4;
                        block175: {
                            block174: {
                                int n5;
                                block173: {
                                    block172: {
                                        int n6;
                                        block171: {
                                            block170: {
                                                int n7;
                                                block169: {
                                                    block168: {
                                                        int n8;
                                                        block167: {
                                                            Object object2;
                                                            block166: {
                                                                bl2 = net.minecraft.aA.h.b();
                                                                Object object3 = this;
                                                                if (bl2) {
                                                                    if (object3 == object) {
                                                                        return true;
                                                                    }
                                                                    object3 = object;
                                                                }
                                                                if (object3 == null) break block165;
                                                                object2 = this.getClass();
                                                                if (!bl2) break block166;
                                                                if (object2 != object.getClass()) break block165;
                                                                object2 = object;
                                                            }
                                                            t2 = (t)object2;
                                                            n2 = this.t;
                                                            n8 = t2.t;
                                                            if (bl2) {
                                                                if (n2 != n8) {
                                                                    return false;
                                                                }
                                                                n2 = this.g;
                                                                n8 = t2.g;
                                                            }
                                                            if (bl2) {
                                                                if (n2 != n8) {
                                                                    return false;
                                                                }
                                                                n2 = this.u;
                                                                n8 = t2.u;
                                                            }
                                                            if (!bl2) break block167;
                                                            if (n2 != n8) {
                                                                return false;
                                                            }
                                                            n2 = this.aj;
                                                            if (!bl2) break block168;
                                                            n8 = t2.aj;
                                                        }
                                                        if (n2 != n8) {
                                                            return false;
                                                        }
                                                        n2 = Float.compare(t2.M, this.M);
                                                    }
                                                    if (bl2) {
                                                        if (n2 != 0) {
                                                            return false;
                                                        }
                                                        n2 = Float.compare(t2.ab, this.ab);
                                                    }
                                                    if (bl2) {
                                                        if (n2 != 0) {
                                                            return false;
                                                        }
                                                        n2 = Float.compare(t2.J, this.J);
                                                    }
                                                    if (bl2) {
                                                        if (n2 != 0) {
                                                            return false;
                                                        }
                                                        n2 = Float.compare(t2.aa, this.aa);
                                                    }
                                                    if (bl2) {
                                                        if (n2 != 0) {
                                                            return false;
                                                        }
                                                        n2 = Float.compare(t2.D, this.D);
                                                    }
                                                    if (bl2) {
                                                        if (n2 != 0) {
                                                            return false;
                                                        }
                                                        n2 = this.B;
                                                    }
                                                    n7 = t2.B;
                                                    if (bl2) {
                                                        if (n2 != n7) {
                                                            return false;
                                                        }
                                                        n2 = this.F;
                                                        n7 = t2.F;
                                                    }
                                                    if (bl2) {
                                                        if (n2 != n7) {
                                                            return false;
                                                        }
                                                        n2 = this.k;
                                                        n7 = t2.k;
                                                    }
                                                    if (bl2) {
                                                        if (n2 != n7) {
                                                            return false;
                                                        }
                                                        n2 = this.av;
                                                        n7 = t2.av;
                                                    }
                                                    if (!bl2) break block169;
                                                    if (n2 != n7) {
                                                        return false;
                                                    }
                                                    n2 = this.ax;
                                                    if (!bl2) break block170;
                                                    n7 = t2.ax;
                                                }
                                                if (n2 != n7) {
                                                    return false;
                                                }
                                                n2 = Float.compare(t2.L, this.L);
                                            }
                                            if (bl2) {
                                                if (n2 != 0) {
                                                    return false;
                                                }
                                                n2 = Float.compare(t2.aB, this.aB);
                                            }
                                            if (bl2) {
                                                if (n2 != 0) {
                                                    return false;
                                                }
                                                n2 = Float.compare(t2.l, this.l);
                                            }
                                            if (bl2) {
                                                if (n2 != 0) {
                                                    return false;
                                                }
                                                n2 = Float.compare(t2.ak, this.ak);
                                            }
                                            if (bl2) {
                                                if (n2 != 0) {
                                                    return false;
                                                }
                                                n2 = this.T;
                                            }
                                            n6 = t2.T;
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.aq;
                                                n6 = t2.aq;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.x;
                                                n6 = t2.x;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.ae;
                                                n6 = t2.ae;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.V;
                                                n6 = t2.V;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.U;
                                                n6 = t2.U;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.G;
                                                n6 = t2.G;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.al;
                                                n6 = t2.al;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.X;
                                                n6 = t2.X;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.s;
                                                n6 = t2.s;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.az;
                                                n6 = t2.az;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.i;
                                                n6 = t2.i;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.Y;
                                                n6 = t2.Y;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.j;
                                                n6 = t2.j;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.at;
                                                n6 = t2.at;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.au;
                                                n6 = t2.au;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.n;
                                                n6 = t2.n;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.m;
                                                n6 = t2.m;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.w;
                                                n6 = t2.w;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.ag;
                                                n6 = t2.ag;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.o;
                                                n6 = t2.o;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.E;
                                                n6 = t2.E;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.q;
                                                n6 = t2.q;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.ay;
                                                n6 = t2.ay;
                                            }
                                            if (bl2) {
                                                if (n2 != n6) {
                                                    return false;
                                                }
                                                n2 = this.ai;
                                                n6 = t2.ai;
                                            }
                                            if (!bl2) break block171;
                                            if (n2 != n6) {
                                                return false;
                                            }
                                            n2 = this.d;
                                            if (!bl2) break block172;
                                            n6 = t2.d;
                                        }
                                        if (n2 != n6) {
                                            return false;
                                        }
                                        n2 = Float.compare(t2.I, this.I);
                                    }
                                    if (bl2) {
                                        if (n2 != 0) {
                                            return false;
                                        }
                                        n2 = this.ap;
                                    }
                                    n5 = t2.ap;
                                    if (bl2) {
                                        if (n2 != n5) {
                                            return false;
                                        }
                                        n2 = this.P;
                                        n5 = t2.P;
                                    }
                                    if (bl2) {
                                        if (n2 != n5) {
                                            return false;
                                        }
                                        n2 = this.as;
                                        n5 = t2.as;
                                    }
                                    if (bl2) {
                                        if (n2 != n5) {
                                            return false;
                                        }
                                        n2 = this.N;
                                        n5 = t2.N;
                                    }
                                    if (bl2) {
                                        if (n2 != n5) {
                                            return false;
                                        }
                                        n2 = this.b;
                                        n5 = t2.b;
                                    }
                                    if (bl2) {
                                        if (n2 != n5) {
                                            return false;
                                        }
                                        n2 = this.H;
                                        n5 = t2.H;
                                    }
                                    if (bl2) {
                                        if (n2 != n5) {
                                            return false;
                                        }
                                        n2 = this.an;
                                        n5 = t2.an;
                                    }
                                    if (bl2) {
                                        if (n2 != n5) {
                                            return false;
                                        }
                                        n2 = this.A;
                                        n5 = t2.A;
                                    }
                                    if (!bl2) break block173;
                                    if (n2 != n5) {
                                        return false;
                                    }
                                    n2 = this.a;
                                    if (!bl2) break block174;
                                    n5 = t2.a;
                                }
                                if (n2 != n5) {
                                    return false;
                                }
                                n2 = Float.compare(t2.S, this.S);
                            }
                            if (bl2) {
                                if (n2 != 0) {
                                    return false;
                                }
                                n2 = Float.compare(t2.R, this.R);
                            }
                            if (bl2) {
                                if (n2 != 0) {
                                    return false;
                                }
                                n2 = Float.compare(t2.aw, this.aw);
                            }
                            if (bl2) {
                                if (n2 != 0) {
                                    return false;
                                }
                                n2 = Float.compare(t2.ac, this.ac);
                            }
                            if (bl2) {
                                if (n2 != 0) {
                                    return false;
                                }
                                n2 = this.y;
                            }
                            n4 = t2.y;
                            if (bl2) {
                                if (n2 != n4) {
                                    return false;
                                }
                                n2 = this.C;
                                n4 = t2.C;
                            }
                            if (bl2) {
                                if (n2 != n4) {
                                    return false;
                                }
                                n2 = this.af;
                                n4 = t2.af;
                            }
                            if (bl2) {
                                if (n2 != n4) {
                                    return false;
                                }
                                n2 = this.e;
                                n4 = t2.e;
                            }
                            if (bl2) {
                                if (n2 != n4) {
                                    return false;
                                }
                                n2 = this.r;
                                n4 = t2.r;
                            }
                            if (!bl2) break block175;
                            if (n2 != n4) {
                                return false;
                            }
                            n2 = this.ah;
                            if (!bl2) break block176;
                            n4 = t2.ah;
                        }
                        if (n2 != n4) {
                            return false;
                        }
                        n2 = Float.compare(t2.v, this.v);
                    }
                    if (bl2) {
                        if (n2 != 0) {
                            return false;
                        }
                        n2 = Float.compare(t2.Z, this.Z);
                    }
                    if (bl2) {
                        if (n2 != 0) {
                            return false;
                        }
                        n2 = this.f ? 1 : 0;
                    }
                    n3 = t2.f;
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.K ? 1 : 0;
                        n3 = t2.K ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.W ? 1 : 0;
                        n3 = t2.W ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.c ? 1 : 0;
                        n3 = t2.c ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.Q ? 1 : 0;
                        n3 = t2.Q ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.p ? 1 : 0;
                        n3 = t2.p ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.ar ? 1 : 0;
                        n3 = t2.ar ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.aA ? 1 : 0;
                        n3 = t2.aA ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.h ? 1 : 0;
                        n3 = t2.h ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.ao ? 1 : 0;
                        n3 = t2.ao ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.O ? 1 : 0;
                        n3 = t2.O ? 1 : 0;
                    }
                    if (bl2) {
                        if (n2 != n3) {
                            return false;
                        }
                        n2 = this.am ? 1 : 0;
                        n3 = t2.am ? 1 : 0;
                    }
                    if (!bl2) break block177;
                    if (n2 != n3) {
                        return false;
                    }
                    n2 = this.ad;
                    if (!bl2) break block178;
                    n3 = t2.ad;
                }
                n2 = n2 == n3 ? 1 : 0;
            }
            return n2 != 0;
        }
        return false;
    }

    public static t a(String string) {
        if (string.isEmpty()) {
            return new t();
        }
        try {
            return aG.a(z, string, t.class);
        }
        catch (Exception exception) {
            return new t();
        }
    }

    public n b() {
        return new n(this, null);
    }

    static {
        z = new GsonBuilder().registerTypeAdapter(t.class, (Object)new f()).create();
    }

    public void a() {
        this.L = 684.412f;
        this.I = 684.412f;
        this.Z = 512.0f;
        this.S = 512.0f;
        this.l = 200.0f;
        this.ak = 200.0f;
        this.aB = 0.5f;
        this.R = 80.0f;
        this.aw = 160.0f;
        this.ac = 80.0f;
        this.M = 8.5f;
        this.v = 12.0f;
        this.J = 1.0f;
        this.ab = 0.0f;
        this.D = 1.0f;
        this.aa = 0.0f;
        this.ah = 63;
        this.f = true;
        this.K = true;
        this.Y = 8;
        this.ar = true;
        this.O = true;
        this.Q = true;
        this.aA = true;
        this.h = true;
        this.ao = true;
        this.p = true;
        this.am = true;
        this.ad = 4;
        this.W = true;
        this.a = 80;
        this.c = false;
        this.j = -1;
        this.B = 4;
        this.r = 4;
        this.i = 33;
        this.X = 10;
        this.az = 0;
        this.s = 256;
        this.d = 33;
        this.q = 8;
        this.ai = 0;
        this.ay = 256;
        this.E = 33;
        this.w = 10;
        this.o = 0;
        this.ag = 80;
        this.al = 33;
        this.V = 10;
        this.G = 0;
        this.U = 80;
        this.aj = 33;
        this.t = 10;
        this.u = 0;
        this.g = 80;
        this.ax = 17;
        this.F = 20;
        this.av = 0;
        this.k = 128;
        this.N = 9;
        this.ap = 20;
        this.as = 0;
        this.P = 64;
        this.m = 9;
        this.at = 2;
        this.n = 0;
        this.au = 32;
        this.e = 8;
        this.y = 8;
        this.af = 0;
        this.C = 16;
        this.ae = 8;
        this.T = 1;
        this.x = 0;
        this.aq = 16;
        this.an = 7;
        this.H = 1;
        this.b = 16;
        this.A = 16;
    }
}

