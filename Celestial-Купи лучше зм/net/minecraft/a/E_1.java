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

final class E
implements ProfileLookupCallback {
    final /* synthetic */ GameProfile[] a;

    E(GameProfile[] arrgameProfile) {
        this.a = arrgameProfile;
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        this.a[0] = null;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.a[0] = gameProfile;
    }
}

