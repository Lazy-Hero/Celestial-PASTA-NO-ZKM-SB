/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.GsonBuilder
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.properties.PropertyMap$Serializer
 *  joptsimple.OptionParser
 *  joptsimple.OptionSpec
 */
package net.minecraft.client.main;

import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import joptsimple.OptionParser;
import joptsimple.OptionSpec;
import net.minecraft.ar.aG;
import net.minecraft.ar.k;
import net.minecraft.client.Q;
import net.minecraft.client.main.a;
import net.minecraft.client.main.b;
import net.minecraft.client.main.c;
import net.minecraft.client.main.d;
import net.minecraft.client.main.e;
import net.minecraft.client.main.f;
import net.minecraft.client.main.g;
import net.minecraft.client.main.h;
import net.minecraft.k.m;

public class Main {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(String string) {
        m[] arrm = e.b();
        String string2 = string;
        if (arrm == null) {
            if (string2 == null) return false;
            string2 = string;
        }
        boolean bl2 = string2.isEmpty();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void main(String[] var0) {
        block19: {
            block20: {
                var2_1 = new OptionParser();
                var2_1.allowsUnrecognizedOptions();
                v0 = e.b();
                var2_1.accepts("demo");
                var2_1.accepts("fullscreen");
                var2_1.accepts("checkGlErrors");
                var1_2 = v0;
                var3_3 = var2_1.accepts("server").withRequiredArg();
                var4_4 = var2_1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo((Object)25565, (Object[])new Integer[0]);
                var5_5 = var2_1.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
                var6_6 = var2_1.accepts("assetsDir").withRequiredArg().ofType(File.class);
                var7_7 = var2_1.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
                var8_8 = var2_1.accepts("proxyHost").withRequiredArg();
                var9_9 = var2_1.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType(Integer.class);
                var10_10 = var2_1.accepts("proxyUser").withRequiredArg();
                var11_11 = var2_1.accepts("proxyPass").withRequiredArg();
                var12_12 = var2_1.accepts("username").withRequiredArg().defaultsTo((Object)("Player" + Q.aj() % 1000L), (Object[])new String[0]);
                var13_13 = var2_1.accepts("uuid").withRequiredArg();
                var14_14 = var2_1.accepts("accessToken").withRequiredArg().required();
                var15_15 = var2_1.accepts("version").withRequiredArg().required();
                var16_16 = var2_1.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
                var17_17 = var2_1.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
                var18_18 = var2_1.accepts("userProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
                var19_19 = var2_1.accepts("profileProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
                var20_20 = var2_1.accepts("assetIndex").withRequiredArg();
                var21_21 = var2_1.accepts("userType").withRequiredArg().defaultsTo((Object)"legacy", (Object[])new String[0]);
                var22_22 = var2_1.accepts("versionType").withRequiredArg().defaultsTo((Object)"release", (Object[])new String[0]);
                var23_23 = var2_1.nonOptions();
                var24_24 = var2_1.parse(var0);
                var25_25 = var24_24.valuesOf((OptionSpec)var23_23);
                v1 = var25_25;
                if (var1_2 == null) {
                    if (!v1.isEmpty()) {
                        System.out.println("Completely ignored arguments: " + var25_25);
                    }
                    v1 = var24_24.valueOf((OptionSpec)var8_8);
                }
                var26_26 = (String)v1;
                var27_27 = Proxy.NO_PROXY;
                v2 = var26_26;
                if (var1_2 == null) {
                    if (v2 != null) {
                        try {
                            var27_27 = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(var26_26, (int)((Integer)var24_24.valueOf((OptionSpec)var9_9))));
                        }
                        catch (Exception var28_28) {
                            // empty catch block
                        }
                    }
                    v2 = (String)var24_24.valueOf((OptionSpec)var10_10);
                }
                var28_29 = v2;
                var29_30 = (String)var24_24.valueOf((OptionSpec)var11_11);
                v3 = var27_27.equals(Proxy.NO_PROXY);
                if (var1_2 != null) break block19;
                if (v3 != 0) break block20;
                v3 = Main.a(var28_29);
                if (var1_2 != null) break block19;
                if (v3 == 0) break block20;
                v3 = Main.a(var29_30) ? 1 : 0;
                if (var1_2 != null) break block19;
                if (v3 != 0) {
                    Authenticator.setDefault(new c(var28_29, var29_30));
                }
            }
            v3 = (Integer)var24_24.valueOf((OptionSpec)var16_16);
        }
        var30_31 = v3;
        var31_32 = (Integer)var24_24.valueOf((OptionSpec)var17_17);
        var32_33 = var24_24.has("fullscreen");
        var33_34 = var24_24.has("checkGlErrors");
        var34_35 = var24_24.has("demo");
        var35_36 = (String)var24_24.valueOf((OptionSpec)var15_15);
        var36_37 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, (Object)new PropertyMap.Serializer()).create();
        var37_38 = aG.a(var36_37, (String)var24_24.valueOf((OptionSpec)var18_18), PropertyMap.class);
        var38_39 = aG.a(var36_37, (String)var24_24.valueOf((OptionSpec)var19_19), PropertyMap.class);
        var39_40 = (String)var24_24.valueOf((OptionSpec)var22_22);
        var40_41 = (File)var24_24.valueOf((OptionSpec)var5_5);
        v4 = var24_24;
        v5 = var6_6;
        if (var1_2 != null) ** GOTO lbl82
        if (v4.has((OptionSpec)v5)) {
            v4 = var24_24;
            v5 = var6_6;
lbl82:
            // 2 sources

            v6 = (File)v4.valueOf((OptionSpec)v5);
        } else {
            v6 = new File(var40_41, "assets/");
        }
        var41_42 = v6;
        v7 = var24_24;
        v8 = var7_7;
        if (var1_2 != null) ** GOTO lbl92
        if (v7.has((OptionSpec)v8)) {
            v7 = var24_24;
            v8 = var7_7;
lbl92:
            // 2 sources

            v9 = (File)v7.valueOf((OptionSpec)v8);
        } else {
            v9 = new File(var40_41, "resourcepacks/");
        }
        var42_43 = v9;
        v10 /* !! */  = var24_24;
        if (var1_2 != null) ** GOTO lbl102
        if (v10 /* !! */ .has((OptionSpec)var13_13)) {
            v11 = (String)var13_13.value(var24_24);
        } else {
            v10 /* !! */  = var12_12.value(var24_24);
lbl102:
            // 2 sources

            v11 = (String)v10 /* !! */ ;
        }
        var43_44 = v11;
        v12 /* !! */  = var24_24;
        if (var1_2 != null) ** GOTO lbl108
        if (v12 /* !! */ .has((OptionSpec)var20_20)) {
            v12 /* !! */  = var20_20.value(var24_24);
lbl108:
            // 2 sources

            v13 = (String)v12 /* !! */ ;
        } else {
            v13 = null;
        }
        var44_45 = v13;
        var45_46 = (String)var24_24.valueOf((OptionSpec)var3_3);
        var46_47 = (Integer)var24_24.valueOf((OptionSpec)var4_4);
        var47_48 = new k((String)var12_12.value(var24_24), var43_44, (String)var14_14.value(var24_24), (String)var21_21.value(var24_24));
        var48_49 = new e(new b(var47_48, var37_38, var38_39, var27_27), new f(var30_31, var31_32, var32_33, var33_34), new h(var40_41, var42_43, var41_42, var44_45), new d(var34_35, var35_36, var39_40), new a(var45_46, var46_47));
        Runtime.getRuntime().addShutdownHook(new g("Client Shutdown Thread"));
        Thread.currentThread().setName("Client thread");
        new Q(var48_49).aG();
        if (var1_2 == null) return;
        m.b(m.d() == false);
    }
}

