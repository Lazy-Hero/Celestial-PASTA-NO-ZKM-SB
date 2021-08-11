/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.B.n;
import net.minecraft.B.q;
import net.minecraft.J.j;
import net.minecraft.J.w;
import net.minecraft.W.az;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aA;
import net.minecraft.av.b;
import net.minecraft.i.h;
import net.minecraft.u.g;
import net.minecraft.w.k;

public class x
extends w {
    public static void b(b b10) {
        net.minecraft.J.w.b(b10, x.class);
    }

    @Override
    public n a(h h2, net.minecraft.i.j j2) {
        this.a(j2);
        return new q(h2, this, j2);
    }

    @Override
    public i n() {
        return net.minecraft.u.g.cd.d().a(net.minecraft.W.az.C, net.minecraft.ar.aA.NORTH);
    }

    public x(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
    }

    @Override
    public int g() {
        return 8;
    }

    @Override
    public void a(G g10) {
        block3: {
            x x2;
            block2: {
                int n2 = net.minecraft.J.j.c();
                super.a(g10);
                int n3 = n2;
                x2 = this;
                if (n3 != 0) break block2;
                if (!x2.aG.M().c("doEntityDrops")) break block3;
                x2 = this;
            }
            x2.a(net.minecraft.w.k.b(net.minecraft.u.g.cd), 1, 0.0f);
        }
    }

    @Override
    public j o() {
        return net.minecraft.J.j.CHEST;
    }

    @Override
    public int e() {
        return 27;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public String a() {
        return "minecraft:chest";
    }

    public x(z z2) {
        super(z2);
    }
}

