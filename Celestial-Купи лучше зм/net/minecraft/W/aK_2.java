/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.w.ar;
import net.minecraft.w.bl;
import net.minecraft.w.d;

class aK
implements ar {
    final /* synthetic */ String[] a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a(d d10) {
        int n2;
        block4: {
            int n3;
            block2: {
                block3: {
                    n2 = d10.d();
                    int n4 = bl.c();
                    n3 = n2;
                    if (n4 != 0) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (n4 != 0) break block2;
                    if (n3 < this.a.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return this.a[n2];
    }

    aK(String[] arrstring) {
        this.a = arrstring;
    }
}

