/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.o;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a {
    private static final /* synthetic */ AtomicInteger b;
    private static final /* synthetic */ Logger a;

    static {
        b = new AtomicInteger(0);
        a = LogManager.getLogger();
    }

    static Logger a() {
        return a;
    }

    static AtomicInteger b() {
        return b;
    }
}

