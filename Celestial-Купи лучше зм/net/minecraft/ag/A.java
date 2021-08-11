/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.ag.P;
import net.minecraft.ak.at;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class A
extends at {
    private static /* synthetic */ String[] d;
    private final /* synthetic */ P f;
    private /* synthetic */ boolean c;
    final /* synthetic */ P e;

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    static {
        if (A.b() == null) {
            A.b(new String[3]);
        }
    }

    @Override
    public void a() {
        block3: {
            block2: {
                String[] arrstring = A.b();
                A a10 = this;
                if (arrstring == null) break block2;
                if (!a10.a) break block3;
                this.f.P();
                a10 = this;
            }
            a10.a = false;
        }
    }

    public A(P p2, P p3) {
        this.e = p2;
        super(p3);
        this.f = p3;
    }

    public static String[] b() {
        return d;
    }

    public boolean c() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public boolean a() {
        return this.a;
    }
}

