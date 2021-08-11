/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.b;
import net.minecraft.J.i;
import net.minecraft.J.j;
import net.minecraft.J.u;
import net.minecraft.N.p;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.av.f;
import net.minecraft.u.g;

public class B
extends u {
    private final /* synthetic */ p a1;

    public B(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.a1 = new i(this);
    }

    public B(z z2) {
        super(z2);
        this.a1 = new i(this);
    }

    @Override
    public net.minecraft.Z.i n() {
        return net.minecraft.u.g.i.d();
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        this.a1.a(r2);
    }

    public static void b(net.minecraft.av.b b10) {
        net.minecraft.J.B.a(b10, B.class);
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new b());
    }

    @Override
    protected void f(r r2) {
        super.f(r2);
        this.a1.b(r2);
    }

    @Override
    public void ae() {
        super.ae();
        this.a1.f();
    }

    @Override
    public void a(byte by2) {
        this.a1.b(by2);
    }

    @Override
    public j o() {
        return net.minecraft.J.j.SPAWNER;
    }
}

