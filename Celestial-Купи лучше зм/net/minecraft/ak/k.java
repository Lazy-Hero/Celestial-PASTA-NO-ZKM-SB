/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.O;
import net.minecraft.ak.h;

public class k
extends h {
    private final /* synthetic */ float e;
    private final /* synthetic */ double l;
    private /* synthetic */ int c;
    private /* synthetic */ B h;
    private final /* synthetic */ float i;
    private final /* synthetic */ int g;
    private final /* synthetic */ int k;
    private final /* synthetic */ O j;
    private /* synthetic */ int d;
    private final /* synthetic */ C f;

    @Override
    public void b() {
        block18: {
            float f10;
            int n2;
            double d10;
            block16: {
                block17: {
                    String string;
                    boolean bl2;
                    block14: {
                        double d11;
                        block15: {
                            double d12;
                            block13: {
                                block12: {
                                    block11: {
                                        d10 = this.f.a(this.h.a, this.h.m().b, this.h.ax);
                                        bl2 = this.f.v().a(this.h);
                                        string = net.minecraft.ak.h.h();
                                        if (string != null) break block11;
                                        if (!bl2) break block12;
                                        ++this.d;
                                    }
                                    if (string == null) break block13;
                                }
                                this.d = 0;
                            }
                            d11 = (d12 = d10 - (double)this.i) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                            if (string != null) break block14;
                            if (d11 > 0) break block15;
                            d11 = this.d;
                            if (string != null) break block14;
                            if (d11 < 20) break block15;
                            this.f.l().f();
                            if (string == null) break block14;
                        }
                        d11 = (double)this.f.l().a(this.h, this.l);
                    }
                    this.f.I().a(this.h, 30.0f, 30.0f);
                    n2 = this.c = this.c - 1;
                    if (string != null) break block16;
                    if (n2 != 0) break block17;
                    if (!bl2) {
                        return;
                    }
                    f10 = net.minecraft.k.h.e(d10) / this.e;
                    float f11 = net.minecraft.k.h.c(f10, 0.1f, 1.0f);
                    this.j.a(this.h, f11);
                    this.c = net.minecraft.k.h.d(f10 * (float)(this.g - this.k) + (float)this.k);
                    if (string == null) break block18;
                }
                n2 = this.c;
            }
            if (n2 < 0) {
                f10 = net.minecraft.k.h.e(d10) / this.e;
                this.c = net.minecraft.k.h.d(f10 * (float)(this.g - this.k) + (float)this.k);
            }
        }
    }

    public k(O o2, double d10, int n2, float f10) {
        this(o2, d10, n2, n2, f10);
    }

    @Override
    public void g() {
        this.h = null;
        this.d = 0;
        this.c = -1;
    }

    public k(O o2, double d10, int n2, int n3, float f10) {
        String string = net.minecraft.ak.h.h();
        String string2 = string;
        this.c = -1;
        if (string2 == null) {
            if (!(o2 instanceof B)) {
                throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
            }
            this.j = o2;
            this.f = (C)((Object)o2);
            this.l = d10;
            this.k = n2;
            this.g = n3;
            this.e = f10;
            this.i = f10 * f10;
            this.a(3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.c();
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = this.f.l().o();
        if (string != null) return bl2;
        if (bl2) return false;
        return true;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public boolean c() {
        B b10 = this.f.J();
        String string = net.minecraft.ak.h.h();
        if (string == null) {
            if (b10 == null) {
                return false;
            }
            this.h = b10;
        }
        return true;
    }
}

