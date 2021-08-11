/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import java.util.List;
import net.minecraft.U.C;
import net.minecraft.ak.aD;
import net.minecraft.ak.ao;
import net.minecraft.ak.h;
import net.minecraft.e.a;
import net.minecraft.e.i;
import net.minecraft.e.j;
import net.minecraft.e.k;

public class w
extends h {
    private final /* synthetic */ Predicate<C> h;
    private final /* synthetic */ float c;
    private /* synthetic */ float f;
    private /* synthetic */ C g;
    private final /* synthetic */ double e;
    private final /* synthetic */ i d;
    private /* synthetic */ int j;
    private final /* synthetic */ C i;
    private final /* synthetic */ float k;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public w(C c10, double d10, float f10, float f11) {
        block5: {
            boolean bl2;
            block4: {
                this.i = c10;
                this.h = new aD(this, c10);
                this.e = d10;
                this.d = c10.l();
                String string = net.minecraft.ak.h.h();
                this.c = f10;
                this.k = f11;
                this.a(3);
                bl2 = c10.l() instanceof k;
                if (string != null) break block4;
                if (bl2) break block5;
                bl2 = c10.l() instanceof j;
            }
            if (!bl2) {
                throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
            }
        }
    }

    @Override
    public void b() {
        block3: {
            double d10;
            double d11;
            block8: {
                block9: {
                    double d12;
                    block11: {
                        ao ao2;
                        String string;
                        block10: {
                            double d13;
                            block6: {
                                block7: {
                                    int n2;
                                    block5: {
                                        w w2;
                                        int n3;
                                        block4: {
                                            C c10;
                                            block2: {
                                                string = net.minecraft.ak.h.h();
                                                c10 = this.g;
                                                if (string != null) break block2;
                                                if (c10 == null) break block3;
                                                c10 = this.i;
                                            }
                                            n3 = c10.O();
                                            if (string != null) break block4;
                                            if (n3 != 0) break block3;
                                            this.i.I().a(this.g, 10.0f, (float)this.i.j());
                                            w w3 = this;
                                            w2 = w3;
                                            n2 = w3.j - 1;
                                            if (string != null) break block5;
                                            n3 = w2.j = n2;
                                        }
                                        if (n3 > 0) break block3;
                                        w2 = this;
                                        n2 = 10;
                                    }
                                    w2.j = n2;
                                    double d14 = this.i.a - this.g.a;
                                    double d15 = this.i.aF - this.g.aF;
                                    double d16 = this.i.ax - this.g.ax;
                                    d13 = d14 * d14 + d15 * d15 + d16 * d16;
                                    if (string != null) break block6;
                                    if (!(d13 > (double)(this.c * this.c))) break block7;
                                    this.d.a(this.g, this.e);
                                    if (string == null) break block3;
                                }
                                this.d.f();
                            }
                            ao2 = this.g.I();
                            d11 = d13;
                            d10 = this.c;
                            if (string != null) break block8;
                            if (d11 <= d10) break block9;
                            double d17 = ao2.a() - this.i.a;
                            d12 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                            if (string != null) break block10;
                            if (d12 != false) break block3;
                            double d18 = ao2.b() - this.i.aF;
                            d12 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                        }
                        if (string != null) break block11;
                        if (d12 != false) break block3;
                        d11 = ao2.d();
                        d10 = this.i.ax;
                        if (string != null) break block8;
                        double d19 = d11 - d10;
                        d12 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                    }
                    if (d12 != false) break block3;
                }
                d11 = this.g.a;
                d10 = this.i.a;
            }
            double d20 = d11 - d10;
            double d21 = this.g.ax - this.i.ax;
            this.d.a(this.i.a - d20, this.i.aF, this.i.ax - d21, this.e);
        }
    }

    @Override
    public boolean c() {
        boolean bl2;
        block3: {
            block4: {
                List<C> list = this.i.aG.a(C.class, this.i.m().a(this.k), this.h);
                String string = net.minecraft.ak.h.h();
                bl2 = list.isEmpty();
                if (string != null) break block3;
                if (bl2) break block4;
                for (C c10 : list) {
                    block6: {
                        boolean bl3;
                        block5: {
                            bl2 = c10.a3();
                            if (string != null) break block3;
                            if (string != null) break block5;
                            if (bl2) break block6;
                            this.g = c10;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    if (string == null) continue;
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        w w2 = this;
        if (string == null) {
            if (w2.g == null) return 0 != 0;
            w2 = this;
        }
        int n2 = w2.d.o();
        if (string == null) {
            if (n2 != 0) return 0 != 0;
            double d10 = this.i.s(this.g) - (double)(this.c * this.c);
            n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        }
        if (string != null) return n2 != 0;
        if (n2 <= 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void a() {
        this.j = 0;
        this.f = this.i.a(a.WATER);
        this.i.a(a.WATER, 0.0f);
    }

    @Override
    public void g() {
        this.g = null;
        this.d.f();
        this.i.a(a.WATER, this.f);
    }
}

