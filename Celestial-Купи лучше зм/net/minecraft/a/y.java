/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
package net.minecraft.a;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;
import net.minecraft.R.b;
import net.minecraft.a.m;

final class y
implements ProfileLookupCallback {
    final /* synthetic */ b a;
    final /* synthetic */ List b;

    y(b b10, List list) {
        this.a = b10;
        this.b = list;
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        m.a().warn("Could not lookup user whitelist entry for {}", (Object)gameProfile.getName(), (Object)exception);
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.a.au().a(gameProfile);
        this.b.add(gameProfile);
    }
}

