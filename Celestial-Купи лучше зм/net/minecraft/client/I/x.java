/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.client.I.v;
import net.minecraft.i.j;

class x
extends D {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j var1_1) {
        var2_2 = v.a();
        v0 = super.a(var1_1);
        if (var2_2 == null) {
            if (v0) {
                v0 = this.b();
                if (var2_2 == null) {
                    if (v0) {
                        if (this.d().c("CustomCreativeLock") != null) return false;
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this.b();
            }
        }
        if (var2_2 != null) return v0;
        if (v0 != false) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public x(a a10, int n2, int n3, int n4) {
        super(a10, n2, n3, n4);
    }
}

