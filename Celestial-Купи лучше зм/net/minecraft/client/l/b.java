/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import java.util.ArrayList;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.client.l.c;
import net.minecraft.i.h;
import net.minecraft.w.d;

public class b
extends ArrayList<d> {
    public static final /* synthetic */ int a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public b() {
        this.ensureCapacity(a);
        String[] arrstring = c.m();
        for (int i2 = 0; i2 < a; ++i2) {
            this.add(d.m);
            if (arrstring != null) continue;
        }
    }

    static {
        a = h.j();
    }

    public void a(u u2) {
        String[] arrstring = c.m();
        for (int i2 = 0; i2 < a; ++i2) {
            this.set(i2, new d(u2.d(i2)));
            if (arrstring != null) continue;
        }
    }

    public u a() {
        u u2;
        block2: {
            u u3 = new u();
            String[] arrstring = c.m();
            for (int i2 = 0; i2 < a; ++i2) {
                u2 = u3;
                if (arrstring != null) {
                    u2.a(((d)this.get(i2)).a(new r()));
                    if (arrstring != null) continue;
                }
                break block2;
            }
            u2 = u3;
        }
        return u2;
    }

    @Override
    public boolean isEmpty() {
        boolean bl2;
        block3: {
            String[] arrstring = c.m();
            for (int i2 = 0; i2 < a; ++i2) {
                bl2 = ((d)this.get(i2)).G();
                if (arrstring != null) {
                    boolean bl3;
                    if (arrstring != null) {
                        if (bl2) continue;
                        bl3 = false;
                    }
                    return bl3;
                }
                break block3;
            }
            bl2 = true;
        }
        return bl2;
    }
}

