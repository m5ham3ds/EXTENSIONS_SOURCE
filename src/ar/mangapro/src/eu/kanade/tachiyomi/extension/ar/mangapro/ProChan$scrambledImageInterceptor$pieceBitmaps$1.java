package eu.kanade.tachiyomi.extension.ar.mangapro;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Request;

/* JADX INFO: compiled from: ProChan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "eu.kanade.tachiyomi.extension.ar.mangapro.ProChan$scrambledImageInterceptor$pieceBitmaps$1", f = "ProChan.kt", i = {0}, l = {484}, m = "invokeSuspend", n = {"$this$runBlocking"}, nl = {-1}, s = {"L$0"}, v = 2)
final class ProChan$scrambledImageInterceptor$pieceBitmaps$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Bitmap>>, Object> {
    final /* synthetic */ String $cdn;
    final /* synthetic */ String $chapterUrl;
    final /* synthetic */ List<String> $orderedPieces;
    final /* synthetic */ Request $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProChan this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProChan$scrambledImageInterceptor$pieceBitmaps$1(List<String> list, String str, ProChan proChan, String str2, Request request, Continuation<? super ProChan$scrambledImageInterceptor$pieceBitmaps$1> continuation) {
        super(2, continuation);
        this.$orderedPieces = list;
        this.$cdn = str;
        this.this$0 = proChan;
        this.$chapterUrl = str2;
        this.$request = request;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> proChan$scrambledImageInterceptor$pieceBitmaps$1 = new ProChan$scrambledImageInterceptor$pieceBitmaps$1(this.$orderedPieces, this.$cdn, this.this$0, this.$chapterUrl, this.$request, continuation);
        proChan$scrambledImageInterceptor$pieceBitmaps$1.L$0 = obj;
        return proChan$scrambledImageInterceptor$pieceBitmaps$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Bitmap>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        List<String> list = this.$orderedPieces;
        String str = this.$cdn;
        ProChan proChan = this.this$0;
        String str2 = this.$chapterUrl;
        Request request = this.$request;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(BuildersKt.async$default(coroutineScope, CoroutineDispatcher.limitedParallelism$default(Dispatchers.getIO(), 2, (String) null, 2, (Object) null), (CoroutineStart) null, new ProChan$scrambledImageInterceptor$pieceBitmaps$1$1$1((String) it.next(), str, proChan, str2, request, null), 2, (Object) null));
            arrayList = arrayList2;
        }
        this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.label = 1;
        Object objAwaitAll = AwaitKt.awaitAll(arrayList, (Continuation) this);
        return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
    }
}
