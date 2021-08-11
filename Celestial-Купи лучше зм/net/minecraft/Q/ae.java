/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.U.x;
import net.minecraft.an.b;
import net.minecraft.n.a;

public class ae
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ double d;
    private /* synthetic */ double e;
    private /* synthetic */ double c;
    private /* synthetic */ int a;

    public int c() {
        return this.b;
    }

    public double b() {
        return this.c;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
        this.b = m2.readByte();
        this.e = m2.readDouble();
        this.c = m2.readDouble();
        this.d = m2.readDouble();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
        m2.writeByte(this.b);
        m2.writeDouble(this.e);
        m2.writeDouble(this.c);
        m2.writeDouble(this.d);
    }

    public double e() {
        return this.e;
    }

    public double d() {
        return this.d;
    }

    public ae() {
    }

    public int a() {
        return this.a;
    }

    public ae(x x2) {
        block3: {
            block2: {
                boolean bl2 = aD.i();
                boolean bl3 = bl2;
                this.a = x2.W();
                this.e = x2.a;
                this.c = x2.aF;
                ae ae2 = this;
                if (!bl3) break block2;
                ae2.d = x2.ax;
                if (!(x2 instanceof b)) break block3;
                ae2 = this;
            }
            ae2.b = 1;
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

