/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.b;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.I.c;
import net.minecraft.P.a;
import net.minecraft.P.d;
import net.minecraft.P.r;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.client.B.n;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.p;
import net.minecraft.client.a.v;
import net.minecraft.client.b.H;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aD;
import net.minecraft.client.b.ai;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.y.b;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public abstract class L
extends q
implements ai {
    protected /* synthetic */ List<s> t;
    protected /* synthetic */ ArrayList<eI> k;
    public /* synthetic */ boolean l;
    protected /* synthetic */ List<H> r;
    private static /* synthetic */ String j;
    protected /* synthetic */ Q m;
    private static final /* synthetic */ Splitter p;
    private /* synthetic */ URI u;
    private static final /* synthetic */ Logger q;
    protected /* synthetic */ a5 v;
    private /* synthetic */ boolean g;
    public static /* synthetic */ int h;
    public /* synthetic */ int a;
    protected /* synthetic */ p x;
    private /* synthetic */ long i;
    private /* synthetic */ int o;
    protected /* synthetic */ s n;
    public static /* synthetic */ int w;
    private static final /* synthetic */ Set<String> s;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean o() {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = Keyboard.isKeyDown((int)42);
        if (arrstring == null) return bl2;
        if (bl2) return true;
        bl2 = Keyboard.isKeyDown((int)54);
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void a(boolean bl2, int n2) {
        block5: {
            int n3;
            block4: {
                String[] arrstring = net.minecraft.client.b.q.b();
                n3 = n2;
                if (arrstring == null) break block4;
                if (n3 != 31102009) break block5;
                n3 = bl2 ? 1 : 0;
            }
            if (n3 != 0) {
                this.a(this.u);
            }
            this.u = null;
            this.m.a(this);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void a(Q q2, int n2, int n3) {
        this.m = q2;
        this.x = q2.Y();
        this.v = q2.a6;
        h = n2;
        w = n3;
        this.t.clear();
        this.r();
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public L() {
        this.k = new ArrayList();
        this.t = Lists.newArrayList();
        this.r = Lists.newArrayList();
    }

    protected void a(s s2) throws IOException {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void f() throws IOException {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = Mouse.isCreated();
        if (arrstring != null) {
            if (bl2) {
                while (Mouse.next()) {
                    this.k();
                    if (arrstring == null) return;
                    if (arrstring != null) continue;
                }
            }
            bl2 = Keyboard.isCreated();
        }
        boolean bl3 = true;
        do {
            block6: {
                block5: {
                    if (!bl3 || (bl3 = false)) break block5;
                    if (arrstring == null) break block6;
                    if (!bl2) return;
                }
                bl2 = Keyboard.next();
            }
            if (!bl2) return;
            this.j();
        } while (arrstring != null);
    }

    protected void a(int n2, int n3, int n4, long l2) {
    }

    public static String g() {
        return j;
    }

    public void a(String string, boolean bl2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        if (arrstring != null) {
            if (bl2) {
                this.m.n.f().a(string);
            }
            this.m.s.b(string);
        }
    }

    public void r() {
    }

    public void f(int n2) {
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.C();
        W w2 = W.c();
        I i2 = w2.b();
        this.m.aN().b(f);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        float f10 = 32.0f;
        i2.a(7, b.t);
        i2.c(0.0, (double)w, 0.0).a(0.0, (float)w / 32.0f + (float)n2).b(64, 64, 64, 255).d();
        i2.c((double)h, (double)w, 0.0).a((float)h / 32.0f, (float)w / 32.0f + (float)n2).b(64, 64, 64, 255).d();
        i2.c((double)h, 0.0, 0.0).a((float)h / 32.0f, (double)n2).b(64, 64, 64, 255).d();
        i2.c(0.0, 0.0, 0.0).a(0.0, (double)n2).b(64, 64, 64, 255).d();
        w2.a();
    }

    protected <T extends s> T b(T t2) {
        this.t.add(t2);
        return t2;
    }

    public static void f(String string) {
        j = string;
    }

    public void b(Q q2, int n2, int n3) {
        this.a(q2, n2, n3);
    }

    public void n() {
        this.b(0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(URI var1_1) {
        var2_2 = net.minecraft.client.b.q.b();
        try {
            var3_3 = Class.forName("java.awt.Desktop");
            var4_5 = var3_3.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            var3_3.getMethod("browse", new Class[]{URI.class}).invoke(var4_5, new Object[]{var1_1});
            return;
        }
        catch (Throwable var3_4) {
            v0 = var4_6 = var3_4.getCause();
            if (var2_2 == null) ** GOTO lbl15
            if (v0 == null) {
                v1 = "<UNKNOWN>";
            } else {
                v0 = var4_6;
lbl15:
                // 2 sources

                v1 = v0.getMessage();
            }
            L.q.error("Couldn't open link: {}", (Object)v1);
        }
    }

    protected void b(int n2, int n3, int n4) {
        block0: {
            if (this.n == null || n4 != 0) break block0;
            this.n.b(n2, n3);
            this.n = null;
        }
    }

    public void j() throws IOException {
        block5: {
            char c10;
            block4: {
                int n2;
                block2: {
                    block3: {
                        c10 = Keyboard.getEventCharacter();
                        String[] arrstring = net.minecraft.client.b.q.b();
                        n2 = Keyboard.getEventKey();
                        if (arrstring == null) break block2;
                        if (n2 != 0) break block3;
                        n2 = c10;
                        if (arrstring == null) break block2;
                        if (n2 >= 32) break block4;
                    }
                    n2 = Keyboard.getEventKeyState() ? 1 : 0;
                }
                if (n2 == 0) break block5;
            }
            this.a(c10, Keyboard.getEventKey());
        }
        this.m.V();
    }

    public List<String> a(net.minecraft.w.d d10) {
        String[] arrstring = net.minecraft.client.b.q.b();
        List<String> list = d10.a(this.m.s, this.m.ac.aP ? net.minecraft.client.B.n.ADVANCED : net.minecraft.client.B.n.NORMAL);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 == 0) {
                list.set(i2, (Object)((Object)d10.l().rarityColor) + list.get(i2));
                if (arrstring != null) continue;
            }
            list.set(i2, (Object)((Object)net.minecraft.at.l.GRAY) + list.get(i2));
            if (arrstring != null) continue;
        }
        return list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean g(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = n2;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = (L.q() ? 1 : 0) != 0;
        }
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = L.o();
        }
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = L.m();
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public static String l() {
        block5: {
            String[] arrstring = net.minecraft.client.b.q.b();
            try {
                Transferable transferable;
                Transferable transferable2 = transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
                if (arrstring != null) {
                    if (transferable2 == null) break block5;
                    transferable2 = transferable;
                }
                DataFlavor dataFlavor = DataFlavor.stringFlavor;
                if (arrstring != null) {
                    if (!transferable2.isDataFlavorSupported(dataFlavor)) break block5;
                    transferable2 = transferable;
                    dataFlavor = DataFlavor.stringFlavor;
                }
                return (String)transferable2.getTransferData(dataFlavor);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return "";
    }

    public static void e(String string) {
        if (!StringUtils.isEmpty((CharSequence)string)) {
            try {
                StringSelection stringSelection = new StringSelection(string);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public void a(int n2, int n3) {
        h = n2;
        w = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean m() {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = Keyboard.isKeyDown((int)56);
        if (arrstring == null) return bl2;
        if (bl2) return true;
        bl2 = Keyboard.isKeyDown((int)184);
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = n2;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = (L.q() ? 1 : 0) != 0;
        }
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = L.o();
        }
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = L.m();
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public boolean a(k k2) {
        block20: {
            block18: {
                net.minecraft.I.d d10;
                block32: {
                    net.minecraft.I.a a10;
                    net.minecraft.I.a a11;
                    String[] arrstring;
                    block30: {
                        block31: {
                            block28: {
                                block29: {
                                    block22: {
                                        block23: {
                                            block25: {
                                                boolean bl2;
                                                block24: {
                                                    net.minecraft.I.d d11;
                                                    block21: {
                                                        block19: {
                                                            arrstring = net.minecraft.client.b.q.b();
                                                            k k3 = k2;
                                                            if (arrstring != null) {
                                                                if (k3 == null) {
                                                                    return false;
                                                                }
                                                                k3 = k2;
                                                            }
                                                            d10 = k3.e().j();
                                                            if (!L.o()) break block19;
                                                            if (k2.e().h() == null) break block20;
                                                            this.b(k2.e().h(), false);
                                                            if (arrstring != null) break block20;
                                                        }
                                                        d11 = d10;
                                                        if (arrstring == null) break block21;
                                                        if (d11 == null) break block20;
                                                        d11 = d10;
                                                    }
                                                    a11 = d11.d();
                                                    a10 = net.minecraft.I.a.OPEN_URL;
                                                    if (arrstring == null) break block22;
                                                    if (a11 != a10) break block23;
                                                    bl2 = this.m.ac.bg;
                                                    if (arrstring == null) break block24;
                                                    if (bl2) break block25;
                                                    bl2 = false;
                                                }
                                                return bl2;
                                            }
                                            try {
                                                L l2;
                                                URI uRI;
                                                block27: {
                                                    boolean bl3;
                                                    block26: {
                                                        uRI = new URI(d10.c());
                                                        String string = uRI.getScheme();
                                                        if (string == null) {
                                                            throw new URISyntaxException(d10.c(), "Missing protocol");
                                                        }
                                                        bl3 = s.contains(string.toLowerCase(Locale.ROOT));
                                                        if (arrstring == null) break block26;
                                                        if (!bl3) {
                                                            throw new URISyntaxException(d10.c(), "Unsupported protocol: " + string.toLowerCase(Locale.ROOT));
                                                        }
                                                        l2 = this;
                                                        if (arrstring == null) break block27;
                                                        bl3 = l2.m.ac.ae;
                                                    }
                                                    if (bl3) {
                                                        this.u = uRI;
                                                        this.m.a(new aD((ai)this, d10.c(), 31102009, false));
                                                        if (arrstring != null) break block18;
                                                    }
                                                    l2 = this;
                                                }
                                                l2.a(uRI);
                                                break block18;
                                            }
                                            catch (URISyntaxException uRISyntaxException) {
                                                q.error("Can't open url for {}", (Object)d10, (Object)uRISyntaxException);
                                                if (arrstring != null) break block18;
                                            }
                                        }
                                        a11 = d10.d();
                                        a10 = net.minecraft.I.a.OPEN_FILE;
                                    }
                                    if (arrstring == null) break block28;
                                    if (a11 != a10) break block29;
                                    URI uRI = new File(d10.c()).toURI();
                                    this.a(uRI);
                                    if (arrstring != null) break block18;
                                }
                                a11 = d10.d();
                                a10 = net.minecraft.I.a.SUGGEST_COMMAND;
                            }
                            if (arrstring == null) break block30;
                            if (a11 != a10) break block31;
                            this.b(d10.c(), true);
                            if (arrstring != null) break block18;
                        }
                        a11 = d10.d();
                        a10 = net.minecraft.I.a.RUN_COMMAND;
                    }
                    if (a11 != a10) break block32;
                    this.a(d10.c(), false);
                    if (arrstring != null) break block18;
                }
                q.error("Don't know how to handle {}", (Object)d10);
            }
            return true;
        }
        return false;
    }

    public void d(String string) {
        this.a(string, true);
    }

    protected void a(net.minecraft.w.d d10, int n2, int n3) {
        this.a(this.a(d10), n2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = n2;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = (L.q() ? 1 : 0) != 0;
        }
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = L.o();
        }
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = L.m();
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public boolean p() {
        return this.g;
    }

    public void e() {
    }

    protected void b(String string, boolean bl2) {
    }

    static {
        q = LogManager.getLogger();
        s = Sets.newHashSet((Object[])new String[]{"http", "https"});
        p = Splitter.on((char)'\n');
        L.f(null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void a(k var1_1, int var2_2, int var3_3) {
        block19: {
            block20: {
                block21: {
                    block23: {
                        block22: {
                            var4_4 = net.minecraft.client.b.q.b();
                            v0 = var1_1;
                            if (var4_4 != null) {
                                if (v0 == null) return;
                                v0 = var1_1;
                            }
                            v1 = v0.e().d();
                            if (var4_4 != null) {
                                if (v1 == null) return;
                                v1 = var1_1.e().d();
                            }
                            var5_5 = v1;
                            v2 = var5_5.b();
                            v3 = net.minecraft.I.c.SHOW_ITEM;
                            if (var4_4 == null) break block20;
                            if (v2 != v3) break block21;
                            var6_6 = net.minecraft.w.d.m;
                            try {
                                var7_8 = net.minecraft.P.d.c(var5_5.a().f());
                                if (var7_8 instanceof r) {
                                    var6_6 = new net.minecraft.w.d((r)var7_8);
                                }
                            }
                            catch (a var7_9) {
                                // empty catch block
                            }
                            if (!var6_6.G()) break block22;
                            this.a((Object)net.minecraft.at.l.RED + "Invalid Item!", var2_2, var3_3);
                            if (var4_4 != null) break block23;
                        }
                        this.a((net.minecraft.w.d)var6_6, var2_2, var3_3);
                    }
                    if (var4_4 != null) break block19;
                }
                v2 = var5_5.b();
                v3 = net.minecraft.I.c.SHOW_ENTITY;
            }
            if (var4_4 == null) ** GOTO lbl57
            if (v2 == v3) {
                if (this.m.ac.aP) {
                    try {
                        var6_6 = net.minecraft.P.d.c(var5_5.a().f());
                        var7_8 = Lists.newArrayList();
                        var7_8.add(var6_6.j("name"));
                        v4 = var6_6.a("type", 8);
                        if (var4_4 != null) {
                            if (v4) {
                                var8_10 = var6_6.j("type");
                                var7_8.add("Type: " + var8_10);
                            }
                            v4 = var7_8.add(var6_6.j("id"));
                        }
                        this.a((List<String>)var7_8, var2_2, var3_3);
                    }
                    catch (a var6_7) {
                        this.a((Object)net.minecraft.at.l.RED + "Invalid Entity!", var2_2, var3_3);
                        if (var4_4 != null) break block19;
                    }
                }
            } else {
                v2 = var5_5.b();
                v3 = net.minecraft.I.c.SHOW_TEXT;
lbl57:
                // 2 sources

                if (v2 == v3) {
                    this.a(this.m.a6.c(var5_5.a().a(), Math.max(L.h / 2, 200)), var2_2, var3_3);
                }
            }
        }
        net.minecraft.client.a.v.y();
    }

    public void a(List<String> list, int n2, int n3) {
        block21: {
            block19: {
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                String[] arrstring;
                block23: {
                    int n9;
                    block22: {
                        int n10;
                        int n11;
                        block18: {
                            int n12;
                            block20: {
                                arrstring = net.minecraft.client.b.q.b();
                                n12 = list.isEmpty();
                                if (arrstring == null) break block20;
                                if (n12 != 0) break block21;
                                net.minecraft.client.a.v.u();
                                a0.a();
                                net.minecraft.client.a.v.y();
                                net.minecraft.client.a.v.n();
                                n12 = 0;
                            }
                            n8 = n12;
                            for (String string : list) {
                                int n13 = n7 = this.v.e(string);
                                if (arrstring != null) {
                                    n11 = n8;
                                    if (arrstring == null) break block18;
                                    if (n13 > n11) {
                                        n13 = n8 = n7;
                                    }
                                }
                                if (arrstring != null) continue;
                            }
                            n10 = n2;
                            n11 = 12;
                        }
                        n6 = n10 + n11;
                        n5 = n3 - 12;
                        n7 = 8;
                        n4 = list.size();
                        n9 = 1;
                        if (arrstring != null) {
                            if (n4 > n9) {
                                n7 += 2 + (list.size() - 1) * 10;
                            }
                            n4 = n6 + n8;
                            n9 = h;
                        }
                        if (arrstring == null) break block22;
                        if (n4 > n9) {
                            n6 -= 28 + n8;
                        }
                        n4 = n5 + n7 + 6;
                        if (arrstring == null) break block23;
                        n9 = w;
                    }
                    if (n4 > n9) {
                        n5 = w - n7 - 6;
                    }
                    c = 300.0f;
                    this.x.g = 300.0f;
                    n4 = -267386864;
                }
                int n14 = n4;
                this.a(n6 - 3, n5 - 4, (double)(n6 + n8 + 3), (double)(n5 - 3), -267386864, -267386864);
                this.a(n6 - 3, n5 + n7 + 3, (double)(n6 + n8 + 3), (double)(n5 + n7 + 4), -267386864, -267386864);
                this.a(n6 - 3, n5 - 3, (double)(n6 + n8 + 3), (double)(n5 + n7 + 3), -267386864, -267386864);
                this.a(n6 - 4, n5 - 3, (double)(n6 - 3), (double)(n5 + n7 + 3), -267386864, -267386864);
                this.a(n6 + n8 + 3, n5 - 3, (double)(n6 + n8 + 4), (double)(n5 + n7 + 3), -267386864, -267386864);
                int n15 = 0x505000FF;
                int n16 = 1344798847;
                this.a(n6 - 3, n5 - 3 + 1, (double)(n6 - 3 + 1), (double)(n5 + n7 + 3 - 1), 0x505000FF, 1344798847);
                this.a(n6 + n8 + 2, n5 - 3 + 1, (double)(n6 + n8 + 3), (double)(n5 + n7 + 3 - 1), 0x505000FF, 1344798847);
                this.a(n6 - 3, n5 - 3, (double)(n6 + n8 + 3), (double)(n5 - 3 + 1), 0x505000FF, 0x505000FF);
                this.a(n6 - 3, n5 + n7 + 2, (double)(n6 + n8 + 3), (double)(n5 + n7 + 3), 1344798847, 1344798847);
                int n17 = 0;
                while (n17 < list.size()) {
                    String string = list.get(n17);
                    this.v.c(string, n6, n5, -1);
                    if (arrstring != null) {
                        if (arrstring != null) {
                            if (n17 == 0) {
                                n5 += 2;
                            }
                            n5 += 10;
                            ++n17;
                        }
                        if (arrstring != null) continue;
                    }
                    break block19;
                }
                c = 0.0f;
                this.x.g = 0.0f;
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.t();
                a0.c();
            }
            net.minecraft.client.a.v.q();
        }
    }

    protected void a(int n2, int n3, int n4) throws IOException {
        block7: {
            int n5;
            String[] arrstring;
            block6: {
                arrstring = net.minecraft.client.b.q.b();
                int n6 = n4;
                if (arrstring == null) break block6;
                if (n6 != 0) break block7;
                n6 = n5 = 0;
            }
            while (n5 < this.t.size()) {
                s s2 = this.t.get(n5);
                if (arrstring != null) {
                    if (s2.a(this.m, n2, n3)) {
                        this.n = s2;
                        s2.a(this.m.p());
                        this.a(s2);
                    }
                    ++n5;
                }
                if (arrstring != null) continue;
            }
        }
    }

    protected void a(char c10, int n2) throws IOException {
        block3: {
            L l2;
            block4: {
                String[] arrstring;
                block2: {
                    arrstring = net.minecraft.client.b.q.b();
                    if (arrstring == null) break block2;
                    if (n2 != 1) break block3;
                    this.m.a((L)null);
                }
                l2 = this.m.aO;
                if (arrstring == null) break block4;
                if (l2 != null) break block3;
                l2 = this;
            }
            l2.m.i();
        }
    }

    public void a(int n2, int n3, float f10) {
        int n4;
        String[] arrstring;
        block3: {
            arrstring = net.minecraft.client.b.q.b();
            for (n4 = 0; n4 < this.t.size(); ++n4) {
                this.t.get(n4).a(this.m, n2, n3, f10);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block3;
            }
            n4 = 0;
        }
        while (n4 < this.r.size()) {
            this.r.get(n4).a(this.m, n2, n3);
            ++n4;
            if (arrstring != null) continue;
            break;
        }
    }

    public boolean i() {
        return true;
    }

    public void b(int n2) {
        block4: {
            L l2;
            block2: {
                block3: {
                    String[] arrstring = net.minecraft.client.b.q.b();
                    l2 = this;
                    if (arrstring == null) break block2;
                    if (l2.m.e == null) break block3;
                    this.a(0, 0, (double)h, (double)w, -1072689136, -804253680);
                    if (arrstring != null) break block4;
                }
                l2 = this;
            }
            l2.f(n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean q() {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = Q.I;
        if (arrstring != null) {
            if (bl2) {
                boolean bl3 = Keyboard.isKeyDown((int)219);
                if (arrstring == null) return bl3;
                if (bl3) return true;
                bl3 = Keyboard.isKeyDown((int)220);
                if (arrstring == null) return bl3;
                if (!bl3) return false;
                return true;
            }
            bl2 = Keyboard.isKeyDown((int)29);
        }
        if (arrstring == null) return bl2;
        if (bl2) return true;
        bl2 = Keyboard.isKeyDown((int)157);
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void k() throws IOException {
        block17: {
            block16: {
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                var2_1 = Mouse.getEventX() * L.h / this.m.P;
                                var3_2 = L.w - Mouse.getEventY() * L.w / this.m.aT - 1;
                                var4_3 = Mouse.getEventButton();
                                var1_4 = net.minecraft.client.b.q.b();
                                v0 = Mouse.getEventButtonState();
                                if (var1_4 == null) break block12;
                                if (v0 == 0) break block13;
                                v1 = this;
                                if (var1_4 == null) ** GOTO lbl22
                                if (v1.m.ac.aZ) {
                                    v2 = this;
                                    v1 = v2;
                                    v3 = v2.o;
                                    if (var1_4 != null) {
                                        v1.o = v3 + 1;
                                        if (v3 > 0) {
                                            return;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    this.a = var4_3;
                                    this.i = Q.aj();
                                    v1 = this;
lbl22:
                                    // 2 sources

                                    v3 = var2_1;
                                }
                                v1.a(v3, var3_2, this.a);
                                if (var1_4 != null) return;
                            }
                            v0 = var4_3;
                        }
                        v4 = -1;
                        if (var1_4 == null) break block14;
                        if (v0 == v4) break block15;
                        v5 = this;
                        if (var1_4 == null) ** GOTO lbl44
                        if (v5.m.ac.aZ) {
                            v6 = this;
                            v5 = v6;
                            v7 = v6.o - 1;
                            if (var1_4 != null) {
                                v5.o = v7;
                                if (v7 > 0) {
                                    return;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            this.a = -1;
                            v5 = this;
lbl44:
                            // 2 sources

                            v7 = var2_1;
                        }
                        v5.b(v7, var3_2, var4_3);
                        if (var1_4 != null) return;
                    }
                    v0 = this.a;
                    if (var1_4 == null) break block16;
                    v4 = -1;
                }
                if (v0 == v4) return;
                v8 = this.i;
                v9 = 0L;
                if (var1_4 == null) break block17;
                cfr_temp_0 = v8 - v9;
                v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
            }
            if (v0 <= 0) return;
            v8 = Q.aj();
            v9 = this.i;
        }
        var5_5 = v8 - v9;
        this.a(var2_1, var3_2, this.a, var5_5);
    }

    public void a(String string, int n2, int n3) {
        this.a(Arrays.asList(string), n2, n3);
    }

    public void h() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean e(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl2 = n2;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = (L.q() ? 1 : 0) != 0;
        }
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = L.o();
        }
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = L.m();
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }
}

