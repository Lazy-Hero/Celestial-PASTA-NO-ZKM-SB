/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.D;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;
import net.minecraft.k.n;

public class M
extends h {
    private /* synthetic */ double e;
    private final /* synthetic */ D d;
    private final /* synthetic */ double g;
    private /* synthetic */ double f;
    private /* synthetic */ double c;

    @Override
    public void a() {
        this.d.l().a(this.c, this.e, this.f, this.g);
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.d.l().o();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean c() {
        String string = h.h();
        D d10 = this.d;
        if (string == null) {
            if (d10.e()) {
                return false;
            }
            d10 = this.d;
        }
        n n2 = d10.n();
        l l2 = net.minecraft.ak.g.b(this.d, 16, 7, new l(n2.e(), n2.b(), n2.a()));
        if (string == null) {
            if (l2 == null) {
                return false;
            }
            this.c = l2.e;
            this.e = l2.d;
            this.f = l2.b;
        }
        return true;
    }

    public M(D d10, double d11) {
        this.d = d10;
        this.g = d11;
        this.a(1);
    }
}

