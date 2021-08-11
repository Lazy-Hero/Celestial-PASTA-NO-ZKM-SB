/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.B.y;
import net.minecraft.ah.o;
import net.minecraft.ah.z;
import net.minecraft.at.k;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dW
implements o {
    private final /* synthetic */ n b;
    private final /* synthetic */ z a;

    @Override
    public net.minecraft.B.n a(h h2, j j2) {
        return new y(h2, this.a, this.b, j2);
    }

    public dW(z z2, n n2) {
        this.a = z2;
        this.b = n2;
    }

    @Override
    public String g() {
        return "anvil";
    }

    @Override
    public String a() {
        return "minecraft:anvil";
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public k d() {
        return new net.minecraft.at.h(g.cb.k() + ".name", new Object[0]);
    }
}

