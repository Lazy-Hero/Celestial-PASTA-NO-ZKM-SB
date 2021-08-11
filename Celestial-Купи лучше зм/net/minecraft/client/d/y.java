/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecureTextureException
 */
package net.minecraft.client.D;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import java.util.HashMap;
import net.minecraft.client.D.B;
import net.minecraft.client.D.L;
import net.minecraft.client.D.h;
import net.minecraft.client.D.p;
import net.minecraft.client.Q;

class y
implements Runnable {
    final /* synthetic */ GameProfile b;
    final /* synthetic */ p a;
    final /* synthetic */ boolean c;
    final /* synthetic */ L d;

    y(p p2, GameProfile gameProfile, boolean bl2, L l2) {
        this.a = p2;
        this.b = gameProfile;
        this.c = bl2;
        this.d = l2;
    }

    @Override
    public void run() {
        HashMap hashMap;
        block5: {
            block6: {
                boolean bl2;
                boolean bl3;
                block4: {
                    hashMap = Maps.newHashMap();
                    bl3 = h.b();
                    try {
                        hashMap.putAll(p.a(this.a).getTextures(this.b, this.c));
                    }
                    catch (InsecureTextureException insecureTextureException) {
                        // empty catch block
                    }
                    bl2 = hashMap.isEmpty();
                    if (bl3) break block4;
                    if (!bl2) break block5;
                    bl2 = this.b.getId().equals(Q.P().aR().c().getId());
                }
                if (bl3) break block6;
                if (!bl2) break block5;
                this.b.getProperties().clear();
                bl2 = this.b.getProperties().putAll((Multimap)Q.P().J());
            }
            hashMap.putAll(p.a(this.a).getTextures(this.b, false));
        }
        Q.P().a(new B(this, hashMap));
    }

    private static InsecureTextureException a(InsecureTextureException insecureTextureException) {
        return insecureTextureException;
    }
}

