/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package net.minecraft.J;

import io.netty.buffer.ByteBuf;
import net.minecraft.J.v;
import net.minecraft.N.j;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.k.l;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class e
extends j {
    final /* synthetic */ v k;

    @Override
    public b e() {
        return this.k.aG.H();
    }

    @Override
    public x c() {
        return this.k;
    }

    @Override
    public n f() {
        return new n(this.k.a, this.k.aF + 0.5, this.k.ax);
    }

    @Override
    public z b() {
        return this.k.aG;
    }

    @Override
    public void a() {
        this.k.E().b(v.c(), this.d());
        this.k.E().b(v.a(), this.e());
    }

    @Override
    public void a(ByteBuf byteBuf) {
        byteBuf.writeInt(this.k.W());
    }

    @Override
    public int c() {
        return 1;
    }

    e(v v2) {
        this.k = v2;
    }

    @Override
    public l h() {
        return new l(this.k.a, this.k.aF, this.k.ax);
    }
}

