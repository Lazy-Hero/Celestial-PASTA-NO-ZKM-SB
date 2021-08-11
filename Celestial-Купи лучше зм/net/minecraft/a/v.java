/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.a;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import net.minecraft.a.b;
import net.minecraft.a.e;
import net.minecraft.a.k;
import net.minecraft.a.t;

public class v
extends t<String, e> {
    @Override
    protected b<String> a(JsonObject jsonObject) {
        return new e(jsonObject);
    }

    public boolean c(SocketAddress socketAddress) {
        String string = this.b(socketAddress);
        return this.d(string);
    }

    @Override
    public e a(SocketAddress socketAddress) {
        String string = this.b(socketAddress);
        return (e)this.a(string);
    }

    private String b(SocketAddress socketAddress) {
        String string;
        block6: {
            boolean bl2;
            String string2;
            block5: {
                string2 = socketAddress.toString();
                boolean bl3 = k.q();
                bl2 = string2.contains("/");
                if (bl3) break block5;
                if (bl2) {
                    string2 = string2.substring(string2.indexOf(47) + 1);
                }
                string = string2;
                if (bl3) break block6;
                bl2 = string.contains(":");
            }
            if (bl2) {
                string2 = string2.substring(0, string2.indexOf(58));
            }
            string = string2;
        }
        return string;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public v(File file) {
        super(file);
    }
}

