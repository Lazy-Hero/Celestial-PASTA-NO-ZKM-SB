/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.CompletableFuture;

public class c {
    private final /* synthetic */ dO a;

    private Boolean lambda$isFavorite$1(String string) {
        return this.a.a(string);
    }

    public CompletableFuture<hA> b() {
        return CompletableFuture.supplyAsync(this.a::b);
    }

    public c(dO dO2) {
        this.a = dO2;
    }

    public CompletableFuture<Boolean> b(String string) {
        return CompletableFuture.supplyAsync(() -> this.lambda$isFavorite$1(string));
    }

    public CompletableFuture<Boolean> a(String string) {
        return CompletableFuture.supplyAsync(() -> this.lambda$isPrivate$0(string));
    }

    private Boolean lambda$isPrivate$0(String string) {
        return this.a.b(string);
    }

    public CompletableFuture<aU> a() {
        return CompletableFuture.supplyAsync(this.a::a);
    }
}

