/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import net.minecraft.l.c;
import net.minecraft.l.d;

final class k
implements c {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a(int n2) {
        double d10 = (double)n2 / 100.0;
        int n3 = d.e();
        double d11 = d10 / 1000.0;
        double d12 = d11 - 0.5;
        double d13 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (n3 != 0) {
            if (d13 > 0) {
                return d.f().format(d11) + " km";
            }
            double d14 = d10 - 0.5;
            d13 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
        }
        return d13 > 0 ? d.f().format(d10) + " m" : n2 + " cm";
    }

    k() {
    }
}

