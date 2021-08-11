/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.as;

import net.minecraft.as.e;
import net.minecraft.as.k;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.k.h;

public class f
extends e {
    public /* synthetic */ float f;
    private /* synthetic */ int d;
    private final /* synthetic */ float g;
    private final /* synthetic */ float c;
    public /* synthetic */ boolean e;

    @Override
    public void b(int n2, int n3) {
        this.f = (float)(n2 - (this.c().o + 4)) / (float)(this.c().a() - 8);
        this.f = h.c(this.f, 0.0f, 1.0f);
        this.d(this.c(this.f));
        this.c().m = this.a();
        this.e = true;
    }

    @Override
    public void a(int n2, int n3) {
        this.e = false;
    }

    public float e(float f10) {
        f10 = this.b(f10);
        return h.c(f10, this.c, this.g);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c(int n2, int n3) {
        block5: {
            f f10;
            block6: {
                boolean bl2;
                block4: {
                    int n4 = k.m();
                    bl2 = this.c().l;
                    if (n4 == 0) break block4;
                    if (!bl2) break block5;
                    f10 = this;
                    if (n4 == 0) break block6;
                    bl2 = f10.e;
                }
                if (bl2) {
                    this.f = (float)(n2 - (this.c().o + 4)) / (float)(this.c().a() - 8);
                    this.f = h.c(this.f, 0.0f, 1.0f);
                    float f11 = this.c(this.f);
                    this.d(f11);
                    this.f = this.a(f11);
                    this.c().m = this.a();
                }
                Q.P().aN().b(b);
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.a(this.c().o + (int)(this.f * (float)(this.c().a() - 8)), this.c().r, 0, 66, 4, 20);
                f10 = this;
            }
            f10.a(this.c().o + (int)(this.f * (float)(this.c().a() - 8)) + 4, this.c().r, 196, 66, 4, 20);
        }
    }

    public f(int n2, int n3, int n4, int n5, int n6, int n7, float f10, float f11) {
        super(n2, n3, n4, n5, 20, "");
        this.f = 1.0f;
        this.c = f10;
        this.g = f11;
        this.f = this.a(n7);
        this.c().m = this.a();
    }

    @Override
    public int a(boolean bl2) {
        return 0;
    }

    public void d(float f10) {
    }

    public float c(float f10) {
        return this.e(this.c + (this.g - this.c) * h.c(f10, 0.0f, 1.0f));
    }

    public f(int n2, int n3, int n4, int n5, int n6, int n7) {
        this(n2, n3, n4, n5, n7, 0, 1.0f, n6);
    }

    protected float b(float f10) {
        block3: {
            int n2;
            block2: {
                int n3 = k.k();
                n2 = this.d;
                if (n3 != 0) break block2;
                if (n2 <= 0) break block3;
                n2 = this.d * Math.round(f10 / (float)this.d);
            }
            f10 = n2;
        }
        return f10;
    }

    public String a() {
        return "";
    }

    public float a(float f10) {
        return h.c((this.e(f10) - this.c) / (this.g - this.c), 0.0f, 1.0f);
    }
}

