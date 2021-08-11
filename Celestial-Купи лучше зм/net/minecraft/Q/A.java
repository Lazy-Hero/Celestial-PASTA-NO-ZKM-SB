/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class A
implements K<a> {
    private /* synthetic */ boolean d;
    private /* synthetic */ int b;
    private /* synthetic */ n a;
    private /* synthetic */ int c;

    public A(int n2, n n3, int n4, boolean bl2) {
        this.b = n2;
        this.a = n3;
        this.c = n4;
        this.d = bl2;
    }

    public boolean a() {
        return this.d;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public A() {
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.b);
        m2.a(this.a);
        m2.writeInt(this.c);
        m2.writeBoolean(this.d);
    }

    public int c() {
        return this.b;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readInt();
        this.a = m2.l();
        this.c = m2.readInt();
        this.d = m2.readBoolean();
    }

    public int d() {
        return this.c;
    }

    public n b() {
        return this.a;
    }
}

