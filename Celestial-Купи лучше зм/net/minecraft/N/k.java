/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net.minecraft.N;

import io.netty.buffer.ByteBuf;
import net.minecraft.N.B;
import net.minecraft.N.j;
import net.minecraft.R.b;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.k.l;
import net.minecraft.k.n;

class k
extends j {
    final /* synthetic */ B k;

    @Override
    public l h() {
        return new l((double)this.k.d.e() + 0.5, (double)this.k.d.b() + 0.5, (double)this.k.d.a() + 0.5);
    }

    @Override
    public void a() {
        i i2 = this.k.a.d(this.k.d);
        this.k.d().a(this.k.d, i2, i2, 3);
    }

    @Override
    public z b() {
        return this.k.d();
    }

    k(B b10) {
        this.k = b10;
    }

    @Override
    public void a(ByteBuf byteBuf) {
        byteBuf.writeInt(this.k.d.e());
        byteBuf.writeInt(this.k.d.b());
        byteBuf.writeInt(this.k.d.a());
    }

    @Override
    public n f() {
        return this.k.d;
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.k.b();
    }

    @Override
    public b e() {
        return this.k.a.H();
    }

    @Override
    public int c() {
        return 0;
    }
}

