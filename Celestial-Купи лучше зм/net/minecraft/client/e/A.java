/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
package net.minecraft.client.e;

import net.minecraft.client.e.D;
import net.minecraft.client.e.o;
import net.minecraft.client.e.s;
import net.minecraft.k.m;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

class A
extends SoundSystem {
    final /* synthetic */ o a;

    A(o o2, D d10) {
        this(o2);
    }

    private A(o o2) {
        this.a = o2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean playing(String string) {
        Object object = SoundSystemConfig.THREAD_SYNC;
        synchronized (object) {
            Source source;
            m[] arrm = s.b();
            Object object2 = this.soundLibrary;
            if (arrm != null) {
                if (object2 == null) {
                    return false;
                }
                object2 = this.soundLibrary.getSources().get(string);
            }
            Source source2 = source = (Source)object2;
            if (arrm != null) {
                if (source2 == null) {
                    return false;
                }
                source2 = source;
            }
            boolean bl2 = source2.playing();
            if (arrm == null) return bl2;
            if (bl2) return true;
            bl2 = source.paused();
            if (arrm == null) return bl2;
            if (bl2) return true;
            bl2 = source.preLoad;
            if (arrm == null) return bl2;
            if (!bl2) return false;
            return true;
        }
    }
}

