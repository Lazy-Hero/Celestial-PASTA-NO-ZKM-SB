/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.util.Map;
import net.minecraft.client.D.n;

public class h {
    private static /* synthetic */ boolean b;
    private static /* synthetic */ n a;

    public static boolean c() {
        boolean bl2 = h.b();
        return !bl2;
    }

    public static Map a() {
        return h.a.a;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public static boolean b() {
        return b;
    }

    public static boolean a(String string) {
        return a.a(string);
    }

    public static String a(String string, Object ... arrobject) {
        return a.a(string, arrobject);
    }

    static {
        if (!h.c()) {
            h.b(true);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static void a(n n2) {
        a = n2;
    }
}

