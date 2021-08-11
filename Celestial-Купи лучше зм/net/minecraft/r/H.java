/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class H
implements a {
    @Override
    public r a(r r2) {
        block7: {
            int n2;
            String string;
            block6: {
                string = m.b();
                n2 = "Zombie".equals(r2.j("id"));
                if (string != null) break block6;
                if (n2 == 0) break block7;
                n2 = r2.m("ZombieType");
            }
            int n3 = n2;
            switch (n3) {
                default: {
                    if (string == null) break;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    r2.a("id", "ZombieVillager");
                    r2.b("Profession", n3 - 1);
                    if (string == null) break;
                }
                case 6: {
                    r2.a("id", "Husk");
                    break;
                }
            }
            r2.k("ZombieType");
        }
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 702;
    }
}

