/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.C;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ak.h;
import net.minecraft.e.k;
import net.minecraft.k.n;

public abstract class p
extends h {
    protected /* synthetic */ C e;
    /* synthetic */ float g;
    protected /* synthetic */ aB h;
    /* synthetic */ boolean d;
    /* synthetic */ float f;
    protected /* synthetic */ n c;

    private aB a(n n2) {
        i i2 = this.e.aG.d(n2);
        K k2 = i2.b();
        return k2 instanceof aB && i2.o() == net.minecraft.ac.c.k ? (aB)k2 : null;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public p(C c10) {
        this.c = n.o;
        this.e = c10;
        if (!(c10.l() instanceof k)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        var1_1 = net.minecraft.ak.h.h();
        v0 = this.e;
        if (var1_1 == null) {
            if (!v0.aE) {
                return false;
            }
            v0 = this.e;
        }
        var2_2 = (k)v0.l();
        v1 = var3_3 = var2_2.k();
        if (var1_1 == null) {
            if (v1 == null) return false;
            v1 = var3_3;
        }
        v2 = v1.h();
        if (var1_1 != null) return v2;
        if (v2 != false) return false;
        v2 = var2_2.c();
        if (var1_1 != null) return v2;
        if (v2 == false) return false;
        var4_4 = 0;
        while (var4_4 < Math.min(var3_3.a() + 2, var3_3.f())) {
            var5_5 = var3_3.b(var4_4);
            this.c = new n(var5_5.g, var5_5.m + 1, var5_5.f);
            if (var1_1 == null) {
                cfr_temp_0 = this.e.a((double)this.c.e(), this.e.aF, (double)this.c.a()) - 2.25;
                v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                if (var1_1 != null) return (boolean)v3;
                if (v3 <= 0) {
                    this.h = this.a(this.c);
                    if (var1_1 == null) {
                        if (this.h != null) {
                            return true;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    ++var4_4;
                }
            }
            if (var1_1 == null) continue;
        }
        this.c = new n(this.e).a();
        this.h = this.a(this.c);
        if (this.h == null) return (boolean)0;
        return (boolean)1;
    }

    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.d;
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public void b() {
        block0: {
            float f10;
            float f11 = (float)((double)((float)this.c.e() + 0.5f) - this.e.a);
            float f12 = this.g * f11 + this.f * (f10 = (float)((double)((float)this.c.a() + 0.5f) - this.e.ax));
            if (!(f12 < 0.0f)) break block0;
            this.d = true;
        }
    }

    @Override
    public void a() {
        this.d = false;
        this.g = (float)((double)((float)this.c.e() + 0.5f) - this.e.a);
        this.f = (float)((double)((float)this.c.a() + 0.5f) - this.e.ax);
    }
}

