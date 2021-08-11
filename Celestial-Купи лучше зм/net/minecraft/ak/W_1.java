/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.C;
import net.minecraft.ak.h;
import net.minecraft.e.i;
import net.minecraft.e.j;
import net.minecraft.e.k;

public class W
extends h {
    private final /* synthetic */ C c;

    public W(C c10) {
        block4: {
            i i2;
            block5: {
                boolean bl2;
                block2: {
                    String string;
                    block3: {
                        String string2 = h.h();
                        this.c = c10;
                        this.a(4);
                        string = string2;
                        bl2 = c10.l() instanceof k;
                        if (string != null) break block2;
                        if (!bl2) break block3;
                        ((k)c10.l()).a(true);
                        if (string == null) break block4;
                    }
                    i2 = c10.l();
                    if (string != null) break block5;
                    bl2 = i2 instanceof j;
                }
                if (!bl2) break block4;
                i2 = c10.l();
            }
            ((j)i2).a(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String string = h.h();
        boolean bl2 = this.c.aj();
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = this.c.av();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block3: {
            C c10;
            block2: {
                String string = h.h();
                c10 = this.c;
                if (string != null) break block2;
                if (!(c10.f().nextFloat() < 0.8f)) break block3;
                c10 = this.c;
            }
            c10.V().b();
        }
    }
}

