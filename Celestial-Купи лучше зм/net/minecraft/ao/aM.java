/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.Y;
import net.minecraft.ao.av;
import net.minecraft.ao.bz;
import net.minecraft.ao.d;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

class aM
implements d {
    private aM() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(s s2) {
        String[] arrstring = u.b();
        boolean bl2 = s2.c[aA.NORTH.f()];
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = s2.f[aA.NORTH.f()].a;
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public Y a(aA aA2, s s2, Random random) {
        s s3;
        block4: {
            s s4;
            block5: {
                s s5;
                block2: {
                    block3: {
                        s3 = s2;
                        String[] arrstring = u.b();
                        s5 = s2;
                        if (arrstring == null) break block2;
                        if (!s5.c[aA.NORTH.f()]) break block3;
                        s4 = s2.f[aA.NORTH.f()];
                        if (arrstring == null) break block4;
                        if (!s4.a) break block5;
                    }
                    s5 = s2.f[aA.SOUTH.f()];
                }
                s3 = s5;
            }
            s3.a = true;
            s4 = s3.f[aA.NORTH.f()];
        }
        s4.a = true;
        return new av(aA2, s3, random);
    }

    aM(bz bz2) {
        this();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

