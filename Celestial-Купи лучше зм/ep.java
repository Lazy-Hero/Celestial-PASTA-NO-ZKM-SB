/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.client.E.h;
import net.minecraft.client.Q;
import net.minecraft.client.q.c;
import net.minecraft.i.j;
import net.minecraft.k.i;
import net.minecraft.k.l;
import net.minecraft.k.n;

public class ep
extends h {
    private /* synthetic */ x l;
    private /* synthetic */ n k;
    private /* synthetic */ boolean m;

    public n f() {
        return this.k;
    }

    public boolean d() {
        return this.m;
    }

    @Override
    public aX a(j j2, x x2, i i2, a3 a32) {
        this.l = x2;
        return super.a(j2, x2, i2, a32);
    }

    @Override
    public aX a(c c10, net.minecraft.client.E.l l2, n n2, aA aA2, l l3, a3 a32) {
        this.m = true;
        this.k = n2;
        aX aX2 = super.a(c10, l2, n2, aA2, l3, a32);
        this.m = false;
        return aX2;
    }

    @Override
    public aX a(j j2, x x2, a3 a32) {
        this.l = x2;
        return super.a(j2, x2, a32);
    }

    public x e() {
        return this.l;
    }

    @Override
    public boolean b(n n2, aA aA2) {
        this.m = true;
        this.k = n2;
        boolean bl2 = super.b(n2, aA2);
        this.m = false;
        return bl2;
    }

    public ep(Q q2, net.minecraft.client.o.j j2) {
        super(q2, j2);
        this.m = false;
        this.k = null;
        this.l = null;
    }

    @Override
    public aX a(j j2, z z2, a3 a32) {
        this.m = true;
        aX aX2 = super.a(j2, z2, a32);
        this.m = false;
        return aX2;
    }

    @Override
    public boolean a(n n2, aA aA2) {
        this.m = true;
        this.k = n2;
        boolean bl2 = super.a(n2, aA2);
        this.m = false;
        return bl2;
    }
}

