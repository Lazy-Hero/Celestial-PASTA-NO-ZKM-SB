/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.ac.c;
import net.minecraft.ag.C;
import net.minecraft.ag.X;
import net.minecraft.ag.Z;
import net.minecraft.ag.u;

public enum k {
    MONSTER(net.minecraft.T.k.class, 70, net.minecraft.ac.c.A, false, false),
    CREATURE(C.class, 10, net.minecraft.ac.c.A, true, true),
    AMBIENT(X.class, 15, net.minecraft.ac.c.A, true, false),
    WATER_CREATURE(Z.class, 5, net.minecraft.ac.c.L, true, false);

    private final /* synthetic */ c c;
    private final /* synthetic */ boolean a;
    private final /* synthetic */ Class<? extends u> b;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ int d;

    private k(Class<? extends u> class_, int n3, c c10, boolean bl2, boolean bl3) {
        this.b = class_;
        this.d = n3;
        this.c = c10;
        this.e = bl2;
        this.a = bl3;
    }

    public boolean c() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    public boolean d() {
        return this.a;
    }

    public Class<? extends u> a() {
        return this.b;
    }
}

