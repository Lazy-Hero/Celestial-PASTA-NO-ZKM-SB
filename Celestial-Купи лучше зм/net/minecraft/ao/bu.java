/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.aV;
import net.minecraft.ao.ac;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;

public class bu
extends ac {
    public bu() {
    }

    public bu(z z2, Random random, int n2, int n3) {
        block2: {
            super(n2, n3);
            b7.d();
            aV aV2 = new aV(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
            this.c.add(aV2);
            String[] arrstring = u.b();
            aV2.a(aV2, this.c, random);
            String[] arrstring2 = arrstring;
            List<u> list = aV2.i;
            while (!list.isEmpty()) {
                int n4 = random.nextInt(list.size());
                u u2 = list.remove(n4);
                u2.a(aV2, this.c, random);
                if (arrstring2 != null) {
                    if (arrstring2 != null) continue;
                }
                break block2;
            }
            this.c();
            this.a(z2, random, 10);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

