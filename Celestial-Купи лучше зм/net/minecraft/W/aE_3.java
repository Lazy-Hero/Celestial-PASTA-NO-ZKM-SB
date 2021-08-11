/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.K.j;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.u.c;
import net.minecraft.w.aY;
import net.minecraft.w.aw;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class aE
extends aw {
    private final /* synthetic */ boolean z;

    @Override
    protected void b(d d10, z z2, net.minecraft.i.j j2) {
        aY aY2 = aY.a(d10);
        int n2 = bl.g();
        if (n2 != 0) {
            if (aY2 == aY.PUFFERFISH) {
                j2.b(new j(c.g, 1200, 3));
                j2.b(new j(c.r, 300, 2));
                j2.b(new j(c.s, 300, 1));
            }
            super.b(d10, z2, j2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int b(d d10) {
        int n2;
        aY aY2;
        block5: {
            aY aY3;
            block4: {
                boolean bl2;
                block3: {
                    aY3 = aY.a(d10);
                    int n3 = bl.c();
                    bl2 = this.z;
                    if (n3 != 0) break block3;
                    if (!bl2) break block4;
                    aY2 = aY3;
                    if (n3 != 0) break block5;
                    bl2 = aY2.e();
                }
                if (bl2) {
                    n2 = aY3.d();
                    return n2;
                }
            }
            aY2 = aY3;
        }
        n2 = aY2.c();
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public float a(d d10) {
        float f10;
        aY aY2;
        block5: {
            aY aY3;
            block4: {
                boolean bl2;
                block3: {
                    aY3 = aY.a(d10);
                    int n2 = bl.g();
                    bl2 = this.z;
                    if (n2 == 0) break block3;
                    if (!bl2) break block4;
                    aY2 = aY3;
                    if (n2 == 0) break block5;
                    bl2 = aY2.e();
                }
                if (bl2) {
                    f10 = aY3.g();
                    return f10;
                }
            }
            aY2 = aY3;
        }
        f10 = aY2.f();
        return f10;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String d(d d10) {
        String string;
        StringBuilder stringBuilder;
        block5: {
            boolean bl2;
            block4: {
                aY aY2 = aY.a(d10);
                int n2 = bl.g();
                stringBuilder = new StringBuilder().append(this.h()).append(".").append(aY2.b()).append(".");
                bl2 = this.z;
                if (n2 == 0) break block4;
                if (!bl2) break block5;
                bl2 = aY2.e();
            }
            if (bl2) {
                string = "cooked";
                return stringBuilder.append(string).toString();
            }
        }
        string = "raw";
        return stringBuilder.append(string).toString();
    }

    @Override
    public void a(a a10, a2<d> a22) {
        int n2 = bl.c();
        if (this.b(a10)) {
            for (aY aY2 : aY.values()) {
                boolean bl2 = this.z;
                if (n2 != 0) continue;
                if (bl2) {
                    bl2 = aY2.e();
                    if (n2 != 0 || !bl2) continue;
                }
                bl2 = a22.add(new d(this, 1, aY2.a()));
                if (n2 == 0) continue;
            }
        }
    }

    public aE(boolean bl2) {
        super(0, 0.0f, false);
        this.z = bl2;
    }
}

