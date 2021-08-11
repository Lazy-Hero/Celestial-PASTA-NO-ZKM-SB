/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import net.minecraft.c.k;

final class m
implements k<String> {
    final /* synthetic */ int a;

    private static Exception a(Exception exception) {
        return exception;
    }

    m(int n2) {
        this.a = n2;
    }

    public String a() throws Exception {
        if (this.a < 0) {
            return "Unknown? (Got " + this.a + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(this.a)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", this.a, string);
    }
}

