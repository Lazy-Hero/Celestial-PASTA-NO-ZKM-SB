/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.H;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.k.m;

public class a
implements K<net.minecraft.F.a> {
    private static /* synthetic */ m[] b;
    private /* synthetic */ long a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(net.minecraft.F.a a10) {
        a10.a(this);
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.writeLong(this.a);
    }

    public static m[] b() {
        return b;
    }

    public a() {
    }

    public long c() {
        return this.a;
    }

    static {
        if (net.minecraft.H.a.b() != null) {
            net.minecraft.H.a.b(new m[3]);
        }
    }

    public a(long l2) {
        m[] arrm = net.minecraft.H.a.b();
        m[] arrm2 = arrm;
        this.a = l2;
        if (arrm2 != null) {
            m.b(!m.d());
        }
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.a = m2.readLong();
    }
}

