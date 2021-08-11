/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.io.IOException;
import net.minecraft.ar.v;
import net.minecraft.client.D.t;
import net.minecraft.client.D.x;
import net.minecraft.client.j.p;

public class q
implements x {
    private static final /* synthetic */ v a;

    static {
        a = new v("textures/colormap/grass.png");
    }

    @Override
    public void b(t t2) {
        try {
            net.minecraft.ah.q.a(p.a(t2, a));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

