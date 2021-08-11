/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.A.c;
import net.minecraft.V.a;
import net.minecraft.aA.o;
import net.minecraft.aA.v;
import net.minecraft.ah.G;
import net.minecraft.ah.p;
import net.minecraft.ah.y;
import net.minecraft.ah.z;
import net.minecraft.k.l;
import net.minecraft.u.d;

public class I
extends G {
    @Override
    public void d() {
        this.h = new c(net.minecraft.u.d.R);
        this.a = true;
        this.d = true;
    }

    @Override
    public boolean a(int n2, int n3) {
        return false;
    }

    @Override
    public boolean b(int n2, int n3) {
        return true;
    }

    @Override
    public p r() {
        return p.NETHER;
    }

    @Override
    public a m() {
        return new y(this);
    }

    @Override
    public float a(long l2, float f10) {
        return 0.5f;
    }

    @Override
    public v o() {
        return new o(this.e, this.e.b().D(), this.e.C());
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    protected void g() {
        float f10 = 0.1f;
        String string = z.I();
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f11 = 1.0f - (float)i2 / 15.0f;
            this.f[i2] = (1.0f - f11) / (f11 * 3.0f + 1.0f) * 0.9f + 0.1f;
            if (string != null) continue;
        }
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public l a(float f10, float f11) {
        return new l(0.2f, 0.03f, 0.03f);
    }
}

