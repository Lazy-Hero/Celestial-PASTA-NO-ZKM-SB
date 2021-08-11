/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import javax.annotation.Nullable;
import net.minecraft.N.j;
import net.minecraft.N.p;
import net.minecraft.N.q;
import net.minecraft.N.t;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.ar.ao;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.k.m;

public class T
extends y
implements ao {
    private final /* synthetic */ p i;

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 1, this.r());
    }

    @Override
    public boolean n() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = j.f();
        boolean bl2 = this.i.b(n2);
        if (arrm != null) return bl2;
        if (bl2) return true;
        bl2 = super.a(n2, n3);
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.i.a(r2);
    }

    @Override
    public void c() {
        this.i.f();
    }

    @Override
    public r a(r r2) {
        super.a(r2);
        this.i.b(r2);
        return r2;
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.BLOCK_ENTITY, (g)new t());
    }

    public T() {
        this.i = new q(this);
    }

    @Override
    public r r() {
        r r2 = this.a(new r());
        r2.k("SpawnPotentials");
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p a() {
        return this.i;
    }
}

