package eu.kanade.tachiyomi.extension.ar.mangapro;

import eu.kanade.tachiyomi.source.model.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Filters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/TriStateFilter;", "Leu/kanade/tachiyomi/source/model/Filter$TriState;", "name", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TriStateFilter extends Filter.TriState {
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriStateFilter(String str, String str2) {
        super(str, 0, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }
}
