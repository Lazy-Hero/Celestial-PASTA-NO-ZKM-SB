/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.g;

import com.mojang.authlib.GameProfile;
import net.minecraft.ar.v;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.b.q;
import net.minecraft.client.g.a;
import net.minecraft.client.g.b;
import net.minecraft.k.m;

public class c
implements b {
    private final /* synthetic */ GameProfile b;
    private final /* synthetic */ v a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, int n2) {
        int n3 = net.minecraft.client.g.a.f();
        Q.P().aN().b(this.a);
        int n4 = n3;
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, (float)n2 / 255.0f);
        q.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        q.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        if (n4 == 0) {
            m.b(!m.c());
        }
    }

    @Override
    public void a(a a10) {
        Q.P().ar().a(new net.minecraft.d.b(this.b.getId()));
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public k b() {
        return new g(this.b.getName());
    }

    public c(GameProfile gameProfile) {
        this.b = gameProfile;
        this.a = net.minecraft.client.q.a.a(gameProfile.getName());
        net.minecraft.client.q.a.a(this.a, gameProfile.getName());
    }
}

