/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.D;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import net.minecraft.client.D.h;
import net.minecraft.client.D.y;

class B
implements Runnable {
    final /* synthetic */ Map b;
    final /* synthetic */ y a;

    B(y y2, Map map) {
        this.a = y2;
        this.b = map;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void run() {
        block6: {
            B b10;
            block5: {
                boolean bl2;
                block4: {
                    boolean bl3 = h.b();
                    bl2 = this.b.containsKey((Object)MinecraftProfileTexture.Type.SKIN);
                    if (bl3) break block4;
                    if (bl2) {
                        this.a.a.a((MinecraftProfileTexture)this.b.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, this.a.d);
                    }
                    b10 = this;
                    if (bl3) break block5;
                    bl2 = b10.b.containsKey((Object)MinecraftProfileTexture.Type.CAPE);
                }
                if (!bl2) break block6;
                b10 = this;
            }
            b10.a.a.a((MinecraftProfileTexture)this.b.get((Object)MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, this.a.d);
        }
    }
}

