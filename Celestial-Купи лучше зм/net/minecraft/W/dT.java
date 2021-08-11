/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.N.y;
import net.minecraft.O.i;
import net.minecraft.ah.z;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dT
implements i {
    private final /* synthetic */ z a;
    private final /* synthetic */ n b;

    @Override
    public double a() {
        return (double)this.b.e() + 0.5;
    }

    @Override
    public n e() {
        return this.b;
    }

    @Override
    public double f() {
        return (double)this.b.b() + 0.5;
    }

    public dT(z z2, n n2) {
        this.a = z2;
        this.b = n2;
    }

    @Override
    public <T extends y> T c() {
        return (T)this.a.b(this.b);
    }

    @Override
    public double d() {
        return (double)this.b.a() + 0.5;
    }

    @Override
    public net.minecraft.Z.i b() {
        return this.a.d(this.b);
    }

    @Override
    public z a() {
        return this.a;
    }
}

