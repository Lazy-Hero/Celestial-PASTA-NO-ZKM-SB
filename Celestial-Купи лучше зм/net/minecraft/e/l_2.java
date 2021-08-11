/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.j;
import net.minecraft.E.s;
import net.minecraft.aN;
import net.minecraft.aS;
import net.minecraft.i.k;
import net.minecraft.k.m;

final class l
extends j {
    @Override
    protected boolean a(k k2, aN aN2) {
        boolean bl2;
        block4: {
            aS aS2 = k2.Y().a(aN2);
            m[] arrm = s.b();
            aS aS3 = aS2;
            if (arrm != null) {
                if (!aS3.h()) {
                    return false;
                }
                aS3 = aS2;
            }
            for (String string : aS3.c()) {
                bl2 = k2.Y().a(aN2, string);
                if (arrm != null) {
                    if (arrm != null) continue;
                }
                break block4;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected boolean a(k k2, aN aN2, String string) {
        return k2.Y().a(aN2, string);
    }

    l(String string2) {
    }
}

