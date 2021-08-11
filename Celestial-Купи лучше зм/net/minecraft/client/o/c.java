/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.o;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.ar.v;
import net.minecraft.client.D.L;
import net.minecraft.client.o.e;
import net.minecraft.client.o.j;
import net.minecraft.client.o.q;

class c
implements L {
    final /* synthetic */ e a;

    c(e e10) {
        this.a = e10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(MinecraftProfileTexture.Type var1_1, v var2_2, MinecraftProfileTexture var3_3) {
        var4_4 = j.b();
        v0 /* !! */  = q.a;
        if (var4_4 == null) ** GOTO lbl7
        switch (v0 /* !! */ [var1_1.ordinal()]) {
            case 1: {
                v0 /* !! */  = (int[])this.a.h.put(MinecraftProfileTexture.Type.SKIN, var2_2);
lbl7:
                // 2 sources

                e.a(this.a, var3_3.getMetadata("model"));
                v1 = e.a(this.a);
                if (var4_4 != null) {
                    if (v1 != null) return;
                    v1 = e.a(this.a, "default");
                }
                if (var4_4 != null) return;
            }
            case 2: {
                this.a.h.put(MinecraftProfileTexture.Type.CAPE, var2_2);
                if (var4_4 != null) return;
            }
            case 3: {
                this.a.h.put(MinecraftProfileTexture.Type.ELYTRA, var2_2);
                return;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

