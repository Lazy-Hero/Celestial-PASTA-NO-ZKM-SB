/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.aU;
import net.minecraft.client.b.d;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class F
extends s {
    private final /* synthetic */ float t;
    private /* synthetic */ float u;
    private final /* synthetic */ d v;
    private final /* synthetic */ String w;
    public /* synthetic */ boolean x;
    private final /* synthetic */ aU y;
    private final /* synthetic */ float s;

    @Override
    public boolean a(Q q2, int n2, int n3) {
        String[] arrstring = q.b();
        boolean bl2 = super.a(q2, n2, n3);
        if (arrstring != null) {
            if (bl2) {
                this.u = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                float f10 = this.u - 0.0f;
                float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                if (arrstring != null) {
                    float f12;
                    if (f11 < 0) {
                        this.u = 0.0f;
                    }
                    f11 = (f12 = this.u - 1.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                if (arrstring != null) {
                    if (f11 > 0) {
                        this.u = 1.0f;
                    }
                    this.m = this.c();
                    this.y.a(this.g, this.a());
                    this.x = true;
                    f11 = 1.0f;
                }
                return (boolean)f11;
            }
            bl2 = false;
        }
        return bl2;
    }

    public F(aU aU2, int n2, int n3, int n4, String string, float f10, float f11, float f12, d d10) {
        super(n2, n3, n4, 150, 20, "");
        this.u = 1.0f;
        this.w = string;
        this.t = f10;
        this.s = f11;
        this.u = (f12 - f10) / (f11 - f10);
        this.v = d10;
        this.y = aU2;
        this.m = this.c();
    }

    @Override
    protected int a(boolean bl2) {
        return 0;
    }

    public void a(float f10, boolean bl2) {
        block3: {
            F f11;
            block2: {
                this.u = (f10 - this.t) / (this.s - this.t);
                String[] arrstring = q.b();
                f11 = this;
                if (arrstring == null) break block2;
                f11.m = this.c();
                if (!bl2) break block3;
                f11 = this;
            }
            f11.y.a(this.g, this.a());
        }
    }

    public float b() {
        return this.u;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String c() {
        String string;
        String[] arrstring = q.b();
        d d10 = this.v;
        if (arrstring != null) {
            if (d10 == null) {
                string = net.minecraft.client.D.h.a(this.w, new Object[0]) + ": " + this.a();
                return string;
            }
            d10 = this.v;
        }
        string = d10.a(this.g, net.minecraft.client.D.h.a(this.w, new Object[0]), this.a());
        return string;
    }

    @Override
    protected void b(Q q2, int n2, int n3) {
        block6: {
            F f10;
            block7: {
                block8: {
                    F f11;
                    block10: {
                        float f12;
                        block9: {
                            boolean bl2;
                            String[] arrstring;
                            block5: {
                                arrstring = q.b();
                                bl2 = this.l;
                                if (arrstring == null) break block5;
                                if (!bl2) break block6;
                                f10 = this;
                                if (arrstring == null) break block7;
                                bl2 = f10.x;
                            }
                            if (!bl2) break block8;
                            this.u = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                            float f13 = this.u - 0.0f;
                            f12 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                            if (arrstring == null) break block9;
                            if (f12 < 0) {
                                this.u = 0.0f;
                            }
                            f11 = this;
                            if (arrstring == null) break block10;
                            float f14 = f11.u - 1.0f;
                            f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                        }
                        if (f12 > 0) {
                            this.u = 1.0f;
                        }
                        this.m = this.c();
                        f11 = this;
                    }
                    f11.y.a(this.g, this.a());
                }
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.a(this.o + (int)(this.u * (float)(this.i - 8)), this.r, 0, 66, 4, 20);
                f10 = this;
            }
            f10.a(this.o + (int)(this.u * (float)(this.i - 8)) + 4, this.r, 196, 66, 4, 20);
        }
    }

    @Override
    public void b(int n2, int n3) {
        this.x = false;
    }

    public float a() {
        return this.t + (this.s - this.t) * this.u;
    }

    public void a(float f10) {
        this.u = f10;
        this.m = this.c();
        this.y.a(this.g, this.a());
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

