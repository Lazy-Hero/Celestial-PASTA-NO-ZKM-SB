/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.t;

import java.io.File;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.ah.G;
import net.minecraft.ah.H;
import net.minecraft.ah.I;
import net.minecraft.av.b;
import net.minecraft.aw.B;
import net.minecraft.aw.h;
import net.minecraft.aw.w;
import net.minecraft.t.d;
import net.minecraft.t.e;
import net.minecraft.t.f;
import net.minecraft.t.j;

public class l
extends B {
    @Override
    public e a(G g10) {
        File file = this.f();
        int n2 = f.e();
        boolean bl2 = g10 instanceof I;
        if (n2 == 0) {
            if (bl2) {
                File file2 = new File(file, "DIM-1");
                file2.mkdirs();
                return new j(file2, this.b);
            }
            bl2 = g10 instanceof H;
        }
        if (bl2) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new j(file3, this.b);
        }
        return new j(file, this.b);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public l(File file, String string, boolean bl2, b b10) {
        super(file, string, bl2, b10);
    }

    @Override
    public void e() {
        try {
            h.a().b();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        d.a();
    }

    @Override
    public void a(w w2, @Nullable r r2) {
        w2.c(19133);
        super.a(w2, r2);
    }
}

