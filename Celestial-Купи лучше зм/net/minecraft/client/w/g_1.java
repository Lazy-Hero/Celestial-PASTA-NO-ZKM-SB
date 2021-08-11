/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.client.a.I;
import net.minecraft.client.w.c;
import net.minecraft.client.w.d;
import net.minecraft.client.w.i;
import net.minecraft.client.w.j;

public class g {
    private final /* synthetic */ i[] i;
    public /* synthetic */ String g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float d;
    public final /* synthetic */ float f;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    private final /* synthetic */ d[] e;
    public final /* synthetic */ float a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public g(c c10, int[][] arrn, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean bl2) {
        block8: {
            d[] arrd;
            int[] arrn2;
            block7: {
                float f17;
                float f18;
                float f19;
                block6: {
                    float f20;
                    block5: {
                        this.d = f10;
                        this.b = f11;
                        this.h = f12;
                        this.a = f10 + f13;
                        this.c = f11 + f14;
                        this.f = f12 + f15;
                        this.i = new i[8];
                        this.e = new d[6];
                        f19 = f10 + f13;
                        f18 = f11 + f14;
                        f17 = f12 + f15;
                        f10 -= f16;
                        f11 -= f16;
                        f12 -= f16;
                        f19 += f16;
                        arrn2 = j.b();
                        f18 += f16;
                        f20 = f17 + f16;
                        if (arrn2 != null) break block5;
                        f17 = f20;
                        if (!bl2) break block6;
                        f20 = f19;
                    }
                    float f21 = f20;
                    f19 = f10;
                    f10 = f21;
                }
                i i2 = new i(f10, f11, f12, 0.0f, 0.0f);
                i i3 = new i(f19, f11, f12, 0.0f, 8.0f);
                i i4 = new i(f19, f18, f12, 8.0f, 8.0f);
                i i5 = new i(f10, f18, f12, 8.0f, 0.0f);
                i i6 = new i(f10, f11, f17, 0.0f, 0.0f);
                i i7 = new i(f19, f11, f17, 0.0f, 8.0f);
                i i8 = new i(f19, f18, f17, 8.0f, 8.0f);
                i i9 = new i(f10, f18, f17, 8.0f, 0.0f);
                this.i[0] = i2;
                this.i[1] = i3;
                this.i[2] = i4;
                this.i[3] = i5;
                this.i[4] = i6;
                this.i[5] = i7;
                this.i[6] = i8;
                this.i[7] = i9;
                this.e[0] = this.a(new i[]{i7, i3, i4, i8}, arrn[4], false, c10.B, c10.d);
                this.e[1] = this.a(new i[]{i2, i6, i9, i5}, arrn[5], false, c10.B, c10.d);
                this.e[2] = this.a(new i[]{i7, i6, i2, i3}, arrn[1], true, c10.B, c10.d);
                this.e[3] = this.a(new i[]{i4, i5, i9, i8}, arrn[0], true, c10.B, c10.d);
                this.e[4] = this.a(new i[]{i3, i2, i5, i4}, arrn[2], false, c10.B, c10.d);
                arrd = this.e;
                if (arrn2 != null) break block7;
                arrd[5] = this.a(new i[]{i6, i7, i8, i9}, arrn[3], false, c10.B, c10.d);
                if (!bl2) break block8;
                arrd = this.e;
            }
            for (d d10 : arrd) {
                d10.a();
                if (arrn2 == null) continue;
            }
        }
    }

    public g a(String string) {
        this.g = string;
        return this;
    }

    private d a(i[] arri, int[] arrn, boolean bl2, float f10, float f11) {
        if (arrn == null) {
            return null;
        }
        return bl2 ? new d(arri, arrn[2], arrn[3], arrn[0], arrn[1], f10, f11) : new d(arri, arrn[0], arrn[1], arrn[2], arrn[3], f10, f11);
    }

    public g(c c10, int n2, int n3, float f10, float f11, float f12, int n4, int n5, int n6, float f13, boolean bl2) {
        this.d = f10;
        this.b = f11;
        this.h = f12;
        this.a = f10 + (float)n4;
        this.c = f11 + (float)n5;
        this.f = f12 + (float)n6;
        this.i = new i[8];
        this.e = new d[6];
        float f14 = f10 + (float)n4;
        float f15 = f11 + (float)n5;
        float f16 = f12 + (float)n6;
        f10 -= f13;
        f11 -= f13;
        f12 -= f13;
        f14 += f13;
        f15 += f13;
        f16 += f13;
        if (bl2) {
            float f17 = f14;
            f14 = f10;
            f10 = f17;
        }
        i i2 = new i(f10, f11, f12, 0.0f, 0.0f);
        i i3 = new i(f14, f11, f12, 0.0f, 8.0f);
        i i4 = new i(f14, f15, f12, 8.0f, 8.0f);
        i i5 = new i(f10, f15, f12, 8.0f, 0.0f);
        i i6 = new i(f10, f11, f16, 0.0f, 0.0f);
        i i7 = new i(f14, f11, f16, 0.0f, 8.0f);
        i i8 = new i(f14, f15, f16, 8.0f, 8.0f);
        i i9 = new i(f10, f15, f16, 8.0f, 0.0f);
        this.i[0] = i2;
        this.i[1] = i3;
        this.i[2] = i4;
        this.i[3] = i5;
        this.i[4] = i6;
        this.i[5] = i7;
        this.i[6] = i8;
        this.i[7] = i9;
        this.e[0] = new d(new i[]{i7, i3, i4, i8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n6, n3 + n6 + n5, c10.B, c10.d);
        this.e[1] = new d(new i[]{i2, i6, i9, i5}, n2, n3 + n6, n2 + n6, n3 + n6 + n5, c10.B, c10.d);
        this.e[2] = new d(new i[]{i7, i6, i2, i3}, n2 + n6, n3, n2 + n6 + n4, n3 + n6, c10.B, c10.d);
        this.e[3] = new d(new i[]{i4, i5, i9, i8}, n2 + n6 + n4, n3 + n6, n2 + n6 + n4 + n4, n3, c10.B, c10.d);
        this.e[4] = new d(new i[]{i3, i2, i5, i4}, n2 + n6, n3 + n6, n2 + n6 + n4, n3 + n6 + n5, c10.B, c10.d);
        this.e[5] = new d(new i[]{i6, i7, i8, i9}, n2 + n6 + n4 + n6, n3 + n6, n2 + n6 + n4 + n6 + n4, n3 + n6 + n5, c10.B, c10.d);
        if (bl2) {
            for (d d10 : this.e) {
                d10.a();
            }
        }
    }

    public void a(I i2, float f10) {
        d[] arrd = this.e;
        int n2 = arrd.length;
        int n3 = 0;
        int[] arrn = j.b();
        while (n3 < n2) {
            d d10 = arrd[n3];
            if (arrn == null) {
                if (d10 != null) {
                    d10.a(i2, f10);
                }
                ++n3;
            }
            if (arrn == null) continue;
        }
    }

    public g(c c10, int n2, int n3, float f10, float f11, float f12, int n4, int n5, int n6, float f13) {
        this(c10, n2, n3, f10, f11, f12, n4, n5, n6, f13, c10.A);
    }
}

