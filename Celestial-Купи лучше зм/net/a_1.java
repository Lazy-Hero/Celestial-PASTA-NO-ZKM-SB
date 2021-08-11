/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.G;
import net.d;
import net.i;
import net.k;
import net.r;
import net.x;

public class a {
    private final /* synthetic */ String a;
    private /* synthetic */ k c;
    private final /* synthetic */ String d;
    private /* synthetic */ r b;

    public a(String string, String string2) {
        this.d = string;
        this.a = string2;
    }

    private static x a(x x2) {
        return x2;
    }

    public void a() {
        float f10 = this.b.a();
        this.c.a(f10);
    }

    public boolean a(i i2) {
        block5: {
            block4: {
                this.c = i2.a(this.d);
                int[] arrn = G.c();
                if (arrn != null) break block4;
                if (this.c != null) break block5;
                fU.h("Model variable not found: " + this.d);
            }
            return false;
        }
        try {
            d d10 = new d(i2);
            this.b = d10.a(this.a);
            return true;
        }
        catch (x x2) {
            fU.h("Error parsing expression: " + this.a);
            fU.h(x2.getClass().getName() + ": " + x2.getMessage());
            return false;
        }
    }
}

