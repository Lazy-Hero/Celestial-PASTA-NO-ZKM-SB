/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  javax.annotation.Nullable
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.FilenameUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.ab;
import net.minecraft.E.ah;
import net.minecraft.E.g;
import net.minecraft.R.b;
import net.minecraft.aG;
import net.minecraft.aV;
import net.minecraft.aW;
import net.minecraft.ar.ao;
import net.minecraft.ar.v;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aZ
implements ao {
    private final /* synthetic */ J g;
    private /* synthetic */ boolean c;
    private final /* synthetic */ Map<v, g> e;
    private /* synthetic */ g d;
    private static final /* synthetic */ Logger i;
    private final /* synthetic */ File b;
    private /* synthetic */ String a;
    private final /* synthetic */ ArrayDeque<aV> h;
    private final /* synthetic */ b f;

    @Override
    public void c() {
        block7: {
            aZ aZ2;
            block6: {
                boolean bl2;
                block5: {
                    String string;
                    block4: {
                        string = this.f.S[0].M().d("gameLoopFunction");
                        bl2 = aG.b();
                        if (!bl2) break block4;
                        if (string.equals(this.a)) break block5;
                        this.a = string;
                    }
                    this.d = this.a(new v(string));
                }
                aZ2 = this;
                if (!bl2) break block6;
                if (aZ2.d == null) break block7;
                aZ2 = this;
            }
            aZ2.a(this.d, this.g);
        }
    }

    @Nullable
    public g a(v v2) {
        return this.e.get(v2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public int a(g var1_1, J var2_2) {
        var4_3 = this.f();
        var3_4 = aG.b();
        v0 = this.c;
        if (!var3_4) ** GOTO lbl14
        if (v0 != 0) {
            v1 = this.h.size();
            if (var3_4 == false) return v1;
            if (v1 >= var4_3) return 0;
            this.h.addFirst(new aV(this, var2_2, new ah(var1_1)));
            return 0;
        }
        try {
            this.c = true;
            v0 = 0;
lbl14:
            // 2 sources

            var6_5 = v0;
            var7_6 = var1_1.a();
            for (var8_7 = var7_6.length - 1; var8_7 >= 0; --var8_7) {
                this.h.push(new aV(this, var2_2, var7_6[var8_7]));
                if (var3_4) {
                    if (var3_4) continue;
                }
                ** GOTO lbl28
            }
            do {
                if (this.h.isEmpty()) {
                    var5_8 = var6_5;
                    var8_7 = var5_8 ? 1 : 0;
                    return var8_7;
                }
                this.h.removeFirst().a(this.h, var4_3);
                ++var6_5;
lbl28:
                // 2 sources

            } while (var6_5 < var4_3);
            var5_9 = var6_5;
            return var5_9;
        }
        finally {
            this.h.clear();
            this.c = false;
        }
    }

    private void d() {
        block7: {
            int n2;
            block5: {
                File file;
                boolean bl2;
                block6: {
                    bl2 = aG.b();
                    file = this.b;
                    if (!bl2) break block6;
                    if (file == null) break block7;
                    this.b.mkdirs();
                    file = this.b;
                }
                for (File file2 : FileUtils.listFiles((File)file, (String[])new String[]{"mcfunction"}, (boolean)true)) {
                    String string = FilenameUtils.removeExtension((String)this.b.toURI().relativize(file2.toURI()).toString());
                    String[] arrstring = string.split("/", 2);
                    n2 = arrstring.length;
                    if (!bl2) break block5;
                    if (n2 == 2) {
                        v v2 = new v(arrstring[0], arrstring[1]);
                        try {
                            this.e.put(v2, net.minecraft.E.g.a(this, Files.readLines((File)file2, (Charset)StandardCharsets.UTF_8)));
                        }
                        catch (Throwable throwable) {
                            i.error("Couldn't read custom function " + v2 + " from " + file2, throwable);
                        }
                    }
                    if (bl2) continue;
                }
                n2 = this.e.isEmpty();
            }
            if (n2 == 0) {
                i.info("Loaded " + this.e.size() + " custom command functions");
            }
        }
    }

    public int f() {
        return this.f.S[0].M().b("maxCommandChainLength");
    }

    public void b() {
        this.e.clear();
        this.d = null;
        this.a = "-";
        this.d();
    }

    public ab c() {
        return this.f.u();
    }

    static {
        i = LogManager.getLogger();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static String b(aZ aZ2) {
        return aZ2.a;
    }

    public aZ(@Nullable File file, b b10) {
        this.e = Maps.newHashMap();
        this.a = "-";
        this.h = new ArrayDeque();
        this.c = false;
        this.g = new aW(this);
        this.b = file;
        this.f = b10;
        this.b();
    }

    public Map<v, g> e() {
        return this.e;
    }

    static b a(aZ aZ2) {
        return aZ2.f;
    }
}

