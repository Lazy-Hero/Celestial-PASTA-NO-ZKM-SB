/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.as.a;
import net.minecraft.client.Q;
import net.minecraft.client.b.aL;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bH
extends aL {
    private final /* synthetic */ a x;

    @Override
    protected boolean a(int n2) {
        return this.x.a(n2);
    }

    @Override
    protected void c() {
        this.x.a();
    }

    @Override
    protected int d() {
        return this.x.i();
    }

    public int e() {
        return this.i;
    }

    @Override
    protected int h() {
        return this.x.g();
    }

    public bH(a a10, int n2, int n3, int n4, int n5, int n6) {
        super(Q.P(), n2, n3, n4, n5, n6);
        this.x = a10;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        this.x.a(n2, n3, n4, n5, n6, n7);
    }

    public int b() {
        return this.q;
    }

    @Override
    protected int a() {
        return this.x.b();
    }

    public int c() {
        return this.k;
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.x.a(n2, bl2, n3, n4);
    }

    @Override
    public void f() {
        super.f();
    }
}

