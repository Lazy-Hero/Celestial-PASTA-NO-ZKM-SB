/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public class h {
    protected /* synthetic */ M a;
    protected /* synthetic */ String b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public h(String var1_1, M var2_2) {
        super();
        this.b = var1_1;
        this.a = var2_2;
        var3_3 = M.c();
        if (var3_3) ** GOTO lbl9
        switch (E.a[var2_2.ordinal()]) {
            case 1: {
                this.b = "    \u00a77[\u00a76!\u00a77] New \u00a7f" + this.b;
lbl9:
                // 2 sources

                if (!var3_3) break;
            }
            case 2: {
                this.b = "    \u00a77[\u00a7a+\u00a77] Added \u00a7f" + this.b;
                if (!var3_3) break;
            }
            case 3: {
                this.b = "    \u00a77[\u00a79*\u00a77] Recoded \u00a7f" + this.b;
                if (!var3_3) break;
            }
            case 4: {
                this.b = "    \u00a77[\u00a7d/\u00a77] Improved \u00a7f" + this.b;
                if (!var3_3) break;
            }
            case 5: {
                this.b = "    \u00a77[\u00a7c-\u00a77] Deleted \u00a7f" + this.b;
                if (!var3_3) break;
            }
            case 6: {
                this.b = "    \u00a77[\u00a7b/\u00a77] Fixed \u00a7f" + this.b;
                if (!var3_3) break;
            }
            case 7: {
                this.b = "    \u00a77[\u00a79->\u00a77] Moved \u00a7f" + this.b;
                if (!var3_3) break;
            }
            case 8: {
                this.b = " " + this.b;
                break;
            }
        }
        if (m.d() != false) return;
        M.b(var3_3 == false);
    }

    public M b() {
        return this.a;
    }

    public String a() {
        return this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

