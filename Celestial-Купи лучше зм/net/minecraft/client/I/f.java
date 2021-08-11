/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.K.b;
import net.minecraft.client.I.c;
import net.minecraft.client.I.g;
import net.minecraft.client.I.h;
import net.minecraft.client.I.v;

class f
extends c {
    final /* synthetic */ h w;
    private final /* synthetic */ int x;
    private final /* synthetic */ b y;

    static int b(f f10) {
        return f10.x;
    }

    public f(h h2, int n2, int n3, int n4, b b10, int n5) {
        this.w = h2;
        super(n2, n3, n4, net.minecraft.client.I.g.N, b10.j() % 8 * 18, 198 + b10.j() / 8 * 18);
        this.y = b10;
        this.x = n5;
    }

    @Override
    public void a(int n2, int n3) {
        f f10;
        String string;
        block4: {
            block5: {
                string = net.minecraft.client.D.h.a(this.y.i(), new Object[0]);
                int[] arrn = v.a();
                f10 = this;
                if (arrn != null) break block4;
                if (f10.x < 3) break block5;
                f10 = this;
                if (arrn != null) break block4;
                if (f10.y != net.minecraft.u.c.t) {
                    string = string + " II";
                }
            }
            f10 = this;
        }
        f10.w.a(string, n2, n3);
    }

    static b a(f f10) {
        return f10.y;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

