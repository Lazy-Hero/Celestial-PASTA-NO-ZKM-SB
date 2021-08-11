/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.ar.v;
import net.minecraft.client.e.C;
import net.minecraft.client.e.a;
import net.minecraft.client.e.b;
import net.minecraft.client.e.h;
import net.minecraft.client.e.k;
import net.minecraft.client.e.s;
import net.minecraft.k.m;

class e
implements a<b> {
    final /* synthetic */ v b;
    final /* synthetic */ C c;
    final /* synthetic */ b a;

    @Override
    public b a() {
        k k2 = (k)C.a(this.c).a(this.b);
        m[] arrm = s.b();
        k k3 = k2;
        if (arrm != null) {
            if (k3 == null) {
                return C.a;
            }
            k3 = k2;
        }
        b b10 = k3.a();
        return new b(b10.a().toString(), b10.e() * this.a.e(), b10.g() * this.a.g(), this.a.b(), h.FILE, b10.b() || this.a.b());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    e(C c10, v v2, b b10) {
        this.c = c10;
        this.b = v2;
        this.a = b10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int b() {
        k k2 = (k)C.a(this.c).a(this.b);
        m[] arrm = s.b();
        k k3 = k2;
        if (arrm != null) {
            if (k3 == null) {
                return 0;
            }
            k3 = k2;
        }
        int n2 = k3.b();
        return n2;
    }
}

