/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Q;
import net.minecraft.k.l;
import org.lwjgl.input.Keyboard;

public class fv
extends e8 {
    private /* synthetic */ float s;
    private /* synthetic */ boolean r;
    public /* synthetic */ List<e8> p;
    public /* synthetic */ float m;
    private static final /* synthetic */ Color n;
    private /* synthetic */ int k;
    private final /* synthetic */ bE o;
    private /* synthetic */ double t;
    private /* synthetic */ c4 q;
    private /* synthetic */ int l;

    @Override
    public void c(int n2, int n3) {
        block10: {
            fv fv2;
            String string;
            block9: {
                int n4;
                block5: {
                    block6: {
                        int n5;
                        block7: {
                            block8: {
                                string = net.minecraft.k.l.b();
                                n4 = this.r;
                                if (string == null) break block5;
                                if (n4 == 0) break block6;
                                this.o.a(n3);
                                this.r = false;
                                n4 = n3;
                                n5 = 211;
                                if (string == null) break block7;
                                if (n4 != n5) break block8;
                                this.o.a(0);
                                if (string != null) break block6;
                            }
                            n4 = n3;
                            if (string == null) break block5;
                            n5 = 1;
                        }
                        if (n4 == n5) {
                            this.a(false);
                        }
                    }
                    fv2 = this;
                    if (string == null) break block9;
                    double d10 = fv2.t - 0.0;
                    n4 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                }
                if (n4 <= 0) break block10;
                fv2 = this;
            }
            for (e8 e82 : fv2.p) {
                e82.c(n2, n3);
                if (string != null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a() {
        var2_1 = this.l;
        var1_2 = net.minecraft.k.l.b();
        v0 = am.a[this.q.ordinal()];
        if (var1_2 == null) ** GOTO lbl9
        switch (v0) {
            case 1: {
                cfr_temp_0 = this.t - (double)var2_1;
                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
lbl9:
                // 2 sources

                if (var1_2 == null) ** GOTO lbl17
                if (v0 >= 0) ** GOTO lbl13
                this.t = n.a((double)var2_1, (double)((float)this.t), 0.045 * Q.o / 5.0);
                if (var1_2 != null) ** GOTO lbl19
lbl13:
                // 2 sources

                v1 = this;
                if (var1_2 == null) ** GOTO lbl20
                cfr_temp_1 = v1.t - (double)var2_1;
                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
lbl17:
                // 2 sources

                if (v0 >= 0) {
                    this.q = c4.STATIC;
                }
lbl19:
                // 4 sources

                v1 = this;
lbl20:
                // 2 sources

                v1.t = this.a(this.t, (double)var2_1);
                if (var1_2 != null) return;
            }
            case 2: {
                cfr_temp_2 = this.t - 0.0;
                v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                if (var1_2 == null) ** GOTO lbl33
                if (v2 <= 0) ** GOTO lbl29
                this.t = n.a(0.0, (double)((float)this.t), 0.045 * Q.o / 5.0);
                if (var1_2 != null) ** GOTO lbl35
lbl29:
                // 2 sources

                v3 = this;
                if (var1_2 == null) ** GOTO lbl36
                cfr_temp_3 = v3.t - 0.0;
                v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
lbl33:
                // 2 sources

                if (v2 <= 0) {
                    this.q = c4.STATIC;
                }
lbl35:
                // 4 sources

                v3 = this;
lbl36:
                // 2 sources

                v3.t = this.a(this.t, (double)var2_1);
                if (var1_2 != null) return;
            }
            case 3: {
                v4 = this;
                if (var1_2 == null) ** GOTO lbl47
                if (!(v4.t > 0.0)) ** GOTO lbl46
                v4 = this;
                if (var1_2 == null) ** GOTO lbl47
                if (v4.t != (double)var2_1) {
                    this.t = n.a((double)var2_1, (double)((float)this.t), 0.045 * Q.o / 5.0);
                }
lbl46:
                // 4 sources

                v4 = this;
lbl47:
                // 3 sources

                v4.t = this.a(this.t, (double)var2_1);
                return;
            }
        }
    }

    @Override
    public double h() {
        return this.t;
    }

    public fv(bE bE2, eb eb2, int n2, int n3, int n4, int n5) {
        block10: {
            int n6;
            List<Object> list;
            block11: {
                block12: {
                    String string = net.minecraft.k.l.b();
                    super(eb2, n2, n3, n4, n5);
                    this.p = new ArrayList<e8>();
                    this.k = 120;
                    String string2 = string;
                    this.s = 0.0f;
                    this.m = 0.0f;
                    this.q = c4.STATIC;
                    this.o = bE2;
                    int n7 = n5;
                    list = cj.b.f.a(bE2);
                    if (string2 == null) break block11;
                    if (list == null) break block12;
                    for (hH hH2 : cj.b.f.a(bE2)) {
                        block14: {
                            int n8;
                            block13: {
                                n6 = hH2.k() ? 1 : 0;
                                if (string2 == null) break block10;
                                if (string2 != null) {
                                    if (n6 != 0) {
                                        this.p.add(new fw(hH2, this.e(), n2, n3 + n7, n4, n5));
                                        n7 += n5 + 20;
                                    }
                                    n8 = hH2.h();
                                }
                                if (string2 != null) {
                                    if (n8 != 0) {
                                        this.p.add(new fl(hH2, this.e(), n2, n3 + n7 - 10, n4, 16));
                                        n7 += n5 + 20;
                                    }
                                    n8 = hH2.s();
                                }
                                if (string2 != null) {
                                    if (n8 != 0) {
                                        this.p.add(new f1(hH2, this.e(), n2, n3 + n7 - 10, n4, 16));
                                        n7 += n5 + 20;
                                    }
                                    n8 = hH2.d();
                                }
                                if (string2 == null) break block13;
                                if (n8 == 0) break block14;
                                this.p.add(new fu(hH2, this.e(), n2, n3 + n7, n4, n5));
                                n8 = n7 + (n5 + 20);
                            }
                            n7 = n8;
                        }
                        if (string2 != null) continue;
                    }
                }
                list = this.p;
            }
            list.add((hH)((Object)new fE(bE2, this.e(), n2, n3, n4, n5)));
            n6 = this.d();
        }
    }

    public bE e() {
        return this.o;
    }

    static {
        n = new Color(23, 23, 23);
    }

    public void a(boolean bl2) {
        this.r = bl2;
    }

    @Override
    public void b(int n2, int n3, int n4) {
        block19: {
            block30: {
                fv fv2;
                block31: {
                    String string;
                    block29: {
                        double d10;
                        block24: {
                            block28: {
                                block25: {
                                    block26: {
                                        fv fv3;
                                        block27: {
                                            block23: {
                                                block22: {
                                                    block20: {
                                                        block21: {
                                                            block18: {
                                                                block17: {
                                                                    block16: {
                                                                        string = net.minecraft.k.l.b();
                                                                        double d11 = this.t - 0.0;
                                                                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                                                                        if (string != null) {
                                                                            if (d10 > 0) {
                                                                                for (e8 e82 : this.p) {
                                                                                    e82.b(n2, n3, n4);
                                                                                    if (string != null) {
                                                                                        if (string != null) continue;
                                                                                    }
                                                                                    break block16;
                                                                                }
                                                                            }
                                                                            d10 = (double)this.a(n2, n3);
                                                                        }
                                                                        if (string == null) break block17;
                                                                        if (d10 == false) break block16;
                                                                        d10 = n4;
                                                                        if (string == null) break block17;
                                                                        if (d10 == 2) {
                                                                            boolean bl2 = this.r;
                                                                            if (string != null) {
                                                                                bl2 = !bl2;
                                                                            }
                                                                            this.r = bl2;
                                                                        }
                                                                    }
                                                                    d10 = (double)this.a(n2, n3);
                                                                }
                                                                if (string == null) break block18;
                                                                if (d10 == false) break block19;
                                                                d10 = n4;
                                                            }
                                                            if (string == null) break block20;
                                                            if (d10 != false) break block21;
                                                            this.o.e();
                                                            if (string != null) break block19;
                                                        }
                                                        d10 = n4;
                                                    }
                                                    if (string == null) break block22;
                                                    if (d10 != true) break block19;
                                                    d10 = (double)this.p.isEmpty();
                                                }
                                                if (string == null) break block23;
                                                if (d10 != false) break block19;
                                                double d12 = this.t - 0.0;
                                                d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                                            }
                                            if (string == null) break block24;
                                            if (d10 <= 0) break block25;
                                            fv3 = this;
                                            if (string == null) break block26;
                                            if (fv3.q == c4.EXPANDING) break block27;
                                            fv2 = this;
                                            if (string == null) break block28;
                                            if (fv2.q != c4.STATIC) break block25;
                                        }
                                        fv3 = this;
                                    }
                                    fv3.q = c4.RETRACTING;
                                    if (string != null) break block19;
                                }
                                fv2 = this;
                            }
                            if (string == null) break block29;
                            double d13 = fv2.t - (double)this.l;
                            d10 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                        }
                        if (d10 >= 0) break block19;
                        fv2 = this;
                    }
                    if (string == null) break block30;
                    if (fv2.q == c4.EXPANDING) break block31;
                    fv2 = this;
                    if (string == null) break block30;
                    if (fv2.q != c4.STATIC) break block19;
                }
                fv2 = this;
            }
            fv2.q = c4.EXPANDING;
        }
    }

    private void a(int n2, int n3) {
        int n4 = 15;
        Iterator<e8> iterator = this.p.iterator();
        String string = net.minecraft.k.l.b();
        while (iterator.hasNext()) {
            block4: {
                e8 e82;
                block3: {
                    e8 e83;
                    e82 = e83 = iterator.next();
                    if (string == null) break block3;
                    if (e82.d()) break block4;
                    e83.a(this.g() + n4);
                    e82 = e83;
                }
                e82.b(n2, n3);
                n4 += 15;
            }
            if (string != null) continue;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(int n2, int n3, int n4) {
        block4: {
            fv fv2;
            String string;
            block3: {
                string = net.minecraft.k.l.b();
                fv2 = this;
                if (string == null) break block3;
                if (!(fv2.t > 0.0)) break block4;
                fv2 = this;
            }
            for (e8 e82 : fv2.p) {
                e82.a(n2, n3, n4);
                if (string != null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(int var1_1, int var2_2) {
        block16: {
            block15: {
                block13: {
                    block14: {
                        block11: {
                            block12: {
                                var4_3 = this.e();
                                var5_4 = var4_3.d() + this.a();
                                var6_5 = var4_3.e() + this.g();
                                var7_6 = this.b();
                                var8_7 = this.c();
                                var3_8 = net.minecraft.k.l.b();
                                var9_9 = this.a(var1_1, var2_2);
                                this.a();
                                this.l = this.d();
                                v0 = var9_9;
                                if (var3_8 == null) break block11;
                                if (v0 == 0) break block12;
                                v1 = this;
                                if (var3_8 == null) break block13;
                                if (v1.k >= 200) break block14;
                                this.k += 15;
                                if (var3_8 != null) break block14;
                            }
                            v1 = this;
                            if (var3_8 == null) break block13;
                            v0 = v1.k;
                        }
                        if (v0 > 120) {
                            this.k -= 15;
                        }
                    }
                    v1 = this;
                }
                v1.s = n.a(this.s, var9_9 != 0 ? 4.0f : 2.0f, 0.001f);
                v2 = this.o.i();
                if (var3_8 != null) {
                    v2 = v2 != 0 ? -1 : new Color(this.k, this.k, this.k).getRGB();
                }
                var10_10 = v2;
                v3 = this.o.i();
                if (var3_8 == null) break block15;
                if (v3 == 0) break block16;
                v3 = var5_4 - 2;
            }
            dJ.a((double)v3, (double)((float)var6_5 + (float)var7_6 / 1.5f - 9.0f), 125.0, 15.0, var4_3.e.b());
        }
        v4 = this;
        if (var3_8 == null) ** GOTO lbl46
        if (v4.r) {
            v5 = "Binding... Key:" + Keyboard.getKeyName((int)this.o.n());
        } else {
            v4 = this;
lbl46:
            // 2 sources

            v5 = v4.o.a();
        }
        fv.c.m.d(v5, (float)var5_4 + 48.0f + this.s, (float)var6_5 + (float)var7_6 / 1.5f - 5.5f, var10_10);
        if (!(this.t > 0.0)) return;
        if (var4_3.i != c4.RETRACTING) {
            dJ.a(var5_4, var6_5, var5_4 + var8_7, (double)((float)((double)var6_5 + Math.min(this.t, var4_3.d) + (double)var7_6)));
        }
        this.a(var1_1, var2_2);
    }

    private double a(double d10, double d11) {
        String string = net.minecraft.k.l.b();
        double d12 = d10;
        double d13 = 0.0;
        if (string != null) {
            if (d12 < d13) {
                return 0.0;
            }
            d12 = d10;
            d13 = d11;
        }
        return Math.min(d12, d13);
    }

    private int d() {
        int n2;
        block3: {
            int n3 = 0;
            String string = net.minecraft.k.l.b();
            for (e8 e82 : this.p) {
                n2 = e82.d() ? 1 : 0;
                if (string != null) {
                    if (string != null && n2 == 0) {
                        int n4 = n3 = (int)((double)(n3 + e82.b()) + e82.h());
                    }
                    if (string != null) continue;
                }
                break block3;
            }
            n2 = n3;
        }
        return n2;
    }
}

