/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.R;

import net.minecraft.R.b;
import net.minecraft.c.k;
import net.minecraft.k.m;

class a
implements k<String> {
    final /* synthetic */ b a;

    a(b b10) {
        this.a = b10;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a() throws Exception {
        m[] arrm = b.U();
        net.minecraft.aq.b b10 = this.a.J;
        if (arrm != null) {
            if (!b10.g) return "N/A (disabled)";
            b10 = this.a.J;
        }
        String string = b10.e();
        return string;
    }
}

