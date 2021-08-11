/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.C;
import net.minecraft.ak.h;

public class F
extends h {
    private /* synthetic */ double d;
    private final /* synthetic */ C e;
    private /* synthetic */ double f;
    private /* synthetic */ int c;

    @Override
    public boolean c() {
        String string = h.h();
        float f10 = this.e.f().nextFloat() - 0.02f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (string == null) {
            f11 = f11 < 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public F(C c10) {
        this.e = c10;
        this.a(3);
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.c;
        if (string == null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    @Override
    public void a() {
        double d10 = Math.PI * 2 * this.e.f().nextDouble();
        this.d = Math.cos(d10);
        this.f = Math.sin(d10);
        this.c = 20 + this.e.f().nextInt(20);
    }

    @Override
    public void b() {
        --this.c;
        this.e.I().a(this.e.a + this.d, this.e.aF + (double)this.e.l(), this.e.ax + this.f, this.e.p(), this.e.j());
    }
}

