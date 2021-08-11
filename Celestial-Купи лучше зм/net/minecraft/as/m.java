/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.as;

import java.lang.reflect.Constructor;
import net.minecraft.as.k;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aa;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m
extends k {
    private /* synthetic */ L q;
    private static final /* synthetic */ Logger p;

    public void b(L l2) {
        this.q = l2;
        try {
            Class<?> class_ = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
            Constructor<?> constructor = class_.getDeclaredConstructor(k.class);
            constructor.setAccessible(true);
            Object obj = constructor.newInstance(this);
            Q.P().a(((k)obj).d());
        }
        catch (ClassNotFoundException classNotFoundException) {
            p.error("Realms module missing");
        }
        catch (Exception exception) {
            p.error("Failed to load Realms module", (Throwable)exception);
        }
    }

    @Override
    public void n() {
        Q.P().a(this.q);
    }

    public aa a(L l2) {
        try {
            this.q = l2;
            Class<?> class_ = Class.forName("com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen");
            Constructor<?> constructor = class_.getDeclaredConstructor(k.class);
            constructor.setAccessible(true);
            Object obj = constructor.newInstance(this);
            return ((k)obj).d();
        }
        catch (ClassNotFoundException classNotFoundException) {
            p.error("Realms module missing");
        }
        catch (Exception exception) {
            p.error("Failed to load Realms module", (Throwable)exception);
        }
        return null;
    }

    static {
        p = LogManager.getLogger();
    }
}

