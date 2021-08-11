/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.I;
import net.minecraft.k.n;

public class g {
    private /* synthetic */ int d;
    private /* synthetic */ int c;
    private final /* synthetic */ int a;
    private final /* synthetic */ n b;

    public int c() {
        return this.d;
    }

    public g(int n2, n n3) {
        this.a = n2;
        this.b = n3;
    }

    public n b() {
        return this.b;
    }

    public void a(int n2) {
        String string = I.j();
        if (string == null) {
            if (n2 > 10) {
                n2 = 10;
            }
            this.c = n2;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.c;
    }

    public void b(int n2) {
        this.d = n2;
    }
}

