/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.R;
import net.minecraft.ao.ac;
import net.minecraft.ao.u;

public class aB
extends ac {
    public aB(z z2, Random random, int n2, int n3) {
        block2: {
            String[] arrstring = u.b();
            super(n2, n3);
            R r2 = new R(random, (n2 << 4) + 2, (n3 << 4) + 2);
            this.c.add(r2);
            String[] arrstring2 = arrstring;
            r2.a(r2, this.c, random);
            List<u> list = r2.j;
            while (!list.isEmpty()) {
                int n4 = random.nextInt(list.size());
                u u2 = list.remove(n4);
                u2.a(r2, this.c, random);
                if (arrstring2 != null) {
                    if (arrstring2 != null) continue;
                }
                break block2;
            }
            this.c();
            this.a(z2, random, 48, 70);
        }
    }

    public aB() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

