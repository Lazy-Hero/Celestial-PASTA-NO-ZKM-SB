/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.ar.D;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class s {
    private final /* synthetic */ B d;
    private /* synthetic */ int a;
    private /* synthetic */ int g;
    private /* synthetic */ boolean h;
    private final /* synthetic */ List<D> b;
    private /* synthetic */ int c;
    private /* synthetic */ String f;
    private /* synthetic */ boolean e;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public k h() {
        block15: {
            block16: {
                block26: {
                    block18: {
                        block27: {
                            block30: {
                                block29: {
                                    block28: {
                                        block19: {
                                            block20: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                block21: {
                                                                    block17: {
                                                                        var1_1 = v.b();
                                                                        v0 = this;
                                                                        if (var1_1 == 0) {
                                                                            if (v0.b.isEmpty()) {
                                                                                return new h("death.attack.generic", new Object[]{this.d.d()});
                                                                            }
                                                                            v0 = this;
                                                                        }
                                                                        var2_2 = v0.g();
                                                                        var3_3 = this.b.get(this.b.size() - 1);
                                                                        var4_4 = var3_3.e();
                                                                        var5_5 = var3_3.c().h();
                                                                        v1 = var2_2;
                                                                        if (var1_1 != 0) break block15;
                                                                        if (v1 == null) break block16;
                                                                        v2 = var3_3.c();
                                                                        if (var1_1 != 0) return v2.c(this.d);
                                                                        if (v2 != G.e) break block16;
                                                                        var7_6 = var2_2.e();
                                                                        v3 = var2_2.c();
                                                                        v4 = G.e;
                                                                        if (var1_1 != 0) break block17;
                                                                        if (v3 == v4) break block18;
                                                                        v3 = var2_2.c();
                                                                        v4 = G.l;
                                                                    }
                                                                    if (v3 == v4) break block18;
                                                                    v5 = var7_6;
                                                                    if (var1_1 != 0) break block19;
                                                                    if (v5 == null) break block20;
                                                                    v5 = var4_4;
                                                                    if (var1_1 != 0) break block21;
                                                                    if (v5 == null) break block22;
                                                                    v5 = var7_6;
                                                                }
                                                                if (var1_1 != 0) break block19;
                                                                if (v5.equals(var4_4)) break block20;
                                                            }
                                                            v6 = var8_7 = var2_2.c().h();
                                                            if (var1_1 != 0) ** GOTO lbl41
                                                            if (v6 instanceof B) {
                                                                v6 = var8_7;
lbl41:
                                                                // 2 sources

                                                                v7 = ((B)v6).av();
                                                            } else {
                                                                v7 = net.minecraft.w.d.m;
                                                            }
                                                            var9_8 = v7;
                                                            v8 = var9_8.G();
                                                            if (var1_1 != 0) break block23;
                                                            if (v8) break block24;
                                                            v8 = var9_8.c();
                                                        }
                                                        if (!v8) break block24;
                                                        var6_9 = new h("death.fell.assist.item", new Object[]{this.d.d(), var7_6, var9_8.F()});
                                                        if (var1_1 == 0) break block25;
                                                    }
                                                    var6_9 = new h("death.fell.assist", new Object[]{this.d.d(), var7_6});
                                                }
                                                if (var1_1 == 0) break block26;
                                            }
                                            v5 = var4_4;
                                        }
                                        if (v5 == null) break block27;
                                        v9 = var5_5;
                                        if (var1_1 != 0) ** GOTO lbl65
                                        if (v9 instanceof B) {
                                            v9 = var5_5;
lbl65:
                                            // 2 sources

                                            v10 = ((B)v9).av();
                                        } else {
                                            v10 = net.minecraft.w.d.m;
                                        }
                                        var8_7 = v10;
                                        v11 = var8_7.G();
                                        if (var1_1 != 0) break block28;
                                        if (v11) break block29;
                                        v11 = var8_7.c();
                                    }
                                    if (!v11) break block29;
                                    var6_9 = new h("death.fell.finish.item", new Object[]{this.d.d(), var4_4, var8_7.F()});
                                    if (var1_1 == 0) break block30;
                                }
                                var6_9 = new h("death.fell.finish", new Object[]{this.d.d(), var4_4});
                            }
                            if (var1_1 == 0) break block26;
                        }
                        var6_9 = new h("death.fell.killer", new Object[]{this.d.d()});
                        if (var1_1 == 0) break block26;
                    }
                    var6_9 = new h("death.fell.accident." + this.a(var2_2), new Object[]{this.d.d()});
                }
                if (var1_1 == 0) return var6_9;
            }
            v1 = var3_3;
        }
        v2 = v1.c();
        return v2.c(this.d);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    private D g() {
        block12: {
            var2_1 = null;
            var3_2 = null;
            var4_3 = 0.0f;
            var5_4 = 0.0f;
            var1_6 = v.b();
            for (var6_5 = 0; var6_5 < this.b.size(); ++var6_5) {
                block15: {
                    block16: {
                        block20: {
                            block19: {
                                block18: {
                                    block17: {
                                        block13: {
                                            block14: {
                                                var7_7 = this.b.get(var6_5);
                                                v0 = var6_5;
                                                if (var1_6 != 0) break block12;
                                                var8_8 = v0 > 0 ? this.b.get(var6_5 - 1) : null;
                                                v1 = var7_7;
                                                if (var1_6 != 0) break block13;
                                                if (v1.c() == G.e) break block14;
                                                v1 = var7_7;
                                                if (var1_6 != 0) break block15;
                                                if (v1.c() != G.l) break block16;
                                            }
                                            v1 = var7_7;
                                        }
                                        if (var1_6 != 0) break block15;
                                        if (!(v1.f() > 0.0f)) break block16;
                                        v1 = var2_1;
                                        if (var1_6 != 0) break block17;
                                        if (v1 == null) break block18;
                                        v1 = var7_7;
                                    }
                                    if (var1_6 != 0) break block15;
                                    if (!(v1.f() > var5_4)) break block16;
                                }
                                if (var6_5 <= 0) break block19;
                                var2_1 = var8_8;
                                if (var1_6 == 0) break block20;
                            }
                            var2_1 = var7_7;
                        }
                        var5_4 = var7_7.f();
                    }
                    v1 = var7_7;
                }
                if (var1_6 == 0) {
                    if (v1.a() == null) continue;
                    v1 = var3_2;
                }
                if (var1_6 != 0) ** GOTO lbl51
                if (v1 != null) {
                    v2 = var7_7.b();
                    if (var1_6 == 0) {
                        if (!(v2 > var4_3)) continue;
                    }
                } else {
                    var3_2 = var7_7;
                    v1 = var7_7;
lbl51:
                    // 2 sources

                    v2 = v1.b();
                }
                var4_3 = v2;
                if (var1_6 == 0) continue;
            }
            v0 = (cfr_temp_0 = var5_4 - 5.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        }
        if (var1_6 == 0) {
            if (v0 > 0) {
                v3 = var2_1;
                if (var1_6 != 0) return v3;
                if (v3 != null) {
                    v3 = var2_1;
                    return v3;
                }
            }
            v0 = (cfr_temp_1 = var4_3 - 5.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
        }
        if (v0 <= 0) return null;
        v4 = var3_2;
        if (var1_6 != 0) return v4;
        if (v4 == null) return null;
        v4 = var3_2;
        return v4;
    }

    private void d() {
        this.f = null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public s(B b10) {
        this.b = Lists.newArrayList();
        this.d = b10;
    }

    public void c() {
        block12: {
            block13: {
                s s2;
                boolean bl2;
                block7: {
                    int n2;
                    block8: {
                        block11: {
                            K k2;
                            K k3;
                            block9: {
                                K k4;
                                block10: {
                                    int n3 = v.b();
                                    this.d();
                                    n2 = n3;
                                    bl2 = this.d.s();
                                    if (n2 != 0) break block7;
                                    if (!bl2) break block8;
                                    k3 = k4 = this.d.aG.d(new n(this.d.a, this.d.m().b, this.d.ax)).b();
                                    k2 = net.minecraft.u.g.cD;
                                    if (n2 != 0) break block9;
                                    if (k3 != k2) break block10;
                                    this.f = "ladder";
                                    if (n2 == 0) break block11;
                                }
                                k3 = k4;
                                k2 = net.minecraft.u.g.aW;
                            }
                            if (k3 == k2) {
                                this.f = "vines";
                            }
                        }
                        if (n2 == 0) break block12;
                    }
                    s2 = this;
                    if (n2 != 0) break block13;
                    bl2 = s2.d.aj();
                }
                if (!bl2) break block12;
                s2 = this;
            }
            s2.f = "water";
        }
    }

    public void a(G g10, float f10, float f11) {
        block3: {
            B b10;
            block5: {
                boolean bl2;
                block4: {
                    int n2;
                    block2: {
                        int n3 = v.b();
                        this.f();
                        this.c();
                        n2 = n3;
                        D d10 = new D(g10, this.d.H, f10, f11, this.f, this.d.an);
                        this.b.add(d10);
                        this.a = this.d.H;
                        this.h = true;
                        bl2 = d10.d();
                        if (n2 != 0) break block2;
                        if (!bl2) break block3;
                        bl2 = this.e;
                    }
                    if (n2 != 0) break block4;
                    if (bl2) break block3;
                    b10 = this.d;
                    if (n2 != 0) break block5;
                    bl2 = b10.aL();
                }
                if (!bl2) break block3;
                this.e = true;
                this.c = this.g = this.d.H;
                b10 = this.d;
            }
            b10.d();
        }
    }

    public void f() {
        block7: {
            int n2;
            int n3;
            block8: {
                block9: {
                    int n4;
                    block6: {
                        n3 = v.d();
                        int n5 = this.e;
                        if (n3 != 0) {
                            n5 = n5 != 0 ? 300 : 100;
                        }
                        n4 = n5;
                        n2 = this.h;
                        if (n3 == 0) break block6;
                        if (n2 == 0) break block7;
                        n2 = this.d.aL();
                    }
                    if (n3 == 0) break block8;
                    if (n2 == 0) break block9;
                    n2 = this.d.H - this.a;
                    if (n3 == 0) break block8;
                    if (n2 <= n4) break block7;
                }
                n2 = this.e;
            }
            int n6 = n2;
            this.h = false;
            this.e = false;
            s s2 = this;
            if (n3 != 0) {
                s2.c = this.d.H;
                if (n6 != 0) {
                    this.d.O();
                }
                s2 = this;
            }
            s2.b.clear();
        }
    }

    @Nullable
    public B e() {
        B b10;
        block19: {
            B b11;
            block20: {
                int n2;
                B b12;
                block11: {
                    b11 = null;
                    b12 = null;
                    int n3 = v.d();
                    float f10 = 0.0f;
                    float f11 = 0.0f;
                    for (D d10 : this.b) {
                        block16: {
                            float f12;
                            B b13;
                            block18: {
                                block17: {
                                    int n4;
                                    block12: {
                                        block13: {
                                            B b14;
                                            block14: {
                                                block15: {
                                                    n2 = d10.c().h() instanceof j;
                                                    if (n3 == 0) break block11;
                                                    if (n3 == 0) break block12;
                                                    if (n2 == 0) break block13;
                                                    b14 = b12;
                                                    if (n3 == 0) break block14;
                                                    if (b14 == null) break block15;
                                                    float f13 = d10.b() - f11;
                                                    n4 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                                    if (n3 == 0) break block12;
                                                    if (n4 <= 0) break block13;
                                                }
                                                f11 = d10.b();
                                                b14 = (j)d10.c().h();
                                            }
                                            b12 = b14;
                                        }
                                        n4 = d10.c().h() instanceof B;
                                    }
                                    if (n4 == false) break block16;
                                    b13 = b11;
                                    if (n3 == 0) break block16;
                                    if (b13 == null) break block17;
                                    f12 = d10.b();
                                    if (n3 == 0) break block18;
                                    if (!(f12 > f10)) break block16;
                                }
                                f12 = d10.b();
                            }
                            f10 = f12;
                            b13 = b11 = (B)d10.c().h();
                        }
                        if (n3 != 0) continue;
                    }
                    b10 = b12;
                    if (n3 == 0) break block19;
                    if (b10 == null) break block20;
                    float f14 = f11 - f10 / 3.0f;
                    n2 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                }
                if (n2 >= 0) {
                    return b12;
                }
            }
            b10 = b11;
        }
        return b10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String a(D d10) {
        int n2 = v.d();
        D d11 = d10;
        if (n2 != 0) {
            if (d11.a() == null) {
                return "generic";
            }
            d11 = d10;
        }
        String string = d11.a();
        return string;
    }

    public B a() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int b() {
        int n2;
        int n3 = v.b();
        int n4 = this.e;
        if (n3 == 0) {
            if (n4 != 0) {
                n2 = this.d.H - this.g;
                return n2;
            }
            n4 = this.c;
        }
        n2 = n4 - this.g;
        return n2;
    }
}

