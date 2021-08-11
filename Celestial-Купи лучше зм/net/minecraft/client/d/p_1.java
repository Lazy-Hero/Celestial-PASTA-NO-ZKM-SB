/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  javax.annotation.Nullable
 */
package net.minecraft.client.D;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.client.D.K;
import net.minecraft.client.D.L;
import net.minecraft.client.D.h;
import net.minecraft.client.D.m;
import net.minecraft.client.D.y;
import net.minecraft.client.D.z;
import net.minecraft.client.a.A;
import net.minecraft.client.a.aI;
import net.minecraft.client.j.d;
import net.minecraft.client.j.u;

public class p {
    private final /* synthetic */ File b;
    private static final /* synthetic */ ExecutorService a;
    private final /* synthetic */ u c;
    private final /* synthetic */ LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> d;
    private final /* synthetic */ MinecraftSessionService e;

    public v a(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, @Nullable L l2) {
        v v2;
        block4: {
            block2: {
                L l3;
                boolean bl2;
                block3: {
                    v2 = new v("skins/" + minecraftProfileTexture.getHash());
                    bl2 = h.b();
                    d d10 = this.c.a(v2);
                    if (d10 == null) break block2;
                    l3 = l2;
                    if (bl2) break block3;
                    if (l3 == null) break block4;
                    l3 = l2;
                }
                l3.a(type, v2, minecraftProfileTexture);
                if (!bl2) break block4;
            }
            File file = new File(this.b, minecraftProfileTexture.getHash().length() > 2 ? minecraftProfileTexture.getHash().substring(0, 2) : "xx");
            File file2 = new File(file, minecraftProfileTexture.getHash());
            aI aI2 = type == MinecraftProfileTexture.Type.SKIN ? new aI() : null;
            A a10 = new A(file2, minecraftProfileTexture.getUrl(), z.a(), new m(this, aI2, l2, type, v2, minecraftProfileTexture));
            this.c.a(v2, a10);
        }
        return v2;
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile gameProfile) {
        return (Map)this.d.getUnchecked((Object)gameProfile);
    }

    static {
        a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    }

    public v a(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type) {
        return this.a(minecraftProfileTexture, type, null);
    }

    public void a(GameProfile gameProfile, L l2, boolean bl2) {
        a.submit(new y(this, gameProfile, bl2, l2));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p(u u2, File file, MinecraftSessionService minecraftSessionService) {
        this.c = u2;
        this.b = file;
        this.e = minecraftSessionService;
        this.d = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new K(this));
    }

    static MinecraftSessionService a(p p2) {
        return p2.e;
    }
}

