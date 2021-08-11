/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.j;

import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import net.minecraft.ar.v;
import net.minecraft.client.D.t;
import net.minecraft.client.j.e;
import net.minecraft.client.j.p;
import net.minecraft.client.j.u;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h
extends e {
    private static final /* synthetic */ Logger h;
    public final /* synthetic */ List<String> g;

    public h(String ... arrstring) {
        this.g = Lists.newArrayList((Object[])arrstring);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(t t2) throws IOException {
        block11: {
            this.c();
            BufferedImage bufferedImage = null;
            boolean bl2 = u.c();
            for (String string : this.g) {
                net.minecraft.client.D.v v2 = null;
                try {
                    if (!bl2) {
                        if (string == null) continue;
                        v2 = t2.a(new v(string));
                        BufferedImage bufferedImage2 = p.a(v2.c());
                        BufferedImage bufferedImage3 = bufferedImage;
                        if (!bl2) {
                            if (bufferedImage3 == null) {
                                bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), 2);
                            }
                            bufferedImage3 = bufferedImage;
                        }
                        bufferedImage3.getGraphics().drawImage(bufferedImage2, 0, 0, null);
                        continue;
                    }
                    break block11;
                }
                catch (IOException iOException) {
                    h.error("Couldn't load layered image", (Throwable)iOException);
                }
                finally {
                    IOUtils.closeQuietly(v2);
                    continue;
                }
                return;
            }
            p.a(this.c(), bufferedImage);
        }
    }

    static {
        h = LogManager.getLogger();
    }
}

