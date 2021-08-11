/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.J.u;
import net.minecraft.ar.a3;
import net.minecraft.av.b;

public class z
extends u {
    private static gP b(gP gP2) {
        return gP2;
    }

    public z(net.minecraft.ah.z z2) {
        super(z2);
    }

    @Override
    public boolean a(net.minecraft.i.j j2, a3 a32) {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = j2.a4();
        if (n2 != 0) {
            if (bl2) {
                return false;
            }
            bl2 = this.aU();
        }
        if (n2 != 0) {
            if (bl2) {
                return true;
            }
            bl2 = this.aG.C;
        }
        if (n2 != 0) {
            if (!bl2) {
                j2.h(this);
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean n5) {
        block5: {
            z z2;
            block7: {
                int n6;
                block6: {
                    int n7;
                    block4: {
                        n7 = net.minecraft.J.j.c();
                        n6 = n5;
                        if (n7 != 0) break block4;
                        if (n6 == 0) break block5;
                        n6 = this.aU() ? 1 : 0;
                    }
                    if (n7 != 0) break block6;
                    if (n6 != 0) {
                        this.at();
                    }
                    z2 = this;
                    if (n7 != 0) break block7;
                    n6 = z2.f();
                }
                if (n6 != 0) break block5;
                this.a(-this.d());
                this.e(10);
                this.b(50.0f);
                z2 = this;
            }
            z2.B();
        }
    }

    @Override
    public j o() {
        return net.minecraft.J.j.RIDEABLE;
    }

    public static void b(b b10) {
        net.minecraft.J.u.a(b10, z.class);
    }

    public z(net.minecraft.ah.z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
    }
}

