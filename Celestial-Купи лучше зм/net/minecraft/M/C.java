/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.M.aW;
import net.minecraft.M.t;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ae.a;

public class C
extends t {
    private final /* synthetic */ K a;
    private final /* synthetic */ Map<a<?>, Object> d;

    public C(@Nullable K k2, @Nullable Map<a<?>, Object> map) {
        super(aW.b());
        this.a = k2;
        this.d = map;
    }

    public boolean a(i i2) {
        block8: {
            Map<a<?>, Object> map;
            int n2;
            block7: {
                n2 = t.c();
                C c10 = this;
                if (n2 != 0) {
                    if (c10.a != null && i2.b() != this.a) {
                        return false;
                    }
                    c10 = this;
                }
                map = c10.d;
                if (n2 == 0) break block7;
                if (map == null) break block8;
                map = this.d;
            }
            for (Map.Entry<a<?>, Object> entry : map.entrySet()) {
                if (i2.b(entry.getKey()) != entry.getValue()) {
                    return false;
                }
                if (n2 != 0) continue;
            }
        }
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

