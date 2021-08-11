/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.s;

import java.io.IOException;
import net.minecraft.client.B.c;
import net.minecraft.client.a.as;
import net.minecraft.client.s.a;
import net.minecraft.client.s.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e {
    private static /* synthetic */ e b;
    private static final /* synthetic */ Logger a;

    public void a(a a10) {
        a10.b().b(a10);
        a10.f().b(a10);
        as.i(a10.h());
    }

    public void b(a a10) throws IOException {
        block3: {
            block2: {
                a10.b().a(a10);
                a10.f().a(a10);
                int n2 = net.minecraft.client.s.b.c();
                as.d(a10.h());
                int n3 = as.h(a10.h(), as.O);
                int n4 = n2;
                if (n4 == 0) break block2;
                if (n3 != 0) break block3;
                a.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", (Object)a10.f().a(), (Object)a10.b().a());
            }
            a.warn(as.a(a10.h(), 32768));
        }
    }

    public int b() throws c {
        int n2 = as.h();
        int n3 = net.minecraft.client.s.b.g();
        int n4 = n2;
        if (n3 == 0) {
            if (n4 <= 0) {
                throw new c("Could not create shader program (returned program ID " + n2 + ")");
            }
            n4 = n2;
        }
        return n4;
    }

    public static e c() {
        return b;
    }

    public static void a() {
        b = new e();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    static {
        a = LogManager.getLogger();
    }
}

