/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ay;

import java.io.IOException;
import java.security.PublicKey;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.al.a;
import net.minecraft.ar.B;

public class d
implements K<a> {
    private /* synthetic */ byte[] d;
    private /* synthetic */ PublicKey b;
    private /* synthetic */ String a;
    private static /* synthetic */ int c;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public static int e() {
        return c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.c(20);
        this.b = B.a(m2.c());
        this.d = m2.c();
    }

    public static void b(int n2) {
        c = n2;
    }

    public static int c() {
        int n2 = net.minecraft.ay.d.e();
        if (n2 == 0) {
            return 114;
        }
        return 0;
    }

    public byte[] d() {
        return this.d;
    }

    public PublicKey a() {
        return this.b;
    }

    public d(String string, PublicKey publicKey, byte[] arrby) {
        this.a = string;
        this.b = publicKey;
        this.d = arrby;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.a);
        m2.a(this.b.getEncoded());
        m2.a(this.d);
    }

    public d() {
    }

    static {
        if (net.minecraft.ay.d.e() != 0) {
            net.minecraft.ay.d.b(46);
        }
    }

    public String f() {
        return this.a;
    }
}

