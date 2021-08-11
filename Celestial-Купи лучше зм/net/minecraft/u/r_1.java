/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.U;

import javax.annotation.Nullable;
import net.minecraft.B.C;
import net.minecraft.U.M;
import net.minecraft.U.e;
import net.minecraft.ah.z;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.d;
import net.minecraft.y.a;
import net.minecraft.y.b;

public class r
implements e {
    private final /* synthetic */ k c;
    private final /* synthetic */ C d;
    private final /* synthetic */ j b;
    private /* synthetic */ a a;

    @Override
    public void b(@Nullable j j2) {
    }

    @Override
    public void a(@Nullable a a10) {
        this.a = a10;
    }

    public r(j j2, k k2) {
        this.b = j2;
        this.c = k2;
        this.d = new C(j2, this);
    }

    @Override
    public k d() {
        int[] arrn = M.b();
        k k2 = this.c;
        if (arrn != null) {
            k2 = k2 != null ? this.c : new h("entity.Villager.name", new Object[0]);
        }
        return k2;
    }

    @Override
    public void a(b b10) {
        b10.h();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public n a() {
        return new n(this.b);
    }

    @Override
    @Nullable
    public j b() {
        return this.b;
    }

    @Override
    public void a(d d10) {
    }

    @Override
    public z c() {
        return this.b.aG;
    }

    @Override
    @Nullable
    public a a(j j2) {
        return this.a;
    }
}

