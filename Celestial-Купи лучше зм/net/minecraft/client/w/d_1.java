/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.w.i;
import net.minecraft.client.w.j;
import net.minecraft.client.y.b;
import net.minecraft.k.l;

public class d {
    public /* synthetic */ i[] c;
    public /* synthetic */ int a;
    private /* synthetic */ boolean b;

    public d(i[] arri) {
        this.c = arri;
        this.a = arri.length;
    }

    public void a() {
        i[] arri = new i[this.c.length];
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            arri[i2] = this.c[this.c.length - i2 - 1];
        }
        this.c = arri;
    }

    public d(i[] arri, int n2, int n3, int n4, int n5, float f10, float f11) {
        this(arri);
        float f12 = 0.0f / f10;
        float f13 = 0.0f / f11;
        arri[0] = arri[0].a((float)n4 / f10 - f12, (float)n3 / f11 + f13);
        arri[1] = arri[1].a((float)n2 / f10 + f12, (float)n3 / f11 + f13);
        arri[2] = arri[2].a((float)n2 / f10 + f12, (float)n5 / f11 - f13);
        arri[3] = arri[3].a((float)n4 / f10 - f12, (float)n5 / f11 - f13);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(I i2, float f10) {
        block8: {
            int[] arrn;
            float f11;
            float f12;
            float f13;
            block10: {
                block9: {
                    l l2 = this.c[1].b.e(this.c[0].b);
                    l l3 = this.c[1].b.e(this.c[2].b);
                    l l4 = l3.a(l2).d();
                    f13 = (float)l4.e;
                    f12 = (float)l4.d;
                    f11 = (float)l4.b;
                    arrn = j.b();
                    boolean bl2 = this.b;
                    if (arrn == null) {
                        if (bl2) {
                            f13 = -f13;
                            f12 = -f12;
                            f11 = -f11;
                        }
                        bl2 = fU.ag();
                    }
                    if (!bl2) break block9;
                    i2.a(7, gT.d);
                    if (arrn == null) break block10;
                }
                i2.a(7, net.minecraft.client.y.b.j);
            }
            for (int i3 = 0; i3 < 4; ++i3) {
                i i4 = this.c[i3];
                i2.c(i4.b.e * (double)f10, i4.b.d * (double)f10, i4.b.b * (double)f10).a(i4.a, i4.c).d(f13, f12, f11).d();
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block8;
            }
            W.c().a();
        }
    }
}

