/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net.minecraft.client.D;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.awt.image.BufferedImage;
import net.minecraft.ar.v;
import net.minecraft.client.D.L;
import net.minecraft.client.D.h;
import net.minecraft.client.D.p;
import net.minecraft.client.a.al;

class m
implements al {
    final /* synthetic */ MinecraftProfileTexture e;
    final /* synthetic */ v a;
    final /* synthetic */ MinecraftProfileTexture.Type c;
    final /* synthetic */ L d;
    final /* synthetic */ al b;
    final /* synthetic */ p f;

    @Override
    public void a() {
        block6: {
            L l2;
            block5: {
                boolean bl2 = h.c();
                m m2 = this;
                if (bl2) {
                    if (m2.b != null) {
                        this.b.a();
                    }
                    m2 = this;
                }
                l2 = m2.d;
                if (!bl2) break block5;
                if (l2 == null) break block6;
                l2 = this.d;
            }
            l2.a(this.c, this.a, this.e);
        }
    }

    m(p p2, al al2, L l2, MinecraftProfileTexture.Type type, v v2, MinecraftProfileTexture minecraftProfileTexture) {
        this.f = p2;
        this.b = al2;
        this.d = l2;
        this.c = type;
        this.a = v2;
        this.e = minecraftProfileTexture;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        block3: {
            al al2;
            block2: {
                boolean bl2 = h.c();
                al2 = this.b;
                if (!bl2) break block2;
                if (al2 == null) break block3;
                al2 = this.b;
            }
            bufferedImage = al2.a(bufferedImage);
        }
        return bufferedImage;
    }
}

