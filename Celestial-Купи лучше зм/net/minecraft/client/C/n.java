/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.B.X;
import net.minecraft.client.C.b;
import net.minecraft.client.C.m;
import net.minecraft.client.r.s;

public class n
extends m<net.minecraft.client.w.n> {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(net.minecraft.client.w.n var1_1, X var2_2) {
        v0 = m.d();
        this.a(var1_1);
        var3_3 = v0;
        if (var3_3) ** GOTO lbl9
        switch (net.minecraft.client.C.b.a[var2_2.ordinal()]) {
            case 1: {
                var1_1.n.q = true;
                var1_1.q.q = true;
lbl9:
                // 2 sources

                if (var3_3 == false) return;
            }
            case 2: {
                var1_1.j.q = true;
                var1_1.o.q = true;
                var1_1.k.q = true;
                if (var3_3 == false) return;
            }
            case 3: {
                var1_1.j.q = true;
                var1_1.i.q = true;
                var1_1.m.q = true;
                if (var3_3 == false) return;
            }
            case 4: {
                var1_1.i.q = true;
                var1_1.m.q = true;
                return;
            }
        }
    }

    public n(s<?> s2) {
        super(s2);
    }

    @Override
    protected void a() {
        this.g = new net.minecraft.client.w.n(0.5f);
        this.c = new net.minecraft.client.w.n(1.0f);
    }

    protected void a(net.minecraft.client.w.n n2) {
        n2.a(false);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

