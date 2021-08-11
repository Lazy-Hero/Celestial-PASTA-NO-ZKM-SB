/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemLogger
 */
package net.minecraft.client.e;

import net.minecraft.client.e.D;
import net.minecraft.client.e.o;
import net.minecraft.client.e.s;
import net.minecraft.k.m;
import paulscode.sound.SoundSystemLogger;

class d
extends SoundSystemLogger {
    final /* synthetic */ D a;

    public void message(String string, int n2) {
        block0: {
            if (string.isEmpty()) break block0;
            o.f().info(string);
        }
    }

    d(D d10) {
        this.a = d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void importantMessage(String string, int n2) {
        block0: {
            if (string.isEmpty()) break block0;
            o.f().warn(string);
        }
    }

    public void errorMessage(String string, String string2, int n2) {
        block3: {
            block2: {
                m[] arrm = s.b();
                if (arrm == null) break block2;
                if (string2.isEmpty()) break block3;
                o.f().error("Error in class '{}'", (Object)string);
            }
            o.f().error(string2);
        }
    }
}

