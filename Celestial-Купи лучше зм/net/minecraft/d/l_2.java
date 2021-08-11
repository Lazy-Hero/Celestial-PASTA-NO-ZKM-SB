/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.D;

import java.util.Collection;
import javax.annotation.Nullable;
import net.minecraft.D.i;
import net.minecraft.D.j;

public abstract class l {
    private static /* synthetic */ int b;

    public abstract j j();

    static {
        if (l.a() != 0) {
            l.b(95);
        }
    }

    public abstract i i();

    public abstract boolean g();

    public abstract Collection<String> h();

    public boolean a(@Nullable l l2) {
        int n2 = l.c();
        l l3 = l2;
        if (n2 != 0) {
            if (l3 == null) {
                return false;
            }
            l3 = this;
        }
        return l3 == l2;
    }

    public abstract j d();

    public static int a() {
        int n2 = l.c();
        if (n2 == 0) {
            return 2;
        }
        return 0;
    }

    public abstract String a(String var1);

    public static void b(int n2) {
        b = n2;
    }

    public static int c() {
        return b;
    }

    public abstract boolean f();

    private static gP a(gP gP2) {
        return gP2;
    }

    public abstract String b();

    public abstract net.minecraft.at.l e();
}

