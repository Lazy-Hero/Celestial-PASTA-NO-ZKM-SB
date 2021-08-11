/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.base.Predicate;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.E.s;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.k.m;

final class aR
implements Predicate<i> {
    final /* synthetic */ K b;
    final /* synthetic */ Map a;

    aR(K k2, Map map) {
        this.b = k2;
        this.a = map;
    }

    public boolean a(@Nullable i i2) {
        block4: {
            boolean bl2;
            block3: {
                aR aR2;
                m[] arrm;
                block5: {
                    arrm = s.b();
                    if (i2 == null) break block4;
                    aR2 = this;
                    if (arrm == null) break block5;
                    if (aR2.b != i2.b()) break block4;
                    aR2 = this;
                }
                for (Map.Entry entry : aR2.a.entrySet()) {
                    block7: {
                        boolean bl3;
                        block6: {
                            bl2 = i2.b((a)entry.getKey()).equals(entry.getValue());
                            if (arrm == null) break block3;
                            if (arrm == null) break block6;
                            if (bl2) break block7;
                            bl3 = false;
                        }
                        return bl3;
                    }
                    if (arrm != null) continue;
                }
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

