/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.aj;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.ah.A;
import net.minecraft.aj.h;
import net.minecraft.aj.i;
import net.minecraft.aj.j;
import net.minecraft.aj.t;
import net.minecraft.ar.G;
import net.minecraft.k.m;

public class k {
    private final /* synthetic */ A c;
    private final /* synthetic */ Set<i> b;
    private final /* synthetic */ h f;
    @Nullable
    private final /* synthetic */ net.minecraft.i.j d;
    @Nullable
    private final /* synthetic */ x a;
    private final /* synthetic */ float g;
    @Nullable
    private final /* synthetic */ G e;

    @Nullable
    public x a() {
        return this.a;
    }

    public void a(i i2) {
        this.b.remove(i2);
    }

    public boolean b(i i2) {
        return this.b.add(i2);
    }

    public k(float f10, A a10, h h2, @Nullable x x2, @Nullable net.minecraft.i.j j2, @Nullable G g10) {
        this.b = Sets.newLinkedHashSet();
        this.g = f10;
        this.c = a10;
        this.f = h2;
        this.a = x2;
        this.d = j2;
        this.e = g10;
    }

    public float d() {
        return this.g;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public x b() {
        m[] arrm = j.b();
        G g10 = this.e;
        if (arrm != null) {
            if (g10 == null) {
                return null;
            }
            g10 = this.e;
        }
        x x2 = g10.h();
        return x2;
    }

    public h c() {
        return this.f;
    }

    @Nullable
    public x e() {
        return this.d;
    }

    @Nullable
    public x a(t t2) {
        switch (t2) {
            case THIS: {
                return this.a();
            }
            case KILLER: {
                return this.b();
            }
            case KILLER_PLAYER: {
                return this.e();
            }
        }
        return null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

