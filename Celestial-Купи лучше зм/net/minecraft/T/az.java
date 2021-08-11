/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.ae;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class az
extends ae {
    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.s;
    }

    public az(z z2) {
        super(z2);
        this.c(this.ad * 6.0f, this.aD * 6.0f);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(100.0);
        this.a(net.minecraft.U.M.d).a(0.5);
        this.a(net.minecraft.U.M.g).a(50.0);
    }

    @Override
    public float b(n n2) {
        return this.aG.k(n2) - 0.5f;
    }

    public static void b(b b10) {
        C.a(b10, az.class);
    }

    @Override
    public float l() {
        return 10.440001f;
    }
}

