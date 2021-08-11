/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.ar.aH;
import net.minecraft.n.a;

public class ab
implements K<a> {
    private /* synthetic */ float d;
    private /* synthetic */ float k;
    private /* synthetic */ float h;
    private /* synthetic */ int g;
    private /* synthetic */ float e;
    private /* synthetic */ float b;
    private /* synthetic */ boolean i;
    private /* synthetic */ int[] a;
    private /* synthetic */ float c;
    private /* synthetic */ aH f;
    private /* synthetic */ float j;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public ab(aH aH2, boolean bl2, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int n2, int ... arrn) {
        this.f = aH2;
        this.i = bl2;
        this.e = f10;
        this.k = f11;
        this.c = f12;
        this.h = f13;
        this.b = f14;
        this.j = f15;
        this.d = f16;
        this.g = n2;
        this.a = arrn;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.f.a());
        boolean bl2 = aD.i();
        m2.writeBoolean(this.i);
        m2.writeFloat(this.e);
        m2.writeFloat(this.k);
        boolean bl3 = bl2;
        m2.writeFloat(this.c);
        m2.writeFloat(this.h);
        m2.writeFloat(this.b);
        m2.writeFloat(this.j);
        m2.writeFloat(this.d);
        m2.writeInt(this.g);
        int n2 = this.f.d();
        for (int i2 = 0; i2 < n2; ++i2) {
            m2.d(this.a[i2]);
            if (bl3) continue;
        }
    }

    public aH g() {
        return this.f;
    }

    public boolean a() {
        return this.i;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public ab() {
    }

    public float i() {
        return this.j;
    }

    public float b() {
        return this.b;
    }

    public int[] f() {
        return this.a;
    }

    public int d() {
        return this.g;
    }

    public float e() {
        return this.h;
    }

    public double c() {
        return this.k;
    }

    public double h() {
        return this.e;
    }

    @Override
    public void a(m m2) throws IOException {
        this.f = aH.a(m2.readInt());
        boolean bl2 = aD.c();
        aH aH2 = this.f;
        if (!bl2) {
            if (aH2 == null) {
                this.f = aH.BARRIER;
            }
            this.i = m2.readBoolean();
            this.e = m2.readFloat();
            this.k = m2.readFloat();
            this.c = m2.readFloat();
            this.h = m2.readFloat();
            this.b = m2.readFloat();
            this.j = m2.readFloat();
            this.d = m2.readFloat();
            this.g = m2.readInt();
            aH2 = this.f;
        }
        int n2 = aH2.d();
        this.a = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a[i2] = m2.a();
            if (!bl2) continue;
        }
    }

    public double j() {
        return this.c;
    }

    public float k() {
        return this.d;
    }
}

