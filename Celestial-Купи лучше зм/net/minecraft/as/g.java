/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 */
package net.minecraft.as;

import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Proxy;
import net.minecraft.P.f;
import net.minecraft.P.r;
import net.minecraft.ah.s;
import net.minecraft.as.k;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a1;

public class g {
    public static String n() {
        return Q.P().aR().a();
    }

    public static int a() {
        return s.SURVIVAL.c();
    }

    public static Proxy g() {
        return Q.P().au();
    }

    public static int c() {
        return s.SPECTATOR.c();
    }

    public static void a(boolean bl2) {
        Q.P().a(bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String p() {
        net.minecraft.ar.k k2 = Q.P().aR();
        int n2 = k.m();
        net.minecraft.ar.k k3 = k2;
        if (n2 != 0) {
            if (k3 == null) {
                return null;
            }
            k3 = k2;
        }
        String string = k3.b();
        return string;
    }

    public static boolean m() {
        return Q.P().ac.aZ;
    }

    public static ListenableFuture<Object> a(String string, String string2) {
        return Q.P().aa().a(string, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b() {
        int n2 = k.k();
        L l2 = Q.P().aO;
        if (n2 == 0) {
            if (l2 == null) return false;
            l2 = Q.P().aO;
        }
        boolean bl2 = l2 instanceof a1;
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static int d() {
        return s.ADVENTURE.c();
    }

    public static String a(String string) {
        return Q.P().w().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString((String)string), null), false).getName();
    }

    public static long o() {
        return Q.aj();
    }

    public static int e() {
        return s.CREATIVE.c();
    }

    public static void a(File file) {
        if (file.exists()) {
            try {
                r r2 = f.a(new FileInputStream(file));
                r r3 = r2.h("Data");
                r3.k("Player");
                f.a(r2, new FileOutputStream(file));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static String f() {
        return Q.P().aR().d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String i() {
        net.minecraft.ar.k k2 = Q.P().aR();
        int n2 = k.k();
        net.minecraft.ar.k k3 = k2;
        if (n2 == 0) {
            if (k3 == null) {
                return null;
            }
            k3 = k2;
        }
        String string = k3.d();
        return string;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean l() {
        return Q.P().ac.a(net.minecraft.client.l.f.REALMS_NOTIFICATIONS);
    }

    public static void j() {
        Q.P().aa().k();
    }

    public static void a(k k2) {
        Q.P().a(k2.d());
    }

    public static String h() {
        return Q.P().aR().b();
    }

    public static String k() {
        return Q.P().aJ.getAbsolutePath();
    }
}

