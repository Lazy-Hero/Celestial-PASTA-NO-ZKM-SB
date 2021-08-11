/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.W.bn;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class A
extends y {
    private /* synthetic */ bl i;

    public boolean b() {
        return bn.a(this.m());
    }

    @Override
    public r r() {
        return this.a(new r());
    }

    public A() {
        this.i = bl.RED;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(bl bl2) {
        this.i = bl2;
        this.b();
    }

    @Override
    public void c(r r2) {
        block3: {
            r r3;
            block2: {
                m[] arrm = j.f();
                A a10 = this;
                r3 = r2;
                if (arrm != null) break block2;
                super.c(r3);
                if (!r2.b("color")) break block3;
                a10 = this;
                r3 = r2;
            }
            a10.i = bl.c(r3.m("color"));
        }
    }

    public d c() {
        return new d(h.bl, 1, this.i.e());
    }

    @Override
    public r a(r r2) {
        super.a(r2);
        r2.b("color", this.i.e());
        return r2;
    }

    public void a(d d10) {
        this.a(bl.c(d10.d()));
    }

    @Override
    public ag k() {
        return new ag(this.d, 11, this.r());
    }

    public bl a() {
        return this.i;
    }
}

