/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.B;

import com.google.common.collect.Lists;
import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.l;
import net.minecraft.B.m;
import net.minecraft.B.n;
import net.minecraft.az.k;
import net.minecraft.az.t;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class P
extends D {
    private final /* synthetic */ j g;
    private /* synthetic */ int h;
    private final /* synthetic */ m f;

    @Override
    protected void b(d d10) {
        block4: {
            k k2;
            k k3;
            l l2;
            block3: {
                int n2 = n.c();
                P p2 = this;
                if (n2 == 0) {
                    if (p2.h > 0) {
                        d10.a(this.g.aG, this.g, this.h);
                    }
                    this.h = 0;
                    p2 = this;
                }
                l2 = (l)p2.c;
                k2 = k3 = l2.a();
                if (n2 != 0) break block3;
                if (k2 == null) break block4;
                k2 = k3;
            }
            if (!k2.b()) {
                this.g.b(Lists.newArrayList((Object[])new k[]{k3}));
                l2.a((k)null);
            }
        }
    }

    @Override
    public d b(int n2) {
        int n3 = n.c();
        P p2 = this;
        if (n3 == 0) {
            if (p2.b()) {
                this.h += Math.min(n2, this.d().t());
            }
            p2 = this;
        }
        return super.b(n2);
    }

    @Override
    public boolean d(d d10) {
        return false;
    }

    @Override
    protected void a(int n2) {
        this.h += n2;
    }

    public P(j j2, m m2, a a10, int n2, int n3, int n4) {
        super(a10, n2, n3, n4);
        this.g = j2;
        this.f = m2;
    }

    @Override
    protected void a(d d10, int n2) {
        this.h += n2;
        this.b(d10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d a(j var1_1, d var2_2) {
        v0 = n.c();
        this.b(var2_2);
        var3_3 = v0;
        var4_4 = t.c(this.f, var1_1.aG);
        for (var5_5 = 0; var5_5 < var4_4.size(); ++var5_5) {
            block14: {
                block12: {
                    block13: {
                        var6_6 = this.f.a(var5_5);
                        var7_7 = var4_4.get(var5_5);
                        v1 = var6_6;
                        if (var3_3 != 0) return v1;
                        v2 = v1.G();
                        if (var3_3 == 0) {
                            if (!v2) {
                                this.f.a(var5_5, 1);
                                var6_6 = this.f.a(var5_5);
                            }
                            v2 = var7_7.G();
                        }
                        if (var3_3 == 0) {
                            if (v2) continue;
                            v2 = var6_6.G();
                        }
                        if (var3_3 == 0) {
                            if (v2) {
                                this.f.a(var5_5, var7_7);
                                if (var3_3 == 0) continue;
                            }
                            v2 = net.minecraft.w.d.c(var6_6, var7_7);
                        }
                        if (var3_3 != 0) break block12;
                        if (!v2) break block13;
                        v2 = net.minecraft.w.d.b(var6_6, var7_7);
                        if (var3_3 == 0) {
                            if (v2) {
                                var7_7.g(var6_6.t());
                                this.f.a(var5_5, var7_7);
                                if (var3_3 == 0) continue;
                            } else {
                                ** GOTO lbl34
                            }
                        }
                        break block12;
                    }
                    v3 = this.g;
                    if (var3_3 != 0) break block14;
                    v2 = v3.cB.b(var7_7);
                }
                if (v2) continue;
                v3 = this.g;
            }
            v3.a(var7_7, false);
            if (var3_3 == 0) continue;
        }
        v1 = var2_2;
        return v1;
    }
}

