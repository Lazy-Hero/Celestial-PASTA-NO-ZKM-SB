/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.D;

import com.google.gson.JsonParseException;
import java.io.IOException;
import net.minecraft.ar.v;
import net.minecraft.at.l;
import net.minecraft.client.D.E;
import net.minecraft.client.D.a;
import net.minecraft.client.D.h;
import net.minecraft.client.b.aH;
import net.minecraft.client.j.f;
import net.minecraft.client.j.p;
import net.minecraft.client.v.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class G
extends E {
    private static final /* synthetic */ Logger h;
    private final /* synthetic */ v g;
    private final /* synthetic */ a i;

    @Override
    protected String e() {
        block5: {
            boolean bl2 = net.minecraft.client.D.h.b();
            try {
                m m2;
                m m3 = m2 = (m)this.i.a(this.a.aa().d, "pack");
                if (!bl2) {
                    if (m3 == null) break block5;
                    m3 = m2;
                }
                return m3.a().a();
            }
            catch (JsonParseException jsonParseException) {
                h.error("Couldn't load metadata info", (Throwable)jsonParseException);
            }
            catch (IOException iOException) {
                h.error("Couldn't load metadata info", (Throwable)iOException);
            }
        }
        return (Object)((Object)l.RED) + "Missing pack.mcmeta :(";
    }

    @Override
    public boolean b() {
        return true;
    }

    static {
        h = LogManager.getLogger();
    }

    @Override
    protected int c() {
        return 3;
    }

    @Override
    protected boolean h() {
        return false;
    }

    public G(aH aH2, a a10) {
        super(aH2);
        f f10;
        this.i = a10;
        try {
            f10 = new f(a10.c());
        }
        catch (IOException iOException) {
            f10 = p.b;
        }
        this.g = this.a.aN().a("texturepackicon", f10);
    }

    @Override
    protected boolean i() {
        return false;
    }

    @Override
    protected void g() {
        this.a.aN().b(this.g);
    }

    @Override
    protected boolean j() {
        return false;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    @Override
    protected String a() {
        return "Server";
    }

    @Override
    protected boolean f() {
        return false;
    }

    @Override
    protected boolean d() {
        return false;
    }
}

