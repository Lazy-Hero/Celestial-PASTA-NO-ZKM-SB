/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.r;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class i
implements a {
    private static final /* synthetic */ List<String> a;

    @Override
    public int a() {
        return 106;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = Lists.newArrayList((Object[])new String[]{"MinecartRideable", "MinecartChest", "MinecartFurnace", "MinecartTNT", "MinecartSpawner", "MinecartHopper", "MinecartCommandBlock"});
    }

    @Override
    public r a(r r2) {
        block6: {
            String string;
            String string2;
            block5: {
                string2 = m.b();
                string = "Minecart";
                if (string2 != null) break block5;
                if (!string.equals(r2.j("id"))) break block6;
                string = "MinecartRideable";
            }
            String string3 = string;
            int n2 = r2.m("Type");
            if (string2 == null) {
                if (n2 > 0 && n2 < a.size()) {
                    string3 = a.get(n2);
                }
                r2.a("id", string3);
            }
            r2.k("Type");
        }
        return r2;
    }
}

