/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.aS;
import net.minecraft.U.x;
import net.minecraft.ar.b;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.n;
import net.minecraft.k.h;

public class t
extends n {
    protected /* synthetic */ c t;
    protected /* synthetic */ c s;

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block2: {
            block3: {
                block4: {
                    super.a(f10, f11, f12, f13, f14, f15, x2);
                    aS aS2 = (aS)x2;
                    int[] arrn = net.minecraft.client.w.j.b();
                    if (arrn != null) break block2;
                    if (!aS2.f()) break block3;
                    if (aS2.al() != net.minecraft.ar.b.RIGHT) break block4;
                    this.o.y = 3.7699115f;
                    if (arrn == null) break block3;
                }
                this.k.y = 3.7699115f;
            }
            this.i.y += 0.62831855f;
            this.s.u = 2.0f;
            this.t.u = 2.0f;
            this.s.h = 1.0f;
            this.t.h = 1.0f;
            this.s.e = 0.47123894f + net.minecraft.k.h.c(f12 * 0.8f) * (float)Math.PI * 0.05f;
            this.t.e = -this.s.e;
            this.t.r = -0.47123894f;
            this.t.y = 0.47123894f;
            this.s.y = 0.47123894f;
            this.s.r = 0.47123894f;
        }
    }

    public t(float f10) {
        super(f10, 0.0f, 64, 64);
        this.m.q = false;
        this.q.q = false;
        this.i = new c(this, 32, 0);
        this.i.b(-1.0f, -1.0f, -2.0f, 6, 10, 4, 0.0f);
        this.i.a(-1.9f, 12.0f, 0.0f);
        this.s = new c(this, 0, 32);
        this.s.a(-20.0f, 0.0f, 0.0f, 20, 12, 1);
        this.t = new c(this, 0, 32);
        this.t.A = true;
        this.t.a(0.0f, 0.0f, 0.0f, 20, 12, 1);
    }

    public int a() {
        return 23;
    }

    public t() {
        this(0.0f);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        super.b(x2, f10, f11, f12, f13, f14, f15);
        this.s.b(f15);
        this.t.b(f15);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

