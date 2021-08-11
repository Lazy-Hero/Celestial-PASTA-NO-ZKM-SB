/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ak.h;
import net.minecraft.ar.e;
import net.minecraft.i.j;

public class aa
extends h {
    protected /* synthetic */ x c;
    protected /* synthetic */ float d;
    private /* synthetic */ int e;
    private final /* synthetic */ float f;
    protected /* synthetic */ Class<? extends x> g;
    protected /* synthetic */ C h;

    @Override
    public void a() {
        this.e = 40 + this.h.f().nextInt(40);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public aa(C c10, Class<? extends x> class_, float f10, float f11) {
        this.h = c10;
        this.g = class_;
        this.d = f10;
        this.f = f11;
        this.a(2);
    }

    @Override
    public void g() {
        this.c = null;
    }

    @Override
    public boolean c() {
        block12: {
            block10: {
                aa aa2;
                block11: {
                    String string;
                    block9: {
                        B b10;
                        block8: {
                            string = net.minecraft.ak.h.h();
                            b10 = this.h;
                            if (string != null) break block8;
                            if (b10.f().nextFloat() >= this.f) {
                                return false;
                            }
                            aa2 = this;
                            if (string != null) break block9;
                            b10 = aa2.h.J();
                        }
                        if (b10 != null) {
                            this.c = this.h.J();
                        }
                        aa2 = this;
                    }
                    if (string != null) break block10;
                    if (aa2.g != j.class) break block11;
                    this.c = this.h.aG.a(this.h.a, this.h.aF, this.h.ax, (double)this.d, (Predicate<x>)Predicates.and(net.minecraft.ar.e.e, net.minecraft.ar.e.a(this.h)));
                    if (string == null) break block12;
                }
                aa2 = this;
            }
            aa2.c = this.h.aG.a(this.g, this.h.m().a((double)this.d, 3.0, this.d), this.h);
        }
        return this.c != null;
    }

    @Override
    public void b() {
        this.h.I().a(this.c.a, this.c.aF + (double)this.c.l(), this.c.ax, this.h.p(), this.h.j());
        --this.e;
    }

    public aa(C c10, Class<? extends x> class_, float f10) {
        this.h = c10;
        this.g = class_;
        this.d = f10;
        this.f = 0.02f;
        this.a(2);
    }

    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.c.aL();
        if (string == null) {
            if (!bl2) {
                return false;
            }
            double d10 = this.h.s(this.c) - (double)(this.d * this.d);
            bl2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            if (bl2 > false) {
                return false;
            }
            bl2 = this.e;
        }
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }
}

