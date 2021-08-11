/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.W.bd;
import net.minecraft.W.dG;
import net.minecraft.Z.i;
import net.minecraft.client.a.X;
import net.minecraft.client.d.d;
import net.minecraft.client.x.n;

class a3
extends d {
    final /* synthetic */ X c;

    @Override
    protected n a(i i2) {
        dG dG2 = i2.b(bd.z);
        switch (dG2) {
            default: {
                return new n("quartz_block", "normal");
            }
            case CHISELED: {
                return new n("chiseled_quartz_block", "normal");
            }
            case LINES_Y: {
                return new n("quartz_column", "axis=y");
            }
            case LINES_X: {
                return new n("quartz_column", "axis=x");
            }
            case LINES_Z: 
        }
        return new n("quartz_column", "axis=z");
    }

    a3(X x2) {
        this.c = x2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

