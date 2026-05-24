package eu.kanade.tachiyomi.extension.ar.mangapro;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;

/* JADX INFO: compiled from: ProChan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$scrambledImageInterceptor$pieceBitmaps$1$1$1", f = "ProChan.kt", i = {0, 0, 0, 0, 1, 1}, l = {460, 472}, m = "invokeSuspend", n = {"imgUrl", "payload", "signHeaders", "signRequest", "imgUrl", "pieceRequest"}, nl = {461, 473}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, v = 2)
final class ProChan$scrambledImageInterceptor$pieceBitmaps$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $cdn;
    final /* synthetic */ String $chapterUrl;
    final /* synthetic */ String $pieceUrl;
    final /* synthetic */ Request $request;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ProChan this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProChan$scrambledImageInterceptor$pieceBitmaps$1$1$1(String str, String str2, ProChan proChan, String str3, Request request, Continuation<? super ProChan$scrambledImageInterceptor$pieceBitmaps$1$1$1> continuation) {
        super(2, continuation);
        this.$pieceUrl = str;
        this.$cdn = str2;
        this.this$0 = proChan;
        this.$chapterUrl = str3;
        this.$request = request;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProChan$scrambledImageInterceptor$pieceBitmaps$1$1$1(this.$pieceUrl, this.$cdn, this.this$0, this.$chapterUrl, this.$request, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0107, code lost:
    
        if (r15 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0196, code lost:
    
        if (r15 != r0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$scrambledImageInterceptor$pieceBitmaps$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
