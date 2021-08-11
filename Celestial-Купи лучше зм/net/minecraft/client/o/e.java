/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  javax.annotation.Nullable
 */
package net.minecraft.client.o;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.D.m;
import net.minecraft.Q.g;
import net.minecraft.ah.s;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.client.D.z;
import net.minecraft.client.Q;
import net.minecraft.client.o.c;
import net.minecraft.client.o.j;

public class e {
    private /* synthetic */ int i;
    private /* synthetic */ long d;
    private final /* synthetic */ GameProfile e;
    private /* synthetic */ long g;
    private /* synthetic */ boolean k;
    private /* synthetic */ int b;
    private /* synthetic */ k j;
    private /* synthetic */ long a;
    private /* synthetic */ int f;
    private /* synthetic */ s l;
    private /* synthetic */ String c;
    /* synthetic */ Map<MinecraftProfileTexture.Type, v> h;

    protected void c(int n2) {
        this.f = n2;
    }

    public void a(@Nullable k k2) {
        this.j = k2;
    }

    public void a(long l2) {
        this.g = l2;
    }

    public int g() {
        return this.b;
    }

    public void b(long l2) {
        this.a = l2;
    }

    public s l() {
        return this.l;
    }

    public int h() {
        return this.i;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String m() {
        String string;
        int[] arrn = net.minecraft.client.o.j.b();
        e e10 = this;
        if (arrn != null) {
            if (e10.c == null) {
                string = z.b(this.e.getId());
                return string;
            }
            e10 = this;
        }
        string = e10.c;
        return string;
    }

    public GameProfile p() {
        return this.e;
    }

    public v b() {
        this.i();
        return (v)MoreObjects.firstNonNull((Object)this.h.get((Object)MinecraftProfileTexture.Type.SKIN), (Object)z.c(this.e.getId()));
    }

    public long f() {
        return this.a;
    }

    public long j() {
        return this.g;
    }

    @Nullable
    public v a() {
        this.i();
        return this.h.get((Object)MinecraftProfileTexture.Type.CAPE);
    }

    @Nullable
    public v k() {
        this.i();
        return this.h.get((Object)MinecraftProfileTexture.Type.ELYTRA);
    }

    public long c() {
        return this.d;
    }

    public void a(int n2) {
        this.i = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void i() {
        e e10 = this;
        synchronized (e10) {
            e e11;
            block5: {
                int[] arrn = net.minecraft.client.o.j.b();
                e11 = this;
                if (arrn == null) return;
                if (e11.k) break block5;
                this.k = true;
                Q.P().F().a(this.e, new c(this), true);
            }
            e11 = e10;
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    public e(g g10) {
        this.h = Maps.newEnumMap(MinecraftProfileTexture.Type.class);
        this.e = g10.d();
        this.l = g10.b();
        this.f = g10.a();
        this.j = g10.c();
    }

    @Nullable
    public m d() {
        return Q.P().e.c().a(this.p().getName());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public e(GameProfile gameProfile) {
        this.h = Maps.newEnumMap(MinecraftProfileTexture.Type.class);
        this.e = gameProfile;
    }

    static String a(e e10, String string) {
        e10.c = string;
        return e10.c;
    }

    public boolean o() {
        return this.b() != null;
    }

    public int n() {
        return this.f;
    }

    public void b(int n2) {
        this.b = n2;
    }

    protected void a(s s2) {
        this.l = s2;
    }

    static String a(e e10) {
        return e10.c;
    }

    public void c(long l2) {
        this.d = l2;
    }

    @Nullable
    public k e() {
        return this.j;
    }
}

