/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ap;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.ao.b;
import net.minecraft.ap.g;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.f;
import net.minecraft.k.n;

public class k {
    private /* synthetic */ float b;
    @Nullable
    private /* synthetic */ Random c;
    @Nullable
    private /* synthetic */ f i;
    private /* synthetic */ boolean h;
    @Nullable
    private /* synthetic */ K f;
    private /* synthetic */ boolean g;
    @Nullable
    private /* synthetic */ Long e;
    @Nullable
    private /* synthetic */ b j;
    private /* synthetic */ ae d;
    private /* synthetic */ h a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public float e() {
        return this.b;
    }

    public k() {
        this.a = net.minecraft.ar.h.NONE;
        this.d = ae.NONE;
        this.g = true;
        this.b = 1.0f;
    }

    @Nullable
    private b b(@Nullable f f10) {
        int[] arrn = net.minecraft.ap.g.c();
        f f11 = f10;
        if (arrn != null) {
            if (f11 == null) {
                return null;
            }
            f11 = f10;
        }
        int n2 = f11.c * 16;
        int n3 = f10.b * 16;
        return new b(n2, 0, n3, n2 + 16 - 1, 255, n3 + 16 - 1);
    }

    @Nullable
    public b f() {
        b b10;
        block4: {
            k k2;
            block6: {
                block5: {
                    int[] arrn = net.minecraft.ap.g.c();
                    b10 = this.j;
                    if (arrn == null) break block4;
                    if (b10 != null) break block5;
                    k2 = this;
                    if (arrn == null) break block6;
                    if (k2.i != null) {
                        this.a();
                    }
                }
                k2 = this;
            }
            b10 = k2.j;
        }
        return b10;
    }

    public Random a(@Nullable n n2) {
        int[] arrn;
        block8: {
            Long l2;
            block7: {
                arrn = net.minecraft.ap.g.c();
                k k2 = this;
                if (arrn != null) {
                    if (k2.c != null) {
                        return this.c;
                    }
                    k2 = this;
                }
                l2 = k2.e;
                if (arrn == null) break block7;
                if (l2 == null) break block8;
                l2 = this.e;
            }
            return l2 == 0L ? new Random(System.currentTimeMillis()) : new Random(this.e);
        }
        n n3 = n2;
        if (arrn != null) {
            if (n3 == null) {
                return new Random(System.currentTimeMillis());
            }
            n3 = n2;
        }
        int n4 = n3.e();
        int n5 = n2.a();
        return new Random((long)(n4 * n4 * 4987142 + n4 * 5947611) + (long)(n5 * n5) * 4392871L + (long)(n5 * 389711) ^ 0x3AD8025FL);
    }

    public k a(f f10) {
        this.i = f10;
        return this;
    }

    public k b(boolean bl2) {
        this.h = bl2;
        return this;
    }

    public k a(float f10) {
        this.b = f10;
        return this;
    }

    public ae g() {
        return this.d;
    }

    public boolean c() {
        return this.g;
    }

    public k a(K k2) {
        this.f = k2;
        return this;
    }

    public boolean h() {
        return this.h;
    }

    public k i() {
        k k2 = new k();
        k2.a = this.a;
        k2.d = this.d;
        k2.h = this.h;
        k2.f = this.f;
        k2.i = this.i;
        k2.j = this.j;
        k2.g = this.g;
        k2.b = this.b;
        k2.c = this.c;
        k2.e = this.e;
        return k2;
    }

    public k a(ae ae2) {
        this.d = ae2;
        return this;
    }

    public k a(h h2) {
        this.a = h2;
        return this;
    }

    public k a(b b10) {
        this.j = b10;
        return this;
    }

    public h d() {
        return this.a;
    }

    public k a(@Nullable Long l2) {
        this.e = l2;
        return this;
    }

    void a() {
        this.j = this.b(this.i);
    }

    @Nullable
    public K b() {
        return this.f;
    }

    public k a(@Nullable Random random) {
        this.c = random;
        return this;
    }

    public k a(boolean bl2) {
        this.g = bl2;
        return this;
    }
}

