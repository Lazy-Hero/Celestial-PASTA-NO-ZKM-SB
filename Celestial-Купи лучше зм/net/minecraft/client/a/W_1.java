/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.I;
import net.minecraft.client.a.Q;

public class W {
    private static final /* synthetic */ W c;
    private final /* synthetic */ I a;
    private final /* synthetic */ Q b;

    public void a() {
        this.a.p();
        this.b.a(this.a);
    }

    public static W c() {
        return c;
    }

    static {
        c = new W(0x200000);
    }

    public W(int n2) {
        this.b = new Q();
        this.a = new I(n2);
    }

    public I b() {
        return this.a;
    }
}

