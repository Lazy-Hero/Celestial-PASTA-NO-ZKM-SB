/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.MoreObjects$ToStringHelper
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
package net.minecraft.Q;

import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;
import net.minecraft.Q.aD;
import net.minecraft.Q.aX;
import net.minecraft.ah.s;
import net.minecraft.at.k;
import net.minecraft.at.o;

public class g {
    private final /* synthetic */ int a;
    private final /* synthetic */ GameProfile c;
    private final /* synthetic */ s d;
    final /* synthetic */ aX e;
    private final /* synthetic */ k b;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    public k c() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        String string;
        boolean bl2 = aD.i();
        MoreObjects.ToStringHelper toStringHelper = MoreObjects.toStringHelper((Object)this).add("latency", this.a).add("gameMode", (Object)this.d).add("profile", (Object)this.c);
        k k2 = this.b;
        if (bl2) {
            if (k2 == null) {
                string = null;
                return toStringHelper.add("displayName", (Object)string).toString();
            }
            k2 = this.b;
        }
        string = o.a(k2);
        return toStringHelper.add("displayName", (Object)string).toString();
    }

    public g(aX aX2, GameProfile gameProfile, int n2, @Nullable s s2, k k2) {
        this.e = aX2;
        this.c = gameProfile;
        this.a = n2;
        this.d = s2;
        this.b = k2;
    }

    public s b() {
        return this.d;
    }

    public GameProfile d() {
        return this.c;
    }
}

