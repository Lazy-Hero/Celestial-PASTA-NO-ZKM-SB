/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.G;

import net.minecraft.E.J;
import net.minecraft.R.b;
import net.minecraft.ah.z;
import net.minecraft.at.k;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
implements J {
    private final /* synthetic */ StringBuffer a;
    private static /* synthetic */ boolean b;
    private final /* synthetic */ b c;

    public static boolean b() {
        return b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a() {
        return true;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    @Override
    public z b() {
        return this.c.b();
    }

    @Override
    public void a(k k2) {
        boolean bl2 = net.minecraft.G.a.b();
        this.a.append(k2.f());
        boolean bl3 = bl2;
        if (!m.d()) {
            net.minecraft.G.a.b(!bl3);
        }
    }

    @Override
    public String g() {
        return "Rcon";
    }

    static {
        if (!net.minecraft.G.a.c()) {
            net.minecraft.G.a.b(true);
        }
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public b e() {
        return this.c;
    }

    public static boolean c() {
        boolean bl2 = net.minecraft.G.a.b();
        return !bl2;
    }

    public a(b b10) {
        boolean bl2 = net.minecraft.G.a.c();
        boolean bl3 = bl2;
        this.a = new StringBuffer();
        this.c = b10;
        if (!bl3) {
            m.b(!m.c());
        }
    }
}

