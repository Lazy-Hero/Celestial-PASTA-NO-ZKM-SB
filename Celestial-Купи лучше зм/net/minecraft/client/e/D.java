/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemLogger
 */
package net.minecraft.client.e;

import net.minecraft.ar.ay;
import net.minecraft.client.e.A;
import net.minecraft.client.e.d;
import net.minecraft.client.e.o;
import net.minecraft.client.e.s;
import net.minecraft.k.m;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

class D
implements Runnable {
    final /* synthetic */ o a;

    D(o o2) {
        this.a = o2;
    }

    @Override
    public void run() {
        SoundSystemConfig.setLogger((SoundSystemLogger)new d(this));
        o o2 = this.a;
        o2.getClass();
        o.a(this.a, new A(o2, null));
        o.a(this.a, true);
        m[] arrm = s.b();
        o.a(this.a).setMasterVolume(o.b(this.a).a(ay.MASTER));
        m[] arrm2 = arrm;
        o.f().info(o.g(), "Sound engine started");
        if (arrm2 == null) {
            m.b(!m.d());
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

