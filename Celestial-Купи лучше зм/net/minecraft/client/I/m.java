/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.B.a;
import net.minecraft.B.t;
import net.minecraft.N.M;
import net.minecraft.client.I.g;
import net.minecraft.client.I.v;
import net.minecraft.i.h;

public class m
extends g {
    private final /* synthetic */ h ac;
    private static final /* synthetic */ net.minecraft.ar.v ab;
    private final /* synthetic */ a aa;

    private int b(int n2) {
        int n3 = this.aa.c(1);
        int[] arrn = net.minecraft.client.I.v.a();
        int n4 = n3;
        if (arrn == null) {
            if (n4 == 0) {
                n3 = 200;
            }
            n4 = this.aa.c(0) * n2 / n3;
        }
        return n4;
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        int n4;
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(ab);
        int n5 = (h - this.M) / 2;
        int n6 = (w - this.F) / 2;
        int[] arrn = net.minecraft.client.I.v.a();
        this.a(n5, n6, 0, 0, this.M, this.F);
        int[] arrn2 = arrn;
        int n7 = net.minecraft.N.M.a(this.aa);
        if (arrn2 == null) {
            if (n7 != 0) {
                n4 = this.b(13);
                this.a(n5 + 56, n6 + 36 + 12 - n4, 176, 12 - n4, 14, n4 + 1);
            }
            n7 = this.a(24);
        }
        n4 = n7;
        this.a(n5 + 79, n6 + 34, 176, 14, n4 + 1, 16);
    }

    public m(h h2, a a10) {
        super(new t(h2, a10));
        this.ac = h2;
        this.aa = a10;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }

    static {
        ab = new net.minecraft.ar.v("textures/gui/container/furnace.png");
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.aa.d().f();
        this.v.b(string, this.M / 2 - this.v.e(string) / 2, 6.0f, 0x404040);
        this.v.b(this.ac.d().f(), 8.0f, this.F - 96 + 2, 0x404040);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n2) {
        int n3 = this.aa.c(2);
        int n4 = this.aa.c(3);
        int[] arrn = net.minecraft.client.I.v.a();
        int n5 = n4;
        if (arrn == null) {
            if (n5 == 0) return 0;
            n5 = n3;
        }
        if (arrn != null) return n5;
        if (n5 == 0) return 0;
        n5 = n3 * n2 / n4;
        return n5;
    }
}

