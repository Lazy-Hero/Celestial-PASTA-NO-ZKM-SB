/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.B.X;
import net.minecraft.T.ay;
import net.minecraft.ag.D;
import net.minecraft.ag.J;
import net.minecraft.ak.h;
import net.minecraft.an.b;
import net.minecraft.ax.T;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class V
extends h {
    private final /* synthetic */ J c;

    private static gP a(gP gP2) {
        return gP2;
    }

    private D a(net.minecraft.ah.h h2) {
        J j2 = new J(this.c.aG);
        j2.a(h2, null);
        j2.g(this.c.a, this.c.aF, this.c.ax);
        j2.Q = 60;
        j2.A();
        j2.u(true);
        j2.l(0);
        j2.aG.f(j2);
        return j2;
    }

    @Override
    public boolean c() {
        return this.c.aG.a(this.c.a, this.c.aF, this.c.ax, 10.0);
    }

    @Override
    public void b() {
        block1: {
            net.minecraft.ah.h h2 = this.c.aG.h(new n(this.c));
            String string = h.h();
            this.c.a(false);
            String string2 = string;
            this.c.u(true);
            this.c.l(0);
            this.c.aG.d(new b(this.c.aG, this.c.a, this.c.aF, this.c.ax, true));
            ay ay2 = this.a(h2, this.c);
            ay2.h(this.c);
            for (int i2 = 0; i2 < 3; ++i2) {
                D d10 = this.a(h2);
                ay ay3 = this.a(h2, d10);
                ay3.h(d10);
                d10.h(this.c.f().nextGaussian() * 0.5, 0.0, this.c.f().nextGaussian() * 0.5);
                if (string2 == null) continue;
            }
            if (m.d()) break block1;
            h.b("mrsEub");
        }
    }

    public V(J j2) {
        this.c = j2;
    }

    private ay a(net.minecraft.ah.h h2, D d10) {
        String string = h.h();
        ay ay2 = new ay(d10.aG);
        ay2.a(h2, null);
        ay2.g(d10.a, d10.aF, d10.ax);
        ay2.Q = 60;
        ay2.A();
        String string2 = string;
        boolean bl2 = ay2.b(X.HEAD).G();
        if (string2 == null) {
            if (bl2) {
                ay2.a(X.HEAD, new d(net.minecraft.u.h.af));
            }
            ay2.a(X.MAINHAND, T.a(ay2.f(), ay2.av(), (int)(5.0f + h2.b() * (float)ay2.f().nextInt(18)), false));
            ay2.a(X.HEAD, T.a(ay2.f(), ay2.b(X.HEAD), (int)(5.0f + h2.b() * (float)ay2.f().nextInt(18)), false));
            bl2 = ay2.aG.f(ay2);
        }
        return ay2;
    }
}

