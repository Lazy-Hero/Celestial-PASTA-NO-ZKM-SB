/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.Y;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class a9
extends Y {
    public a9(aA aA2, b b10) {
        super(aA2, b10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block6: {
            int n3;
            String[] arrstring;
            block5: {
                String[] arrstring2 = u.b();
                this.a(z2, b10, 2, -1, 2, 11, -1, 11, n, n, false);
                this.a(z2, b10, 0, -1, 0, 1, -1, 11, l, l, false);
                this.a(z2, b10, 12, -1, 0, 13, -1, 11, l, l, false);
                arrstring = arrstring2;
                this.a(z2, b10, 2, -1, 0, 11, -1, 1, l, l, false);
                this.a(z2, b10, 2, -1, 12, 11, -1, 13, l, l, false);
                this.a(z2, b10, 0, 0, 0, 0, 0, 13, n, n, false);
                this.a(z2, b10, 13, 0, 0, 13, 0, 13, n, n, false);
                this.a(z2, b10, 1, 0, 0, 12, 0, 0, n, n, false);
                this.a(z2, b10, 1, 0, 13, 12, 0, 13, n, n, false);
                for (n3 = 2; n3 <= 11; n3 += 3) {
                    this.a(z2, m, 0, 0, n3, b10);
                    this.a(z2, m, 13, 0, n3, b10);
                    this.a(z2, m, n3, 0, 0, b10);
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block5;
                }
                this.a(z2, b10, 2, 0, 3, 4, 0, 9, n, n, false);
                this.a(z2, b10, 9, 0, 3, 11, 0, 9, n, n, false);
                this.a(z2, b10, 4, 0, 9, 9, 0, 11, n, n, false);
                this.a(z2, n, 5, 0, 8, b10);
                this.a(z2, n, 8, 0, 8, b10);
                this.a(z2, n, 10, 0, 10, b10);
                this.a(z2, n, 3, 0, 10, b10);
                this.a(z2, b10, 3, 0, 3, 3, 0, 7, k, k, false);
                this.a(z2, b10, 10, 0, 3, 10, 0, 7, k, k, false);
                this.a(z2, b10, 6, 0, 10, 7, 0, 10, k, k, false);
                n3 = 3;
            }
            int n4 = 0;
            while (n4 < 2) {
                block7: {
                    n2 = 2;
                    if (arrstring == null) break block6;
                    for (int i2 = v116819; i2 <= 8; i2 += 3) {
                        this.a(z2, b10, n3, 0, i2, n3, 2, i2, n, n, false);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block7;
                    }
                    n3 = 10;
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            this.a(z2, b10, 5, 0, 10, 5, 2, 10, n, n, false);
            this.a(z2, b10, 8, 0, 10, 8, 2, 10, n, n, false);
            this.a(z2, b10, 6, -1, 7, 7, -1, 8, k, k, false);
            this.a(z2, b10, 6, -1, 3, 7, -1, 4, false);
            this.a(z2, b10, 6, 1, 6);
            n2 = 1;
        }
        return n2 != 0;
    }

    public a9() {
    }
}

