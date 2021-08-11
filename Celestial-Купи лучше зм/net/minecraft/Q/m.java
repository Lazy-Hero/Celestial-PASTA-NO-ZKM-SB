/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.W.K;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class m
implements net.minecraft.C.K<a> {
    private /* synthetic */ K b;
    private /* synthetic */ int c;
    private /* synthetic */ int a;
    private /* synthetic */ n d;

    public m(n n2, K k2, int n3, int n4) {
        this.d = n2;
        this.a = n3;
        this.c = n4;
        this.b = k2;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.a(this.d);
        m2.writeByte(this.a);
        m2.writeByte(this.c);
        m2.d(K.b(this.b) & 0xFFF);
    }

    public n c() {
        return this.d;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public K a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.d = m2.l();
        this.a = m2.readUnsignedByte();
        this.c = m2.readUnsignedByte();
        this.b = K.b(m2.a() & 0xFFF);
    }

    public m() {
    }

    public int d() {
        return this.a;
    }
}

