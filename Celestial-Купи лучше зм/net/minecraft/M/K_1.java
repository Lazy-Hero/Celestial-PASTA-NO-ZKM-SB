/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.M.Z;
import net.minecraft.M.a0;
import net.minecraft.M.aq;
import net.minecraft.M.t;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ah.A;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class K
extends t {
    private final /* synthetic */ Map<a<?>, Object> e;
    private final /* synthetic */ Z f;
    private final /* synthetic */ net.minecraft.W.K a;
    private final /* synthetic */ a0 d;

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(i i2, n n2, A a10, d d10) {
        boolean bl2;
        block9: {
            int n3 = t.b();
            K k2 = this;
            if (n3 == 0) {
                if (k2.a != null && i2.b() != this.a) {
                    return false;
                }
                k2 = this;
            }
            if (n3 == 0) {
                if (k2.e != null) {
                    for (Map.Entry<a<?>, Object> entry : this.e.entrySet()) {
                        if (n3 == 0) {
                            if (i2.b(entry.getKey()) != entry.getValue()) {
                                return false;
                            }
                            if (n3 == 0) continue;
                        }
                        break block9;
                    }
                }
                k2 = this;
            }
            bl2 = k2.f.a(a10, n2.e(), n2.b(), n2.a());
            if (n3 != 0) return bl2;
            if (!bl2) {
                return false;
            }
        }
        bl2 = this.d.a(d10);
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public K(@Nullable net.minecraft.W.K k2, @Nullable Map<a<?>, Object> map, Z z2, a0 a02) {
        super(aq.b());
        this.a = k2;
        this.e = map;
        this.f = z2;
        this.d = a02;
    }
}

