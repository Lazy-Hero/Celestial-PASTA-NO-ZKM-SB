/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.T.aX;
import net.minecraft.ag.W;
import net.minecraft.ak.h;

public class E
extends h {
    private final /* synthetic */ aX d;
    private /* synthetic */ W c;
    private /* synthetic */ int e;

    @Override
    public boolean c() {
        E e10;
        block6: {
            int n2;
            block5: {
                String string = h.h();
                n2 = this.d.aG.R();
                if (string != null) break block5;
                if (n2 == 0) {
                    return false;
                }
                e10 = this;
                if (string != null) break block6;
                n2 = e10.d.f().nextInt(8000);
            }
            if (n2 != 0) {
                return false;
            }
            this.c = (W)((Object)this.d.aG.a(W.class, this.d.m().a(6.0, 2.0, 6.0), this.d));
            e10 = this;
        }
        return e10.c != null;
    }

    @Override
    public void b() {
        this.d.I().a(this.c, 30.0f, 30.0f);
        --this.e;
    }

    public E(aX aX2) {
        this.d = aX2;
        this.a(3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.e;
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public void a() {
        this.e = 400;
        this.d.a(true);
    }

    @Override
    public void g() {
        this.d.a(false);
        this.c = null;
    }
}

