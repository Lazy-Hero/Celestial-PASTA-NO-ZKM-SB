/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import net.minecraft.t.f;

public class a {
    private final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    private final /* synthetic */ int a;

    public a(byte[] arrby, int n2) {
        this.c = arrby;
        this.b = n2;
        this.a = n2 + 4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = n2 << this.a | n4 << this.b | n3;
        int n8 = f.d();
        int n9 = n7 >> 1;
        int n10 = n6 = n7 & 1;
        if (n8 != 0) {
            if (n10 == 0) {
                n5 = this.c[n9] & 0xF;
                return n5;
            }
            n10 = this.c[n9] >> 4;
        }
        n5 = n10 & 0xF;
        return n5;
    }
}

