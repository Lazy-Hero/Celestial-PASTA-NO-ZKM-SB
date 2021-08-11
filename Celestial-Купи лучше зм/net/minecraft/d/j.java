/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.d;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.aN;
import net.minecraft.ar.v;
import net.minecraft.d.i;
import net.minecraft.d.z;
import net.minecraft.n.b;

public class j
implements K<b> {
    private /* synthetic */ i b;
    private /* synthetic */ v a;

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public i c() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        int[] arrn = z.b();
        m m3 = m2.a(this.b);
        if (arrn != null && this.b == i.OPENED_TAB) {
            m3 = m2.a(this.a);
        }
    }

    public j(i i2, @Nullable v v2) {
        this.b = i2;
        this.a = v2;
    }

    public v a() {
        return this.a;
    }

    public static j b() {
        return new j(i.CLOSED_SCREEN, null);
    }

    public static j a(aN aN2) {
        return new j(i.OPENED_TAB, aN2.f());
    }

    @Override
    public void a(m m2) throws IOException {
        block3: {
            block2: {
                this.b = m2.a(i.class);
                int[] arrn = z.b();
                j j2 = this;
                if (arrn == null) break block2;
                if (j2.b != i.OPENED_TAB) break block3;
                j2 = this;
            }
            j2.a = m2.e();
        }
    }

    public j() {
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

