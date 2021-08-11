/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.U.x;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class o
extends n {
    protected /* synthetic */ int q;
    protected /* synthetic */ int r;
    protected /* synthetic */ int s;

    @Override
    public int a() {
        return this.s;
    }

    public o(n n2) {
        this(n2.e(), n2.b(), n2.a());
    }

    public o(int n2, int n3, int n4) {
        super(0, 0, 0);
        this.r = n2;
        this.q = n3;
        this.s = n4;
    }

    public void a(int n2) {
        this.q = n2;
    }

    @Override
    public o a(int n2, int n3, int n4) {
        this.r = n2;
        this.q = n3;
        this.s = n4;
        return this;
    }

    public o() {
        this(0, 0, 0);
    }

    @Override
    public n a(double d10, double d11, double d12) {
        return super.a(d10, d11, d12).l();
    }

    @Override
    public n l() {
        return new n(this);
    }

    @Override
    public int b() {
        return this.q;
    }

    @Override
    public o a(m m2) {
        return this.a(m2.e(), m2.b(), m2.a());
    }

    @Override
    public o a(aA aA2) {
        return this.a(aA2, 1);
    }

    @Override
    public n a(int n2, int n3, int n4) {
        return super.a(n2, n3, n4).l();
    }

    @Override
    public n a(ae ae2) {
        return super.a(ae2).l();
    }

    @Override
    public int e() {
        return this.r;
    }

    @Override
    public o a(aA aA2, int n2) {
        return this.a(this.r + aA2.r() * n2, this.q + aA2.p() * n2, this.s + aA2.i() * n2);
    }

    @Override
    public o a(double d10, double d11, double d12) {
        return this.a(h.f(d10), h.f(d11), h.f(d12));
    }

    @Override
    public n a(aA aA2, int n2) {
        return super.a(aA2, n2).l();
    }

    public o a(x x2) {
        return this.a(x2.a, x2.aF, x2.ax);
    }
}

