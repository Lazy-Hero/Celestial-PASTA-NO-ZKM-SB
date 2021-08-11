/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.y;
import net.minecraft.Z.i;
import net.minecraft.c.k;

class v
implements k<String> {
    final /* synthetic */ y a;

    private static Exception a(Exception exception) {
        return exception;
    }

    public String a() throws Exception {
        i i2 = this.a.a.d(this.a.d);
        int n2 = i2.b().d(i2);
        if (n2 < 0) {
            return "Unknown? (Got " + n2 + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(n2)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", n2, string);
    }

    v(y y2) {
        this.a = y2;
    }
}

