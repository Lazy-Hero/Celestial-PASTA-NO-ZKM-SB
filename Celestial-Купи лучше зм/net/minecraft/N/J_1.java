/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.ah.l;
import net.minecraft.ah.x;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.k.m;

public abstract class J
extends y
implements l {
    private /* synthetic */ x i;

    @Override
    public r a(r r2) {
        m[] arrm = j.f();
        r r3 = super.a(r2);
        if (arrm == null) {
            if (this.i != null) {
                this.i.b(r2);
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public k d() {
        return this.g() ? new g(this.g()) : new h(this.g(), new Object[0]);
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        m[] arrm = j.f();
        x x2 = this.i;
        if (arrm == null) {
            if (x2 == null) return false;
            x2 = this.i;
        }
        boolean bl2 = x2.a();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.i = x.a(r2);
    }

    @Override
    public x a() {
        return this.i;
    }

    @Override
    public void a(x x2) {
        this.i = x2;
    }

    public J() {
        this.i = x.a;
    }
}

