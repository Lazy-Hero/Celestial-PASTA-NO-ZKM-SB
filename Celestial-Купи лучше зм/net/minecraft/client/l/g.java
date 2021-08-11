/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.l;

import java.io.File;
import net.minecraft.P.f;
import net.minecraft.P.r;
import net.minecraft.client.Q;
import net.minecraft.client.l.b;
import net.minecraft.client.l.c;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class g {
    protected /* synthetic */ Q a;
    private final /* synthetic */ File c;
    private final /* synthetic */ b[] b;
    private static final /* synthetic */ Logger d;

    static {
        d = LogManager.getLogger();
    }

    public b a(int n2) {
        return this.b[n2];
    }

    public void a() {
        String[] arrstring = net.minecraft.client.l.c.m();
        try {
            r r2 = f.a(this.c);
            if (r2 == null) {
                return;
            }
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b[i2].a(r2.c(String.valueOf(i2), 10));
                if (arrstring != null && arrstring != null) continue;
                break;
            }
        }
        catch (Exception exception) {
            d.error("Failed to load creative mode options", (Throwable)exception);
        }
    }

    public g(Q q2, File file) {
        block2: {
            String[] arrstring = net.minecraft.client.l.c.m();
            this.b = new b[9];
            String[] arrstring2 = arrstring;
            this.a = q2;
            this.c = new File(file, "hotbar.nbt");
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b[i2] = new b();
                if (arrstring2 != null) {
                    if (arrstring2 != null) continue;
                }
                break block2;
            }
            this.a();
        }
    }

    public void b() {
        block4: {
            String[] arrstring = net.minecraft.client.l.c.m();
            try {
                r r2 = new r();
                for (int i2 = 0; i2 < 9; ++i2) {
                    r2.a(String.valueOf(i2), this.b[i2].a());
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block4;
                }
                f.b(r2, this.c);
            }
            catch (Exception exception) {
                d.error("Failed to save creative mode options", (Throwable)exception);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

