/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.ay;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;
import net.minecraft.C.K;
import net.minecraft.al.a;
import net.minecraft.ay.d;
import net.minecraft.k.m;

public class b
implements K<a> {
    private /* synthetic */ GameProfile a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(net.minecraft.C.m var1_1) throws IOException {
        var3_2 = this.a.getId();
        var2_3 = d.e();
        v0 = var3_2;
        if (var2_3 != 0) ** GOTO lbl9
        if (v0 == null) {
            v1 = "";
        } else {
            v0 = var3_2;
lbl9:
            // 2 sources

            v1 = v0.toString();
        }
        var1_1.a(v1);
        var1_1.a(this.a.getName());
        if (m.c() == false) return;
        d.b(++var2_3);
    }

    public b(GameProfile gameProfile) {
        this.a = gameProfile;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public b() {
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        String string = m2.c(36);
        String string2 = m2.c(16);
        UUID uUID = UUID.fromString(string);
        int n2 = d.e();
        this.a = new GameProfile(uUID, string2);
        if (n2 != 0) {
            m.b(!m.d());
        }
    }

    public GameProfile a() {
        return this.a;
    }
}

