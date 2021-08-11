/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.B.a;
import net.minecraft.B.r;
import net.minecraft.client.I.g;
import net.minecraft.client.a.v;
import net.minecraft.i.h;

public class l
extends g {
    private final /* synthetic */ h ab;
    private static final /* synthetic */ net.minecraft.ar.v aa;
    public /* synthetic */ a ac;

    @Override
    protected void b(int n2, int n3) {
        String string = this.ac.d().f();
        this.v.b(string, this.M / 2 - this.v.e(string) / 2, 6.0f, 0x404040);
        this.v.b(this.ab.d().f(), 8.0f, this.F - 96 + 2, 0x404040);
    }

    public l(h h2, a a10) {
        super(new r(h2, a10));
        this.ab = h2;
        this.ac = a10;
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(aa);
        int n4 = (h - this.M) / 2;
        int n5 = (w - this.F) / 2;
        this.a(n4, n5, 0, 0, this.M, this.F);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }

    static {
        aa = new net.minecraft.ar.v("textures/gui/container/dispenser.png");
    }
}

