/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import net.minecraft.P.r;
import net.minecraft.av.c;
import net.minecraft.av.e;
import net.minecraft.x.b;

public class d
extends b {
    private final /* synthetic */ String[] c;

    public d(Class<?> class_, String ... arrstring) {
        super(class_);
        this.c = arrstring;
    }

    @Override
    r b(c c10, r r2, int n2) {
        r r3;
        block2: {
            String[] arrstring = this.c;
            int n3 = arrstring.length;
            String string = b.b();
            for (int i2 = 0; i2 < n3; ++i2) {
                String string2 = arrstring[i2];
                r3 = e.a(c10, r2, n2, string2);
                if (string != null) {
                    r2 = r3;
                    if (string != null) continue;
                }
                break block2;
            }
            r3 = r2;
        }
        return r3;
    }
}

