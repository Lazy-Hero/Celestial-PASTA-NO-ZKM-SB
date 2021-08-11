/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.aj;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import javax.annotation.Nullable;
import net.minecraft.aj.a;
import net.minecraft.aj.c;
import net.minecraft.aj.d;
import net.minecraft.aj.i;
import net.minecraft.aj.j;
import net.minecraft.aj.l;
import net.minecraft.aj.n;
import net.minecraft.aj.o;
import net.minecraft.aj.p;
import net.minecraft.aj.r;
import net.minecraft.aj.t;
import net.minecraft.aj.u;
import net.minecraft.ar.v;
import net.minecraft.k.m;
import net.minecraft.m.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h {
    private static final /* synthetic */ Gson a;
    private final /* synthetic */ LoadingCache<v, i> c;
    private final /* synthetic */ File b;
    private static final /* synthetic */ Logger d;

    static {
        d = LogManager.getLogger();
        a = new GsonBuilder().registerTypeAdapter(l.class, (Object)new u()).registerTypeAdapter(c.class, (Object)new p()).registerTypeAdapter(i.class, (Object)new r()).registerTypeHierarchyAdapter(d.class, (Object)new n()).registerTypeHierarchyAdapter(net.minecraft.m.m.class, (Object)new b()).registerTypeHierarchyAdapter(net.minecraft.g.d.class, (Object)new net.minecraft.g.l()).registerTypeHierarchyAdapter(t.class, (Object)new a()).create();
    }

    public i a(v v2) {
        return (i)this.c.getUnchecked((Object)v2);
    }

    static File a(h h2) {
        return h2.b;
    }

    static Logger a() {
        return d;
    }

    static Gson b() {
        return a;
    }

    public h(@Nullable File file) {
        this.c = CacheBuilder.newBuilder().build((CacheLoader)new o(this, null));
        this.b = file;
        this.c();
    }

    public void c() {
        m[] arrm = j.b();
        this.c.invalidateAll();
        m[] arrm2 = arrm;
        for (v v2 : j.c()) {
            this.a(v2);
            if (arrm2 != null) continue;
        }
    }
}

