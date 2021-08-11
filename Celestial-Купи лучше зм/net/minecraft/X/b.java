/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.X;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.C.K;
import net.minecraft.X.a;
import net.minecraft.ar.B;
import net.minecraft.k.m;

public class b
implements K<net.minecraft.al.b> {
    private /* synthetic */ byte[] b;
    private /* synthetic */ byte[] a;

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        m2.a(this.a);
        m2.a(this.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    public byte[] a(PrivateKey privateKey) {
        byte[] arrby;
        int[] arrn = net.minecraft.X.a.b();
        PrivateKey privateKey2 = privateKey;
        if (arrn == null) {
            if (privateKey2 == null) {
                arrby = this.b;
                return arrby;
            }
            privateKey2 = privateKey;
        }
        arrby = B.a((Key)privateKey2, this.b);
        return arrby;
    }

    public SecretKey b(PrivateKey privateKey) {
        return B.a(privateKey, this.a);
    }

    public b(SecretKey secretKey, PublicKey publicKey, byte[] arrby) {
        this.a = new byte[0];
        this.b = new byte[0];
        this.a = B.b(publicKey, secretKey.getEncoded());
        int[] arrn = net.minecraft.X.a.b();
        this.b = B.b(publicKey, arrby);
        if (arrn != null) {
            m.b(!m.c());
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.a = m2.c();
        this.b = m2.c();
    }

    public b() {
        block0: {
            this.a = new byte[0];
            int[] arrn = net.minecraft.X.a.b();
            this.b = new byte[0];
            if (!m.c()) break block0;
            net.minecraft.X.a.b(new int[3]);
        }
    }

    @Override
    public void a(net.minecraft.al.b b10) {
        b10.a(this);
    }
}

