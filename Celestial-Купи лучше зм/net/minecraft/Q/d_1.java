/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.List;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.ar.a2;
import net.minecraft.n.a;

public class d
implements K<a> {
    private /* synthetic */ List<net.minecraft.w.d> b;
    private /* synthetic */ int a;

    public d(int n2, a2<net.minecraft.w.d> a22) {
        this.a = n2;
        this.b = a2.a(a22.size(), net.minecraft.w.d.m);
        boolean bl2 = aD.c();
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            net.minecraft.w.d d10 = a22.get(i2);
            this.b.set(i2, d10.C());
            if (!bl2) continue;
        }
    }

    @Override
    public void b(m m2) throws IOException {
        boolean bl2 = aD.c();
        m2.writeByte(this.a);
        boolean bl3 = bl2;
        m2.writeShort(this.b.size());
        for (net.minecraft.w.d d10 : this.b) {
            m2.a(d10);
            if (!bl3) continue;
        }
    }

    public int a() {
        return this.a;
    }

    public List<net.minecraft.w.d> b() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readUnsignedByte();
        int n2 = m2.readShort();
        boolean bl2 = aD.c();
        this.b = a2.a(n2, net.minecraft.w.d.m);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b.set(i2, m2.j());
            if (!bl2) continue;
        }
    }

    public d() {
    }
}

