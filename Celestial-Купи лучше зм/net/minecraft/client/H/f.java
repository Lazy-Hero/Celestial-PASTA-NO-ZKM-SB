/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.H;

import java.util.function.Function;
import net.minecraft.client.H.a;
import net.minecraft.client.H.b;
import net.minecraft.client.H.c;
import net.minecraft.client.H.d;
import net.minecraft.client.H.e;
import net.minecraft.client.H.g;
import net.minecraft.client.H.h;
import net.minecraft.client.H.i;

public enum f {
    MOVEMENT("movement", b::new),
    FIND_TREE("find_tree", g::new),
    PUNCH_TREE("punch_tree", c::new),
    OPEN_INVENTORY("open_inventory", i::new),
    CRAFT_PLANKS("craft_planks", a::new),
    NONE("none", h::new);

    private final /* synthetic */ String c;
    private final /* synthetic */ Function<d, ? extends e> b;

    public static f a(String string) {
        f f10;
        block4: {
            f[] arrf = f.values();
            boolean bl2 = d.a();
            int n2 = arrf.length;
            int n3 = 0;
            while (n3 < n2) {
                f f11 = arrf[n3];
                if (bl2) {
                    f10 = f11;
                    if (!bl2) break block4;
                    if (f10.c.equals(string)) {
                        return f11;
                    }
                    ++n3;
                }
                if (bl2) continue;
            }
            f10 = NONE;
        }
        return f10;
    }

    public String a() {
        return this.c;
    }

    private <T extends e> f(String string2, Function<d, T> function) {
        this.c = string2;
        this.b = function;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public e a(d d10) {
        return this.b.apply(d10);
    }
}

