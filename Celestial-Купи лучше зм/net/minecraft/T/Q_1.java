/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aC;
import net.minecraft.T.at;
import net.minecraft.ak.h;

public class Q
extends h {
    final /* synthetic */ at c;

    @Override
    public boolean c() {
        int[] arrn = S.f();
        boolean bl2 = this.c.a();
        if (arrn != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public void b() {
        block3: {
            at at2;
            block2: {
                int[] arrn = S.f();
                at2 = this.c;
                if (arrn == null) break block2;
                if (at2.J() == null) break block3;
                at2 = this.c;
            }
            at2.I().a(this.c.J(), (float)this.c.p(), (float)this.c.j());
        }
    }

    @Override
    public void a() {
        super.a();
        at.a(this.c).f();
    }

    @Override
    public void g() {
        super.g();
        this.c.a(aC.NONE);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public Q(at at2) {
        this.c = at2;
        this.a(3);
    }
}

