/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Locale;
import java.util.Random;
import net.minecraft.U.e;
import net.minecraft.ag.a1;
import net.minecraft.ag.b;
import net.minecraft.ah.z;
import net.minecraft.aw.C;
import net.minecraft.aw.s;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.an;
import net.minecraft.w.d;
import net.minecraft.y.a;

class t
implements a1 {
    public /* synthetic */ C b;
    public /* synthetic */ String a;
    public /* synthetic */ b c;

    @Override
    public void a(e e10, a a10, Random random) {
        int n2 = this.c.a(random);
        z z2 = e10.c();
        n n3 = z2.a(this.a, e10.a(), true);
        if (n3 != null) {
            d d10 = an.a(z2, n3.e(), n3.a(), (byte)2, true, true);
            an.a(z2, d10);
            s.a(d10, n3, "+", this.b);
            d10.f("filled_map." + this.a.toLowerCase(Locale.ROOT));
            a10.add(new net.minecraft.y.b(new d(h.aO, n2), new d(h.b7), d10));
        }
    }

    public t(b b10, String string, C c10) {
        this.c = b10;
        this.a = string;
        this.b = c10;
    }
}

