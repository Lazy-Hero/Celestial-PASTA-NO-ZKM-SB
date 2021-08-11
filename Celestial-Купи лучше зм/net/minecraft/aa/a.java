/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aa;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.p;
import net.minecraft.k.m;

public class a
implements K<net.minecraft.Y.a> {
    private /* synthetic */ String c;
    private /* synthetic */ int f;
    private /* synthetic */ int d;
    private /* synthetic */ p e;
    private static /* synthetic */ int[] b;

    public a(String string, int n2, p p2) {
        this.d = 340;
        this.c = string;
        this.f = n2;
        this.e = p2;
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    @Override
    public void a(net.minecraft.Y.a a10) {
        a10.a(this);
    }

    public p b() {
        return this.e;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        block0: {
            this.d = m2.a();
            this.c = m2.c(255);
            int[] arrn = a.c();
            this.f = m2.readUnsignedShort();
            this.e = p.a(m2.a());
            if (!m.c()) break block0;
            a.b(new int[4]);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static int[] c() {
        return b;
    }

    public a() {
    }

    static {
        if (a.c() == null) {
            a.b(new int[2]);
        }
    }

    public int a() {
        return this.d;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        int[] arrn = a.c();
        m2.d(this.d);
        int[] arrn2 = arrn;
        m2.a(this.c);
        m2.writeShort(this.f);
        m2.d(this.e.a());
        if (arrn2 == null) {
            m.b(!m.c());
        }
    }
}

