/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.aA.g;
import net.minecraft.ah.z;
import net.minecraft.ao.ac;
import net.minecraft.ao.k;
import net.minecraft.ao.t;
import net.minecraft.ao.u;
import net.minecraft.ar.ae;
import net.minecraft.k.n;

public class ax
extends ac {
    private /* synthetic */ boolean e;

    public ax() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(z z2, g g10, Random random, int n2, int n3) {
        block4: {
            int n4;
            ae ae2;
            block3: {
                String[] arrstring;
                block2: {
                    Random random2 = new Random(n2 + n3 * 10387313);
                    ae2 = ae.values()[random2.nextInt(ae.values().length)];
                    n4 = k.a(n2, n3, g10);
                    arrstring = u.b();
                    if (arrstring == null) break block2;
                    if (n4 >= 60) break block3;
                    this.e = false;
                }
                if (arrstring != null) break block4;
            }
            n n5 = new n(n2 * 16 + 8, n4, n3 * 16 + 8);
            t.a(z2.v().d(), n5, ae2, this.c, random);
            this.c();
            this.e = true;
        }
    }

    public ax(z z2, g g10, Random random, int n2, int n3) {
        super(n2, n3);
        this.a(z2, g10, random, n2, n3);
    }

    @Override
    public boolean a() {
        return this.e;
    }
}

