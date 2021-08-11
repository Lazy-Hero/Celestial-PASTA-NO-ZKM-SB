/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.B.a;
import net.minecraft.B.u;
import net.minecraft.client.I.g;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.i.h;

public class ay
extends g {
    private final /* synthetic */ a ac;
    private static final /* synthetic */ net.minecraft.ar.v aa;
    private final /* synthetic */ a ab;

    public ay(h h2, a a10) {
        super(new u(h2, a10, Q.P().s));
        this.ab = h2;
        this.ac = a10;
        this.l = false;
        this.F = 133;
    }

    @Override
    protected void b(int n2, int n3) {
        this.v.b(this.ac.d().f(), 8.0f, 6.0f, 0x404040);
        this.v.b(this.ab.d().f(), 8.0f, this.F - 96 + 2, 0x404040);
    }

    static {
        aa = new net.minecraft.ar.v("textures/gui/container/hopper.png");
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(aa);
        int n4 = (h - this.M) / 2;
        int n5 = (w - this.F) / 2;
        this.a(n4, n5, 0, 0, this.M, this.F);
    }
}

