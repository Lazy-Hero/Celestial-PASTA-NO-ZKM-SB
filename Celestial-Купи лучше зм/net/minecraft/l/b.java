/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import net.minecraft.k.m;
import net.minecraft.l.c;
import net.minecraft.l.d;

final class b
implements c {
    b() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a(int n2) {
        String string;
        block6: {
            double d10 = (double)n2 / 20.0;
            double d11 = d10 / 60.0;
            double d12 = d11 / 60.0;
            double d13 = d12 / 24.0;
            int n3 = d.h();
            double d14 = d13 / 365.0;
            double d15 = d14 - 0.5;
            double d16 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
            if (n3 == 0) {
                if (d16 > 0) {
                    return d.f().format(d14) + " y";
                }
                double d17 = d13 - 0.5;
                d16 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
            }
            if (n3 == 0) {
                if (d16 > 0) {
                    return d.f().format(d13) + " d";
                }
                double d18 = d12 - 0.5;
                d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
            }
            if (n3 == 0) {
                if (d16 > 0) {
                    return d.f().format(d12) + " h";
                }
                double d19 = d11 - 0.5;
                d16 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
            }
            string = d16 > 0 ? d.f().format(d11) + " m" : d10 + " s";
            if (!m.c()) break block6;
            d.b(++n3);
        }
        return string;
    }
}

