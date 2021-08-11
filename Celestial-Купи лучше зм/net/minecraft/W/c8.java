/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.B.A;
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
public class c8
implements o {
    private final /* synthetic */ z a;
    private final /* synthetic */ n b;

    @Override
    public net.minecraft.B.n a(h h2, j j2) {
        return new A(h2, this.a, this.b);
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public k d() {
        return new net.minecraft.at.h(g.aj.k() + ".name", new Object[0]);
    }

    @Override
    public String a() {
        return "minecraft:crafting_table";
    }

    public c8(z z2, n n2) {
        this.a = z2;
        this.b = n2;
    }

    @Override
    public String g() {
        return "crafting_table";
    }
}

