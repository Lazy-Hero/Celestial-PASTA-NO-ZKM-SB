/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import java.io.File;
import java.io.IOException;
import net.minecraft.aw.z;
import net.minecraft.client.D.h;
import net.minecraft.client.a.as;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.apache.commons.io.FileUtils;
import org.lwjgl.input.Keyboard;

public class aG
extends L {
    private final /* synthetic */ String y;
    private /* synthetic */ aq A;
    private final /* synthetic */ L z;

    @Override
    protected void a(char c10, int n2) throws IOException {
        block3: {
            block2: {
                int n3;
                int n4;
                block1: {
                    String[] arrstring = q.b();
                    this.A.a(c10, n2);
                    String[] arrstring2 = arrstring;
                    s s2 = (s)this.t.get(2);
                    boolean bl2 = this.A.n().trim().isEmpty();
                    if (arrstring2 != null) {
                        bl2 = !bl2;
                    }
                    s2.h = bl2;
                    n4 = n2;
                    n3 = 28;
                    if (arrstring2 == null) break block1;
                    if (n4 == n3) break block2;
                    n4 = n2;
                    n3 = 156;
                }
                if (n4 != n3) break block3;
            }
            this.a((s)this.t.get(2));
        }
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.A.a(n2, n3, n4);
    }

    @Override
    protected void a(s s2) throws IOException {
        block5: {
            int n2;
            z z2;
            int n3;
            block10: {
                block11: {
                    String[] arrstring;
                    block8: {
                        block9: {
                            block6: {
                                block7: {
                                    block4: {
                                        arrstring = q.b();
                                        n3 = s2.h;
                                        if (arrstring == null) break block4;
                                        if (n3 == 0) break block5;
                                        n3 = s2.g;
                                    }
                                    if (arrstring == null) break block6;
                                    if (n3 != 1) break block7;
                                    this.m.a(this.z);
                                    if (arrstring != null) break block5;
                                }
                                n3 = s2.g;
                            }
                            if (arrstring == null) break block8;
                            if (n3 != 0) break block9;
                            z2 = this.m.e();
                            z2.a(this.y, this.A.n().trim());
                            this.m.a(this.z);
                            if (arrstring != null) break block5;
                        }
                        n3 = s2.g;
                    }
                    n2 = 3;
                    if (arrstring == null) break block10;
                    if (n3 != n2) break block11;
                    z2 = this.m.e();
                    FileUtils.deleteQuietly((File)z2.b(this.y, "icon.png"));
                    s2.h = false;
                    if (arrstring != null) break block5;
                }
                n3 = s2.g;
                n2 = 4;
            }
            if (n3 == n2) {
                z2 = this.m.e();
                as.a(z2.b(this.y, "icon.png").getParentFile());
            }
        }
    }

    @Override
    public void e() {
        this.A.i();
    }

    public aG(L l2, String string) {
        this.z = l2;
        this.y = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void r() {
        Keyboard.enableRepeatEvents((boolean)true);
        v0 = q.b();
        this.t.clear();
        var2_1 = this.b(new s(3, aG.h / 2 - 100, aG.w / 4 + 24 + 12, net.minecraft.client.D.h.a("selectWorld.edit.resetIcon", new Object[0])));
        this.t.add(new s(4, aG.h / 2 - 100, aG.w / 4 + 48 + 12, net.minecraft.client.D.h.a("selectWorld.edit.openFolder", new Object[0])));
        var1_2 = v0;
        this.t.add(new s(0, aG.h / 2 - 100, aG.w / 4 + 96 + 12, net.minecraft.client.D.h.a("selectWorld.edit.save", new Object[0])));
        this.t.add(new s(1, aG.h / 2 - 100, aG.w / 4 + 120 + 12, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        var2_1.h = this.m.e().b(this.y, "icon.png").isFile();
        var3_3 = this.m.e();
        v1 = var4_4 = var3_3.f(this.y);
        if (var1_2 == null) ** GOTO lbl20
        if (v1 == null) {
            v2 = "";
        } else {
            v1 = var4_4;
lbl20:
            // 2 sources

            v2 = v1.p();
        }
        var5_5 = v2;
        this.A = new aq(2, this.v, aG.h / 2 - 100, 60, 200, 20);
        this.A.c(true);
        this.A.a(var5_5);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, net.minecraft.client.D.h.a("selectWorld.edit.title", new Object[0]), h / 2, 20, 0xFFFFFF);
        this.a(this.v, net.minecraft.client.D.h.a("selectWorld.enterName", new Object[0]), h / 2 - 100, 47, 0xA0A0A0);
        this.A.d();
        super.a(n2, n3, f10);
    }
}

